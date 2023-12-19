package GeneralStore.Utulities;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import static GeneralStore.Utulities.Driver.*;
import static GeneralStore.Utulities.ExtentReport.*;

public class Listener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        raporOlustur();


    }

    @Override
    public void onTestStart(ITestResult result) {
        startServer();
        testOlustur(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test BAsarili");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Hata mesajı
        test.fail("Test başarısız oldu. Çünkü: " + result.getThrowable().getMessage());

        // Ekran Görüntüsü alma
        File dosya = driver.getScreenshotAs(OutputType.FILE);
        String dosyaYolu = System.getProperty("user.dir") + File.separator + "raporlar" + File.separator + result.getMethod().getMethodName() + ".png";
//        try {
//            FileUtils.copyFile(dosya, new File(dosyaYolu));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // Ekran görüntüsünü rapora ekleme
        try {
            test.addScreenCaptureFromPath(dosyaYolu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        uygulamayiKapat();

    }

    @Override
    public void onFinish(ITestContext context) {
        uygulamayiKapat();
        raporuKaydet();

    //    stopServer();

    }
}
