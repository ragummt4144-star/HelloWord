package wentrite;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoFillip_SignUp extends GoFillipBase {

    @Test
    public void go_SignUp()
    {
        GoFillip_FormPage goFillip_formPage = new GoFillip_FormPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        goFillip_formPage.handleAlert();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        goFillip_formPage.allowPermission();
        goFillip_formPage.ClickAccount();
        goFillip_formPage.ClickSign_up();
        goFillip_formPage.SetFullName("John");
        goFillip_formPage.SetEmail("gofillip@wentrite.com");
        goFillip_formPage.SetPassword("Wentrite@1");
        goFillip_formPage.ClickCreate_Account();
        goFillip_formPage.ClickLogin_Alert();
        //goFillip_formPage.click_Logout("Log out");
       // goFillip_formPage.click_LogoutAlert();
        GoFillip_AddtoCart AddtoCart_page = new GoFillip_AddtoCart(driver);
        AddtoCart_page.Click_homepage();
        AddtoCart_page.Click_FruitsLogo();
        AddtoCart_page.Click_Fruits1();
        AddtoCart_page.Click_Fruites2();
        AddtoCart_page.Click_GoBackButton();
        AddtoCart_page.Click_cartView();
        AddtoCart_page.Click_proceedtoPay();
        AddtoCart_page.Select_UPI();
        AddtoCart_page.Click_PayNow();
        AddtoCart_page.Click_OrderDetails();






    }


}
