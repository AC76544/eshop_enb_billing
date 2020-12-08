package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;




public class Excel {



	public static ArrayList<String> ReadFile(String Sheetname,String TestId) throws IOException { 
		ArrayList<String> a_value= new  ArrayList<String>(); 
 
		String value,value1=null; 
 
		File f = new File("InputFile\\InputFile.xls"); 
		FileInputStream File_Input = new FileInputStream(f); 
		HSSFWorkbook wb= new HSSFWorkbook(File_Input); 
 
			Sheet sh= wb.getSheet(Sheetname); 
			int rowcount = sh.getLastRowNum(); 
			int colcount= sh.getRow(0).getPhysicalNumberOfCells(); 
            if(rowcount==0) 
            {System.out.println("No input value present");} 
 


            
			for (int j =1; j<rowcount+1;j++){ 
 
 
				Cell cell=sh.getRow(j).getCell(0); 
				value=cell.getStringCellValue(); 
				
				if (TestId.equalsIgnoreCase(value)) 
 
				{	for (int k =0; k<colcount;k++) { 
 
						Cell cell1=sh.getRow(j).getCell(k); 
						//System.out.println(cell.toString());
						if (cell1==null)
						{value1="";}
						else
						{
						value1=cell1.getStringCellValue(); }
						//value1=value1.toString();
                     if((value1==null) || (value1.isEmpty())|| (value1==""))
                      {
                    	  
                    	  value1="";
                      }

						System.out.println(value1); 
						a_value.add(value1); 
 
 
					} 
				} 
 
 
 
			} 
 
 
 
 
 
 
return a_value; 
 
	}


}

