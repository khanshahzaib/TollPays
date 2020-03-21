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

    //Variable's declaration
    //region

    private WebElement signUpButton;

    private WebElement continueButton;

    //Variable's declaration
    //endregion

    //Wait For DOM Elements
    //region

    //Variable's declaration
    //endregion

    //Load DOM Elements
    //region

    //Variable's declaration
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
