package Pages;

import Base.BaseUtil;
import Utilities.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BaseUtil {

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        mSheet = wb.getSheetAt(0);
    }

    //Variable's declaration

    //region

    WebElement btnSignIn;

    WebElement txtEmail;

    WebElement txtPassword;

    WebElement btnSubmitSignIn;

//    public final static By SignInButton = (By.id(ReadExcel.GetCellValue(4,2)));
    public final static By SignInButton = (By.id("button_signin"));

    //endregion

    //Wait For DOM Elements

    //region

    public void waitForSignInButton(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(SignInButton));
    }

    public void waitForEmailAddress(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath(ReadExcel.GetCellValue(1, 3))));
    }

    public void waitForPassword(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath(ReadExcel.GetCellValue(2,3))));
    }

    public void waitForSignInSubmitButton(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath(ReadExcel.GetCellValue(3,3))));
    }

    //endregion

    //Load DOM Elements

    //region

    public void loadControlsForSignInButton(){
        btnSignIn = Web_Driver.findElement(SignInButton);
    }

    public void loadControlsForEmailAddress(){
        txtEmail = Web_Driver.findElement(By.
                xpath(ReadExcel.GetCellValue(1,3)));
    }

    public void loadControlsForPassword(){
        txtPassword = Web_Driver.findElement(By
                .xpath(ReadExcel.GetCellValue(2,3)));
    }

    public void LoadControlsForSignInSubmitbutton(){
        btnSubmitSignIn = Web_Driver.findElement(By.
                xpath(ReadExcel.GetCellValue(3,3)));
    }

    //endregion

    //Methods Declaration

    //region

    public void loginSignInButton(){
        btnSignIn.click();
    }

    public void loginEmailAddress() {
        txtEmail.sendKeys(ReadExcel.GetCellValue(1,6));
    }

    public void loginPassword() {
        txtPassword.sendKeys(ReadExcel.GetCellValue(2,6));
    }

    public void loginButton() {
        btnSubmitSignIn.click();
    }

    //endregion



}
