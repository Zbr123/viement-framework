package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class HomePage extends Page {

    @When("^\\[Home Page] User clicks on profile dropdown from home page$")
    public void clickOnProfileDropdownHome() throws InterruptedException {
        Thread.sleep(1000);
        getPageHomeWeb().getProfileDropdown().click();
    }
    @When("^\\[Home Page] User clicks on logout button from home page$")
    public void userClicksOnLogoutButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageHomeWeb().getLogoutButton().click();
    }
    @Then("[Home Page] User should see home tab in header")
    public void userShouldSeeHomeTabInHeader(){
        Assert.assertTrue(getPageHomeWeb().getHomeTab().isDisplayed());
    }
    @And("[Home Page] User should see the welcome heading")
    public void userShouldSeeWelcomeHeading(){
        Assert.assertTrue(getPageHomeWeb().getWelcomeHeading().isDisplayed());
    }
}
