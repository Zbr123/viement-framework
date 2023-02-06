package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebProviderInfoSubTabPage extends Page {

    @Then("^\\[Web Provider Info SubTab Page] User should see the doctor1 heading$")
    public void userSeesDoctor1Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDoctor1Heading().isDisplayed());
    }
    @And("^\\[Web Provider Info SubTab Page] User should see the dentist1 heading$")
    public void userSeesDentist1Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDentist1Heading().isDisplayed());
    }
    @When("^\\[Web Provider Info SubTab Page] User enters doctor1 practice name (.*)$")
    public void userEntersDoctor1PracticeName(String doctor1PracticeName) {
        getPageProviderInfoSubTab().getDoctor1PracticeName().sendKeys(doctor1PracticeName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters doctor1 first name (.*)$")
    public void userEntersDoctor1FirstName(String doctor1FirstName) {
        getPageProviderInfoSubTab().getDoctor1FirstName().sendKeys(doctor1FirstName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters doctor1 last name (.*)$")
    public void userEntersDoctor1LastName(String doctor1LastName) {
        getPageProviderInfoSubTab().getDoctor1LastName().sendKeys(doctor1LastName);
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on doctor1 specialty dropdown$")
    public void userClicksOnDoctor1Specialty() throws InterruptedException {
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getDoctor1SpecialtyDropdown().click();
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on chiropractor$")
    public void userClicksOnDoctor1Chiropractor() throws InterruptedException {
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getDoctor1SelectChiropractor().click();
    }
    @And("^\\[Web Provider Info SubTab Page] User enters doctor1 contact phone (.*)$")
    public void userEntersDoctor1ContactPhone(String doctor1ContactPhone) throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDoctor1ContactPhone().sendKeys(doctor1ContactPhone);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters doctor1 email address (.*)$")
    public void userEntersDoctor1EmailAddress (String doctor1EmailAddress) throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDoctor1EmailAddress().sendKeys(doctor1EmailAddress);
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on add doctor button$")
    public void userClicksOnAddDoctorButton () throws InterruptedException {
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getAddDoctorButton().click();
    }
    @Then("^\\[Web Provider Info SubTab Page] User should see doctor2 heading$")
    public void userSeesDoctor2Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDoctor2Heading().isDisplayed());
    }
    @When("^\\[Web Provider Info SubTab Page] User enters dentist1 practice name (.*)$")
    public void userEntersDentist1PracticeName(String dentist1PracticeName) throws InterruptedException {
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getDentist1PracticeName().sendKeys(dentist1PracticeName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters dentist1 first name (.*)$")
    public void userEntersDentist1FirstName(String dentist1FirstName) throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1FirstName().sendKeys(dentist1FirstName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters dentist1 last name (.*)$")
    public void userEntersDentist1LastName(String dentist1LastName) throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1LastName().sendKeys(dentist1LastName);
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on dentist1 specialty dropdown$")
    public void userClicksOnDentist1SpecialtyDropdown() throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1SpecialtyDropdown().click();
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on endodontist$")
    public void userClicksOnDentist1Endodontist() throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1Endodontist().click();
    }
    @And("^\\[Web Provider Info SubTab Page] User enters dentist1 contact phone (.*)$")
    public void userEntersDentist1ContactPhone(String dentist1PhoneContact) throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1ContactPhone().sendKeys(dentist1PhoneContact);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters dentist1 email address (.*)$")
    public void userEntersDentist1EmailAddress (String dentist1EmailAddress) throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getDentist1EmailAddress().sendKeys(dentist1EmailAddress);
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on add dentist button$")
    public void userEntersDentist1EmailContact() throws InterruptedException {
        Thread.sleep(500);
        getPageProviderInfoSubTab().getAddDentistButton().click();
    }
    @Then("^\\[Web Provider Info SubTab Page] User should see dentist2 heading$")
    public void userSeesDentist2Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDentist2Heading().isDisplayed());
    }
}
