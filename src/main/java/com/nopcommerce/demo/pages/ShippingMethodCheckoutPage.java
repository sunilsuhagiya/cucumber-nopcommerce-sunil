package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShippingMethodCheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShippingMethodCheckoutPage.class.getName());

    public ShippingMethodCheckoutPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAir;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement secondDayAir;

    public void clickOnRadioButtonTextDayAir() {
        log.info("Click on radio button day air" + nextDayAir.toString());
        clickOnElement(nextDayAir);
    }

    public void clickOnContinue() {
        log.info("Click on Continue" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnRadioButtonSecondDayAir() {
        log.info("Click on radio button second day air" + secondDayAir.toString());
        clickOnElement(secondDayAir);
    }
}
