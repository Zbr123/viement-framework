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
}
