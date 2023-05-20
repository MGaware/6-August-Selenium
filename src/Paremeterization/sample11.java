package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample11 
{
	//TO PRINT ALL DATA FROM EXCELLSHEET...>SHEET9
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet9");
		
		int s1=sh.getLastRowNum();
		
		//TAKE OUTER FOR LOOP FOR "ROW"
		for(int a=0; a<=s1; a++) 
		{
			
			          int s2=sh.getRow(a).getLastCellNum()-1;
			       
			        //TAKE INNER FOR LOOP FOR "CELL/COLUMN"
			          for(int b=0; b<=s2; b++) 
			          {
			        	  String value=sh.getRow(a).getCell(b).getStringCellValue();
			        	  System.out.print(value+" ");
			          }
			          System.out.println();
			
			
	
		}

}
}


