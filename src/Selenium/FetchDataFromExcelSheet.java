package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{

		String path="E:\\FetchExcelSheetData\\ExcelData.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		
		System.out.print(value+" ");
			}
			System.out.println();
		}
	}

	}
