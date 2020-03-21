package Utilities;

import DataProvider.ConfigFileReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel {

    private static XSSFSheet mSheet;

    private ReadExcel() {
    }

    //This method is to set the File path and to open the Excel file
    public static void readExcelFile() {
        ConfigFileReader configFileReader = new ConfigFileReader();
        if (mSheet != null) {
            return;
        }
        File src = new File(configFileReader.getTollPaysAppKeywords());

        try {
            // Open the Excel file
            FileInputStream file = new FileInputStream(src);

            // Access the required data sheet
            XSSFWorkbook wb = new XSSFWorkbook(file);

            mSheet = wb.getSheetAt(0);

        } catch (Exception ex) {
            System.out.println("You got: " + ex);
        }
    }

    //This method is to read the data from the Excel cell, in this we are passing parameters as Row num and Col num
    public static String GetCellValue(int row, int column) {
        if (mSheet == null) {
            return "Cell Value is null";
        }
        return mSheet.getRow(row).getCell(column).getStringCellValue();
    }
}