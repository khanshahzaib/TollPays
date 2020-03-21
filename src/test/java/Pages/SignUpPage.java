package Pages;

import Utilities.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.signUpButton = webDriver.findElement(By.xpath(ReadExcel.GetCellValue(1,3)));
        this.continueButton = webDriver.findElement(By.xpath(ReadExcel.GetCellValue(2,3)));
    }

    private WebElement signUpButton;

    private WebElement continueButton;

    public void signUpMethod(){
        signUpButton.click();
    }

    public void continueMethod(){
        continueButton.click();
    }
}
