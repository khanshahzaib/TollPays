package Steps;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import Pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSD extends BaseUtil {

    SignInPage signInPage;

    @Given("^user enter the correct URL$")
    public void userEnterTheCorrectURL() throws Throwable {
        ConfigFileReader configFileReader = new ConfigFileReader();
        Web_Driver.navigate().to(configFileReader.getApplicationUrl());
        System.out.println("Application launch successfully...");
    }

    @When("^user click on the Sign In Button$")
    public void userClickOnTheSignInButton() throws Throwable {
        System.out.println("user click on the Sign In Button");
        signInPage = new SignInPage(Web_Driver);
        signInPage.waitForSignInButton();
        signInPage.loadControlsForSignInButton();
        signInPage.loginSignInButton();
    }

    @Given("^user is on the Sign In Screen$")
    public void userIsOnTheSignInScreen() throws Throwable {
        System.out.println("user is on the Sign In Screen");
//        scenarioDef.createNode(new GherkinKeyword("Given"), "User is on Application SignIn Page");
    }

    @When("^user enter valid email address$")
    public void userEnterValidEmailAddress() throws Throwable{
        System.out.println("user enter valid email address");
        signInPage = new SignInPage(Web_Driver);
        signInPage.waitForEmailAddress();
        signInPage.loadControlsForEmailAddress();
        signInPage.loginEmailAddress();
    }

    @And("^user enter valid password$")
    public void userEnterValidPassword() throws Throwable{
        System.out.println("user enter valid password");
        signInPage = new SignInPage(Web_Driver);
        signInPage.waitForPassword();
        signInPage.loadControlsForPassword();
        signInPage.loginPassword();
        Thread.sleep(10000);
    }

    @Then("^user click on the Sign In Submit button$")
    public void userClickOnTheSignInSubmitButton() throws Throwable{
        System.out.println("user click on the Sign In button");
        signInPage = new SignInPage(Web_Driver);
        signInPage.waitForSignInSubmitButton();
        signInPage.LoadControlsForSignInSubmitbutton();
        signInPage.loginButton();
    }
}