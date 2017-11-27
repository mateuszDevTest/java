package com.jbehave.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mateusz on 2017-11-26.
 */
public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void writeElementById (String id, String text){
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void clickLogIn(String id) {
        driver.findElement(By.id(id)).click();
    }


}
