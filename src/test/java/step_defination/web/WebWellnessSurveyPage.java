package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebWellnessSurveyPage extends Page {
    @When("^\\[Web Wellness Survey Page] User should see the wellness check-in survey heading$")
    public void userSeesWellnessSurveyPageMainHeading() throws InterruptedException {
        Thread.sleep(4000);
        getPageWellnessSurvey().getWellnessSurveyPageMainHeading().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on wellness survey reset button$")
    public void userClicksOnWellnessSurveyResetButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getWellnessSurveyResetButton().click();
    }
    @And("^\\[Web Wellness Survey Page] User clicks on wellness survey save button$")
    public void userClicksOnWellnessSurveySaveButton() throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSurvey().getWellnessSurveySaveButton().click();
    }
    @Then("^\\[Web Wellness Survey Page] User should see limit reached alert popup$")
    public void userSeesWellnessSurveyLimitReachedAlertPopup() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageWellnessSurvey().getWellnessSurveyLimitReachedAlertPopup().isDisplayed());
    }
    @When("^\\[Web Wellness Survey Page] User clicks on alert popup okay button$")
    public void userClicksOnWellnessSurveyAlertPopupOkayButton() throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSurvey().getWellnessSurveyAlertPopupOkayButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on wellness survey submit button$")
    public void userClicksOnWellnessSurveySubmitButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getWellnessSurveySubmitButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User Select (.*) radio button on wellness survey form$")
    public void userClicksOnXxxRadioButtonOnWellnessSurveyForm(String ButtonName) throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getRadioButtonLocator(ButtonName).click();
    }
}
