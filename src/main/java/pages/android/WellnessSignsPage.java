package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

//extends BasePage
public class WellnessSignsPage {

    private final String monthViewXpath = "//android.view.ViewGroup[@content-desc=\"v:Month:month\"]";
    private final String leftCalendarArrowXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]";
    private final String weekViewXpath = "//android.view.ViewGroup[@content-desc=\"HeartRateGraphVita:Week:week\"]";
    private final String dayViewXpath = "//android.view.ViewGroup[@content-desc=\"HeartRateGraphVita:Day:day\"]";
    public WellnessSignsPage(Page page) {
    }
     public WebElement getMonthView() {
         return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(monthViewXpath));
     }
    public WebElement getLeftCalendarArrow() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(leftCalendarArrowXpath));
    }
    public WebElement getWeekView() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(weekViewXpath));
    }
    public WebElement getDayView() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(dayViewXpath));
    }
}
