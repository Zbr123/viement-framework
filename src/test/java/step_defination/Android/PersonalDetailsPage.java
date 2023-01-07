package step_defination.Android;

//import core.utils.AndroidCore.AndroidDriverSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import pages.Page;

import java.util.Random;

public class PersonalDetailsPage extends Page {


    @And("^\\[Personal detail\\] User enter the last name (.*)")
    public void personalDetailUserEnterTheLastName(String lastname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        getPagePersonalDetailsAndroid().getLastName().clear();
//        getPagePersonalDetailsAndroid().getLastName().sendKeys(lastname);
    }

    @Then("^\\[Personal detail\\] User enter the email address \"([^\"]*)\"$")
    public void personalDetailUserEnterTheEmailAddress(String emailaddress) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   //     getPagePersonalDetailsAndroid().getEmailAddress().clear();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
   //     getPagePersonalDetailsAndroid().getEmailAddress().sendKeys(emailaddress+randomInt+"@mailinator.com");
    }

    @And("^\\[Personal detail\\] User tap on the country of residency$")
    public void personalDetailUserTapOnTheCountryOfResidency() throws InterruptedException {
     //   getPagePersonalDetailsAndroid().getCountryOfResidence().click();
        Thread.sleep(5000);
    }

    @Then("^\\[Personal detail] User enter the first name (.*)")
    public void personalDetailUserEnterTheFirstName(String firstname) throws Throwable {
    //    getPagePersonalDetailsAndroid().getFirstName().clear();
    //    getPagePersonalDetailsAndroid().getFirstName().sendKeys(firstname);
    }

    @Then("^\\[Personal detail]\\ User select the country (.*)$")
    public void personalDetailUserSelectTheCountry(String country) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    //    getPagePersonalDetailsAndroid().getSelectCountry(country).click();
//       getBasePage().patientlyScroll("Next");
      //            getBasePage().swipeUp();
    }

    @And("^\\[Personal detail\\] User tap the country$")
    public void personalDetailUserTapTheCountry() throws InterruptedException {
     //   getPagePersonalDetailsAndroid().getCountry().click();

    }

//    @And("^\\[Personal detail\\] User tap the location$")
//    public void personalDetailUserTapTheLocation() {
//        getPagePersonalDetailsAndroid().getlocation().click();
//    }

    @When("^\\[Personal detail\\] User scroll down$")
    public void personalDetailUserScrollDown() {
//        TouchActions action = new TouchActions(AndroidDriverSetup.getAndroidDriver());
//        action.scroll(getHomePageAndroid().getNextButton(), 10, 100);
//        action.perform();
//
//        // JavascriptExecutor js = JavascriptExecutor;
        //js.executeScript("window.scrollBy(250,350)");
//        JavascriptExecutor js = (JavascriptExecutor) AndroidDriverSetup.getAndroidDriver();
//        js.executeScript("window.scrollBy("+0+","+400+")");

    }

    @Then("^\\[Personal detail\\] User select the location (.*)$")
    public void personalDetailUserSelectTheLocation(String location) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   getPagePersonalDetailsAndroid().getSelectTheLocation(location).click();
    }

//    @And("^\\[Personal detail\\] User tap the Department$")
//    public void personalDetailUserTapTheDepartment() {
//        getPagePersonalDetailsAndroid().getDepartment().click();
//    }
//
    @Then("^\\[Personal detail\\] User select the Department (.*)$")
    public void personalDetailUserSelectTheDepartment(String department) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  getPagePersonalDetailsAndroid().getSelectTheDepartment(department).click();
    }

    @Then("^\\[Personal detail\\] User enter the password (.*)$")
    public void personalDetailUserEnterThePassword(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   getPagePersonalDetailsAndroid().getPassword().click();
    //    getPagePersonalDetailsAndroid().getPassword().sendKeys(password);
    }

    @And("^\\[Personal detail\\] user enter the confirm password (.*)$")
    public void personalDetailUserEnterTheConfirmPassword(String confirmpassword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   //     getPagePersonalDetailsAndroid().getConfirmPassword().click();
   //     getPagePersonalDetailsAndroid().getConfirmPassword().sendKeys(confirmpassword);
   //     AndroidDriverSetup.getAndroidDriver().hideKeyboard();
//        Thread.sleep(2000);
//        Actions action=new Actions(AndroidDriverSetup.getAndroidDriver());
//        action.sendKeys(Keys.ENTER).build().perform();

    }

    @When("^\\[Personal detail\\] user tap the gender$")
    public void personalDetailUserTapTheGender() {
   //     getPagePersonalDetailsAndroid().getGender().click();
    }

    @Then("^\\[Personal detail\\] user select the gender$")
    public void personalDetailUserSelectTheGender() {

   //     getPagePersonalDetailsAndroid().getSelectTheGender().click();
    }

    @And("^\\[Personal detail\\] user tap the date of birth$")
    public void personalDetailUserTapTheDateOfBirth() {
     //   getPagePersonalDetailsAndroid().getDateOfBirth().click();
    }

    @And("^\\[Personal Detail\\] user tap the confirm button$")
    public void personalDetailUserTapTheConfirmButton() {
 //       getPagePersonalDetailsAndroid().getConfirm().click();
    }

    @Then("^\\[Personal detail\\] user  see the tick mark on the show your details$")
    public void personalDetailUserSeeTheTickMarkOnTheShowYourDetails() {


    }

    @Then("^\\[Personal detail\\] user  see the tick mark on the show your details \"([^\"]*)\"$")
    public void personalDetailUserSeeTheTickMarkOnTheShowYourDetails(String tickmark) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   //     getPagePersonalDetailsAndroid().getTickMark().isDisplayed();
        org.testng.Assert.assertEquals(tickmark,"");
    }

    @Then("^\\[Personal detail\\] user  see the tick mark on the assess your current health \"([^\"]*)\"$")
    public void personalDetailUserSeeTheTickMarkOnTheAssessYourCurrentHealth(String tickmark) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   getPagePersonalDetailsAndroid().getTickMarkCurrentHealth().isDisplayed();
        Assert.assertEquals(tickmark,"");
    }
}