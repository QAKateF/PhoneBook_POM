package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.Contact;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactListScreen extends BaseScreen{

    public ContactListScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/action_bar']/android.widget.TextView")
    MobileElement activityViewText;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/title']")
    MobileElement logoutBtn;
    @FindBy(xpath = "//*[@content-desc='More options']")
    MobileElement moreOptions;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/add_contact_btn']")
    MobileElement addContactBtn;
    @FindBy(xpath = "//*[@resource-id='android:id/button1']")
    MobileElement yesBtn;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/emptyTxt']")
    MobileElement emptyTxt;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/rowContainer']")
    List<MobileElement> contacts;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/rowName']")
    List<MobileElement> names;
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/rowPhone']")
    List<MobileElement> phones;


    public boolean isContactListActivityPresent(){
        return shouldHave(activityViewText, "Contact list", 5);
    }

    public AuthenticationScreen logout(){
        moreOptions.click();
        logoutBtn.click();
        return  new AuthenticationScreen(driver);
    }

    public AddNewContactScreen openContactForm() {
        waitElement(addContactBtn, 5);
        addContactBtn.click();
        return new AddNewContactScreen(driver);
    }

    public boolean isContactAdded(Contact contact) {
        return ;
    }
}
