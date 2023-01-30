package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebHomePage extends Page {

    @When("^\\[Web Home Page] User clicks on profile dropdown from home page$")
    public void clickOnProfileDropdownHome() throws InterruptedException {
        Thread.sleep(1000);
        getPageHomeWeb().getProfileDropdown().click();
    }
    @When("^\\[Web Home Page] User clicks on logout button from home page$")
    public void userClicksOnLogoutButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageHomeWeb().getLogoutButton().click();
    }
    @Then("^\\[Web Home Page] User should see home tab in header")
    public void userShouldSeeHomeTabInHeader(){
        Assert.assertTrue(getPageHomeWeb().getHomeTab().isDisplayed());
    }
    @And("^\\[Web Home Page] User should see the welcome header$")
    public void userShouldSeeWelcomeHeading() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageHomeWeb().getWelcomeHeading().isDisplayed());
    }
    @When("^\\[Web Home Page] User enters in the senior list search textbox (.*)$")
    public void enterSeniorNameInSearchTextbox(String seniorNameForSearch) throws InterruptedException {
        Thread.sleep(5000);
        getPageHomeWeb().getSeniorNameInSearchTextbox().sendKeys(seniorNameForSearch);
    }
    @And("^\\[Web Home Page] User clicks on the top senior after search$")
    public void clickOnTopSeniorAfterSearch() throws InterruptedException {
        Thread.sleep(5000);
        getPageHomeWeb().getTopSeniorAfterSearch().click();
    }
}
