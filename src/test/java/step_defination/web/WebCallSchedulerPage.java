package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebCallSchedulerPage extends Page {
    CommonFunctions commonFunctions = new CommonFunctions();

    @When("^\\[Web Scheduler Page] User clicks on who to call dropdown$")
    public void userClicksOnWhoToCallDropdown() throws InterruptedException {
        Thread.sleep(5000);
        getPageScheduler().getWhoToCallDropdown().click();
    }

    @And("^\\[Web Scheduler Page] User clicks on first senior in list$")
    public void userClicksOnFirstSeniorInList()throws InterruptedException {
        Thread.sleep(1500);
        getPageScheduler().getFirstSeniorInList().click();
    }
    @And("^\\[Web Scheduler Page] User clicks on assigned care agent dropdown$")
    public void userClicksOnAssignedCareAgentDropdown() throws InterruptedException {
        Thread.sleep(1000);
        getPageScheduler().getAssignedCareAgentDropdown().click();
    }
    @And("^\\[Web Scheduler Page] User clicks on senior zubair dogar$")
    public void userClicksOnSeniorZubairDogar() throws InterruptedException {
        Thread.sleep(1000);
        getPageScheduler().getSeniorZubairDogar().click();
    }
    @And("^\\[Web Scheduler Page] User clicks on call priority dropdown$")
    public void userClicksOnCallPriorityDropdown() throws InterruptedException {
        Thread.sleep(1000);
        getPageScheduler().getCallPriorityDropdown().click();
    }
    @And("^\\[Web Scheduler Page] User clicks on high call priority$")
    public void userClicksOnHighCallPriority() throws InterruptedException {
        Thread.sleep(1000);
        getPageScheduler().getHighCallPriority().click();
    }
    @And("^\\[Web Scheduler Page] User enters current date$")
    public void userEntersCallScheduledDate() throws InterruptedException {
        Thread.sleep(1500);
        String currentDate = commonFunctions.todaysDateInMMDDYYYY();
        getPageScheduler().getCallScheduledDate().sendKeys(currentDate);
    }
    @And("^\\[Web Scheduler Page] User enters ten minutes from current time$")
    public void userEntersCallScheduledTime() throws InterruptedException {
        Thread.sleep(1500);
        getPageScheduler().getCallScheduledTime().sendKeys(commonFunctions.currentTimeInHHMM());
    }
    @And("^\\[Web Scheduler Page] User clicks on call duration dropdown$")
    public void userClicksOnCallDurationDropdown() throws InterruptedException {
        Thread.sleep(1500);
        getPageScheduler().getCallDurationDropdown().click();
    }
    @And("^\\[Web Scheduler Page] User clicks on call duration first option$")
    public void userClicksOnCallDurationFirstOption() throws InterruptedException {
        Thread.sleep(1500);
        getPageScheduler().getCallDurationFirstOption().click();
    }
    @And("^\\[Web Scheduler Page] User enters call reason (.*)$")
    public void userEntersCallReason(String callReason) throws InterruptedException {
        Thread.sleep(1500);
        getPageScheduler().getCallReason().sendKeys(callReason);
    }
    @And("^\\[Web Scheduler Page] User clicks on call type dropdown$")
    public void userClicksOnCallTypeDropdown() throws InterruptedException {
        Thread.sleep(1500);
        getPageScheduler().getCallTypeDropdown().click();
    }
    @And("^\\[Web Scheduler Page] User clicks on call type$")
    public void userClicksOnCallTypeFallDetected() throws InterruptedException {
        Thread.sleep(1500);
        getPageScheduler().getCallTypeFallDetected().click();
    }
    @And("^\\[Web Scheduler Page] User clicks on schedule submit button$")
    public void userClicksOnScheduleSubmitButton() throws InterruptedException {
        Thread.sleep(1500);
        getPageScheduler().getScheduleSubmitButton().click();
    }
    @Then("^\\[Web Scheduler Page] User should see a call schedule success alert message$")
    public void userShouldSeeCallScheduledSuccessAlert()throws InterruptedException {
        Thread.sleep(1500);
        Assert.assertTrue(getPageScheduler().getCallScheduledSuccessAlert().isDisplayed());
    }
}
