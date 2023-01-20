package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageHomeWeb {

    private String WelcomeHeader = "div:nth-child(1) > p > a" ;

//    private String ProfileDropdown =  "div.MuiBox-root.css-0 > div > div > svg"

    private String ProfileDropdownCSS =  ".MuiBox-root.css-u4p24i > div.MuiBox-root.css-0";

    private String LogoutButtonCSS = "nav > div:nth-child(2) > span";

    public PageHomeWeb(Page page) {
    }

    public WebElement getWelcomeHeader() { return  WebConnector.driver.findElement(By.cssSelector(WelcomeHeader)); }

    public WebElement getProfileDropdown() {return WebConnector.driver.findElement(By.cssSelector(ProfileDropdownCSS)); }
    public WebElement getLogoutButton() {return WebConnector.driver.findElement(By.cssSelector(LogoutButtonCSS));}
}
