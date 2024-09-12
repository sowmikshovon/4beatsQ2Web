package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AliExpressMainPage;
import static org.awaitility.Awaitility.await;


public class MainPageSteps {
    AliExpressMainPage aliExpressMainPage = new AliExpressMainPage();

    private static final String PAGE_NAME = "AliExpress";

    @Given("I open the AliExpress homepage")
    @Then("I should see the AliExpress homepage")
    public void assertMainPage(){
        Assert.assertEquals(aliExpressMainPage.getHeaderText(), PAGE_NAME, "Main page is not open");
    }
    @Given("I search for {string}")
    public void inputTestForSearch(String searchString) throws InterruptedException {
        wait(20);
        aliExpressMainPage.searchInput(searchString);
        wait(10);
        aliExpressMainPage.clickSearchButton();
    }
}
