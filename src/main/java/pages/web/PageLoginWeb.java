package pages.web;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageLoginWeb {

    private String emailID = "email" ;
    private String passwordID= "password";
    private String loginButtonCss= "form > button";
    private String forgotPasswordCss = "h6 > a";

    public PageLoginWeb(Page page) {
    }

    public WebElement getEmail() { return  WebConnector.driver.findElement(By.id(emailID)); }
    public WebElement getPassword() { return  WebConnector.driver.findElement(By.id(passwordID)); }
    public WebElement getLoginButton() { return  WebConnector.driver.findElement(By.cssSelector(loginButtonCss)); }
    public WebElement getForgotPassword() { return WebConnector.driver.findElement(By.cssSelector(forgotPasswordCss));}

}
