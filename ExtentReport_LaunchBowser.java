package wentrite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExtentReport_LaunchBowser {
    ExtentReports extent;
    @BeforeTest
    public void setupReport() {
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(path);

        spark.config().setReportName("My Automation Report");
        spark.config().setDocumentTitle("Test Report");

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "Raghu Nandhan");
    }


    @Test
    public void launchBowser() {
        extent.createTest("launchBowser");

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Wentrite Technologies\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Facebook Page OPened Successfully");

        driver.close();
        extent.flush();


    }
}
