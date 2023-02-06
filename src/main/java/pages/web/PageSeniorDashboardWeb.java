package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageSeniorDashboardWeb {

    private String schedulerTabCss = "div:nth-child(6) > button";
    private String wellnessSurveyTabCss = "div:nth-child(5) button";
    private String onboardingInfoTabCss = "div:nth-child(1) > div > div > div:nth-child(1) > div:nth-child(2) > button";
    public PageSeniorDashboardWeb(Page page) {
    }
    public WebElement getSchedulerTab() {
        { return WebConnector.driver.findElement(By.cssSelector(schedulerTabCss));}
    }
    public WebElement getWellnessSurveyTab() {
        { return WebConnector.driver.findElement(By.cssSelector(wellnessSurveyTabCss));}
    }
    public WebElement getOnboardingInfoTab() {
        { return WebConnector.driver.findElement(By.cssSelector(onboardingInfoTabCss));}
    }
}
