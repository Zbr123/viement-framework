package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageAddSeniorWeb {

    private String FirstNameXpath = "//*[@id=\"First Name\"]" ;
    private String FirstNameCss = "#First\\ Name";
    private String LastNameXpath = "//*[@id=\"Last Name\"]";
    private String LastNameCSS = "#Last\\ Name";
    private String MobileNumberXpath = "//*[@id=\"Mobile Phone\"]";
    private String MobileNumberCSS = "#Mobile\\ Phone";
    private String GenderSelectDropdownCss = "#mui-component-select-gender";
//    private String SelectMaleButtonXpath = "//*[@id="menu-gender"]/div[3]/ul/li[2]";
    private String SelectMaleButtonCss = "li:nth-child(2)";
    private String addSeniorDateOfBirthXpath = "/html/body/div[1]/div[1]/div/div/div[3]/div/form[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[6]/div/div[1]/div/div/input";
//private String AddSeniorDateOfBirthCss = "#mui-57";
    private String addSeniorEmail = "#Email";
    public PageAddSeniorWeb(Page page) {
    }

//    public WebElement getSeniorFirstName() { return  WebConnector.driver.findElement(By.xpath(FirstNameXpath)); }
    public WebElement getSeniorFirstName() { return  WebConnector.driver.findElement(By.cssSelector(FirstNameCss)); }
    public WebElement getSeniorLastName() { return  WebConnector.driver.findElement(By.xpath(LastNameXpath)); }
//    public WebElement getSeniorLastName() { return  WebConnector.driver.findElement(By.cssSelector(LastNameCSS)); }
    public WebElement getMobileNumber() { return  WebConnector.driver.findElement(By.xpath(MobileNumberXpath)); }
//public WebElement getMobileNumber() { return  WebConnector.driver.findElement(By.cssSelector(MobileNumberCSS)); }
    public WebElement getGenderSelectDropdown() { return  WebConnector.driver.findElement(By.cssSelector(GenderSelectDropdownCss)); }
    public WebElement getMaleSelectButton() { return  WebConnector.driver.findElement(By.cssSelector(SelectMaleButtonCss)); }
    public WebElement getAddSeniorDateOfBirth() { return  WebConnector.driver.findElement(By.xpath(addSeniorDateOfBirthXpath)); }
//    public WebElement getDateOfBirth() { return  WebConnector.driver.findElement(By.cssSelector(AddSeniorDateOfBirthCss)); }
    public WebElement getSeniorEmail() { return WebConnector.driver.findElement(By.cssSelector(addSeniorEmail)); }
}