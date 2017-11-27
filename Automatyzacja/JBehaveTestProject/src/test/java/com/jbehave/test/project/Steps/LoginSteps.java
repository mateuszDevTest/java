package com.jbehave.test.project.Steps;


import com.jbehave.test.project.Pages.LoginPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-11-26.
 */
public class LoginSteps extends DefaultSteps{
    LoginPage loginPage = new LoginPage(driver);

    @Given("a $page_url page.")
    public void aPage(@Named("page_url") String page_url) {
        open(page_url);
    }

    @When("field $email is filled with $value value.")
    public void enterEmail(@Named("email") String email, @Named("value") String value) {
        driver.findElement(By.id(email)).sendKeys(value);
        //loginPage.writeElementById(email, value);
    }
    @When("field $pass is filled with value $passValue.")
    public void enterPassword(@Named("pass") String pass, @Named("passValue") String passValue){
        driver.findElement(By.id(pass)).sendKeys(passValue);
        //loginPage.writeElementById(pass, passValue);
    }
    @When("button $login is pressed.")
    public void pressLogIn(@Named("login") String login){
        //loginPage.clickLogIn(login);
        driver.findElement(By.id(login)).click();
    }

    @Then("user is logged in and element $element is displayed.")
    public void loggedIn(@Named("element") String element){
        assertTrue(elementWithClassIsDisplayed(element));
    }
}
