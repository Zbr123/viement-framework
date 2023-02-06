package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebProviderInfoSubTabPage extends Page {

    @Then("^\\[Web Provider Info SubTab Page] User should see the doctor1 heading$")
    public void userSeesProviderInfoHeading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDoctor1Heading().isDisplayed());
    }
    @When("^\\[Web Provider Info SubTab Page] User enters practice name (.*)$")
    public void userEntersDoctor1PracticeName(String doctor1PracticeName) {
        getPageProviderInfoSubTab().getDoctor1PracticeName().sendKeys(doctor1PracticeName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters first name (.*)$")
    public void userEntersDoctor1FirstName(String doctor1FirstName) {
        getPageProviderInfoSubTab().getDoctor1FirstName().sendKeys(doctor1FirstName);
    }
    @And("^\\[Web Provider Info SubTab Page] User enters last name (.*)$")
    public void userEntersDoctor1LastName(String doctor1LastName) {
        getPageProviderInfoSubTab().getDoctor1LastName().sendKeys(doctor1LastName);
    }
    @And("^\\[Web Provider Info SubTab Page] User clicks on specialty dropdown$")
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
    public void userEntersDoctor1EmailAddress () throws InterruptedException {
        Thread.sleep(1000);
        getPageProviderInfoSubTab().getAddDoctorButton().click();
    }
    @Then("^\\[Web Provider Info SubTab Page] User should see doctor2 heading$")
    public void userSeesDeleteDoctorButton() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageProviderInfoSubTab().getDoctor2Heading().isDisplayed());
    }
}
