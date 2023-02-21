package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebSeniorDashboardPage extends Page {

    @When("^\\[Web Senior Dashboard Page] User clicks on (.*) tab$")
    public void userClicksOnSeniorPageTabs(String seniorPageTabsLocatorString) throws InterruptedException {
        Thread.sleep(7000);
        getPageSeniorDashboard().getSeniorPageTabs(seniorPageTabsLocatorString).click();
    }
}
