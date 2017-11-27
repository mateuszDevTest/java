package com.jbehave.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mateusz on 2017-11-27.
 */
public class ProjectPage {
    WebDriver driver;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillElementWithId(String id, String text) {
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void pressSaveButtonUsingId(String id){
        driver.findElement(By.id(id)).click();
    }
}
