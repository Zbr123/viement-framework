package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageAdminWeb {

    private String ADMIN_TAB_CSS = "div:nth-child(1) > p > a" ;

    public PageAdminWeb(Page page) {
    }

    public WebElement getAdminTab() { return  WebConnector.driver.findElement(By.cssSelector(ADMIN_TAB_CSS)); }
}
