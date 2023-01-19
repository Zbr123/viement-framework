package step_defination.web;
import io.cucumber.java.en.When;
import pages.Page;

public class AdminPage extends Page {
    @When("^\\[Admin Page] User click on home button from admin tab$")
    public void clickOnHomeTab() throws InterruptedException {
        Thread.sleep(3000);
        getAdminPage().getHomeTab().click();
    }
}
