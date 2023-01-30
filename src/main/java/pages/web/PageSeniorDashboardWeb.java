package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageSeniorDashboardWeb {

    private String schedulerTabCss = "div:nth-child(6) > button";
    public PageSeniorDashboardWeb(Page page) {
    }


    public WebElement getSchedulerTab() {
        { return WebConnector.driver.findElement(By.cssSelector(schedulerTabCss));}
    }
}
