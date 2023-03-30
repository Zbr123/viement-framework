package pages.android;

//import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

//extends BasePage
public class WelcomePage {

//    private String continueButtonID = "WelcomeScreen:OnContinueButton:oncontinuebutton";
//    private String continueButtonXpath = "//android.widget.TextView[@content-desc=\"WelcomeScreen:OnContinueButtonText:oncontinuebuttontext\"]";
//    private String continueButtonXpath = "//*[@id=\"screenshotContainer\"]/div[2]/div/div/div/div/div[62]";
    private String welcomePageHeadingID = "WelcomeScreen:OnContinueButtonText:oncontinuebuttontext";
    private String getWelcomePageHeadingXpath = "//android.widget.TextView[@content-desc=\"WelcomeScreen:WelcomeText:welcometext\"]";
    public WelcomePage(Page page) {
    }

     public WebElement getContinueButton() {
         return AndroidDriverSetup.getAndroidDriver().findElement(By.id(welcomePageHeadingID));
     }
    public WebElement getWelcomePageHeading() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(getWelcomePageHeadingXpath));
    }
}
