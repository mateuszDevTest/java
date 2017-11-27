package com.jbehave.test.project.Steps;

import com.jbehave.test.project.Pages.DefectPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-11-27.
 */
public class DefectSteps extends DefaultSteps{
    DefectPage defectPage = new DefectPage(driver);

    @Given("logged in user in new defect window.")
    public void loggedInToDefect () {
        open(url);
        logIn(email, pass);
        goToPageUsingPLink("Defects");
        goToPageUsingPLink("ADD DEFECT");
    }

    @When("Defect field title with id $title is filled with $defectName value.")
    public void defectTitle (@Named("title") String title, @Named("defectName") String defectName) {
        //defectPage.fillTCElementWithId(title, defectName);
        driver.findElement(By.id(title)).sendKeys(defectName);
    }

    @When("Defect field description with id $descr is filled with $value value.")
    public void defectDescription (@Named("descr") String descr, @Named("value") String value) {
        //defectPage.fillTCElementWithId(descr, value);
        driver.findElement(By.id(descr)).sendKeys(value);
    }

    @When("Defect field environments with id $id is filled with $env env.")
    public void defectEnv(@Named("id") String id, @Named("env") String env) throws InterruptedException {
        //defectPage.selectWithEnter(id, env);
        driver.findElement(By.id(id)).sendKeys(env);
        Thread.sleep(3000);
        driver.findElement(By.id(id)).sendKeys(Keys.RETURN);
        }

    @When("Defect field versions with id $version is filled with $ver version.")
    public void defectVersion(@Named("version") String version, @Named("ver") String ver) throws InterruptedException {
        //defectPage.selectWithEnter(version, ver);
        driver.findElement(By.id(version)).sendKeys(ver);
        Thread.sleep(3000);
        driver.findElement(By.id(version)).sendKeys(Keys.RETURN);
    }

    @When("Defect button $link button is clicked.")
    public void defectAssign(@Named("link") String link){
        //defectPage.pressAssignButton(link);
        driver.findElement(By.linkText(link)).click();
    }
    @When("Defect field priority with id $priority and value $select is selected.")
    public void defectSelect(@Named("priority") String prior,@Named("select") String select) {
        Select dropdown = new Select(driver.findElement(By.id(prior)));
        dropdown.selectByVisibleText(select);
    }

    @When("Defect button save with id $save is clicked.")
    public void defectSave (@Named("save") String save) {
        driver.findElement(By.id(save)).click();
        //defectPage.pressSaveButtonUsingId(save);
    }

    @Then("new defect is added and button $button is displayed.")
    public void defectCreated(@Named("button") String button) {
        assertTrue(elementWithLinkIsDisplayed(button));
    }


}
