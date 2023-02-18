package step_defination.web;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebMedicalInfoSubTabPage extends Page {

    CommonFunctions commonFunctions = new CommonFunctions();
    @Then("^\\[Web Medical Info SubTab Page] User should see the medical history heading$")
    public void userSeesDoctor1Heading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageMedicalInfoSubTab().getMedicalHistoryHeading().isDisplayed());
    }
    @When("^\\[Web Medical Info SubTab Page] User clicks on (.*) dropdown$")
    public void userClicksOnMedicalInfoDropdowns(String medicalInfoPageDropdowns) throws InterruptedException {
        Thread.sleep(2000);
        getPageMedicalInfoSubTab().getMedicalInfoDropdowns(medicalInfoPageDropdowns).click();
    }
    @And("^\\[Web Medical Info SubTab Page] User clicks on (.*) option$")
    public void userClicksOnMedicalInfoPageDropdownOptions(String medicalInfoPageDropdownOptions) throws InterruptedException {
        Thread.sleep(200);
        getPageMedicalInfoSubTab().getMedicalInfoDropdownOptions(medicalInfoPageDropdownOptions).click();
    }
}
