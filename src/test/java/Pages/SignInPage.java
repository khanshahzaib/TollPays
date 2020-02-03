package Pages;

import Utilities.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.txtEmail = driver.findElement(By.xpath(ReadExcel.GetCellValue(1, 3)));
        this.txtPassword = driver.findElement(By.xpath(ReadExcel.GetCellValue(2, 3)));
        this.btnSignIn = driver.findElement(By.xpath(ReadExcel.GetCellValue(3, 3)));
    }

    private WebElement txtEmail;

    private WebElement txtPassword;

    private WebElement btnSignIn;

    public void loginEmailAddress(String enterEmailAddress) {
        txtEmail.sendKeys(enterEmailAddress);
    }

    public void loginPassword(String enterPassword) {
        txtPassword.sendKeys(enterPassword);
    }

    public void loginButton() {
        btnSignIn.click();
    }
}
