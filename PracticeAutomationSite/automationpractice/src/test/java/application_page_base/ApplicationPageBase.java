package application_page_base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class ApplicationPageBase {
    /**
     *
     * This class will have all the common methods/helper methods
     *
     * */
    WebDriver driver = null;


    public static void sendKeys(String webElementName, WebElement element, String textToSend){
        TestLogger.log("Send text to " + webElementName);
        element.sendKeys(textToSend);
        TestLogger.log("Text Sent to " + webElementName);
    }

    public static void click( WebElement element, String elementName){
        TestLogger.log("Click " + elementName);
        element.click();
        TestLogger.log("Clicked " + elementName);
    }

    public static void selectByIndex( WebElement element, int i){
        Select select = new Select(element);
        TestLogger.log("Select option at index " + i);
        select.selectByIndex(i);
        TestLogger.log("Selected option at index " + i);

    }
    public static String getText(WebElement webElement, String webElementName){

        TestLogger.log("Getting text from " + webElementName);
        String actualText =  webElement.getText();
        TestLogger.log("Actual text: " + actualText);
        return actualText;
    }

    public static String getAttribute(WebElement webElement, String attributeString){
        TestLogger.log("Getting attribute from " + webElement);
        String webElementAttribute = webElement.getAttribute(attributeString);
        TestLogger.log("Actual attribute: " + webElementAttribute);
        return webElementAttribute;
    }

    // Implement for click
    // Handle drop down

    public void waitUntilElementIsPresentUsingIDLocator(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
    }
    // 5 every 6sec
    public void fluentWait(){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

                 //Wait for the condition
                .withTimeout(30, TimeUnit.SECONDS)
                  // which to check for the condition with
                .pollingEvery(6, TimeUnit.SECONDS)
                   //Which will ignore the NoSuchElementException
                .ignoring(NoSuchElementException.class);
    }
}