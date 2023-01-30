package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebSeniorDashboardPage extends Page {
    @When("^\\[Web Senior Dashboard Page] User clicks on scheduler tab$")
    public void userClicksOnSchedulerTab(){
        getPageSeniorDashboard().getSchedulerTab().click();
    }
    @When("^\\[Web Scheduler Page] User clicks on who to call dropdown$")
    public void userClicksOnWhoToCallDropdown(){
        getPageScheduler().getWhoToCallDropdown().click();
    }
}
