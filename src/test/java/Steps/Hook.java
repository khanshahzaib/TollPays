package Steps;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import Utilities.ReadExcel;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil {

    private BaseUtil base;
    ConfigFileReader configFileReader;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before("@A_ValidSignIn")
    public void InitializeTest(Scenario scenario) {

//        scenarioDef = base.features.createNode(scenario.getName());

        configFileReader = new ConfigFileReader();
        System.out.println("Opening the Web Browser");
        if (configFileReader.getBrowser().contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
            Web_Driver = new ChromeDriver();
        }
        if (configFileReader.getBrowser().contains("FireFox")) {
            System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath());
            Web_Driver = new FirefoxDriver();
        }
        if (configFileReader.getBrowser().contains("Opera")) {
            System.setProperty("webdriver.opera.driver", configFileReader.getDriverPath());
            Web_Driver = new OperaDriver();
        }
        Web_Driver.manage().window().maximize();
        Web_Driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        ReadExcel.readExcelFile();
    }

    @After("@A_ValidSignIn")
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        Web_Driver.close();
        Web_Driver.quit();
        System.out.println("Closing the Browser");
    }
}