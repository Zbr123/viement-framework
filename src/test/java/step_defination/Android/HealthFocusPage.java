//package step_defination.Android;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Given;
//import org.junit.Assert;
//import pages.Page;
//
//import java.io.IOException;
//
//
//
//public class HealthFocusPage extends Page {
//
//    @Given("^\\[Health Page] User tap on Skip Button$")
//    public void tapOnSkipButton() throws IOException, InterruptedException {
//        getHealthFocusPage().getSkipButton().click();
//    }
//
//    @Given("^\\[Health Page] User tap on Garmin connect button$")
//    public void tapOnGarminApp() {
//        getHealthFocusPage().getSkipButton().click();
//    }
//
//    @Given("^\\[Health Page] Verify user should be on Connect App$")
//    public void verifyConnectedGarminApp() {
//        getHealthFocusPage().getSkipButton().click();
//    }
//
//    @When("^\\[Health Page] User tap on close connect app$")
//    public void tapOnCloseConnectApp() {
//        getHealthFocusPage().getSkipButton().click();
//
//    }
//
//    @And("^\\[Health Page] Verify Garmin App should be successfully connected$")
//    public void assertGarminAppConnnected() {
//        getHealthFocusPage().getSkipButton().click();
//    }
//
//    @And("^\\[Health Focus\\] User select the placholder pillors \"([^\"]*)\"$")
//    public void healthFocusUserSelectThePlacholderPillors(String pillars) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        getHealthFocusPage().getActivity(pillars).click();
////        Thread.sleep(2000);
//
//    }
//
//    @Then("^\\[Health Focus\\] User select a focus area \"([^\"]*)\"$")
//    public void healthFocusUserSelectAFocusArea(String area) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        getBasePage().swipeUp();
//        getHealthFocusPage().getFocusArea(area).click();
//    }
//
//    @Then("^\\[Health Focus\\] User select moderate activity (\\d+)$")
//    public void healthFocusUserSelectModerateActivity(int activity) {
//        for (int k = 1; k < activity; k++) {
//            getHealthFocusPage().getModerateActivity().click();
//        }
//    }
//
//    @Then("^\\[Health Focus\\] User select vigorous activity (\\d+)$")
//    public void healthFocusUserSelectVigorousActivity(int vigorous) {
//        for (int k = 1; k < vigorous; k++) {
//            getHealthFocusPage().getModerateActivity().click();
//        }
//    }
//
//    @Then("^\\[Health Focus\\] User select the strength training (\\d+)$")
//    public void healthFocusUserSelectTheStrengthTraining(int training) {
//        for (int k = 1; k < training; k++) {
//            getHealthFocusPage().getModerateActivity().click();
//        }
//    }
//
//    @Then("^\\[Health Focus\\] User select the spent time (\\d+)$")
//    public void healthFocusUserSelectTheSpentTime(int down) {
//        for (int k = 1; k < down; k++) {
//            getHealthFocusPage().getModerateActivity().click();
//        }
//    }
//}