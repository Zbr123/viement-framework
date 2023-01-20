package step_defination.web;
import io.cucumber.java.en.When;
import pages.Page;

public class AdminPage extends Page {
    @When("^\\[Admin Page] User clicks on home button from admin tab$")
    public void clickOnHomeTab() throws InterruptedException {
        Thread.sleep(1000);
        getPageAdmin().getHomeTab().click();
    }

    @When("^\\[Admin Page] User clicks on profile dropdown from admin tab$")
    public void clickOnProfileDropdownAdmin() throws InterruptedException {
        Thread.sleep(1000);
        getPageAdmin().getProfileDropdown().click();
    }
    @When("^\\[Admin Page] User clicks on logout button from admin tab$")
    public void clickOnSignoutButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageAdmin().getLogoutButton().click();
    }

    @When("^\\[Admin Page]  User clicks on add user button$")
    public void clickOnAddUserTab() throws InterruptedException {
        Thread.sleep(1000);
        getPageAdmin().getAddUserTab().click();
    }

}
