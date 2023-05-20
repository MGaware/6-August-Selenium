package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample10 
{
	
	
	//TO PRINT INFORMATION OF FIRST "ROW"....>SHEET8
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet8");
		
		int s1=sh.getRow(0).getLastCellNum();
		
		for(int a=0; a<=s1; a++ ) 
		{
			
			String v1=sh.getRow(0).getCell(a).getStringCellValue();
			System.out.println(v1);
		}
	
	}
}
