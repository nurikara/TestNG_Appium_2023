package GeneralStore.Pages;

import GeneralStore.Utulities.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SiparisTamamlamaSayfasi {
    public SiparisTamamlamaSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }
}
