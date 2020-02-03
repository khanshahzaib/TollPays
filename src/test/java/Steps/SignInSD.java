package Steps;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import Pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSD extends BaseUtil {

    @Given("user enter the correct URL")
    public void userEnterTheCorrectURL() throws Throwable {
        ConfigFileReader configFileReader = new ConfigFileReader();
        Web_Driver.navigate().to(configFileReader.getApplicationUrl());
        System.out.println("Application launch successfully...");
        Thread.sleep(500);
    }

    @Given("user is on the Sign In Screen")
    public void userIsOnTheSignInScreen() throws Throwable {
        System.out.println("user is on the Sign In Screen");
//        scenarioDef.createNode(new GherkinKeyword("Given"), "User is on Application SignIn Page");
    }

    @When("user enter valid email address \"([^\"]*)\"")
    public void userEnterValidEmailAddress(String enterEmailAddress) throws Throwable{
        System.out.println("user enter valid email address");
        SignInPage signInPage = new SignInPage(Web_Driver);
        signInPage.loginEmailAddress(enterEmailAddress);
        Thread.sleep(500);
    }

    @And("user enter valid password \"([^\"]*)\"")
    public void userEnterValidPassword(String enterPassword) throws Throwable{
        System.out.println("user enter valid password");
        SignInPage signInPage = new SignInPage(Web_Driver);
        signInPage.loginPassword(enterPassword);
        Thread.sleep(500);
    }

    @Then("user click on the Sign In button")
    public void userClickOnTheSignInButton() throws Throwable{
        System.out.println("user click on the Sign In button");
        SignInPage signInPage = new SignInPage(Web_Driver);
        signInPage.loginButton();
        Thread.sleep(500);
    }
}