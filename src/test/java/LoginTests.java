import config.AppiumConfiguration;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screens.ContactListScreen;
import screens.SplashScreen;

public class LoginTests extends AppiumConfiguration {

    @Test
    public void LoginPositive(){
        Assert.assertTrue(new SplashScreen(driver)
                .goToAuthenticationScreen()
                .fillEmail("qwerty@gm.com")
                .fillPassword("abcD123$")
                .submitLogin()
                .isContactListActivityPresent());
    }

    @AfterMethod
    public void postcodition(){
        if(new ContactListScreen(driver).isContactListActivityPresent()){
            new ContactListScreen(driver).logout();
            new SplashScreen(driver);
        }
    }
}
