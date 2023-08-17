import config.AppiumConfiguration;
import models.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.ContactListScreen;
import screens.SplashScreen;

public class AddNewContactTests extends AppiumConfiguration {
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
    public void addNewContactPositive(){
        Contact contact = Contact.builder()
                .name("Jack_" + i)
                .lastName("Smit")
                .phone("05325684" + i)
                .email("smit_" + i + "@mm.nn")
                .address("Tel-Aviv")
                .description("Friend")
                .build();
        Assert.assertTrue(new ContactListScreen(driver)
                        .openContactForm()
                        .fillContactForm(contact)
                        .submitContact()
                        .isContactAdded(contact));
    }
    @Test
    public void addNewContact_withScrolling_Positive(){
        Contact contact = Contact.builder()
                .name("Jack_" + i)
                .lastName("Smit")
                .phone("05325684" + i)
                .email("smit_" + i + "@mm.nn")
                .address("Tel-Aviv")
                .description("Friend")
                .build();
        Assert.assertTrue(new ContactListScreen(driver)
                        .openContactForm()
                        .fillContactForm(contact)
                        .submitContact()
                        .isContactAddedScrolling(contact));
    }
}