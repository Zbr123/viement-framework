package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PagePartner {

    private String Help_Center_Css = ".elementor-nav-menu--main .elementor-nav-menu > li:nth-child(4)" ;
    private String Freq_Ask_Ques_Css= ".elementor-nav-menu--main .elementor-nav-menu > li:nth-child(4) .menu-item-type-post_type:nth-child(1)";

    public PagePartner(Page page) {
    }

    public WebElement getHelpCenter() { return  WebConnector.driver.findElement(By.cssSelector(Help_Center_Css)); }
    public WebElement getFAQ() { return  WebConnector.driver.findElement(By.cssSelector(Freq_Ask_Ques_Css)); }
}
