package Pages;

import Base.BaseUtil;
import Utilities.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BaseUtil {

    public SignUpPage(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

    //Variable's Declaration
    //region

    private WebElement signUpButton;

    private WebElement continueButton;

    //endregion

    //Wait For DOM Elements
    //region

    public void waitForSignUpButton() throws Throwable{

        System.out.println("Waiting for Continue Button");
        WebDriverWait wait = new WebDriverWait(Web_Driver, 6);
        wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath(ReadExcel.GetCellValue(1,3))));
    }

    public void waitForContinueButton() throws Throwable{

        System.out.println("Waiting for Continue Button");
        WebDriverWait wait = new WebDriverWait(Web_Driver, 6);
        wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath(ReadExcel.GetCellValue(2,3))));
    }


    //endregion

    //Load DOM Elements
    //region

    public void loadControlsForSignUpButton() throws Throwable{

        System.out.println("Loading control");

        signUpButton = Web_Driver.findElement(By
                .xpath(ReadExcel.GetCellValue(1,3)));

        System.out.println("Controls loaded");
    }

    public void loadControlsForContinueButton() throws Throwable{

        System.out.println("Loading control");

        continueButton = Web_Driver.findElement(By
                .xpath(ReadExcel.GetCellValue(2,3)));

        System.out.println("Controls loaded");
    }

    //endregion

    //Methods
    //region

    public void signUpMethod(){
        signUpButton.click();
    }

    public void continueMethod(){
        continueButton.click();
    }
    //endregion

}
