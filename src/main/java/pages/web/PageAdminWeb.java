package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageAdminWeb {

    private String HOME_TAB_CSS = "div:nth-child(2) > p > a" ;

    public PageAdminWeb(Page page) {
    }

    public WebElement getHomeTab() { return  WebConnector.driver.findElement(By.cssSelector(HOME_TAB_CSS)); }
}
