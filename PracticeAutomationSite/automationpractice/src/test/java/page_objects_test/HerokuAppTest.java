package page_objects_test;

import base.BrowserDriver;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HerokuappTraining;

public class HerokuAppTest extends BrowserDriver {

    public static HerokuappTraining p1;

    @BeforeMethod
    public void setUp() {
        p1 = PageFactory.initElements(driver, HerokuappTraining.class);
    }

    @Test(priority = 0)
    public void openingTheFirstLink() throws InterruptedException {
        p1.getBasicPageLink();
        Thread.sleep(3000);
        String expected = "Basic Web Page Title";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 1)
    public void openingTheSecondLink() {
        p1.getElementalAttributesLink();
        boolean Actual;
        boolean Expected = false;
        if (driver.getTitle().contains("Test")) {
            Actual = true;
        } else {
            Actual = false;
        }
        Assert.assertEquals(Actual, true);
    }

    @Test(priority = 2)
    public void openingTheThirdLink(){
        p1.getLocatorsPageLink();
        String actual = driver.getCurrentUrl();
        String expected = "https://testpages.herokuapp.com/styled/basic-web-page-test.html";
        Assert.assertEquals(actual, expected);
    }



}
