package com.gul.test;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;

public class AddingTable {
	public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
		// Creating a PdfDocument object   
		      String dest = "C:/itextExamples/addingTable.pdf";   
		      PdfWriter writer = new PdfWriter("addingTable.pdf");       
		         
		      // Creating a PdfDocument object      
		      PdfDocument pdf = new PdfDocument(writer);                  
		      
		      // Creating a Document object       
		      Document doc = new Document(pdf);                       
		         
		      // Creating a table       
		      float [] pointColumnWidths = {150F, 150F, 150F};   
		      Table table = new Table(pointColumnWidths);    
		      
		      // Adding cells to the table       
		      table.addCell(new Cell().add("Name"));       
		      table.addCell(new Cell().add("Raju"));       
		      table.addCell(new Cell().add("Id"));       
		      table.addCell(new Cell().add("1001"));       
		      table.addCell(new Cell().add("Designation"));       
		      table.addCell(new Cell().add("Programmer"));                 
		         
		      // Adding Table to document        
		      doc.add(table);                  
		         
		      // Closing the document       
		      doc.close();
		      System.out.println("Table created successfully..");   
	}
}
