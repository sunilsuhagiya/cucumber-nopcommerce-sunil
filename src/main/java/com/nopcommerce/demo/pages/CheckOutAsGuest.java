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

public class CheckOutAsGuest extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutAsGuest.class.getName());

    public CheckOutAsGuest() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[text()= 'Checkout as Guest']")
    WebElement guestButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerLink;


    public String verifyWelComeText() {
        log.info("Verify WelCome Text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnAsGuestButton() {
        log.info("click On As Guest Button" + guestButton.toString());
        clickOnElement(guestButton);
    }

    public void clickOnRegisterTab() {
        log.info("click On As Register Button" + registerLink.toString());
        clickOnElement(registerLink);
    }
}
