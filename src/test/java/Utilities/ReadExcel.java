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

    public static void readExcelFile() {
        ConfigFileReader configFileReader = new ConfigFileReader();
        if (mSheet != null) {
            return;
        }
        File src = new File(configFileReader.getSellerOpticsAppKeywords());

        try {
            FileInputStream file = new FileInputStream(src);

            XSSFWorkbook wb = new XSSFWorkbook(file);

            mSheet = wb.getSheetAt(0);

        } catch (Exception ex) {
            System.out.println("You got: " + ex);
        }
    }

    public static String GetCellValue(int row, int column) {
        if (mSheet == null) {
            return "";
        }
        return mSheet.getRow(row).getCell(column).getStringCellValue();
    }
}