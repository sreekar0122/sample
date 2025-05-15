package pdfbox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedaPDFContent {
	
	
	@Test
	public void VerifyPDFTest() throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\swarna.sreekar\\Downloads\\StepathonGuide.pdf");
		
		PDDocument pdfDcoument = PDDocument.load(fis);
		
		int pages = pdfDcoument.getPages().getCount();
		
		System.out.println("Number of Pages: " + pages);
		Assert.assertEquals(pages, 18);
		
		
		
		
		
		
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		
		
		
//		pdfTextStripper.setStartPage(2);
//		pdfTextStripper.setEndPage(3);
		
		
		
		
		String pdfContent = pdfTextStripper.getText(pdfDcoument);
		
		System.out.println("============================================");
		System.out.println(pdfContent);
		System.out.println("============================================");
		
		
		Assert.assertFalse(pdfContent.contains("Upholding the Law and Enforcing Fundamental Rights"), "validation get failed.");
		
		
		pdfDcoument.close();
		fis.close();
		
	}

}
