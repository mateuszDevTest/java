package com.jbehave.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mateusz on 2017-11-27.
 */
public class ExploratoryPage {
    WebDriver driver;

    public ExploratoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillExplorElementWithId(String id, String text) {
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void duration(int count, String xpath) {

        for (int i=0; i<=count-1; i++){
            driver.findElement(By.xpath(xpath)).click();

        }
    }

    public void pressSaveButtonUsingId(String id){
        driver.findElement(By.id(id)).click();
    }
}
