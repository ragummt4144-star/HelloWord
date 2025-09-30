package wentrite;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPage extends SauceBaseTest {

    @Test
    public void login() throws InterruptedException {

        FormPage formPage = new FormPage(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(formPage.userName));
        System.out.println("User name Located"+formPage.userName);
        formPage.setuserName("standard_user");
        formPage.setpassword("secret_sauce");
        formPage.clickLogin();
        formPage.addToCart();
        formPage.viewFirstProduct();
        formPage.verifyCart();
        formPage.checkout();
        formPage.setFirstName("John");
        formPage.setLastName("Doe");
        formPage.setZipcode("12345");
        formPage.clickContinue();
        formPage.clickFinishByText("FINISH");

        //Toast Message If Any error mandatory error message displayed
        //String ToastMessage=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Username and password do not match any user in this service.\")")).getAttribute("name");
        // Assert.assertEquals(ToastMessage,"Username and password do not match any user in this service.");
        // System.out.println("ToastMessage:"+ToastMessage);



    }
}
