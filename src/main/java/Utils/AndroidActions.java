package Utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidActions {

    static AndroidDriver  driver;
    public AndroidActions(AndroidDriver driver) {

        this.driver = driver;

    }

    public void LongPress(WebElement element) {

        ((JavascriptExecutor) driver).executeScript("mobile:longClickGesture()", ImmutableMap
                .of("elementId",((RemoteWebElement)element).getId(), "duration",2000));



    }
    public void DragDrop(WebElement element) {

        ((JavascriptExecutor) driver).executeScript("mobile.longClickGesture()", ImmutableMap
                .of("elementId",((RemoteWebElement)element).getId(), "duration",2000));


    }
    public void SwipAction (WebElement element,String direction) {

        ((JavascriptExecutor) driver).executeScript("mobile.longClickGesture()", ImmutableMap
                .of("elementId",((RemoteWebElement)element).getId(), "direction",direction,"percent",0.75));

    }
    public void scrollToText(String text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + text + "\"));"
        ));
    }


}
