package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageSchedulerWeb {
    private String whoToCallDropdownXpath = "//*[@id=\"mui-component-select-callerList\"]";
    private String firstSeniorInListOfWhoToCallCss = "ul li:nth-child(2)";
    private String assignedCareAgentDropdownCss = "div:nth-child(12) div:nth-child(3) div div div";
    private String seniorZubairDogarCss = "ul li:nth-child(23)";
    private String callPriorityDropdownCss = "div:nth-child(13) div:nth-child(3) div div div";
    private String highCallPriorityCss = "ul li:nth-child(2)";
    private String callScheduledDateInputBoxCss = "div:nth-child(14) input";
    private String callScheduledTimeInputBoxCss = "div:nth-child(15) input";
    private String callDurationDropdownCss = "div:nth-child(16) div:nth-child(3) div div div";
    private String callDurationFirstOptionCss = "ul li:nth-child(2)";
    private String callReasonTextboxCss = "div:nth-child(17) input";
    private String callTypeDropdownCss = "div:nth-child(18) div:nth-child(3) div div div";
    private String callTypeFallDetectedCss = "ul li:nth-child(2)";
    private String callScheduleSubmitButtonXpath = "//*[@id=\"root\"]/div[1]/div/div/div[2]/form/div/div/div[2]";
    private String callScheduledSuccessAlertXpath = "//*[@id=\"root\"]/div[1]/div/div[2]";
    public PageSchedulerWeb(Page page) {
    }

    public WebElement getWhoToCallDropdown() {
        { return WebConnector.driver.findElement(By.xpath(whoToCallDropdownXpath));}
    }
    public WebElement getFirstSeniorInList() {
        { return WebConnector.driver.findElement(By.cssSelector(firstSeniorInListOfWhoToCallCss));}
    }
    public WebElement getAssignedCareAgentDropdown() {
        { return WebConnector.driver.findElement(By.cssSelector(assignedCareAgentDropdownCss));}
    }
    public WebElement getSeniorZubairDogar() {
        { return WebConnector.driver.findElement(By.cssSelector(seniorZubairDogarCss));}
    }
    public WebElement getCallPriorityDropdown() {
        { return WebConnector.driver.findElement(By.cssSelector(callPriorityDropdownCss));}
    }
    public WebElement getHighCallPriority() {
        { return WebConnector.driver.findElement(By.cssSelector(highCallPriorityCss));}
    }
    public WebElement getCallScheduledDate() {
        { return WebConnector.driver.findElement(By.cssSelector(callScheduledDateInputBoxCss));}
    }
    public WebElement getCallScheduledTime() {
        { return WebConnector.driver.findElement(By.cssSelector(callScheduledTimeInputBoxCss));}
    }
    public WebElement getCallDurationDropdown() {
        { return WebConnector.driver.findElement(By.cssSelector(callDurationDropdownCss));}
    }
    public WebElement getCallDurationFirstOption() {
        { return WebConnector.driver.findElement(By.cssSelector(callDurationFirstOptionCss));}
    }
    public WebElement getCallReason() {
        { return WebConnector.driver.findElement(By.cssSelector(callReasonTextboxCss));}
    }
    public WebElement getCallTypeDropdown() {
        { return WebConnector.driver.findElement(By.cssSelector(callTypeDropdownCss));}
    }
    public WebElement getCallTypeFallDetected() {
        { return WebConnector.driver.findElement(By.cssSelector(callTypeFallDetectedCss));}
    }
    public WebElement getScheduleSubmitButton() {
        { return WebConnector.driver.findElement(By.xpath(callScheduleSubmitButtonXpath));}
    }
    public WebElement getCallScheduledSuccessAlert() {
        { return WebConnector.driver.findElement(By.xpath(callScheduledSuccessAlertXpath));}
    }
}
