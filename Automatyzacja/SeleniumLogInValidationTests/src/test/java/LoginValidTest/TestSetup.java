package LoginValidTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

class TestSetup {
    String url = "http://demo.testarena.pl";
    String loginCorrect = "administrator@testarena.pl";
    String passCorrect = "sumXQQ72$L";

    private WebDriver driver;

    void logIn(String loginCorrect, String passCorrect) {

        driver = new ChromeDriver();

        open(url);
        findElementById("email", loginCorrect);
        findElementById("password", passCorrect);
        clickElementWithId("login");
    }
    private void open(String url){
        driver.get(url);
    }

    private void clickElementWithId(String id) {
        driver.findElement(By.id(id)).click();
    }

    private void findElementById(String id, String sendKey){
        driver.findElement(By.id(id)).sendKeys(sendKey);
    }

    void clickElementWithXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    void isEqualToXpath(String expected, String actual) {
        assertEquals(expected, driver.findElement(By.xpath(actual)).getText());
    }

    boolean isDisplayedElementByClassName(String className) {
         return driver.findElement(By.className(className)).isDisplayed();
    }

    void close() {
        driver.close();
    }
}
