package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarDealerPage extends Utility {
    public static final Logger log = LogManager.getLogger(CarDealerPage.class.getName());

    public CarDealerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "(//h1[normalize-space()='Find a Car Dealership Near You'])[1]")
    WebElement carDealershipText;
    @CacheLookup
    @FindBy(css = ".dealerResults")
    WebElement dealersNames;

    public String textCarDealershipText() {
        log.info("Find a Car Dealership Near You" + carDealershipText.toString());
        return getTextFromElement(carDealershipText);
    }

    public String findTheDealersName() {
        log.info("Find the Dealers Name " + dealersNames.toString());
        return getTextFromElement(dealersNames);

    }
}
