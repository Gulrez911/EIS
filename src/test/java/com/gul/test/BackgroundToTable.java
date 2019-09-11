package com.gul.test;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.border.DottedBorder;
import com.itextpdf.layout.border.DoubleBorder;
import com.itextpdf.layout.border.RoundDotsBorder;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class BackgroundToTable {
	public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
		// Creating a PdfWriter object
		String dest = "C:/itextExamples/coloredBorders.pdf";

		PdfWriter writer = new PdfWriter("coloredBorders.pdf");

		// Creating a PdfDocument object
		PdfDocument pdfDoc = new PdfDocument(writer);

		// Creating a Document object
		Document doc = new Document(pdfDoc);

		// Creating a table
		float[] pointColumnWidths = { 200F, 200F };
		Table table = new Table(pointColumnWidths);

		// Adding row 1 to the table
		Cell c1 = new Cell();

		// Adding the contents of the cell
		c1.add("Name");

		// Setting the back ground color of the cell
		c1.setBackgroundColor(Color.DARK_GRAY);

		// Instantiating the Border class
		Border b1 = new DashedBorder(Color.RED, 3);

		// Setting the border of the cell
		c1.setBorder(b1);

		// Setting the text alignment
		c1.setTextAlignment(TextAlignment.CENTER);

		// Adding the cell to the table
		table.addCell(c1);
		Cell c2 = new Cell();
		c2.add("Raju");
		c1.setBorder(new SolidBorder(Color.RED, 3));
		c2.setTextAlignment(TextAlignment.CENTER);
		table.addCell(c2);

		// Adding row 2 to the table
		Cell c3 = new Cell();
		c3.add("Id");
		c3.setBorder(new DottedBorder(Color.DARK_GRAY, 3));
		c3.setTextAlignment(TextAlignment.CENTER);
		table.addCell(c3);

		Cell c4 = new Cell();
		c4.add("001");
		c4.setBorder(new DoubleBorder(Color.DARK_GRAY, 3));
		c4.setTextAlignment(TextAlignment.CENTER);
		table.addCell(c4);

		// Adding row 3 to the table
		Cell c5 = new Cell();
		c5.add("Designation");
		c5.setBorder(new RoundDotsBorder(Color.RED, 3));
		c5.setTextAlignment(TextAlignment.CENTER);
		table.addCell(c5);

		Cell c6 = new Cell();
		c6.add("Programmer");
		c6.setBorder(new RoundDotsBorder(Color.RED, 3));
		c6.setTextAlignment(TextAlignment.CENTER);
		table.addCell(c6);

		// Adding Table to document
		doc.add(table);

		// Closing the document
		doc.close();

		System.out.println("Borders added successfully..");
	}
}
