package wentrite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeTest;

public class ExtentReports_TestNG {
    static ExtentReports extent;
    @BeforeTest
    public static ExtentReports setupReport() {
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(path);

        spark.config().setReportName("My Automation Report");
        spark.config().setDocumentTitle("Test Report");

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "Raghu Nandhan");
        return extent;
    }

}
