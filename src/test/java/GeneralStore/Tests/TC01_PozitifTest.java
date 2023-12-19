package GeneralStore.Tests;

import GeneralStore.Pages.FormSayfasi;
import GeneralStore.Pages.UrunKatalogSayfasi;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class TC01_PozitifTest  {
    @Test
    public void testGeneralStore()  {

        FormSayfasi formSayfasi = new FormSayfasi();

        formSayfasi.ulkeSec("Cuba");
        formSayfasi.isimGir("safinaz");
        formSayfasi.cinsiyetSec("Erkek");
        formSayfasi.setLetShopButtonuTikla();

        UrunKatalogSayfasi urunKatalogSayfasi = new UrunKatalogSayfasi();

        urunKatalogSayfasi.sepeteUrunEkle("LeBron Soldier 12 ");
        urunKatalogSayfasi.sepeteUrunEkle("LeBron Soldier 12 ");
        urunKatalogSayfasi.sepeteGit();



        // Menü
//        WebElement menu = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
//        menu.click();
//
//        //Ülke Seçimi
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Barbados\"))"));
//
//        WebElement barbados = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Barbados\"]"));
//        barbados.click();
//
//        //İsim
//        WebElement nameBox = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
//        nameBox.sendKeys("Safinaz");
//
//        //Cinsiyet
//        WebElement female = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale"));
//        female.click();
//
//        //Buton
//        WebElement button = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
//        button.click();
//
//        //Ürün Seçimi
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))"));
//        driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text=\"ADD TO CART\"]")).get(1).click();
//
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"LeBron Soldier 12 \"))"));
//        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"ADD TO CART\"]")).click();
//
//        //Sepet
//        WebElement cart = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));
//        cart.click();
//
//        //Fiyat Doğrulaması
//        List<WebElement> products = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice"));
//        Assert.assertEquals(products.size(), 2);
//
//        double total = 0;
//        for (int i = 0; i < products.size(); i++) {
//            String priceText = products.get(i).getText(); // $160.97 --> $120.0
//            double price = Double.parseDouble(priceText.substring(1)); // 160.97  --> 120.0
//            total += price;
        }
//        for (WebElement w:products) {
//            String priceText = w.getText();
//            double price = Double.parseDouble(priceText.substring(1));
//            total += price;
//        }
//
//        double totalAmount = Double.parseDouble(driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText().substring(1));
//
//        Assert.assertEquals(total, totalAmount);
//
//        // CheckBox
//        WebElement checkBox = driver.findElement(AppiumBy.className("android.widget.CheckBox"));
//        checkBox.click();
//
//        //Visit
//        WebElement visitButton = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed"));
//        visitButton.click();
//
//
//
//        //Hibrit Uygulama
//        // Sadece Web context'inin değerini alabilmek için bu kodu yazmaya ihtiyacım var.
////        Set<String> contextHandles = driver.getContextHandles();
////        for (String contextName:contextHandles){
////            System.out.println(contextName);
////        }
//
//        driver.context("WEBVIEW_com.androidsample.generalstore");
//
//        //Arama motoru
//        driver.findElement(By.name("q")).sendKeys("Temel Reis", Keys.ENTER);
//
//        //Native Uygulama
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//        driver.context("NATIVE_APP");
//
//        // Başlık Doğrulaması
//        String baslik = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/toolbar_title")).getText();
//        Assert.assertEquals(baslik, "General Store");


    }
