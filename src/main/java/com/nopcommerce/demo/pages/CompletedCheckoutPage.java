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

public class CompletedCheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CompletedCheckoutPage.class.getName());

    public CompletedCheckoutPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankyouText;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement sucessText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;


    public String verifyThankYouText() {
        log.info("Verify Thank You Text" + thankyouText.toString());
        return getTextFromElement(thankyouText);
    }

    public String verifySucessOrderText() {
        log.info("Verify Sucess Order Text" + sucessText.toString());
        return getTextFromElement(sucessText);
    }

    public void clickOnContinue() {
        log.info("Click on Continue Button" + continueButton.toString());
        clickOnElement(continueButton);
    }

}
