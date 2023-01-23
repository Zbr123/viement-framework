package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageHomeWeb {

    private String welcomeHeading = "h2:nth-child(1)";
    private String homeTabCss = "div:nth-child(1) > p > a" ;


//    private String ProfileDropdown =  "div.MuiBox-root.css-0 > div > div > svg"

    private String profileDropdownCss =  ".MuiBox-root.css-u4p24i > div.MuiBox-root.css-0";

    private String logoutButtonCss = "nav > div:nth-child(2) > span";

    public PageHomeWeb(Page page) {
    }

    public WebElement getWelcomeHeading() { return  WebConnector.driver.findElement(By.cssSelector(welcomeHeading)); }

    public WebElement getProfileDropdown() {return WebConnector.driver.findElement(By.cssSelector(profileDropdownCss)); }
    public WebElement getLogoutButton() {return WebConnector.driver.findElement(By.cssSelector(logoutButtonCss));}
    public WebElement getHomeTab() {return WebConnector.driver.findElement(By.cssSelector(homeTabCss));}
}
