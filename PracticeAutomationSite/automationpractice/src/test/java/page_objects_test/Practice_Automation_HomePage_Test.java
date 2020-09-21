package page_objects_test;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Practice_Automation_HomePage;

public class Practice_Automation_HomePage_Test extends BrowserDriver {

    public static Practice_Automation_HomePage p1;

    @BeforeMethod
    public void setup(){
        p1 = PageFactory.initElements(driver, Practice_Automation_HomePage.class);
    }

    @Test
    public void testing_phase() throws InterruptedException {
        p1.find_shirt("shirt");
        Thread.sleep(2000);

    }
}
