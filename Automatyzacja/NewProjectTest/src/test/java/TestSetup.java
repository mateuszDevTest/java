import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Mateusz on 2017-11-04.
 */
class TestSetup {
    WebDriver driver = new ChromeDriver();
    String url = "http://demo.testarena.pl";
    String email = "administrator@testarena.pl";
    String pass = "sumXQQ72$L";

    void logIn() {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login")).click();


    }

    void open() {

        driver.get(url);
    }

    void close() {
        driver.close();
    }


    public boolean isDisplayedElementWithId (String id) {
        driver.findElement(By.id(id)).isDisplayed();
        return true;
    }

}
