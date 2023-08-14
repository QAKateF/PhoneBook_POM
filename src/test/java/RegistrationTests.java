import config.AppiumConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SplashScreen;
import java.util.Random;

public class RegistrationTests extends AppiumConfiguration {
    int i = new Random().nextInt(1000)+1234;
    @Test
    public void RegistrationPositive(){
        Assert.assertTrue(new SplashScreen(driver)
                .goToAuthenticationScreen()
                .fillEmail("cat_" + i + "@gm.com")
                .fillPassword("abcD" + i + "5$")
                .submitRegistration()
                .isContactListActivityPresent());
    }

    @Test
    public void RegistrationNegativeWrongPassword(){
        Assert.assertTrue(new SplashScreen(driver)
                .goToAuthenticationScreen()
                .fillEmail("cat_" + i + "gm.com")
                .fillPassword("abcD" + i + "5$")
                .submitRegistration()
                .isContactListActivityPresent());
    }
}
