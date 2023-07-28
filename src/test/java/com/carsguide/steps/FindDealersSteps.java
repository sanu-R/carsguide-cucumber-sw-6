package com.carsguide.steps;

import com.carsguide.pages.CarDealerPage;
import com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class FindDealersSteps {
    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        new HomePage().clickFindADealer();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals("text  not displayed", "Find a Car Dealership Near You", new CarDealerPage().textCarDealershipText());
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealersName) {
        Assert.assertEquals("Dealers name are not displayed", dealersName, new CarDealerPage().findTheDealersName());
    }
}
