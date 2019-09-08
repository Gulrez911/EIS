package com.gul.test;

import java.io.File;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.extgstate.PdfExtGState;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

public class PdfWaterMark {
	public static final String DEST = "C:/Users/gulfa/OneDrive/Pictures/transparent.pdf";
	    public static final String IMG ="C:/Users/gulfa/OneDrive/Desktop/nasa-logo.png";
//	    public static final String SRC = "./src/test/resources/pdfs/pages.pdf";

	    public static void main(String[] args) throws Exception {
	        File file = new File(DEST);
	        file.getParentFile().mkdirs();
	        new PdfWaterMark().manipulatePdf(DEST);
	    }


	    protected void manipulatePdf(String dest) throws Exception {
	        PdfDocument pdfDoc = new PdfDocument( new PdfWriter(DEST));
	        Document doc = new Document(pdfDoc);
	        int n = pdfDoc.getNumberOfPages();
	        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
	        Paragraph p = new Paragraph("My watermark (text)").setFont(font).setFontSize(30);
	        // image watermark
	        ImageData img = ImageDataFactory.create(IMG);
	        //  Implement transformation matrix usage in order to scale image
	        float w = img.getWidth();
	        float h = img.getHeight();
	        // transparency
	        PdfExtGState gs1 = new PdfExtGState();
	        gs1.setFillOpacity(0.5f);
	        // properties
	        PdfCanvas over;
	        Rectangle pagesize;
	        float x, y;
	        // loop over every page
	        for (int i = 1; i <= n; i++) {
	            PdfPage pdfPage = pdfDoc.getPage(i);
	            pagesize = pdfPage.getPageSizeWithRotation();
	            pdfPage.setIgnorePageRotationForContent(true);

	            x = (pagesize.getLeft() + pagesize.getRight()) / 2;
	            y = (pagesize.getTop() + pagesize.getBottom()) / 2;
	            over = new PdfCanvas(pdfDoc.getPage(i));
	            over.saveState();
	            over.setExtGState(gs1);
	            if (i % 2 == 1) {
	                doc.showTextAligned(p, x, y, i, TextAlignment.CENTER, VerticalAlignment.TOP, 0);
	            } else {
	                over.addImage(img, w, 0, 0, h, x - (w / 2), y - (h / 2), false);
	            }
	            over.restoreState();
	        }
	        doc.close();
	    }
	}