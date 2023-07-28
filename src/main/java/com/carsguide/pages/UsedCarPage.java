package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarPage extends Utility {
    public static final Logger log = LogManager.getLogger(UsedCarPage.class.getName());

    public UsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement usedCarsForSale;

    public String textUsedCarsForSale() {
        log.info("Navigated to  Used Car page " + usedCarsForSale.toString());
        return getTextFromElement(usedCarsForSale);
    }

}
