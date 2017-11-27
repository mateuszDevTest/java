package com.jbehave.test.project.Steps;

import com.jbehave.test.project.Pages.ExploratoryPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-11-27.
 */
public class ExploratorySteps extends DefaultSteps {
    ExploratoryPage explorPage = new ExploratoryPage(driver);

    @Given("logged in user in exploratory testing creation panel.")
    public void loggedInToExploratory () {
        open(url);
        logIn(email, pass);
        goToPageUsingPLink("Test base");
        goToPageUsingPLink("ADD");
        goToPageUsingXPath("//*[@id=\"content\"]/article/nav/ul/div/div/ul/li[1]/a");
    }

    @When("Explore field with id $title is filled with $explore value.")
    public void nameExploratory (@Named("title") String title, @Named("explore") String explore) {
        //explorPage.fillTCElementWithId(title, explore);
        driver.findElement(By.id(title)).sendKeys(explore);
    }

    @When("time in duration field with path $xpath is added $time times (It is 25 minutes).")
    public void durationExploratory (@Named("xpath") String xpath, @Named("time") Integer time) throws InterruptedException {
        for (int i=0; i<=time-1; i++){
            driver.findElement(By.xpath(xpath)).click();
            Thread.sleep(100);
        }
        //explorPage.duration(time, xpath);
    }

    @When("test charter field with id $testCard is filled with $charter value.")
    public void charterExploratory (@Named("testCard") String testCard, @Named("charter") String charter) {
        //explorPage.fillTCElementWithId(testCard, charter);
        driver.findElement(By.id(testCard)).sendKeys(charter);
    }

    @When("button Save with id $save is clicked.")
    public void pressSaveExploratory (@Named("save") String save) {
        driver.findElement(By.id(save)).click();
        //explorPage.pressSaveButtonUsingId(save);
    }

    @Then("new exploratory test case is created and button with id $id is displayed.")
    public void explorCreated(@Named("id") String id ) {
        assertTrue(elementWithIdIsDisplayed(id));
    }

}
