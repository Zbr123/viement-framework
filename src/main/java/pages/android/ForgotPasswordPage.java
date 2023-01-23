package pages.android;

//import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

//extends BasePage
public class ForgotPasswordPageAndroid {

   private String recoveryEmailXpath = "//android.widget.EditText[@content-desc=\"ForgotPasswordScreen:EmailInput:emailinput\"]";
    public ForgotPasswordPageAndroid(Page page) {
    }

    public WebElement getForgotPasswordButton() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(recoveryEmailXpath));
    }
}
