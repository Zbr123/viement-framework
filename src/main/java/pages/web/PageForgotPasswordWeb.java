package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageForgotPasswordWeb {

    public PageForgotPasswordWeb(Page page) {
    }

    public WebElement getEnterRecoveryEmail() {
        return  WebConnector.driver.findElement(By.cssSelector("input[name='email']"));
    }
    public WebElement getResetPasswordButton(String forgotPasswordButtonLocatorString) {
        return  WebConnector.driver.findElement(By.cssSelector("button[type='submit']"));
    }
    public WebElement getForgotPasswordH1Heading(String forgotPasswordPageHeadingLocatorString) {
        return  WebConnector.driver.findElement(By.xpath(String.format("//h1[contains(., '%s')]", forgotPasswordPageHeadingLocatorString)));
    }
}