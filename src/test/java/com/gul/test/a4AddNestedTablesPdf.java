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

public class a4AddNestedTablesPdf {
	public static void main(String[] args) throws MalformedURLException, FileNotFoundException {

		 // Creating a PdfWriter object   
		      String dest = "C:/itextExamples/addingNestedTable.pdf";   
		      PdfWriter writer = new PdfWriter("addingNestedTable.pdf");                  
		   
		      // Creating a PdfDocument object       
		      PdfDocument pdfDoc = new PdfDocument(writer);                      
		   
		      // Creating a Document object       
		      Document doc = new Document(pdfDoc);                            
		   
		      // Creating a table       
		      float [] pointColumnWidths1 = {150f, 150f};       
		      Table table = new Table(pointColumnWidths1);                             
		      
		      // Populating row 1 and adding it to the table          
		      Cell cell1 = new Cell();       
		      cell1.add("Name");       
		      table.addCell(cell1);             
		      
		      Cell cell2 = new Cell();       
		      cell2.add("Raju");       
		      table.addCell(cell2);                          
		   
		      // Populating row 2 and adding it to the table        
		      Cell cell3 = new Cell();       
		      cell3.add("Id");       
		      table.addCell(cell3);             
		      
		      Cell cell4 = new Cell();       
		      cell4.add("1001");       
		      table.addCell(cell4);                    
		   
		      // Populating row 3 and adding it to the table        
		      Cell cell5 = new Cell();       
		      cell5.add("Designation");       
		      table.addCell(cell5); 
		      
		      Cell cell6 = new Cell();       
		      cell6.add("Programmer");       
		      table.addCell(cell6);              
		   
		      // Creating nested table for contact         
		      float [] pointColumnWidths2 = {150f, 150f};       
		      Table nestedTable = new Table(pointColumnWidths2);                
		      
		      // Populating row 1 and adding it to the nested table        
		      Cell nested1 = new Cell();       
		      nested1.add("Phone");       
		      nestedTable.addCell(nested1);                   
		      
		      Cell nested2 = new Cell();       
		      nested2.add("9848022338");       
		      nestedTable.addCell(nested2);                   
		      
		      // Populating row 2 and adding it to the nested table        
		      Cell nested3 = new Cell();       
		      nested3.add("email");       
		      nestedTable.addCell(nested3);                    
		      
		      Cell nested4 = new Cell();       
		      nested4.add("Raju123@gmail.com");       
		      nestedTable.addCell(nested4);                       
		      
		      // Populating row 3 and adding it to the nested table        
		      Cell nested5 = new Cell();       
		      nested5.add("Address");       
		      nestedTable.addCell(nested5);                    
		      
		      Cell nested6 = new Cell();       
		      nested6.add("Hyderabad");       
		      nestedTable.addCell(nested6);              
		      
		      // Adding table to the cell       
		      Cell cell7 = new Cell();       
		      cell7.add("Contact");       
		      table.addCell(cell7);              
		      
		      Cell cell8 = new Cell();       
		      cell8.add(nestedTable);       
		      table.addCell(cell8);
		      
		      // Adding table to the document       
		      doc.add(table);                   
		      
		      // Closing the document               
		      doc.close();  
		      System.out.println("Nested Table Added successfully..");     
	}
}
