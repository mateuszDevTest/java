package com.jbehave.test.project.Steps;


import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DefaultSteps extends Steps {

    public WebDriver driver;
    String url = "http://demo.testarena.pl";
    String email = "administrator@testarena.pl";
    String pass = "sumXQQ72$L";

    @BeforeStories
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
    }

    //@AfterStories
    public void tearDown(){
        driver.quit();
    }

    public void logIn(String email, String pass) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login")).click();
    }

    public void open(String url) {
        driver.get(url);
    }

    public boolean elementWithClassIsDisplayed(String className) {
        return driver.findElement(By.className(className)).isDisplayed();
    }
    public boolean elementWithLinkIsDisplayed(String link) {
        return driver.findElement(By.partialLinkText(link)).isDisplayed();
    }
    public boolean elementWithIdIsDisplayed(String id) {
        return driver.findElement(By.id(id)).isDisplayed();
    }

    public void goToPageUsingClass (String className){
        driver.findElement(By.className(className)).click();
    }

    public void goToPageUsingPLink (String pLink){
        driver.findElement(By.partialLinkText(pLink)).click();
    }

    public void goToPageUsingXPath (String xPath) {
        driver.findElement(By.xpath(xPath)).click();
    }



}
