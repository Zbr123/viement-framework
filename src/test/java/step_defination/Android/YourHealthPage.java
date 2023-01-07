package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Page;

import static org.testng.AssertJUnit.assertTrue;
//import static pages.android.YourHealthPage.*;

public class YourHealthPage extends Page {

    @Then("^\\[Your Health\\] User enter the height (.*)$")
    public void yourHealthUserEnterTheHeight(String heaight) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
  //      getYourHealthPageAndroid().getHeight().clear();
   //     getYourHealthPageAndroid().getHeight().sendKeys(heaight);
    }

//    @And("^\\[Your Health\\] User tap on the unit field$")
//    public void yourHealthUserTapOnTheUnitField() {
//        getYourHealthPageAndroid().getUnitField().click();
//    }


//    @Then("^\\[Your Health\\] User select the unit (.*)$")
//    public void yourHealthUserSelectTheUnit(String unit) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        getSelectUnit(unit).click();
//    }

//    @And("^\\[Your Health\\] User enter the weight (.*)$")
//    public void yourHealthUserEnterTheWeight(String weight) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        getWeight().clear();
//        getWeight().sendKeys(weight);
//    }

//    @Then("^\\[Your Health\\] User Tap on thee weight unit field$")
//    public void yourHealthUserTapOnTheeWeightUnitField() {
//        getWeightUnit().clear();
//        getWeightUnit().click();
//    }

    @And("^\\[Your Health\\] User select the weight unit (.*)$")
    public void yourHealthUserSelectTheWeightUnit(String weightunit) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // getSelectWeightUnit(weightunit).click();
    }

    @And("^\\[Your Health\\] User select current life stage (.*)$")
    public void yourHealthUserSelectCurrentLifeStage(String single) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // getLifeStage(single).click();
    }


    @And("^\\[Health Page\\] User tap on 0-5 dependent age (.*)$")
    public void healthPageUserTapOnDependentAge(int age) {
        for (int k = 1; k < age; k++) {
         //  getAge().click();
        }
    }

    @Then("^\\[Health Page\\] User tap on 6-11 second dependent age (.*)$")
    public void healthPageUserTapOnSecondDependentAge(int age) {
        for (int k = 1; k < age; k++) {
           // getSecondDependentAge().click();
        }
    }

    @Then("^\\[Your Health\\] User tap stander alcoholic drinks (\\d+)$")
    public void yourHealthUserTapStanderAlcoholicDrinks(int drink) throws InterruptedException {
        Thread.sleep(4000);
        for (int k = 1; k < drink; k++) {
          //  getAlcoholicDrinks().click();
        }
    }

    @Then("^\\[Your Health\\] User select on tobacco product \"([^\"]*)\"$")
    public void yourHealthUserSelectOnTobaccoProduct(String product) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   getTobaccoProduct(product).click();
    }

    @Then("^\\[Your Health\\] User select on package food \"([^\"]*)\"$")
    public void yourHealthUserSelectOnPackageFood(String diet) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // getPackagedFood(diet).click();
    }

    @Then("^\\[Your Health\\] User select on sleep and wake up feeling \"([^\"]*)\"$")
    public void yourHealthUserSelectOnSleepAndWakeUpFeeling(String sleep) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    //    getSleepandWakeup(sleep).click();
    }

    @Then("^\\[Your Health] User select the health and wellbeing \"([^\"]*)\"$")
    public void yourHealthUserSelectTheHealthAndWellbeing(String wellbeing) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        getHealthAndWellbeing(wellbeing).click();
    }

    @Then("^\\[Your Health\\] User select the well-balanced lifestyle \"([^\"]*)\"$")
    public void yourHealthUserSelectTheWellBalancedLifestyle(String lifestyle) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
 //       getWellbalanced(lifestyle).click();
    }

    @Then("^\\[Your Health\\] User select the physical health \"([^\"]*)\"$")
    public void yourHealthUserSelectThePhysicalHealth(String physical) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   //     getPhysicalHealth(physical).click();
    }

    @Then("^\\[Your Health\\] User select the health condition \"([^\"]*)\"$")
    public void yourHealthUserSelectTheHealthCondition(String condition) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     //   getHealthCondition(condition).click();
    }

    @Then("^\\[Your Health} User select the mental wellbeing \"([^\"]*)\"$")
    public void yourHealthUserSelectTheMentalWellbeing(String mental) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // getMentelWellbeing(mental).click();
    }

//    @And("^\\[Your Health\\] User tap on the show my health score$")
//    public void yourHealthUserTapOnTheShowMyHealthScore() {
//        getHealthScore().click();
//    }
}
