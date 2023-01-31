package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pages.Page;

import java.util.Random;

public class WebAddSeniorPage extends Page {
//    Random randomGenerator = new Random();
    CommonFunctions commonFunctions = new CommonFunctions();
    @When("\\[Web Add Senior Page\\] User enters first name (.*)$")
    public void enterFirstName(String firstName) throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getSeniorFirstName().sendKeys(firstName);
    }
    @When("\\[Web Add Senior Page\\] User enters last name (.*)$")
    public void enterLastName(String lastName) throws InterruptedException {
        Thread.sleep(1000);
        String suffixNumber = RandomStringUtils.randomNumeric(2);
        String last_Name_with_suffixNumber = lastName+suffixNumber;
        getPageAddSenior().getSeniorLastName().sendKeys(last_Name_with_suffixNumber);
    }
    @When("\\[Web Add Senior Page\\] User enters mobile phone number (.*)$")
    public void enterMobileNumber(String mobilePhoneNumber) throws InterruptedException {
        Thread.sleep(1000);
        String randomNumbers = RandomStringUtils.randomNumeric(5);
        String mobileNo = mobilePhoneNumber+randomNumbers;
        getPageAddSenior().getMobileNumber().sendKeys(mobileNo);
    }
    @When("^\\[Web Add Senior Page] User clicks on gender select dropdown$")
    public void clickOnGenderSelectDropdown() throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getGenderSelectDropdown().click();
    }
    @When("^\\[Web Add Senior Page] User clicks on male button$")
    public void clickOnMaleSelectButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getMaleSelectButton().click();
    }
    @When("^\\[Web Add Senior Page] User enters date of birth (.*)$")
    public void enterDateOfBirth(String seniorDateOfBirth) throws InterruptedException {
        Thread.sleep(3000);
        getPageAddSenior().getAddSeniorDateOfBirth().sendKeys(seniorDateOfBirth);
    }

    @When("^\\[Web Add Senior Page] User enters senior email address$")
    public void enterSeniorEmail() throws InterruptedException {
        Thread.sleep(5000);
        int randomInt = commonFunctions.randomEmialSuffix();
        String randomNumberString = String.valueOf(randomInt);

        getPageAddSenior().getSeniorEmail().sendKeys("ahsan.kahn+automation" + randomNumberString +"@vimient.com");
    }
    @And("^\\[Web Add Senior Page] User enters street address (.*)$")
    public void enterSeniorAddress(String seniorAddress) {
        getPageAddSenior().getSeniorAddress().sendKeys(seniorAddress);
    }
    @And("^\\[Web Add Senior Page] User clicks on state select dropdown$")
    public void clickOnStateSelectDropdown() {
        getPageAddSenior().getStateSelectDropdown().click();
    }
    @And("^\\[Web Add Senior Page] User clicks on colorado state button$")
    public void clickOnColoradoState() {
        getPageAddSenior().getStateColoradoButton().click();
    }
    @And("^\\[Web Add Senior Page] User enters senior city (.*)$")
    public void enterSeniorCity(String seniorCity) {
        getPageAddSenior().getSeniorCity().sendKeys(seniorCity);
    }
    @And("^\\[Web Add Senior Page] User enters senior zipcode (.*)$")
    public void enterSeniorZipcode(String seniorZipcode) {
        getPageAddSenior().getSeniorZipcode().sendKeys(seniorZipcode);
    }
    @And("^\\[Web Add Senior Page] User clicks on create account button$")
    public void clickOnCreateAccountButton() {
        getPageAddSenior().getCreateAccountButton().click();
    }
    @Then("^\\[Web Add Senior Page] User should see the account created success alert in green below$")
    public void userShouldSeeAccountCreatedSuccessAlert() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getPageAddSenior().getAccountCreatedSuccessAlert().isDisplayed());
    }
}
