package LoginValidTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-10-16.
 */
public class LoginTest {



    //Set URL for test:
    String url = "http://demo.testarena.pl";


    //Correct log in TC1.
    @Test
    public void shouldLogIn () {



        //Correct Login/Password (TC1)
        String loginCorrect = "administrator@testarena.pl";
        String passCorrect = "sumXQQ72$L";


        WebDriver driver = new ChromeDriver();
            driver.get(url);

            driver.findElement(By.id("email")).sendKeys(loginCorrect);
            driver.findElement(By.id("password")).sendKeys(passCorrect);
            driver.findElement(By.id("login")).click();

            //Assertion.
            assertTrue(driver.findElement(By.className("activeMenu")).isDisplayed());

            //In case of session is on.
            driver.findElement(By.xpath("//div[@class='header_logout']")).click();
            driver.close();
    }

    //Empty Login/Passsword
    @Test
    public void shouldNotLogInEmpty () {
        String loginEmpty ="";
        String passEmpty ="";

        WebDriver driver = new ChromeDriver();
            driver.get(url);

            driver.findElement(By.id("email")).sendKeys(loginEmpty);
            driver.findElement(By.id("password")).sendKeys(passEmpty);
            driver.findElement(By.id("login")).click();

            //Assertions for email
            assertEquals(driver.findElement(By.xpath("//input[@id='password']/../div[@class='login_form_error']")).getText(), "Pole wymagane");

            //Assertions for password
            assertEquals(driver.findElement(By.xpath("//input[@id='password']/../div[@class='login_form_error']")).getText(), "Pole wymagane");
            driver.close();

    }
}
