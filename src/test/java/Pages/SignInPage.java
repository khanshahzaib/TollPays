package Pages;

import Utilities.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {

    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.btnSignIn = driver.findElement(By.xpath(ReadExcel.GetCellValue(3, 3)));
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"doLogin\"]/div[2]/div[1]/input")
//    @CacheLookup
    public WebElement txtEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"doLogin\"]/div[2]/div[2]/input")
    //@CacheLookup
    public WebElement txtPassword;

//    @FindBy(how = How.XPATH, using = "//*[@id=\"doLogin\"]/div[2]/div[4]/div/button")
    public WebElement btnSignIn;

    public void abc(String email, String password) {
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
    }

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
