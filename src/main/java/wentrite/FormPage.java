package wentrite;

import Utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormPage extends AndroidActions {

    private AndroidDriver driver;

    public FormPage(AndroidDriver driver) {
        super(driver);
        // super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // ==== Locators ====


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Username\")")
    public WebElement userName;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Password\")")
    public WebElement password;

    @AndroidFindBy(uiAutomator =
            "new UiSelector().text(\"LOGIN\")")
    public WebElement submit;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"ADD TO CART\"])[1]")
    public WebElement cart1;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement img1;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(13)")
    public WebElement cartVerify;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"CHECKOUT\")")
    public WebElement checkout;

    @AndroidFindBy(accessibility = "test-First Name")
    public WebElement firstName;

    @AndroidFindBy(accessibility = "test-Last Name")
    public WebElement lastName;

    @AndroidFindBy(accessibility = "test-Zip/Postal Code")
    public WebElement zipcode;

    @AndroidFindBy(accessibility = "test-CONTINUE")
    public WebElement continueButton;

    @AndroidFindBy(accessibility = "test-FINISH")
    public WebElement finishButton;

    // ==== Actions ====

    public void setuserName(String name) {
        userName.sendKeys(name);
    }

    public void setpassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickLogin() {
        submit.click();
    }

    public void addToCart() {
        cart1.click();
    }

    public void viewFirstProduct() {
        img1.click();
    }

    public void verifyCart() {
        cartVerify.click();
    }

    public void checkout() {
        checkout.click();
    }

    public void setFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void setLastName(String lname) {
        lastName.sendKeys(lname);
    }

    public void setZipcode(String zip) {
        zipcode.sendKeys(zip);
    }

    public void clickContinue() {
        continueButton.click();
    }
    public void clickFinishByText(String text) {
        scrollToText(text);  // Scroll to make the element visible

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement finishButton = wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("test-FINISH")));

        finishButton.click();
        System.out.println("Clicked on FINISH button");
    }


}










