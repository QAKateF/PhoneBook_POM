import config.AppiumConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;
import screens.SplashScreen;

public class LaunchTest extends AppiumConfiguration {
    @Test
    public void launch(){
        String version = new SplashScreen(driver).getCurrentVersion();
        Assert.assertTrue(version.contains("1.0.0"));
    }

    @Test
    public void authentication(){
        String authentication = new AuthenticationScreen(driver).getCurrentEmail();
        Assert.assertTrue(authentication.contains("Type email"));
    }
}
