import config.AppiumConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.ContactListScreen;
import screens.SplashScreen;

public class RemoveContactsTests extends AppiumConfiguration {
    @BeforeClass
    public void precondition(){
        new SplashScreen(driver)
                .goToAuthenticationScreen()
                .fillEmail("cat_1959@gm.com")
                .fillPassword("abcD19595$")
                .submitLogin();
    }

    @BeforeMethod
    public void providerContacts(){
       new ContactListScreen(driver).provideContacts();
    }

    @Test
    public void removeOneContactPositive(){
        Assert.assertTrue(new ContactListScreen(driver).removeOneContact().isContactRemoved());
    }

    @Test
    public void removeAllContactPositive(){
        Assert.assertTrue(new ContactListScreen(driver).removeAllContacts().isNoContactMessage());
    }
}
