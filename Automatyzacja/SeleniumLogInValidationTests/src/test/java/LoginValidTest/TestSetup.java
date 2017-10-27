package LoginValidTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Mateusz on 2017-10-17.
 */
public class TestSetup {

    public void LogInCorrect (String loginCorrect, String passCorrect, String url) {

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("email")).sendKeys(loginCorrect);
        driver.findElement(By.id("password")).sendKeys(passCorrect);
        driver.findElement(By.id("login")).click();
    }
}
