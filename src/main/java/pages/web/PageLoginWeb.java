package pages.web;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageLoginWeb {

    private String EMAIL_ID = "email" ;
    private String PASSWORD_ID= "password";
    private String LOGIN_BUTTON_CSS= "form > button";

    public PageLoginWeb(Page page) {
    }

    public WebElement getEmail() { return  WebConnector.driver.findElement(By.id(EMAIL_ID)); }
    public WebElement getPassword() { return  WebConnector.driver.findElement(By.id(PASSWORD_ID)); }
    public WebElement getLoginButton() { return  WebConnector.driver.findElement(By.cssSelector(LOGIN_BUTTON_CSS)); }

    public WebElement getLoginButtonAndroid() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(EMAIL_ID));
    }
}
