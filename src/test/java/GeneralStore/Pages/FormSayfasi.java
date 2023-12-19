package GeneralStore.Pages;

import GeneralStore.Utulities.Driver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

import static GeneralStore.Utulities.Driver.driver;
import static GeneralStore.Utulities.ExtentReport.bilgiNotu;
import static GeneralStore.Utulities.ExtentReport.test;

public class FormSayfasi {

    public FormSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);

    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public WebElement ulkeMenusu;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public WebElement isimAlani;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
    public WebElement cinsiyetFemale;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
    public WebElement cinsiyetMale;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public WebElement letShopButtonu;

    public void ulkeSec(String ulke){
        ulkeMenusu.click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ulke+"\"))"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\""+ulke+"\"]")).click();
        bilgiNotu("Ulke ismi secildi");
    }

    public void isimGir(String isim){
        isimAlani.sendKeys(isim);
        bilgiNotu("Isim bilgisi");

    }

    public void cinsiyetSec(String cinsiyet) {
        if (cinsiyet.equalsIgnoreCase("female")) {
            cinsiyetFemale.click();
        } else {
            cinsiyetMale.click();
        }
        bilgiNotu("Cinsiyet bilgisi secil");
    }

    public  void setLetShopButtonuTikla(){
        letShopButtonu.click();
    }
}