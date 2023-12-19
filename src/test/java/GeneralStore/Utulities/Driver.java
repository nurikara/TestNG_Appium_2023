package GeneralStore.Utulities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver extends ReusableMethods {
    public static AndroidDriver driver;
  public static   AppiumDriverLocalService  servis;


    public static AndroidDriver getDriver() {

        if (driver == null) {
            String appUrl = System.getProperty("user.dir")
                    + File.separator + "src"
                    + File.separator + "test"
                    + File.separator + "resources"
                    + File.separator + "General-Store.apk";

            UiAutomator2Options options = new UiAutomator2Options()
                    .setUiautomator2ServerInstallTimeout(Duration.ofSeconds(60))
                    .setApp(appUrl);

            URL url = null;
            try {
                url = new URL("http://127.0.0.1:4723");
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

            driver = new AndroidDriver(url, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }

        return driver;
    }

    public static void startServer() {
       servis = new AppiumServiceBuilder()
                .withAppiumJS(new File("C:/Users/nurik/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();

      servis.start();

    }

//    public static void stopServer() {
//        servis.stop();
//
//    }

    public static void uygulamayiKapat() {
        if (driver != null) {

            driver.quit();
            driver = null;

        }

    }

}


