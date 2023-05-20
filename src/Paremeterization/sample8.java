package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample8 
{
	

	   //TO FIND LAST "CELL" INDEX ....>SHEET6
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			
			FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
			
			
			int s2=WorkbookFactory.create(file).getSheet("Sheet6").getRow(0).getLastCellNum()-1;    //TO FIND LAST CELL INDEX
			System.out.println(s2);
			
			
			
		}

}
