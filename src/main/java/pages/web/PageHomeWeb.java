package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageHomeWeb {

    private String welcomeHeading = "h2:nth-child(1)";
    private String homeTabCss = "div:nth-child(1) > p > a" ;
    private String profileDropdownCss =  "header div:nth-child(4) div div";
    private String logoutButtonCss = "nav > div:nth-child(2)";
    private String seniorListSearchTextboxCss = "form > div > input";
    private String topSeniorAfterSearchCss = "tbody tr:nth-child(1)";

    public PageHomeWeb(Page page) {
    }

    public WebElement getWelcomeHeading() { return  WebConnector.driver.findElement(By.cssSelector(welcomeHeading)); }

    public WebElement getProfileDropdownHome() {return WebConnector.driver.findElement(By.cssSelector(profileDropdownCss)); }
    public WebElement getLogoutButton() {return WebConnector.driver.findElement(By.cssSelector(logoutButtonCss));}
    public WebElement getHomeTab() {return WebConnector.driver.findElement(By.cssSelector(homeTabCss));}
    public WebElement getSeniorNameInSearchTextbox() { return WebConnector.driver.findElement(By.cssSelector(seniorListSearchTextboxCss));}
    public WebElement getTopSeniorAfterSearch() { return WebConnector.driver.findElement(By.cssSelector(topSeniorAfterSearchCss));}
}
