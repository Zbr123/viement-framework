package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.Page;

import java.util.Objects;

public class WebCareCircleSubTabPage extends Page {

    CommonFunctions commonFunctions = new CommonFunctions();
    @Then("^\\[Web Care Circle SubTab Page] User should see the (.*) heading$")
    public void userSeesContact1Heading(String careCirclePageHeadings) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageCareCircleSubTab().getCareCircleHeadings(careCirclePageHeadings).isDisplayed());
    }
    @When("^\\[Web Care Circle SubTab Page] User enters (.*) in (.*) text box$")
    public void userEntersCareCircleTextInputs(String textboxInput, String textboxInputLocator) throws InterruptedException {
        Thread.sleep(1000);
        if(Objects.equals(textboxInputLocator, "Mobile Phone")) {
            String randomNumbers = RandomStringUtils.randomNumeric(5);
            String mobileNo = textboxInput + randomNumbers;
            getPageCareCircleSubTab().getCareCircleTextboxInputs(textboxInputLocator).sendKeys(mobileNo);
        }
        getPageCareCircleSubTab().getCareCircleTextboxInputs(textboxInputLocator).sendKeys(textboxInput);
    }
    @And("^\\[Web Care Circle SubTab Page] User clicks on (.*) dropdown$")
    public void userClicksOnCareCircleDropdowns(String dropdownLocator) throws InterruptedException {
        Thread.sleep(1000);
        getPageCareCircleSubTab().getCareCircleDropdowns(dropdownLocator).click();
    }
    @And("^\\[Web Care Circle SubTab Page] User clicks on (.*) option$")
    public void userClicksOnCareCircleDropdownOptions(String dropdownOptionLocator) throws InterruptedException {
        Thread.sleep(1000);
        getPageCareCircleSubTab().getCareCircleDropdownOptions(dropdownOptionLocator).click();
    }
}