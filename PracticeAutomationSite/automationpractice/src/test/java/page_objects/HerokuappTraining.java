package page_objects;

import application_page_base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappTraining {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div/ul[1]/li[1]/a")
    WebElement basicPageLink;

    @FindBy(xpath = "//a[@id='elementattributestest']")
    WebElement elementAttributesLink;

    @FindBy(xpath = "//button[@class='styled-click-button']")
    WebElement attributesButton;

    @FindBy(xpath = "//a[@id='basicpagetest']")
    WebElement locatorsPageLink;

    @FindBy(xpath = "//a[@id='alerttest']")
    WebElement alertsForJavaScriptPage;

    public HerokuappTraining(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getBasicPageLink() {
        ApplicationPageBase.click(basicPageLink, "Basic Page Length");

    }

    public void getElementalAttributesLink(){
        ApplicationPageBase.click(elementAttributesLink, "The Elements Attribute Link");
        ApplicationPageBase.click(attributesButton, "Button to add another Attribute");
    }

    public void getLocatorsPageLink() {
        ApplicationPageBase.click(locatorsPageLink, "locating links page");
    }






}
