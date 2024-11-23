package com.Qapitol.util;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtil
{
    public  String getDataFromExcel(String sheetName,int row,int cell) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol\\Desktop\\textBox.xlsx");
        Workbook wb= WorkbookFactory.create(fis);
       String value= wb.getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
        return value;
    }
}
