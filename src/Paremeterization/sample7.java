package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample7 
{
	
	   // TO FIND SIZE OF THE CELL ....>SHEET6
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			
			FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
			
			int s1=WorkbookFactory.create(file).getSheet("Sheet6").getRow(0).getLastCellNum();    //TO FIND SIZE OF THE CELL
			System.out.println(s1);
			
			
			
			
		}

}
