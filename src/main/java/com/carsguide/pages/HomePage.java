package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    public static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buySellTab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCar;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findDealer;

    public void mouseHoverOnBuyAndSellTab() {
        mouseHoverToElement(buySellTab);
        log.info("Mouse hover on element " + buySellTab);
    }

    public void clickOnSearchCarLink() {
        clickOnElement(searchCar);
        log.info("Click on search car element " + searchCar);
    }

    public void clickOnUsedLink() {
        clickOnElement(usedLink);
        log.info("Click on search car element" + usedLink);
    }

    public void clickFindADealer() {
        clickOnElement(findDealer);
        log.info("Click on find a dealer element" + findDealer);
    }


}
