package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebForgotPasswordVerificationPage extends Page {

    @Then("^\\[Web Forgot Password Verification Page] User should see the (.*) heading$")
    public void userSeesForgotPasswordPageH1Headings(String FPVPageHeadingLocatorString2) throws InterruptedException {
        Thread.sleep(3000);
        String FPVPageHeadingLocatorString1 = "MuiDialogContent-root";
        Assert.assertTrue(getPageForgotPasswordVerification().getFPVPageH3Heading(FPVPageHeadingLocatorString1, FPVPageHeadingLocatorString2).isDisplayed());
    }
    @And("^\\[Web Forgot Password Page] User clicks on cross button to close the alert$")
    public void userClicksOnCrossButton() throws InterruptedException {
        Thread.sleep(500);
        getPageForgotPasswordVerification().getAlertCrossButton().click();
    }
}
