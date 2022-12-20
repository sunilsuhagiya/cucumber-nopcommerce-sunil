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

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerPageText;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationPageText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonText;


    public String verifyRegisterText(){
        log.info("verify Register Text" + registerPageText.toString());
        return getTextFromElement(registerPageText);
    }

    public void enterFirstName(String text){
        log.info("Enter First Name" + firstName.toString());
        sendTextToElement(firstName,text + getAlphaNumericString(5));
    }
    public void enterLastName(String text){
        log.info("Enter Last Name" + lastName.toString());
        sendTextToElement(lastName,text + getAlphaNumericString(5));
    }
    public void enterEmail(String text){
        log.info("Enter Email" + emailId.toString());
        sendTextToElement(emailId,text );
    }
    public void enterPassword(String text){
        log.info("Enter Password" + password.toString());
        sendTextToElement(password,text);
    }
    public void enterConfirmPassword(String text){
        log.info("Enter Confirm Password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, text);
    }

    public void clickOnRegisterButton(){
        log.info("Click on Register button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText(){
        log.info("Registration Page Text" + registrationPageText.toString());
        return getTextFromElement(registrationPageText);
    }

    public void clickOnContinueButton(){
        log.info("Click on Continue button" + continueButtonText.toString());
        clickOnElement(continueButtonText);
    }
}
