package pages.android;

//import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

//extends BasePage
public class LoginPage {

    private String emailAddress_id = "//android.widget.EditText[@content-desc=\"SignInScreen:EmailInput:email\"]";
    private String password_id = "//android.widget.EditText[@content-desc=\"SignInScreen:PasswordInput:password\"]";
    private String loginButton_id = "//android.view.ViewGroup[@content-desc=\"SignInScreen:SignInButton:signinbutton\"]";

    public LoginPage(Page page) {
    }

     public WebElement getEmailAddress() {
         return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(emailAddress_id));
     }

    public WebElement getPassword() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(password_id));
    }

    public WebElement getLoginButton() {
        return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(loginButton_id));
    }
}
