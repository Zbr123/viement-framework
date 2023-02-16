package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebSeniorDashboardPage extends Page {
    @When("^\\[Web Senior Dashboard Page] User clicks on scheduler tab$")
    public void userClicksOnSchedulerTab() throws InterruptedException {
        Thread.sleep(4000);
        getPageSeniorDashboard().getSchedulerTab().click();
    }
    @When("^\\[Web Senior Dashboard Page] User clicks on onboarding info tab$")
    public void userClicksOnOnboardingInfoTab() throws InterruptedException {
        Thread.sleep(4000);
        getPageSeniorDashboard().getOnboardingInfoTab().click();
    }
    @When("^\\[Web Senior Dashboard Page] User clicks on wellness survey tab$")
    public void userClicksOnWellnessSurveyTab() throws InterruptedException {
        Thread.sleep(4000);
        getPageSeniorDashboard().getWellnessSurveyTab().click();
    }
}
