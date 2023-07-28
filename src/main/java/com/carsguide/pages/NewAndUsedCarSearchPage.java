package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {
    public static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement carMakes;

    @CacheLookup
    @FindBy(id = "models")
    WebElement carModels;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement carLocations;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement carPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarTab;


    public void selectMakesFromDropdown(String make) {
        selectByVisibleTextFromDropDown(carMakes, make);
        log.info("Select makes dropdown " + carMakes.toString());
    }
    public void selectModelFromDropdown(String model) {
     selectByVisibleTextFromDropDown(carModels, model);
        log.info("Select Models dropdown " + carModels.toString());
    }
    public void selectLocationFromDropdown(String location) {
        selectByVisibleTextFromDropDown(carLocations, location);
        log.info("Select location dropdown " + carLocations.toString());
    }
    public void selectPriceFromDropdown(String price) {
        selectByVisibleTextFromDropDown(carPrice, price);
        log.info("Select price dropdown " + carPrice.toString());
    }
    public void clickOnFindMyNextCarTab() {
        clickOnElement(findMyNextCarTab);
    }


}
