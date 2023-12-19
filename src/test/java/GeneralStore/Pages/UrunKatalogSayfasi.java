package GeneralStore.Pages;

import GeneralStore.Utulities.Driver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static GeneralStore.Utulities.Driver.driver;

public class UrunKatalogSayfasi {

    public UrunKatalogSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @AndroidBy(xpath ="//android.widget.TextView[@text=\"ADD TO CART\"]" )
    public List<WebElement> addToCard;
    @AndroidBy(id ="com.androidsample.generalstore:id/appbar_btn_cart" )
    public WebElement sepeteGit;

    public void sepeteUrunEkle(String urun){

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+urun+"\"))"));

        addToCard.get(1).click();
    }

    public void sepeteGit(){
        sepeteGit.click();
    }

}
