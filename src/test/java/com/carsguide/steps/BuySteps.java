package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarSearchPage;
import com.carsguide.pages.ResultPage;
import com.carsguide.pages.UsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuySteps {
    @When("^I mouse hover on buy sell tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSellTab();
    }
    @And("^I click Search Cars link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarLink();
    }

    @Then("^I navigate to New & Used Car Search - carsguide page$")
    public void iNavigateToNewUsedCarSearchCarsguidePage() {
       Assert.assertEquals("page not displayed","New & Used Car Search - carsguide",new ResultPage().textNewAndUsedCarSearchGuide());
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) throws InterruptedException {
        Thread.sleep(1000);
        new NewAndUsedCarSearchPage().selectMakesFromDropdown(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) throws InterruptedException {
        Thread.sleep(1000);
        new NewAndUsedCarSearchPage().selectModelFromDropdown(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) throws InterruptedException {
        Thread.sleep(1000);
        new NewAndUsedCarSearchPage().selectLocationFromDropdown(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) throws InterruptedException {
        Thread.sleep(1000);
        new NewAndUsedCarSearchPage().selectPriceFromDropdown(price);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() throws InterruptedException {
        Thread.sleep(1000);
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarTab();

    }

    @Then("^I should see the \"([^\"]*)\" in results$")
    public void iShouldSeeTheInResults(String make) {
        Assert.assertEquals("Text not displayed","Make",new ResultPage().verifyMakeText());

    }

    @And("^I click used link$")
    public void iClickUsedLink() {
       new HomePage().clickOnUsedLink();
    }

    @Then("^I navigate to Used Cars For Sale page$")
    public void iNavigateToUsedCarsForSalePage() {
        new UsedCarPage().textUsedCarsForSale();

    }
}
