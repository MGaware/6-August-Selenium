package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample9 
{
	//TO PRINT INFORMATION OF FIRST CELL....>SHEET7
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
	
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet7");
		
		int s1=sh.getLastRowNum();
		
		//TAKE FOR LOOP FOR "ROW"
		for(int a=0; a<=s1; a++) 
		{
			String v1=sh.getRow(a).getCell(0).getStringCellValue();
			System.out.println(v1);
		}
		
		
		
		
	}
}
