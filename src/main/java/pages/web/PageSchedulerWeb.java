package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageSchedulerWeb {
    private String whoToCallDropdownXpath = "//*[@id=\"mui-component-select-callerList\"]";
    public PageSchedulerWeb(Page page) {
    }



    public WebElement getWhoToCallDropdown() {
        { return WebConnector.driver.findElement(By.xpath(whoToCallDropdownXpath));}
    }
}
