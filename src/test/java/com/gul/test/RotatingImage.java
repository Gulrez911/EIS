package com.gul.test;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData; 
import com.itextpdf.io.image.ImageDataFactory; 

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 

import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Image;  
public class RotatingImage {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		
		// Creating a PdfWriter       
		      String dest = "C:/EXAMPLES/itextExamples/3images/positionOfImage.pdf";       
		      PdfWriter writer = new PdfWriter("rotatingImage.pdf");               
		      
		      // Creating a PdfDocument       
		      PdfDocument pdfDoc = new PdfDocument(writer);              
		      
		      // Creating a Document        
		      Document document = new Document(pdfDoc);              
		      
		      // Creating an ImageData object       
			String imFile = "D:/Fevicon Icon Bundle/Icon From Website/PSD-File-icon.png";
		      ImageData data = ImageDataFactory.create(imFile);             

		      // Creating an Image object        
		      Image image = new Image(data);                
		      
		      // Rotating the image       
		      image.setRotationAngle(45);    
		      
		      // Adding image to the document       
		      document.add(image);              
		      
		      // Closing the document       
		      document.close();
		      
		      System.out.println("Image added");  
	}
}
