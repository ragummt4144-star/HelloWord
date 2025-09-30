package wentrite;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;

public class SauceBaseTest {

    public AppiumDriverLocalService service;
    public AndroidDriver driver;

    @BeforeClass
    public void Setup() throws MalformedURLException {

        AppiumServiceBuilder builder=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Murugesan\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723);

        service = AppiumDriverLocalService.buildService(builder);
        service.start();

        //UiAutomator declaration
        UiAutomator2Options option=new UiAutomator2Options().setAutomationName("UiAutomator2")
                .setDeviceName("emulator 5554")
                .setPlatformName("10")
                .setApp("C:\\Wentrite Technologies\\Appium With Maven\\Appium With Maven\\src\\test\\java\\resorces\\Android.SauceLabs.apk")
                .setAppPackage("com.swaglabsmobileapp")
                .setAppActivity("com.swaglabsmobileapp.MainActivity");



        option.setUiautomator2ServerInstallTimeout(Duration.ofMinutes(5));
        option.setUiautomator2ServerLaunchTimeout(Duration.ofMinutes(5));

        //Android driver, IOS
        driver=new AndroidDriver(service.getUrl(),option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

    }

        @AfterClass
    public void tearDown(){

        service.stop();
        driver.quit();

    }
}
