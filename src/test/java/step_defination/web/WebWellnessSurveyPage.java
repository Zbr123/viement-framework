package step_defination.web;
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
    @When("^\\[Web Wellness Survey Page] User clicks on first c1 radio button$")
    public void userClicksOnFirstC1RadioButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageWellnessSurvey().getFirstC1RadioButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on second c1 radio button$")
    public void userClicksOnSecondC1RadioButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getSecondC1RadioButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on third c1 radio button$")
    public void userClicksOnThirdC1RadioButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getThirdC1RadioButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on fourth c1 radio button$")
    public void userClicksOnFourthC1RadioButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getFourthC1RadioButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on fifth c1 radio button$")
    public void userClicksOnFifthC1RadioButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getFifthC1RadioButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on sixth c1 radio button$")
    public void userClicksOnSixthC1RadioButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getSixthC1RadioButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on seventh c1 radio button$")
    public void userClicksOnSeventhC1RadioButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getSeventhC1RadioButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on wellness survey reset button$")
    public void userClicksOnWellnessSurveyResetButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getWellnessSurveyResetButton().click();
        Thread.sleep(4000);
    }
    @When("^\\[Web Wellness Survey Page] User clicks on wellness survey save button$")
    public void userClicksOnWellnessSurveySaveButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getWellnessSurveySaveButton().click();
    }
    @Then("^\\[Web Wellness Survey Page] User should see limit reached alert popup$")
    public void userSeesWellnessSurveyLimitReachedAlertPopup() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageWellnessSurvey().getWellnessSurveyLimitReachedAlertPopup().isDisplayed());
    }
    @When("^\\[Web Wellness Survey Page] User clicks on alert popup okay button$")
    public void userClicksOnWellnessSurveyAlertPopupOkayButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getWellnessSurveyAlertPopupOkayButton().click();
    }
    @When("^\\[Web Wellness Survey Page] User clicks on wellness survey submit button$")
    public void userClicksOnWellnessSurveySubmitButton() throws InterruptedException {
        Thread.sleep(500);
        getPageWellnessSurvey().getWellnessSurveySubmitButton().click();
    }
}
