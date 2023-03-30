package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Page;

public class WelcomePage extends Page {


    @And("^\\[Welcome Page] User clicks on continue button$")
    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(8000);
        getPageWelcomeAndroid().getContinueButton().click();
    }

    @Then("^\\[Welcome Page] User sees Welcome to Vimient heading$")
    public void test() throws InterruptedException {
        Thread.sleep(8000);
        System.out.println("Welcome Page Open Successfully");
        Assert.assertTrue(getPageWelcomeAndroid().getWelcomePageHeading().isDisplayed());
    }
}