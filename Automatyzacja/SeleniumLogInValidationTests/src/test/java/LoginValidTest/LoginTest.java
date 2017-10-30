package LoginValidTest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-10-16.
 */
public class LoginTest extends TestSetup {

    //Correct log in TC1.
    @Test
    public void shouldLogIn() {

        logIn(loginCorrect, passCorrect);
        //Assertion.
        assertTrue(isDisplayedElementByClassName("activeMenu"));
        //Session killer
        clickElementWithXpath("//div[@class='header_logout']");
        close();
    }

    //Empty Login/Password TC2
    @Test
    public void shouldNotLogInEmpty() {
        String loginEmpty = "";
        String passEmpty = "";

        logIn(loginEmpty, passEmpty);
        //Assertions for email
        isEqualToXpath("Pole wymagane", "//input[@id='email']/../div[@class='login_form_error']");
        //Assertions for password
        isEqualToXpath("Pole wymagane", "//input[@id='password']/../div[@class='login_form_error']");
        close();
    }

    // Empty Login/ Filled Password TC3.
    @Test
    public void shouldNotLogInOneEmpty() {
        String loginEmpty = "";

        logIn(loginEmpty, passCorrect);
        //Assertions for password
        isEqualToXpath("Adres e-mail i/lub hasło są niepoprawne.", "//input[@id='password']/../div[@class='login_form_error']");
        close();
    }

    // Correct Login/Wrong Password TC4.
    @Test
    public void shouldNotLogInWrongPass() {
        String passWrong = "qweqweqwe";

        logIn(loginCorrect, passWrong);
        //Assertions for email
        isEqualToXpath("Adres e-mail i/lub hasło są niepoprawne.", "//input[@id='password']/../div[@class='login_form_error']");
        close();
    }

    // Correct Login/Wrong Password TC4.
    @Test
    public void shouldNotLogInWrongEmail() {
        String loginWrong = "qweqweqwe@wp.pl";

        logIn(loginWrong, passCorrect);
        //Assertions for email
        isEqualToXpath("Adres e-mail i/lub hasło są niepoprawne.", "//input[@id='password']/../div[@class='login_form_error']");
        close();
    }


    //Wrong email format TC5.
    @Test
    public void shouldNotLogInWrongEmailFormat() {
        String loginFormat = "wwwww#eee.pl";

        logIn(loginFormat, passCorrect);
        //Assertions for email
        isEqualToXpath("Nieprawidłowy format adresu e-mail. Wprowadź adres ponownie.", "//input[@id='email']/../div[@class='login_form_error']");
        close();
    }
}
