package Pages;

import Base.BaseUtil;
import Utilities.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContactUsPage extends BaseUtil {

    public ContactUsPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        mSheet = wb.getSheetAt(3);
    }

    SoftAssert softAssert = new SoftAssert();

    String actualTitle = Web_Driver.getTitle();
    String expectedTitle = "Tollpays Landing Page";

    //Variable's Declaration

    //region

    WebElement contact_us;
    WebElement subject;
    WebElement account_type;
    WebElement email;
    WebElement message;
    WebElement submit;
    //endregion

    //Wait For DOM Elements

    //region

    public void waitForContactUsButton(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath(ReadExcel.GetCellValue(1,3))));
    }

    public void waitForSubjectDD(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .id(ReadExcel.GetCellValue(2,2))));
    }

    public void waitForAccountTypeDD(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .id(ReadExcel.GetCellValue(3,2))));
    }

    public void waitForEmailField(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .id(ReadExcel.GetCellValue(4,2))));
    }

    public void waitForMessageField(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .id(ReadExcel.GetCellValue(5,2))));
    }

    public void waitForSubmitButton(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath(ReadExcel.GetCellValue(6,3))));
    }

    //endregion

    //Load DOM Elements

    //region

    public void loadControlsForContactUsButton(){
        contact_us = Web_Driver.findElement(By
                .xpath(ReadExcel.GetCellValue(1,3)));
    }

    public void loadControlsForSubjectDD(){
        subject = Web_Driver.findElement(By
                .id(ReadExcel.GetCellValue(2,2)));
    }

    public void loadControlsForAccountTypeDD(){
        account_type = Web_Driver.findElement(By
                .id(ReadExcel.GetCellValue(3,2)));
    }

    public void loadControlsForEmailField(){
        email = Web_Driver.findElement(By
                .id(ReadExcel.GetCellValue(4,2)));
    }

    public void loadControlsForMessageField(){
        message = Web_Driver.findElement(By
                .id(ReadExcel.GetCellValue(5,2)));
    }

    public void loadControlsForSubmitButton(){
        submit = Web_Driver.findElement(By
                .xpath(ReadExcel.GetCellValue(6,3)));
    }

    //endregion

    //Methods Declaration

    //region

    public void contactUsMethod(){
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(contact_us.isDisplayed(),"Contact Us button is present");
        contact_us.click();
    }

    public void subjectMethod(){
        softAssert.assertEquals(actualTitle, expectedTitle);
//        softassert.assertAll();
        Select select = new Select(subject);
        select.selectByIndex(1);
    }

    public void accountTypeMethod(){
        Select select = new Select(account_type);
        select.selectByIndex(1);
    }

    public void emailMethod(){
        email.sendKeys(ReadExcel.GetCellValue(10,1));
    }

    public void messageMethod(){
        message.sendKeys(ReadExcel.GetCellValue(11,1));
    }

    public void submitMethod(){

        Assert.assertTrue(submit.isDisplayed(),"submit button is present");
        submit.click();
    }

    //endregion

}
