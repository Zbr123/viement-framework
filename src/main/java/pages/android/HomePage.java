package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
//import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

//extends BasePage
public class HomePage {

    private final String profileIconXpath = "//android.view.ViewGroup[@content-desc=\"HomeScreen:ProfileImageClickEvent:profileimageclickevent\"]/android.view.ViewGroup";
    private final String careInsightTabXpath = "//android.widget.TextView[@content-desc=\"HomeScreen:CareInsightAlertMessage:careinsightalertmessage\"]";
    private final String infoButtonHomeXpath = "//android.view.ViewGroup[@content-desc=\"HomeScreen:InfoIcon:infoicon\"]";
    private final String seniorNameHeadingID = "HomeScreen:SeniorName:seniorname";
    private final String seniorNameHeadingXpath = "//android.widget.TextView[@content-desc=\"HomeScreen:SeniorName:seniorname\"]";
    private final String hamburgerMenuID = "HomeScreen:HemburgerMenu:hemburgermenu";
    private final String wellnessSignsTabID = "SideMenu:WellnessSign:wellnesssign";


    public HomePage(Page page) {
    }

     public WebElement getProfileIcon() {
         return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(profileIconXpath));
     }
     public WebElement getCareInsightTab(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(careInsightTabXpath));
     }
     public WebElement getInfoButton(){
         return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(infoButtonHomeXpath));
     }
    public WebElement getSeniorNameHeading(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(seniorNameHeadingXpath));
    }
    public WebElement getHamburgerMenu(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(hamburgerMenuID));
    }
    public WebElement getWellnessSignsTab(){
        return AndroidDriverSetup.getAndroidDriver().findElement(By.id(wellnessSignsTabID));
    }
}
