package genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xlsheet {

	
		public String getData(String path,String sheet1,int row1,int cell1) throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			FileInputStream fis=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheet1);
			Row row = sheet.getRow(row1);
			Cell cell = row.getCell(cell1);
			String result = cell.getStringCellValue();
					
			return result;
			
		}

		public void setData(String path,String sheet1,int row1,int cell1,String data) throws IOException, EncryptedDocumentException, InvalidFormatException
		{
			{
				FileInputStream fis=new FileInputStream(path);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet(sheet1);
				Row row = sheet.getRow(row1);
				Cell cell = row.getCell(cell1);
				FileOutputStream fio=new FileOutputStream(path);
				cell.setCellValue(data);
				wb.write(fio);
			}
	}

}
