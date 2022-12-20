package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicsSteps {
    @When("^User mouse hover on Electronic tab$")
    public void userMouseHoverOnElectronicTab() {
        new HomePage().mouseHoverOnElectronics();
    }

    @And("^User mouse hover on cell phone and click$")
    public void userMouseHoverOnCellPhoneAndClick() {
        new HomePage().mouseHoverOnCellPhonesAndClick();
    }

    @Then("^Verify the cell phone text \"([^\"]*)\"$")
    public void verifyTheCellPhoneText(String text) {
        Assert.assertEquals("Text not found", text, new CellPhonesPage().verifyCellPhonesText());
    }

    @And("^User click on list view$")
    public void userClickOnListView() {
        new CellPhonesPage().clickOnListView();
    }

    @And("^User click on nokia lumia$")
    public void userClickOnNokiaLumia() throws InterruptedException {
        Thread.sleep(2000);
        new CellPhonesPage().clickOnNokiaLumia();
    }

    @Then("^Verify nokia lumia text \"([^\"]*)\"$")
    public void verifyNokiaLumiaText(String nokiaText) {
        Assert.assertEquals("Text not matched", nokiaText, new NokiaLumiaPage().verifyNokiaLumiaText());
    }

    @And("^Verify nokia lumia price \"([^\"]*)\"$")
    public void verifyNokiaLumiaPrice(String price) {
        Assert.assertEquals("Price not matched", price, new NokiaLumiaPage().verifyNokiaPrice());
    }

    @And("^User change the quantity$")
    public void userChangeTheQuantity() {
        new NokiaLumiaPage().changeNokiaQuantity();
    }

    @And("^User click on add to cart nokia$")
    public void userClickOnAddToCartNokia() {
        new NokiaLumiaPage().nokiaAddToCartButton();
    }

    @Then("^Verify the message product added to cart \"([^\"]*)\"$")
    public void verifyTheMessageProductAddedToCart(String addedToCart) {
        Assert.assertEquals("Text not matched", addedToCart, new NokiaLumiaPage().productAddedToTheCartMessage());
    }

    @And("^User click on cross button$")
    public void userClickOnCrossButton() {
        new NokiaLumiaPage().clickOnCrossButton();
    }

    @And("^User click on shopping cart link$")
    public void userClickOnShoppingCartLink() {
        new NokiaLumiaPage().clickOnShoppingCartLink();
    }

    @Then("^Verify shopping cart text \"([^\"]*)\"$")
    public void verifyShoppingCartText(String cartText) {
        Assert.assertEquals("Text not found", cartText, new ShoppingCartPage().verifyShoppingCartText());
    }

    @And("^Verify product quantity \"([^\"]*)\"$")
    public void verifyProductQuantity(String pQuantity) {
        Assert.assertEquals("Quantity not matched", pQuantity, new ShoppingCartPage().verifyProductQuantity());
    }

    @And("^Verify total price nokia \"([^\"]*)\"$")
    public void verifyTotalPriceNokia(String totalPrice) {
        Assert.assertEquals("Total price not matched", totalPrice, new ShoppingCartPage().verifyTotalPrice());
    }

    @And("^User click on Terms of services$")
    public void userClickOnTermsOfServices() {
        new ShoppingCartPage().clickOnTermsOfService();
    }

    @And("^User click on check out box$")
    public void userClickOnCheckOutBox() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @Then("^Verify welcome text for nokia page$")
    public void verifyWelcomeTextForNokiaPage() {
        new CheckOutAsGuest().verifyWelComeText();
    }

    @And("^User click on register tab$")
    public void userClickOnRegisterTab() {
        new CheckOutAsGuest().clickOnRegisterTab();
    }

    @Then("^User verify register text \"([^\"]*)\"$")
    public void userVerifyRegisterText(String registerText) {
        Assert.assertEquals("Not matched", registerText, new RegisterPage().verifyRegisterText());
    }

    @And("^User enter First name \"([^\"]*)\"$")
    public void userEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("^User enter Last name \"([^\"]*)\"$")
    public void userEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("^User enter email \"([^\"]*)\"$")
    public void userEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("^User enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("^User enter confirm password \"([^\"]*)\"$")
    public void userEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("^User click on register$")
    public void userClickOnRegister() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^Verify Register success message \"([^\"]*)\"$")
    public void verifyRegisterSuccessMessage(String success) {
        Assert.assertEquals("Not found", success, new RegisterPage().verifyRegistrationText());
    }

    @And("^User click on continue after register$")
    public void userClickOnContinueAfterRegister() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("^User click on terms and conditions$")
    public void userClickOnTermsAndConditions() {
        new ShoppingCartPage().clickOnTermsOfService();
    }

    @And("^User click on check out button e$")
    public void userClickOnCheckOutButtonE() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @And("^User select country from drop down \"([^\"]*)\"$")
    public void userSelectCountryFromDropDown(String country) {
        new BillingCheckOutPage().selectCountryFromDropDown(country);
    }

    @And("^User select state from drop down \"([^\"]*)\"$")
    public void userSelectStateFromDropDown(String state) {
        new BillingCheckOutPage().selectStateFromDropDown(state);
    }

    @And("^User enter billing city for electronics \"([^\"]*)\"$")
    public void userEnterBillingCityForElectronics(String city) {
        new BillingCheckOutPage().enterBillingCity(city);
    }

    @And("^User enter billing address for electronics \"([^\"]*)\"$")
    public void userEnterBillingAddressForElectronics(String address) {
        new BillingCheckOutPage().enterBillingAddress(address);
    }

    @And("^User enter billing zipcode for electronics \"([^\"]*)\"$")
    public void userEnterBillingZipcodeForElectronics(String zipcode) {
        new BillingCheckOutPage().enterBillingZipcode(zipcode);
    }

    @And("^User enter billing phone number for electronics \"([^\"]*)\"$")
    public void userEnterBillingPhoneNumberForElectronics(String phoneNumber) {
        new BillingCheckOutPage().enterBillingPhoneNumber(phoneNumber);
    }

    @And("^User click on continue$")
    public void userClickOnContinue() {
        new BillingCheckOutPage().clickOnContinueButton();
    }

    @And("^User click on second day air$")
    public void userClickOnSecondDayAir() {
        new ShippingMethodCheckoutPage().clickOnRadioButtonSecondDayAir();
    }

    @And("^User click on continue after day air$")
    public void userClickOnContinueAfterDayAir() {
        new ShippingMethodCheckoutPage().clickOnContinue();
    }

    @And("^User click on credit card Electronics$")
    public void userClickOnCreditCardElectronics() {
        new PaymentMethodCheckOut().clickOnCreditCard();
    }

    @And("^User click on continue button on credit card page$")
    public void userClickOnContinueButtonOnCreditCardPage() {
        new PaymentMethodCheckOut().clickOnContinue();
    }

    @And("^User select card type \"([^\"]*)\"$")
    public void userSelectCardType(String card) {
        new PaymentCheckOut().selectCardTypeFromDropDown(card);
    }

    @And("^User enter card name \"([^\"]*)\"$")
    public void userEnterCardName(String eName) {
        new PaymentCheckOut().enterCardHolderName(eName);
    }

    @And("^User enter card number digits \"([^\"]*)\"$")
    public void userEnterCardNumberDigits(String cNumber) {
        new PaymentCheckOut().enterCardNumber(cNumber);
    }

    @And("^User select card expiry month \"([^\"]*)\"$")
    public void userSelectCardExpiryMonth(String eMonth) {
        new PaymentCheckOut().selectExpiryMonthFromDropDown(eMonth);
    }

    @And("^User select card expiry year \"([^\"]*)\"$")
    public void userSelectCardExpiryYear(String eYear) {
        new PaymentCheckOut().selectExpiryYearFromDropDown(eYear);
    }

    @And("^User enter visa code \"([^\"]*)\"$")
    public void userEnterVisaCode(String eCode) {
        new PaymentCheckOut().enterCardCode(eCode);
    }

    @And("^User click on continue on payment$")
    public void userClickOnContinueOnPayment() {
        new PaymentCheckOut().clickOnContinueButton();
    }

    @Then("^Verify payment method \"([^\"]*)\"$")
    public void verifyPaymentMethod(String creditCard) {
        Assert.assertEquals("Text not found", creditCard, new ConfirmOrderPage().VerifyCreditCardPaymentMethod());
    }

    @And("^Verify second day air \"([^\"]*)\"$")
    public void verifySecondDayAir(String secondDay) {
        Assert.assertEquals("Text not found", secondDay, new ConfirmOrderPage().verifySecondDayAir());
    }

    @And("^Verify Nokia Total price \"([^\"]*)\"$")
    public void verifyNokiaTotalPrice(String price) {
        Assert.assertEquals("Price not matched", price, new ConfirmOrderPage().verifyNokiaTotalPrice());
    }

    @And("^User click on continue after verify$")
    public void userClickOnContinueAfterVerify() {
        new ConfirmOrderPage().clickOnConFirm();
    }

    @Then("^Verify Thank you \"([^\"]*)\"$")
    public void verifyThankYou(String thanks) {
        Assert.assertEquals("Text not found", thanks, new CompletedCheckoutPage().verifyThankYouText());
    }

    @And("^Verify order success \"([^\"]*)\"$")
    public void verifyOrderSuccess(String order) {
        Assert.assertEquals("Text not found", order, new CompletedCheckoutPage().verifySucessOrderText());
    }

    @And("^User click on continue on final$")
    public void userClickOnContinueOnFinal() {
        new CompletedCheckoutPage().clickOnContinue();
    }

    @Then("^Verify welcome \"([^\"]*)\"$")
    public void verifyWelcome(String welcome) {
        Assert.assertEquals("Text not found", welcome, new HomePage().verifyWelComeText());
    }

    @And("^User click on log out$")
    public void userClickOnLogOut() {
        new HomePage().clickOnLogoutButton();
    }

    @Then("^Verify url$")
    public void verifyUrl() {

    }
}
