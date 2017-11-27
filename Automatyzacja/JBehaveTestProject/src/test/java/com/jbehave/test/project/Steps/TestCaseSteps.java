package com.jbehave.test.project.Steps;

import com.jbehave.test.project.Pages.TestCasePage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-11-27.
 */
public class TestCaseSteps extends DefaultSteps {
    TestCasePage testCasePage = new TestCasePage(driver);

    @Given("logged in user in test case creation window.")
    public void loggedInToTC () {
        open(url);
        logIn(email, pass);
        goToPageUsingPLink("Test base");
        goToPageUsingPLink("ADD");
        goToPageUsingXPath("//*[@id=\"content\"]/article/nav/ul/div/div/ul/li[2]/a");
    }

    @When("TC field name with id $title is filled with $TcName value.")
    public void nameTC(@Named("title") String title, @Named("TcName") String TcName) {
        //testCasePage.fillTCElementWithId(title, TcName);
        driver.findElement(By.id(title)).sendKeys(TcName);
    }

    @When("TC field description with id $des is filled with $descVal value.")
    public void descTC (@Named("des") String des, @Named("descVal") String descVal) {
        //testCasePage.fillTCElementWithId(des, descVal);
        driver.findElement(By.id(des)).sendKeys(descVal);
    }

    @When("TC field prerequisites with id $presupp is filled with $preco value.")
    public void precoTC (@Named("presupp") String presupp, @Named("preco") String preco) {
        //testCasePage.fillTCElementWithId(presupp, preco);
        driver.findElement(By.id(presupp)).sendKeys(preco);
    }

    @When("TC field expected result with id $result is filled with $expect value.")
    public void resultTC (@Named("result") String result, @Named("expect") String expect) {
        //testCasePage.fillTCElementWithId(result, expect);
        driver.findElement(By.id(result)).sendKeys(expect);
    }

    @When("TC button Save with id $save is clicked.")
    public void pressSaveTC (@Named("save") String save) {
        driver.findElement(By.id(save)).click();
        //testCasePage.pressSaveButtonUsingId(save);
    }

    @Then("new test case is created and button with id $id is displayed.")
    public void TCCreated(@Named("id") String id ) {
        assertTrue(elementWithIdIsDisplayed(id));
    }


}
