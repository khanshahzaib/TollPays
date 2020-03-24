package Steps;

import Base.BaseUtil;
import DataProvider.ConfigFileReader;
import Pages.ContactUsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ContactUsSD extends BaseUtil {

    ConfigFileReader configFileReader = new ConfigFileReader();
    ContactUsPage contactUsPage;

    @Given("user click on the Contact Us button")
    public void userClickOnTheContactUsButton() throws Throwable {
        System.out.println("user click on the Contact Us button");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForContactUsButton();
        contactUsPage.loadControlsForContactUsButton();
        contactUsPage.contactUsMethod();
        Thread.sleep(500);
    }

    @When("user is on the Contact Us Screen")
    public void userIsOnTheContactUsScreen() throws Throwable {
        System.out.println("user is on the Contact Us Screen");
        contactUsPage = new ContactUsPage(Web_Driver);
        Thread.sleep(500);
    }

    @And("user select the reason of contact")
    public void userSelectTheReasonOfContact() throws Throwable {
        System.out.println("user select the reason of contact");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForSubjectDD();
        contactUsPage.loadControlsForSubjectDD();
        contactUsPage.subjectMethod();
        Web_Driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
    }

    @And("user select the account type")
    public void userSelectTheAccountType() throws Throwable {
        System.out.println("user select the account type");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForAccountTypeDD();
        contactUsPage.loadControlsForAccountTypeDD();
        contactUsPage.accountTypeMethod();
        Thread.sleep(500);
    }

    @And("user enter valid email address for contact \"([^\"]*)\"")
    public void userEnterValidEmailAddressForContact(String enterEmailAddress) throws Throwable {
        System.out.println("user enter valid email address for contact");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForEmailField();
        contactUsPage.loadControlsForEmailField();
        contactUsPage.emailMethod(enterEmailAddress);
        Thread.sleep(500);
    }

    @And("user enter message \"([^\"]*)\"")
    public void userEnterMessage(String enterMessage) throws Throwable {
        System.out.println("user enter message");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForMessageField();
        contactUsPage.loadControlsForMessageField();
        contactUsPage.messageMethod(enterMessage);
        Thread.sleep(500);
    }

    @Then("user click on the Submit button")
    public void userClickOnTheSubmitButton() throws Throwable {
        System.out.println("user click on the Submit button");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForSubmitButton();
        contactUsPage.loadControlsForSubmitButton();
        contactUsPage.submitMethod();
        Thread.sleep(500);
    }
}
