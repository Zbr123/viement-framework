package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageAdminWeb {

    private String homeTabCss = "div:nth-child(2) > p a";
    private String adminTabCss = "div:nth-child(1) > p > a";
    private String toDoHeading = "div:nth-child(1) > h2";
    private String profileDropdownCss =  "header div:nth-child(4) path";
    private String logoutButtonCss = "nav > div:nth-child(2)";
    private String addUserCss = "div:nth-child(3) > p > a";

    public PageAdminWeb(Page page) {
    }

    public WebElement getHomeTab() { return  WebConnector.driver.findElement(By.cssSelector(homeTabCss)); }
    public WebElement getProfileDropdownAdmin() { return WebConnector.driver.findElement(By.cssSelector(profileDropdownCss)); }
    public WebElement getLogoutButton() { return WebConnector.driver.findElement(By.cssSelector(logoutButtonCss)); }
    public WebElement getAddUserTab() { return WebConnector.driver.findElement(By.cssSelector(addUserCss)); }
    public WebElement getAdminTab() { return WebConnector.driver.findElement(By.cssSelector(adminTabCss)); }
    public WebElement getToDoHeading() { return WebConnector.driver.findElement(By.cssSelector(toDoHeading)); }
}
