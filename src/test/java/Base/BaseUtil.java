package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class BaseUtil {

    public static WebDriver Web_Driver;

    public static ExtentReports extent;

    public static ExtentTest scenarioDef;

    public static ExtentTest features;

    public static String reportLocation = "/Reports/SellerOptics/";
}