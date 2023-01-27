package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class AdminPage extends Page {
    @When("^\\[Admin Page] User clicks on home button from admin tab$")
    public void clickOnHomeTab() throws InterruptedException {
        Thread.sleep(1000);
        getPageAdminWeb().getHomeTab().click();
    }

    @When("^\\[Admin Page] User clicks on profile dropdown from admin tab$")
    public void userClicksOnProfileDropdownAdmin(){
        getPageAdminWeb().getProfileDropdownAdmin().click();
    }
    @When("^\\[Admin Page] User clicks on logout button from admin tab$")
    public void clickOnSignoutButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageAdminWeb().getLogoutButton().click();
    }

    @When("^\\[Admin Page]  User clicks on add user button$")
    public void clickOnAddUserTab() throws InterruptedException {
        Thread.sleep(3000);
        getPageAdminWeb().getAddUserTab().click();
    }
    @Then("[Admin Page] User should see admin tab in header")
    public void userShouldSeeAdminTabInHeader() {
        Assert.assertTrue(getPageAdminWeb().getAdminTab().isDisplayed());
    }
    @And("[Adming Page] User should see todo heading")
    public void userShouldSeeToDoHeading(){
        Assert.assertTrue(getPageAdminWeb().getToDoHeading().isDisplayed());
    }

}
