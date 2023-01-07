package step_defination.Android;

//import core.utils.AndroidCore.AndroidDriverSetup;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Page;

import java.io.IOException;

public class DashboardPage extends Page {

    @And("^\\[Dashboard Page] User tap the me button$")
    public void taoToMeButton() throws IOException, InterruptedException {
  //      getDashboardPage().getMeButton().click();
    }

    @Then("^\\[Dashboard Page] Verify the Good Morning Text with Name \"([^\"]*)\"$")
    public void dashboardPageVerifyTheGoodMorningTextWithName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}