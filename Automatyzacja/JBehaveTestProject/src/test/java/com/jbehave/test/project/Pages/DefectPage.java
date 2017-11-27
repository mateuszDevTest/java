package com.jbehave.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mateusz on 2017-11-27.
 */
public class DefectPage {
    WebDriver driver;

    public DefectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillTCElementWithId (String id, String text) {
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void pressSaveButtonUsingId (String id){
        driver.findElement(By.id(id)).click();
    }

    public void selectWithEnter(String id, String env) throws InterruptedException {
        driver.findElement(By.id(id)).sendKeys(env);
        Thread.sleep(3000);
        driver.findElement(By.id(id)).sendKeys(Keys.RETURN);
    }

    public void pressAssignButton(String link){
        driver.findElement(By.linkText(link)).click();
    }

}
