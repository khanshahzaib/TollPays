package Steps;

import Base.BaseUtil;
import Pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SignUpSD extends BaseUtil {

    SignUpPage signUpPage;

    @Given("user click on the Sign Up Button")
    public void userClickOnTheSignUpButton() throws Throwable {
        System.out.println("user click on the Sign Up Button");
        signUpPage = new SignUpPage(Web_Driver);
        signUpPage.waitForSignUpButton();
        signUpPage.loadControlsForSignUpButton();
        signUpPage.signUpMethod();
        Thread.sleep(500);
    }

    @When("user is on the Sign Up Screen")
    public void userIsOnTheSignUpScreen() {
        System.out.println("user is on the Sign Up Screen");
    }

    @And("user click on the continue button")
    public void userClickOnTheContinueButton() throws Throwable {
        System.out.println("user click on the continue button");
        signUpPage = new SignUpPage(Web_Driver);
        signUpPage.waitForContinueButton();
        signUpPage.loadControlsForContinueButton();
        signUpPage.continueMethod();
        Thread.sleep(500);
    }
}
