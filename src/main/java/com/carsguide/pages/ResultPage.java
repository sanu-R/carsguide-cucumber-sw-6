package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    public static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement textNewAndUsedCarSearch;

    @CacheLookup
    @FindBy(xpath = "//h3[normalize-space()='Make']")
    WebElement verifyMake;
    public String textNewAndUsedCarSearchGuide() {
        log.info("Navigated to New and Used Car page " + textNewAndUsedCarSearch.toString());
        return getTextFromElement(textNewAndUsedCarSearch);
    }
    public String verifyMakeText(){
        log.info("Navigated to Make page " + verifyMake.toString());
        return getTextFromElement(verifyMake);


    }







}
