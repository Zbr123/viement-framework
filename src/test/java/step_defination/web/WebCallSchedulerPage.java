package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

import java.util.Objects;

public class WebCallSchedulerPage extends Page {
    CommonFunctions commonFunctions = new CommonFunctions();

    @When("^\\[Web Scheduler Page] User clicks on (.*) dropdown$")
    public void userClicksOnSchedulerDropdowns(String schedulerSubtabDropdownsLocatorString) throws InterruptedException {
        Thread.sleep(5000);
        String dropdownLocatorPartString = null;
        if (Objects.equals(schedulerSubtabDropdownsLocatorString, "Who to call")) {
            String[] dropdownLocatorStringPart = schedulerSubtabDropdownsLocatorString.split(" ");
            String dropdownLocatorStringPart1 = dropdownLocatorStringPart[0];
            System.out.println(dropdownLocatorStringPart1);
            String dropdownLocatorStringPart2 = dropdownLocatorStringPart[1];
            System.out.println(dropdownLocatorStringPart2);
            String dropdownLocatorStringPart3 = dropdownLocatorStringPart[2];
            System.out.println(dropdownLocatorStringPart3);
            dropdownLocatorPartString = dropdownLocatorStringPart3 + "erList";
            System.out.println(dropdownLocatorPartString);
            getPageScheduler().getSchedulerDropdowns(dropdownLocatorPartString).click();
        }
        else getPageScheduler().getSchedulerDropdowns(schedulerSubtabDropdownsLocatorString).click();
    }

    @And("^\\[Web Scheduler Page] User clicks on (.*) option in list$")
    public void userClicksOnDropdownOptionInList(String schedulerSubtabDropdownOptionsLocatorString)throws InterruptedException {
        Thread.sleep(500);
        getPageScheduler().getSchedulerDropdownOption(schedulerSubtabDropdownOptionsLocatorString).click();
    }
    @And("^\\[Web Scheduler Page] User enters in the (.*) textbox (.*)$")
    public void userEntersSchedulerTextboxInputs(String schedulerSubtabDateInputLocatorString, String schedulerInputboxData) throws InterruptedException {
        Thread.sleep(500);
        String inputBoxLocatorString = null;
        String inputBoxData = null;
        switch(schedulerSubtabDateInputLocatorString){
            case "Date":
                inputBoxLocatorString = "mui-478";
                inputBoxData = commonFunctions.todaysDateInMMDDYYYY();
                System.out.println(inputBoxLocatorString);
            break;
            case "Time":
                inputBoxLocatorString = "mui-479";
                inputBoxData = commonFunctions.currentTimeInHHMM();
                System.out.println(inputBoxLocatorString);
            break;
            case "Call Reason":
                inputBoxLocatorString = schedulerSubtabDateInputLocatorString;
                inputBoxData = schedulerInputboxData;
                System.out.println(inputBoxLocatorString);
            break;
        }
//        System.out.println(inputBoxLocatorString);
        System.out.println(inputBoxData);
        getPageScheduler().getSchedulerDateInputs(inputBoxLocatorString).sendKeys(inputBoxData);
    }

    @And("^\\[Web Scheduler Page] User clicks on (.*) button$")
    public void userClicksOnSchedulerButtons(String schedulerButtonLocatorString) throws InterruptedException {
        Thread.sleep(500);
        getPageScheduler().getSchedulerButtons(schedulerButtonLocatorString).click();
    }
    @Then("^\\[Web Scheduler Page] User should see a (.*) alert$")
    public void userSeesSchedulerSubtabSuccessAlert(String schedulerSavedSuccessfullyAlert) throws InterruptedException {
        Thread.sleep(5000);
        String savedSuccessfullyAlertLocatorInput = "MuiAlert-message') and contains(., '"+schedulerSavedSuccessfullyAlert;
        System.out.println(savedSuccessfullyAlertLocatorInput);
        Assert.assertTrue(getPageScheduler().getSchedulerSavedSuccessfullyAlert(savedSuccessfullyAlertLocatorInput).isDisplayed());
    }
}
