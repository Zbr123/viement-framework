package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageForgotPasswordWeb {
    private String EnterRecoveryEmailID = "#mui-4";
    private String ResetPasswordButtonID = "button";
    public PageForgotPasswordWeb(Page page) {
    }

    public WebElement getEnterRecoveryEmail() { return  WebConnector.driver.findElement(By.id(EnterRecoveryEmailID)); }
    public WebElement getResetPasswordButton() { return  WebConnector.driver.findElement(By.id(ResetPasswordButtonID)); }
}