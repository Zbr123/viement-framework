package step_defination.web;
import io.cucumber.java.en.When;
import pages.Page;

public class AddSeniorPage extends Page {

    @When("\\[Add Senior Page\\] User enters first name Zubair(.*)$")
    public void enterFirstName(String firstName) throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getSeniorFirstName().sendKeys(firstName);
    }
    @When("\\[Add Senior Page\\] User enters last name Shafi(.*)$")
    public void enterLastName(String lastName) throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getSeniorLastName().sendKeys(lastName);
    }
    @When("\\[Add Senior Page\\] User enters mobile phone number 2359421681(.*)$")
    public void enterMobileNumber(String mobilePhoneNumber) throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getMobileNumber().sendKeys(mobilePhoneNumber);
    }
    @When("^\\[Add Senior Page] User clicks on gender select dropdown$")
    public void clickOnGenderSelectDropdown() throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getGenderSelectDropdown().click();
    }
    @When("^\\[Add Senior Page] User clicks on male button$")
    public void clickOnMaleSelectButton() throws InterruptedException {
        Thread.sleep(1000);
        getPageAddSenior().getMaleSelectButton().click();
    }
}
