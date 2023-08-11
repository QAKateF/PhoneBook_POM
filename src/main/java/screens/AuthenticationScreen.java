package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationScreen extends BaseScreen{
    public AuthenticationScreen(AppiumDriver<MobileElement> driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/action_bar']/android.view.ViewGroup")
    MobileElement activityViewText;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/inputEmail']/android.view.ViewGroup")
    MobileElement emailViewText;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/inputPassword']/android.view.ViewGroup")
    MobileElement passwordViewText;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/regBtn']/android.view.ViewGroup")
    MobileElement ButtonRegistrationViewText;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/loginBtn']/android.view.ViewGroup")
    MobileElement ButtonPasswordViewText;

    public String getCurrentVersion() {
        return activityViewText.getText();
    }

    public String getCurrentEmail() {
        return emailViewText.getText();
    }
    public String getCurrentPassword() {
        return passwordViewText.getText();
    }
    public String getCurrentButtonRegistration() {
        return ButtonRegistrationViewText.getText();
    }
    public String getCurrentuttonPasswor() {
        return ButtonPasswordViewText.getText();
    }
}
