package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class CongratulationPage extends Page {

        @Then("^\\[Congratulation Page\\] user see the tick mark on the define your health focus \"([^\"]*)\"$")
        public void congratulationPageUserSeeTheTickMarkOnTheDefineYourHealthFocus(String tickmark) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            //getCongratulationsPage().getTickMarkCurrentHealth().isDisplayed();
            org.testng.Assert.assertEquals(tickmark,"");

        }

    }
