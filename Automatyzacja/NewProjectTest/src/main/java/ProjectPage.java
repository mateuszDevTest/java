import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Mateusz on 2017-11-04.
 */
public class ProjectPage {
    WebDriver driver;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendTextToElementWithId(String id, String text) {
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void clickElementWithXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();

    }
    public void clickElementWithLinkText (String link) {
        driver.findElement(By.partialLinkText(link)).click();
    }
    public void clickElementWithId (String id) {
        driver.findElement(By.id(id)).click();
    }

}
