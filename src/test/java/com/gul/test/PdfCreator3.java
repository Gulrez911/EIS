package com.gul.test;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.UUID;

import javax.imageio.ImageIO;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.extgstate.PdfExtGState;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfImage;
import com.itextpdf.text.pdf.PdfIndirectObject;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfCreator3 {
	public static final String DEST = "C:/Users/gulfa/OneDrive/Pictures/transparent.pdf";
	public static final String IMAGE = "C:/Users/gulfa/OneDrive/Desktop/nasa-logo.png";

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		Document document = new Document();
		com.itextpdf.kernel.pdf.PdfDocument pdfdoc = new com.itextpdf.kernel.pdf.PdfDocument(new com.itextpdf.kernel.pdf.PdfWriter(DEST));
		com.itextpdf.kernel.geom.PageSize pageSize3 = new com.itextpdf.kernel.geom.PageSize(com.itextpdf.kernel.geom.PageSize.A4).rotate();
		com.itextpdf.layout.Document  doc = new com.itextpdf.layout.Document(pdfdoc,pageSize3);
		PdfCanvas canvas = new PdfCanvas(pdfdoc.addNewPage());
		ImageData image = ImageDataFactory.create(IMAGE);
		canvas.saveState();
		PdfExtGState state = new PdfExtGState();
		state.setFillOpacity(0.6f);
		canvas.setExtGState(state);
		canvas.addImage(image, 0, 0,pageSize3.getWidth(),false);
		canvas.restoreState();
		
//		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(DEST));
//		        document.open();
//		 
//		        PdfPTable table = new PdfPTable(3); // 3 columns.
//		        table.setWidthPercentage(100); //Width 100%
//		        table.setSpacingBefore(10f); //Space before table
//		        table.setSpacingAfter(10f); //Space after table
//		 
//		        //Set Column widths
//		        float[] columnWidths = {1f, 1f, 1f};
//		        table.setWidths(columnWidths);
//		 
//		        PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 1"));
//		        cell1.setBorderColor(BaseColor.BLUE);
//		        cell1.setPaddingLeft(10);
//		        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
//		        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
//		 
//		        PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
//		        cell2.setBorderColor(BaseColor.GREEN);
//		        cell2.setPaddingLeft(10);
//		        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
//		        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
//		 
//		        PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
//		        cell3.setBorderColor(BaseColor.RED);
//		        cell3.setPaddingLeft(10);
//		        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
//		        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
//		 
//		        //To avoid having the cell border and the content overlap, if you are having thick cell borders
//		        //cell1.setUserBorderPadding(true);
//		        //cell2.setUserBorderPadding(true);
//		        //cell3.setUserBorderPadding(true);
//		 
//		        table.addCell(cell1);
//		        table.addCell(cell2);
//		        table.addCell(cell3);
//		 
//		        document.add(table);
//		 
//		        document.close();
//		        writer.close();
		System.out.println("Done");
	}
}
