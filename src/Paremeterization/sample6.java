package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample6 
{
	
	           //TO FIND LAST "ROW" INDEX AND TO FIND SIZE OF THE ROW ....>SHEET5
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			
			FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
			
			Sheet s1=WorkbookFactory.create(file).getSheet("Sheet5");
			int s2=s1.getLastRowNum();   //to find last row index
			System.out.println(s2);
			
			
			int s3=s1.getLastRowNum()+1;   //to find row size
			System.out.println(s3);
			
			
		}

}
