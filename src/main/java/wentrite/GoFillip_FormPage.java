package wentrite;

import Utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class GoFillip_FormPage extends AndroidActions {

    private AndroidDriver driver;

    public GoFillip_FormPage(AndroidDriver driver) {
        super(driver);
        // super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locators
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    public  WebElement Alert;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\")")
    public WebElement Permission_Allow_Foreground_Only;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uDB82\uDF55\")")
    public WebElement Account;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
    public WebElement Sign_up;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Jane Doe\")")
    public WebElement FullName;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"you@example.com\")")
    public WebElement Email;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"••••••••\")")
    public WebElement Password;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Create account\")")
    public WebElement Create_Account;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button1\"]")
    public WebElement Login_Alert;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log out\")")
    public WebElement Log_out;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    public WebElement Logout_Alert;

    // Element Actions

    public void handleAlert()
    {
        Alert.click();
    }
    public void allowPermission()
    {
        Permission_Allow_Foreground_Only.click();

    }
    public void ClickAccount()
    {
        Account.click();
    }
    public void ClickSign_up()
    {
        Sign_up.click();
    }
    public void SetFullName(String fullName)
    {
        FullName.sendKeys(fullName);
    }
    public void SetEmail(String email)
    {
        Email.sendKeys(email);
    }
    public void SetPassword(String password)
    {
        Password.sendKeys(password);
    }
    public void ClickCreate_Account()
    {
        Create_Account.click();
    }
    public void ClickLogin_Alert()
    {
        Login_Alert.click();

    }
    public void click_Logout(String text) {
        scrollToText(text);  // Scroll to make the element visible

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement logOutButton = wait.until(ExpectedConditions.elementToBeClickable(Log_out));
        logOutButton.click();
        System.out.println("Clicked on logout button");
    }
    public void click_LogoutAlert() {

        Logout_Alert.click();
        String Text=Logout_Alert.getText();
        System.out.println("Log out alert text:"+Text);


    }
}
