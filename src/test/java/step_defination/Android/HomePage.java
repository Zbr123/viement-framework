package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Page;

public class HomePage extends Page {


    @And("^\\[Home Page] User clicks on profile icon$")
    public void clickOnProfileSwticher() throws InterruptedException {
        getPageHomeAndroid().getProfileIcon().click();
    }

    @And("^\\[Home Page] User clicks on care insight tab$")
    public void clickOnCareInsightTab() throws InterruptedException {
        Thread.sleep(5000);
        getPageHomeAndroid().getCareInsightTab().click();
    }
    @And("^\\[Home Page] User clicks on info button$")
    public void clickOnInfoButton() throws InterruptedException {
        Thread.sleep(3000);
        getPageHomeAndroid().getInfoButton().click();
    }

    @And("^\\[Home Page] Home page should open successfully$")
    public void test() throws InterruptedException {
        System.out.println("Home Page Open Successfully");
    }
    @Then("^\\[Home Page] User sees Senior name heading$")
    public void userSeesSeniorNameHeading() throws InterruptedException {
        Thread.sleep(8000);
        Assert.assertTrue(getPageHomeAndroid().getSeniorNameHeading().isDisplayed());
    }
    @When("^\\[Home Page] User taps on hamburger menu$")
    public void userClicksOnHamburgerMenu() {
        getPageHomeAndroid().getHamburgerMenu().click();
    }
    @And("^\\[Home Page] User taps on wellness signs tab$")
    public void userClicksOnWellnessSignsTab() {
        getPageHomeAndroid().getWellnessSignsTab().click();
    }
}