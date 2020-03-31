package Steps;

import Base.BaseUtil;
import Pages.ContactUsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSD extends BaseUtil {

    ContactUsPage contactUsPage;

    @Given("^user click on the Contact Us button$")
    public void userClickOnTheContactUsButton() throws Throwable {
        System.out.println("user click on the Contact Us button");
        contactUsPage = new ContactUsPage(Web_Driver);
        Thread.sleep(5000);
        contactUsPage.waitForContactUsButton();
        contactUsPage.loadControlsForContactUsButton();
        contactUsPage.contactUsMethod();
    }

    @When("^user is on the Contact Us Screen$")
    public void userIsOnTheContactUsScreen() throws Throwable {
        System.out.println("user is on the Contact Us Screen");
        contactUsPage = new ContactUsPage(Web_Driver);
    }

    @And("^user select the reason of contact$")
    public void userSelectTheReasonOfContact() throws Throwable {
        System.out.println("user select the reason of contact");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForSubjectDD();
        contactUsPage.loadControlsForSubjectDD();
        contactUsPage.subjectMethod();
    }

    @And("^user select the account type$")
    public void userSelectTheAccountType() throws Throwable {
        System.out.println("user select the account type");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForAccountTypeDD();
        contactUsPage.loadControlsForAccountTypeDD();
        contactUsPage.accountTypeMethod();
    }

    @And("^user enter valid email address for contact$")
    public void userEnterValidEmailAddressForContact() throws Throwable {
        System.out.println("user enter valid email address for contact");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForEmailField();
        contactUsPage.loadControlsForEmailField();
        contactUsPage.emailMethod();
    }

    @And("^user enter message$")
    public void userEnterMessage() throws Throwable {
        System.out.println("user enter message");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForMessageField();
        contactUsPage.loadControlsForMessageField();
        contactUsPage.messageMethod();
    }

    @Then("^user click on the Submit button$")
    public void userClickOnTheSubmitButton() throws Throwable {
        System.out.println("user click on the Submit button");
        contactUsPage = new ContactUsPage(Web_Driver);
        contactUsPage.waitForSubmitButton();
        contactUsPage.loadControlsForSubmitButton();
        contactUsPage.submitMethod();
    }
}
