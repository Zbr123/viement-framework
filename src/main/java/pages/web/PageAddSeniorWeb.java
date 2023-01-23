package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageAddSeniorWeb {

    private String FirstNameXpath = "//*[@id=\"First Name\"]" ;
    private String FirstNameCSS = "#First\\ Name";
    private String LastNameXpath = "//*[@id=\"Last Name\"]";
    private String LastNameCSS = "#Last\\ Name";
    private String MobileNumberXpath = "//*[@id=\"Mobile Phone\"]";
    private String MobileNumberCSS = "#Mobile\\ Phone";
    private String GenderSelectDropdownCSS = "#mui-component-select-gender";
//    private String SelectMaleButtonXpath = "//*[@id="menu-gender"]/div[3]/ul/li[2]";
    private String SelectMaleButtonCSS = "li:nth-child(2)";

    public PageAddSeniorWeb(Page page) {
    }

//    public WebElement getSeniorFirstName() { return  WebConnector.driver.findElement(By.xpath(FirstNameXpath)); }
    public WebElement getSeniorFirstName() { return  WebConnector.driver.findElement(By.cssSelector(FirstNameCSS)); }
    public WebElement getSeniorLastName() { return  WebConnector.driver.findElement(By.xpath(LastNameXpath)); }
//    public WebElement getSeniorLastName() { return  WebConnector.driver.findElement(By.cssSelector(LastNameCSS)); }
    public WebElement getMobileNumber() { return  WebConnector.driver.findElement(By.xpath(MobileNumberXpath)); }
//public WebElement getMobileNumber() { return  WebConnector.driver.findElement(By.cssSelector(MobileNumberCSS)); }
    public WebElement getGenderSelectDropdown() { return  WebConnector.driver.findElement(By.cssSelector(GenderSelectDropdownCSS)); }
    public WebElement getMaleSelectButton() { return  WebConnector.driver.findElement(By.cssSelector(SelectMaleButtonCSS)); }
}