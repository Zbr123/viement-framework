package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageAdminWeb {

    private String HOME_TAB_CSS = "div:nth-child(2) > p > a" ;
    private String ProfileDropdownCSS =  "div > svg" ;

//    private String ProfileDropdownCSS =  ".MuiBox-root.css-u4p24i > div.MuiBox-root.css-0";
    private String LogoutButtonCSS = "nav > div:nth-child(2) > span";
    private String AddUserCss = "div:nth-child(3) > p";

    public PageAdminWeb(Page page) {
    }

    public WebElement getHomeTab() { return  WebConnector.driver.findElement(By.cssSelector(HOME_TAB_CSS)); }
    public WebElement getProfileDropdown() { return WebConnector.driver.findElement(By.cssSelector(ProfileDropdownCSS)); }
    public WebElement getLogoutButton() { return WebConnector.driver.findElement(By.cssSelector(LogoutButtonCSS)); }
    public WebElement getAddUserTab() { return WebConnector.driver.findElement(By.cssSelector(AddUserCss)); }
}
