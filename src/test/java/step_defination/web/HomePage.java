package step_defination.web;
import io.cucumber.java.en.When;
import pages.Page;

public class HomePage extends Page {
    @When("[Web Home Page] User should see the welcome header")
    public void webBrowser() {
        getPageHome().getWelcomeHeader().click();
    }

    @When("^\\[Home Page] User clicks on profile dropdown from home page$")
    public void clickOnProfileDropdownHome() throws InterruptedException {
        Thread.sleep(1000);
        getPageHome().getProfileDropdown().click();
    }
    @When("^\\[Home Page] User clicks on logout button from home page$")
    public void clickOnLogoutButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageHome().getLogoutButton().click();
    }
}
