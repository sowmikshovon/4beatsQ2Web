package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.AliExpressProductPage;
import org.testng.Assert;

public class SearchAndNavSteps {
    AliExpressProductPage aliExpressProductPage = new AliExpressProductPage();

    @Given("I should see search results for {string}")
    public void assertSearchResults(String searchString){
        Assert.assertEquals(aliExpressProductPage.getFirstProductText(), searchString, "Search results not found");
    }
}
