package page_objects;

import application_page_base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice_Automation_HomePage {

    WebDriver driver;

    @FindBy(id = "search_query_top")
    WebElement searchBar;

    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement searchBarSubmit;


    public Practice_Automation_HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void find_shirt(String search){
        ApplicationPageBase.sendKeys("search bar", searchBar, search);
        ApplicationPageBase.click(searchBarSubmit, "submit button");


    }

}
