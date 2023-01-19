package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageHomeWeb {

    private String WelcomeHeader = "div:nth-child(1) > p > a" ;
    private String ProfileDropdown =  " div.MuiBox-root.css-0 > div > div > svg" ;

    public PageHomeWeb(Page page) {
    }

    public WebElement getWelcomeHeader() { return  WebConnector.driver.findElement(By.cssSelector(WelcomeHeader)); }
    public WebElement getProfileDropdown() {return WebConnector.driver.findElement(By.cssSelector(ProfileDropdown)); }
}
