package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;

public class BaseUtil {

    protected static WebDriver Web_Driver;

    public static ExtentReports extent;

    static ExtentTest scenarioDef;

    public static ExtentTest features;

    static String reportLocation = "/Reports/TollPays/";

    public static XSSFSheet mSheet;
}