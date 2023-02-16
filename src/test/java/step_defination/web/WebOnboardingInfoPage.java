package step_defination.web;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Page;

public class WebOnboardingInfoPage extends Page {
    @Then("^\\[Web Onboarding Info Page] User should see the profile info heading$")
    public void userSeesProfileInfoHeading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageOnboardingInfo().getProfileInfoHeading().isDisplayed());
    }
    @When("^\\[Web Onboarding Info Page] User clicks on provider info subtab$")
    public void userClicksOnProviderInfoSubTab() throws InterruptedException {
        Thread.sleep(1000);
        getPageOnboardingInfo().getProviderInfoSubTab().click();
    }
    @Then("^\\[Web Onboarding Info Page] User should see the provider info heading$")
    public void userSeesProviderInfoHeading() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getPageOnboardingInfo().getProviderInfoHeading().isDisplayed());
    }
    @When("^\\[Web Onboarding Info Page] User clicks on medical info subtab$")
    public void userClicksOnMedicalInfoSubTab() throws InterruptedException {
        Thread.sleep(1000);
        getPageOnboardingInfo().getMedicalInfoSubTab().click();
    }
}
