package GeneralStore.Utulities;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReport {
    public static ExtentTest test;

    public static ExtentReports extent;

    public static void raporOlustur() {

        String path = System.getProperty("user.dir") + File.separator + "reports" + File.separator + "report.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("General Store");
        reporter.config().setDocumentTitle("General Store Raporu");

        extent = new ExtentReports();

        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "NuriKara");
    }

    public static void testOlustur(String testAdi) {
        test = extent.createTest(testAdi);


    }

    public static void bilgiNotu(String Bilginotu) {
        test.info(Bilginotu);
    }

    public static void raporuKaydet(){

        extent.flush();
    }

}
