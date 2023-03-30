package step_defination.Android;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Page;

public class WellnessSignsPage extends Page {
    @And("^\\[Wellness Signs Tab] User clicks on month view$")
    public void userClickOnMonthView() throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSignsAndroid().getMonthView().click();
    }
    @And("^\\[Wellness Signs Tab] User clicks on left calendar arrow$")
    public void userClickOnLeftCalendarArrow() throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSignsAndroid().getLeftCalendarArrow().click();
    }
    @And("^\\[Wellness Signs Tab] User clicks on week view$")
    public void userClickOnWeekView() throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSignsAndroid().getWeekView().click();
    }
    @And("^\\[Wellness Signs Tab] User clicks on day view$")
    public void userClickOnDayView() throws InterruptedException {
        Thread.sleep(2000);
        getPageWellnessSignsAndroid().getDayView().click();
    }
}