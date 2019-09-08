package com.gul.test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

import javax.imageio.ImageIO;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfImage;
import com.itextpdf.text.pdf.PdfIndirectObject;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfCreator2 {
	public static final String DEST = "C:/Users/gulfa/OneDrive/Pictures/transparent.pdf";
	public static final String IMAGE = "C:/Users/gulfa/OneDrive/Desktop/nasa-logo.png";

	public static void main(String[] args) throws Exception {
		Rectangle pageSize = new Rectangle(400, 400);
		pageSize.setBackgroundColor(BaseColor.GREEN);
		Document document = new Document(pageSize);
		PdfWriter.getInstance(document,
		new FileOutputStream("backgroundColorPDF.pdf"));
		document.open();
		Paragraph para=new Paragraph("Page Size and Background color");
		document.add(para);
		document.add(new Paragraph("Background color--->>roseinia.net"));
		document.close();
		System.out.println("Done");
	}
}
