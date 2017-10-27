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
    String loginCorrect = "administrator@testarena.pl";
    String passCorrect = "sumXQQ72$L";

    //Correct log in TC1.
    @Test
    public void shouldLogIn () {

            //TestSetup login = new TestSetup();
            //login.LogInCorrect(loginCorrect, passCorrect, url);

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

    //Empty Login/Passsword TC2
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
            assertEquals("Pole wymagane", driver.findElement(By.xpath("//input[@id='password']/../div[@class='login_form_error']")).getText());

            //Assertions for password
            assertEquals("Pole wymagane", driver.findElement(By.xpath("//input[@id='password']/../div[@class='login_form_error']")).getText());
            driver.close();

    }

    // Empty Login/ Filled Password TC3.
    @Test
    public void shouldNotLogInOneEmpty () {
        String loginEmpty ="";


        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("email")).sendKeys(loginEmpty);
        driver.findElement(By.id("password")).sendKeys(passCorrect);
        driver.findElement(By.id("login")).click();

        //Assertions for password
        assertEquals("Adres e-mail i/lub hasło są niepoprawne.", driver.findElement(By.xpath("//input[@id='password']/../div[@class='login_form_error']")).getText());
        driver.close();

    }

    // Correct Login/Wrong Password TC4.
    @Test
    public void shouldNotLogInWrongPass () {

        String passWrong ="qweqweqwe";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("email")).sendKeys(loginCorrect);
        driver.findElement(By.id("password")).sendKeys(passWrong);
        driver.findElement(By.id("login")).click();

        //Assertions for email
        assertEquals("Adres e-mail i/lub hasło są niepoprawne.", driver.findElement(By.xpath("//input[@id='password']/../div[@class='login_form_error']")).getText());
        driver.close();

    }

    // Correct Login/Wrong Password TC4.
    @Test
    public void shouldNotLogInWrongEmail () {

        String loginWrong ="qweqweqwe@wp.pl";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("email")).sendKeys(loginWrong);
        driver.findElement(By.id("password")).sendKeys(passCorrect);
        driver.findElement(By.id("login")).click();

        //Assertions for email
        assertEquals("Adres e-mail i/lub hasło są niepoprawne.", driver.findElement(By.xpath("//input[@id='password']/../div[@class='login_form_error']")).getText());
        driver.close();

    }


    //Wrong email format TC5.
    @Test
    public void shouldNotLogInWrongEmailFormat () {
        String loginEmpty ="wwwww#eee.pl";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("email")).sendKeys(loginEmpty);
        driver.findElement(By.id("login")).click();

        //Assertions for email
        assertEquals("Nieprawidłowy format adresu e-mail. Wprowadź adres ponownie.", driver.findElement(By.xpath("//input[@id='email']/../div[@class='login_form_error']")).getText());
        driver.close();

    }


}
