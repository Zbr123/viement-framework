package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageHomeWeb {

    private String XYZ = "div:nth-child(1) > p > a" ;

    public PageHomeWeb(Page page) {
    }

    public WebElement GETTXGXG() { return  WebConnector.driver.findElement(By.cssSelector(XYZ)); }
}
