package com.jbehave.test.project.Steps;

import com.jbehave.test.project.Pages.ProjectPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-11-27.
 */
public class ProjectSteps extends DefaultSteps {
    ProjectPage projectPage = new ProjectPage(driver);

    @Given("logged in user in project creation panel.")
    public void loggedInUser(){
        open(url);
        logIn(email, pass);
        goToPageUsingClass("header_admin");
        goToPageUsingPLink("ADD A PROJECT");
    }

    @When("project field $name is filled with value $description.")
    public void enterName(@Named("name") String name, @Named("description") String desc) {
        //projectPage.fillElementWithId(name, desc);
        driver.findElement(By.id(name)).sendKeys(desc);
    }

    @When("project field $prefix is filled with $prefixValue value.")
    public void enterPrefix (@Named("prefix") String prefix, @Named("prefixValue") String prefixValue) {
        //projectPage.fillElementWithId(prefix, prefixValue);
        driver.findElement(By.id(prefix)).sendKeys(prefixValue);
    }

    @When(" project field $description is filled with value $descValue.")
    public void enterDesc (@Named("description") String description, @Named("descValue") String descValue) {
        //projectPage.fillElementWithId(description, descValue);
        driver.findElement(By.id(description)).sendKeys(descValue);
    }

    @When("project button $save is clicked.")
    public void pressSave (@Named("save") String save) {
        driver.findElement(By.id(save)).click();
        //projectPage.pressSaveButtonUsingId(save);
    }

    @Then("new project is created and $suspend button is displayed.")
    public void projectCreated (@Named("suspend") String suspend){
        assertTrue(elementWithLinkIsDisplayed(suspend));
    }





}
