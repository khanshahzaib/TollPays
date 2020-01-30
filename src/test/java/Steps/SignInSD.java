package Steps;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import Pages.SignInPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SignInSD extends BaseUtil {


    private BaseUtil base;
    ConfigFileReader configFileReader;
    SignInPage signInPage;

    public SignInSD(BaseUtil base) {
        signInPage = new SignInPage(base.Web_Driver);
        this.base = base;
    }

    @Given("user is on the Sign In Screen")
    public void userIsOnTheSignInScreen() throws Throwable {
        System.out.println("user is on the Sign In Screen");
//        scenarioDef.createNode(new GherkinKeyword("Given"), "User is on Application SignIn Page");
        configFileReader = new ConfigFileReader();
        Web_Driver.navigate().to(configFileReader.getApplicationUrl());
        Web_Driver.manage().window().maximize();
        Web_Driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        System.out.println("Application launch successfully...");
        Thread.sleep(1000);

    }

    @When("user enter valid email address \"([^\"]*)\"$")
    public void userEnterValidEmailAddress(String enterEmailAddress) throws Throwable{
        System.out.println("user enter valid email address");
//        SignInPage signInPage = new SignInPage(Web_Driver);
        signInPage.loginEmailAddress(enterEmailAddress);
        Thread.sleep(1000);
    }

    @And("user enter valid password \"([^\"]*)\"$")
    public void userEnterValidPassword(String enterPassword) throws Throwable{
        System.out.println("user enter valid password");
//        SignInPage signInPage = new SignInPage(Web_Driver);
        signInPage.loginPassword(enterPassword);
        Thread.sleep(1000);
    }

    @Then("user click on the Sign In button")
    public void userClickOnTheSignInButton() throws Throwable{
        System.out.println("user click on the Sign In button");
//        SignInPage signInPage = new SignInPage(Web_Driver);
        signInPage.loginButton();
        Thread.sleep(1000);
    }
}