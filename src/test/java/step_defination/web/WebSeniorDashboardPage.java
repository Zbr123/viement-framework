package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebSeniorDashboardPage extends Page {
//    @When("^\\[Web Senior Dashboard Page] User clicks on scheduler tab$")
//    public void userClicksOnSchedulerTab() throws InterruptedException {
//        Thread.sleep(4000);
//        getPageSeniorDashboard().getSchedulerTab().click();
//    }
    @When("^\\[Web Senior Dashboard Page] User clicks on (.*) tab$")
    public void userClicksOnOnboardingInfoTab(String onboardingInfoTab) throws InterruptedException {
        Thread.sleep(10000);
        getPageSeniorDashboard().getSeniorDashTabs(onboardingInfoTab).click();
    }
//    @When("^\\[Web Senior Dashboard Page] User clicks on wellness survey tab$")
//    public void userClicksOnWellnessSurveyTab() throws InterruptedException {
//        Thread.sleep(4000);
//        getPageSeniorDashboard().getWellnessSurveyTab().click();
//    }
}
