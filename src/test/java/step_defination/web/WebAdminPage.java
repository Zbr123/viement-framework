package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebAdminPage extends Page {
    @When("^\\[Web Admin Page] User clicks on home button from admin tab$")
    public void clickOnHomeTab() throws InterruptedException {
        Thread.sleep(3000);
        getPageAdminWeb().getHomeTab().click();
    }

    @When("^\\[Web Admin Page] User clicks on profile dropdown from admin tab$")
    public void userClicksOnProfileDropdownAdmin() throws InterruptedException {
        Thread.sleep(3000);
        getPageAdminWeb().getProfileDropdownAdmin().click();
    }
    @When("^\\[Web Admin Page] User clicks on logout button from admin tab$")
    public void clickOnSignoutButton() throws InterruptedException {
        Thread.sleep(3000);
        getPageAdminWeb().getLogoutButton().click();
    }

    @When("^\\[Web Admin Page]  User clicks on add user button$")
    public void clickOnAddUserTab() throws InterruptedException {
        Thread.sleep(3000);
        getPageAdminWeb().getAddUserTab().click();
    }
    @Then("[Web Admin Page] User should see admin tab in header")
    public void userShouldSeeAdminTabInHeader() {
        Assert.assertTrue(getPageAdminWeb().getAdminTab().isDisplayed());
    }
    @And("[Web Admin Page] User should see todo heading")
    public void userShouldSeeToDoHeading() {
        Assert.assertTrue(getPageAdminWeb().getToDoHeading().isDisplayed());
    }
}
