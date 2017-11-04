import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Mateusz on 2017-11-04.
 */
public class NewProjectTest extends TestSetup {
    ProjectPage projectPage;

    @Before
    public void before() {
        driver.manage().window().maximize();
        projectPage = new ProjectPage(driver);
        open();
        logIn();
    }

    @Test
    public void shouldCreateNewProject() {
        // Opening New project.
        projectPage.clickElementWithXpath("//a[@title='Admin panel']");
        projectPage.clickElementWithLinkText("ADD A PROJECT");

        //Filling data.

        // Project name <- CHANGE IT
        projectPage.sendTextToElementWithId("name", "New project test1");
        //Project prefix <- CHANGE IT
        projectPage.sendTextToElementWithId("prefix", "test");
        projectPage.sendTextToElementWithId("description", "This is test project.");
        projectPage.clickElementWithXpath("//label[@for='openStatusColor']/../div[@class='sp-replacer sp-light']/div[@class='sp-dd']");
        projectPage.clickElementWithXpath("//span[@title='#b6d7a8']/span[@class='sp-thumb-inner']");
        projectPage.clickElementWithXpath("//label[@for='inProgressStatusColor']/../div[@class='sp-replacer sp-light']/div[@class='sp-dd']");
        projectPage.clickElementWithXpath("/html/body/div[5]/div[1]/div[1]/div[7]/span[6]/span");
        projectPage.clickElementWithId("save");

        //Assertion
        assertTrue(isDisplayedElementWithId("j_info_box"));


    }

    @After
    public void after() {
        close();
    }
}
