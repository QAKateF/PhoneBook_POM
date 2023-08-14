package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.LinkPermission;

public class AuthenticationScreen extends BaseScreen{
    public AuthenticationScreen(AppiumDriver<MobileElement> driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/action_bar']/android.view.ViewGroup")
    MobileElement activityViewText;
    @FindBy(id = "com.sheygam.contactapp:id/inputEmail")
    MobileElement inputEmail;
    @FindBy(id = "com.sheygam.contactapp:id/inputPassword")
    MobileElement inputPassword;
    @FindBy(id = "com.sheygam.contactapp:id/regBtn")
    MobileElement ButtonRegistration;
    @FindBy(id = "com.sheygam.contactapp:id/loginBtn")
    MobileElement ButtonLogin;

    public AuthenticationScreen fillEmail(String email) {
        waitElement(inputEmail, 5);
        type(inputEmail, email);
        return this;
    }

    public AuthenticationScreen fillPassword(String password) {
        waitElement(inputPassword, 1);
        type(inputPassword, password);
        return this;
    }

    public ContactListScreen submitLogin() {
        ButtonLogin.click();
        return new ContactListScreen(driver);
    }

    public ContactListScreen submitRegistration() {
        ButtonRegistration.click();
        return new ContactListScreen(driver);
    }
    public AuthenticationScreen submitRegistrationNegative() {
        ButtonRegistration.click();
        return this;
    }
}
