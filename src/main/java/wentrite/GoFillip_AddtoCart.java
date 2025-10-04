package wentrite;

import Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GoFillip_AddtoCart extends AndroidActions {

    private AndroidDriver driver;

    public GoFillip_AddtoCart(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    //AddtoCart Page Locators

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Home\")")
    public WebElement home_page;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement FruitsLogo;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add\").instance(0)")
    public WebElement Fruits1;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add\").instance(1)")
    public WebElement Fruits2;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Go back\")")
    public WebElement GoBackButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\")")
    public WebElement CartView;
    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Proceed to pay\"]")
    public WebElement ProceedToPay;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"UPI (Google Pay/PhonePe/Paytm)\")")
    public WebElement UPI;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pay now\")")
    public WebElement PayNow;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Payment completed\")")
    public WebElement OrderDetails;

    //AddtoCart Action Flow
    public void Click_homepage()
    {
        home_page.click();
    }
    public void Click_FruitsLogo()
    {
        FruitsLogo.click();
    }
    public void Click_Fruits1()
    {
        Fruits1.click();
    }
    public void Click_Fruites2()
    {
        Fruits2.click();
    }
    public void Click_GoBackButton()
    {
        GoBackButton.click();
    }
    public void Click_cartView()
    {
        CartView.click();
    }
    public void Click_proceedtoPay()
    {
        ProceedToPay.click();
    }
    public void Select_UPI()
    {
        UPI.click();
    }
    public void Click_PayNow()
    {
        PayNow.click();
    }
    public void Click_OrderDetails()
    {
            OrderDetails.click();
            String Text=OrderDetails.getText();
            System.out.println(Text);
    }






}
