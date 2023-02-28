package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebHolisticAssessmentsPage extends Page {
    @Then("^\\[Web Holistic Assessment Page] User should see the (.*) heading$")
    public void userSeesAssessmentsTabHeadings(String assessmentsTabHeadingLocatorString) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageHolisticAssessments().getHolisticAssessmentTabHeadings(assessmentsTabHeadingLocatorString).isDisplayed());
    }
    @When("^\\[Web Holistic Assessment Page] User clicks on (.*) option in (.*)$")
    public void userClicksOnOnboardingInfoSubTabs(String radioButtonOption, String radioButtonid) throws InterruptedException {
        Thread.sleep(500);
        getPageHolisticAssessments().getHolisticAssessmentRadioButtonOptions(radioButtonOption, radioButtonid).click();
    }
    @And("^\\[Web Holistic Assessment Page] User clicks on (.*) button$")
    public void userClicksOnOnboardingInfoSubTabs(String buttonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageHolisticAssessments().getHolisticAssessmentButtons(buttonLocatorString).click();
    }
    @Then("^\\[Web Holistic Assessment Page] User should see the '(.*)' alert$")
    public void userSeesSuccessAlert(String successAlertLocatorString) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageHolisticAssessments().getHolisticAssessmentSuccessAlert(successAlertLocatorString).isDisplayed());
    }
//    @Then("^\\[Web Onboarding Info Page] User should see the provider info heading$")
//    public void userSeesProviderInfoHeading() throws InterruptedException {
//        Thread.sleep(2000);
//        Assert.assertTrue(getPageOnboardingInfo().getProviderInfoHeading().isDisplayed());
//    }
}
