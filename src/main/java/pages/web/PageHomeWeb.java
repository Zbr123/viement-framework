package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageHomeWeb {

    private String HOME_BUTTON_CSS = "div:nth-child(2) > p > a" ;

    public PageHomeWeb(Page page) {
    }

    public WebElement getHomeButton() { return  WebConnector.driver.findElement(By.cssSelector(HOME_BUTTON_CSS)); }
}
