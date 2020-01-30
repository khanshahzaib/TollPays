package Utilities;

import DataProvider.ConfigFileReader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel {

    private static XSSFSheet mSheet;
    static ConfigFileReader configFileReader;

    private ReadExcel() {
    }

    public static void readExcelFile() {
        configFileReader= new ConfigFileReader();
        if (mSheet != null) {
            return;
        }
        File src = new File(configFileReader.getRosterAppKeywords());

        try {
            FileInputStream file = new FileInputStream(src);

            XSSFWorkbook wb = new XSSFWorkbook(file);

            mSheet = wb.getSheetAt(0);

            //String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();

            //return sheet1.getRow(1).getCell(2).getStringCellValue();
        } catch (Exception ex) {
            System.out.println("You got: " + ex);
        }

        return;
    }

    public static String GetCellValue(int row, int column) {
        if (mSheet == null) {
            return "";
        }
        return mSheet.getRow(row).getCell(column).getStringCellValue();
    }
}