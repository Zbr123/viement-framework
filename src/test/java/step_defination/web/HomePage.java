package step_defination.web;
import io.cucumber.java.en.When;
import pages.Page;

public class HomePage extends Page {
    @When("[Web Home Page] User should see the welcome header")
    public void webBrowser() {
        getPageHome().getWelcomeHeader().click();

    }

    @When("[Home Page] User clicks on profile dropdown")
    public void clickOnProfileDropdown() {
        getPageHome().getProfileDropdown().click();


    }
}
