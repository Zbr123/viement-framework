package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageAddSeniorWeb {

    private String firstNameXpath = "//*[@id=\"First Name\"]" ;
    private String firstNameCss = "#First\\ Name";
    private String lastNameXpath = "//*[@id=\"Last Name\"]";
    private String lastNameCSS = "#Last\\ Name";
    private String mobileNumberXpath = "//*[@id=\"Mobile Phone\"]";
    private String mobileNumberCSS = "#Mobile\\ Phone";
    private String genderSelectDropdownCss = "#mui-component-select-gender";
//    private String SelectMaleButtonXpath = "//*[@id="menu-gender"]/div[3]/ul/li[2]";
    private String selectMaleButtonCss = "li:nth-child(2)";
    private String seniorDateOfBirthXpath = "/html/body/div[1]/div[1]/div/div/div[3]/div/form[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[6]/div/div[1]/div/div/input";
//private String AddSeniorDateOfBirthCss = "#mui-57";
    private String seniorEmailCss = "#Email";
    private String seniorAddressCss = "#Street\\ Address";
//    private String stateSelectDropDownCss = "#mui-component-select-address\\.state";
    private String stateSelectDropDownXpath = "//*[@id=\"mui-component-select-address.state\"]";
    private String stateColoradoButtonXpath = "//*[@id=\"menu-address.state\"]/div[3]/ul/li[8]";
    private String seniorCityCss = "#City";
    private String seniorZipcodeCss = "#Zip\\ code";
    private String createAccountButtonXpath = "//*[@id=\"tabpanel-0\"]/div/form[1]/div[2]/button";
    private String accountCreatedSuccessAlertCss = "div > div.MuiAlert-message.css-1xsto0d";
    public PageAddSeniorWeb(Page page) {

    }

//    public WebElement getSeniorFirstName() { return  WebConnector.driver.findElement(By.xpath(FirstNameXpath)); }
    public WebElement getSeniorFirstName() { return  WebConnector.driver.findElement(By.cssSelector(firstNameCss)); }
    public WebElement getSeniorLastName() { return  WebConnector.driver.findElement(By.xpath(lastNameXpath)); }
//    public WebElement getSeniorLastName() { return  WebConnector.driver.findElement(By.cssSelector(LastNameCSS)); }
    public WebElement getMobileNumber() { return  WebConnector.driver.findElement(By.xpath(mobileNumberXpath)); }
//public WebElement getMobileNumber() { return  WebConnector.driver.findElement(By.cssSelector(MobileNumberCSS)); }
    public WebElement getGenderSelectDropdown() { return  WebConnector.driver.findElement(By.cssSelector(genderSelectDropdownCss)); }
    public WebElement getMaleSelectButton() { return  WebConnector.driver.findElement(By.cssSelector(selectMaleButtonCss)); }
    public WebElement getAddSeniorDateOfBirth() { return  WebConnector.driver.findElement(By.xpath(seniorDateOfBirthXpath)); }
//    public WebElement getDateOfBirth() { return  WebConnector.driver.findElement(By.cssSelector(AddSeniorDateOfBirthCss)); }
    public WebElement getSeniorEmail() { return WebConnector.driver.findElement(By.cssSelector(seniorEmailCss)); }
    public WebElement getSeniorAddress() { return WebConnector.driver.findElement(By.cssSelector(seniorAddressCss)); }
//    public WebElement getStateSelectDropdown() { return WebConnector.driver.findElement(By.cssSelector(stateSelectDropDownCss)); }
    public WebElement getStateSelectDropdown() { return WebConnector.driver.findElement(By.xpath(stateSelectDropDownXpath)); }
    public WebElement getStateColoradoButton() { return WebConnector.driver.findElement(By.xpath(stateColoradoButtonXpath)); }
    public WebElement getSeniorCity() { return WebConnector.driver.findElement(By.cssSelector(seniorCityCss)); }
    public WebElement getSeniorZipcode() { return WebConnector.driver.findElement(By.cssSelector(seniorZipcodeCss)); }
    public WebElement getCreateAccountButton() { return WebConnector.driver.findElement(By.xpath(createAccountButtonXpath)); }
    public WebElement getAccountCreatedSuccessAlert() { return WebConnector.driver.findElement(By.cssSelector(accountCreatedSuccessAlertCss)); }
}