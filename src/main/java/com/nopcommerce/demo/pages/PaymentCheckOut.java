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

public class PaymentCheckOut extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentCheckOut.class.getName());

    public PaymentCheckOut() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYearField;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeField;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton;


    public void selectCardTypeFromDropDown(String text) {
        log.info("Select card type from drop down" + cardType.toString());
        selectByValueFromDropDown(cardType, text);
    }

    public void enterCardHolderName(String text) {
        log.info("Enter card Card holder name" + cardHolderNameField.toString());
        sendTextToElement(cardHolderNameField, text);
    }

    public void enterCardNumber(String text) {
        log.info("Enter card Card number" + cardNumberField.toString());
        sendTextToElement(cardNumberField, text);
    }

    public void selectExpiryMonthFromDropDown(String text) {
        log.info("Select Expiry Month" + expireMonthField.toString());
        selectByValueFromDropDown(expireMonthField, text);
    }

    public void selectExpiryYearFromDropDown(String text) {
        log.info("Select expire Year" + expireYearField.toString());
        selectByValueFromDropDown(expireYearField, text);
    }

    public void enterCardCode(String text) {
        log.info("Enter Card Code" + cardCodeField.toString());
        sendTextToElement(cardCodeField, text);
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
