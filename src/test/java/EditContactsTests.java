import config.AppiumConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.ContactListScreen;
import screens.SplashScreen;

public class EditContactsTests extends AppiumConfiguration {
    int i = (int) (System.currentTimeMillis() / 1000) % 3600;
    @BeforeMethod
    public void precondition(){
        new SplashScreen(driver)
                .goToAuthenticationScreen()
                .fillEmail("cat_1959@gm.com")
                .fillPassword("abcD19595$")
                .submitLogin();
    }

    @Test
    public void editOneContactPositive(){
        String text = "updated@mail.com";
        new ContactListScreen(driver)
                .editOneContact()
                .editEmail(text)
                .submitEditContact()
                .isContactContains(text);
    }
}
