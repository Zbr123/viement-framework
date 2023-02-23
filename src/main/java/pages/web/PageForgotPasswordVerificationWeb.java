package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageForgotPasswordVerificationWeb {

    public PageForgotPasswordVerificationWeb(Page page) {
    }

    public WebElement getFPVPageH3Heading(String FPVPageHeadingLocatorString1, String FPVPageHeadingLocatorString2) {
        return  WebConnector.driver.findElement(By.xpath(String.format("//div[contains(@class, '%s') and contains(., '%s')]", FPVPageHeadingLocatorString1, FPVPageHeadingLocatorString2)));
    }
    public WebElement getAlertCrossButton() {
        return  WebConnector.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/svg/path"));
    }
}