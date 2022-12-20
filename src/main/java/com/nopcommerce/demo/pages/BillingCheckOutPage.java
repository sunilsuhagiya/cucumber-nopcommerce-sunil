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


public class BillingCheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(BillingCheckOutPage.class.getName());

    public BillingCheckOutPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;

    @CacheLookup
    @FindBy(xpath = "//div[1]/button[4]")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButton;


    public void enterBillingFirstName(String text) {
        log.info("Enter Billing First Name" + firstNameField.toString());
        sendTextToElement(firstNameField, text);
    }

    public void enterBillingLastName(String text) {
        log.info("Enter Billing Last Name" + lastNameField.toString());
        sendTextToElement(lastNameField, text);
    }

    public void enterBillingEmailAddress(String text) {
        log.info("Enter Billing Email Address" + emailAddressField.toString());
        sendTextToElement(emailAddressField, text);
    }

    public void selectCountryFromDropDown(String text) {
        log.info("Select Country" + countryField.toString());
        selectByValueFromDropDown(countryField, text);
    }

    public void selectStateFromDropDown(String text) {
        log.info("Select Country" + stateField.toString());
        selectByValueFromDropDown(stateField, text);

    }

    public void enterBillingCity(String text) {
        log.info("Enter Billing City Name" + cityField.toString());
        sendTextToElement(cityField, text);
    }

    public void enterBillingAddress(String text) {
        log.info("Enter Billing Address" + addressField.toString());
        sendTextToElement(addressField, text);
    }

    public void enterBillingZipcode(String text) {
        log.info("Enter Billing Zipcode" + zipCodeField.toString());
        sendTextToElement(zipCodeField, text);
    }

    public void enterBillingPhoneNumber(String text) {
        log.info("Enter Billing Phone number" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, text);
    }

    public void clickOnCheckOutButton() {
        log.info("Click on checkout" + checkout.toString());
        clickOnElement(checkout);
    }

    public void clickOnContinueButton() {
        log.info("Click on continue Button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
