package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Map;

public class ComputerSteps {
    @Given("^User is on home page$")
    public void userIsOnHomePage() {
    }

    @When("^User select menu option \"([^\"]*)\"$")
    public void userSelectMenuOption(String menu) {
        new HomePage().selectMenu(menu);
    }

    @And("^User click on Desktop$")
    public void userClickOnDesktop() {
        new HomePage().clickOnDeskTop();
    }

    @And("^User select sort by name \"([^\"]*)\"$")
    public void userSelectSortByName(String sortBy) {
        new DeskTopPage().selectSortByName(sortBy);
    }

    @Then("^Verify user can see products arranged in order$")
    public void verifyUserCanSeeProductsArrangedInOrder() {
        Map<String, ArrayList> mapArrays = new DeskTopPage().arrangeProductInDescendingOrder();
        Assert.assertEquals(mapArrays.get("originalProductsName"), mapArrays.get("afterSortByZToAProductsName"));
    }

    @And("^User click on add to cart$")
    public void userClickOnAddToCart() throws InterruptedException {
        Thread.sleep(5000);
        new DeskTopPage().clickOnAddToCart();
    }

    @Then("^Verify text build your own computer \"([^\"]*)\"$")
    public void verifyTextBuildYourOwnComputer(String expected) {
        Assert.assertEquals("Text not found", expected, new BuildYourOwnComputerPage().VerifytheTextBuildyourowncomputer());
    }

    @And("^User select processor \"([^\"]*)\"$")
    public void userSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^User select Ram \"([^\"]*)\"$")
    public void userSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^User select HDD radio button$")
    public void userSelectHDDRadioButton() {
        new BuildYourOwnComputerPage().selectHDDRadio();
    }

    @And("^User select OS Vista premium$")
    public void userSelectOSVistaPremium() {
        new BuildYourOwnComputerPage().selectOSRadiVistaPremium();
    }

    @And("^User select software$")
    public void userSelectSoftware() {
        new BuildYourOwnComputerPage().selectSoftware();
    }

    @Then("^Verify the price \"([^\"]*)\"$")
    public void verifyThePrice(String price) {
        Assert.assertEquals("Price not matched", price, new BuildYourOwnComputerPage().VerifythePrice());
    }

    @And("^User click on add to cart after price$")
    public void userClickOnAddToCartAfterPrice() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^Verify message on green bar \"([^\"]*)\"$")
    public void verifyMessageOnGreenBar(String greenBar) {
        Assert.assertEquals("Text not found", greenBar, new BuildYourOwnComputerPage().VerifytheMessageOnTopGreenbar());
    }

    @And("^User click on close the pop up$")
    public void userClickOnCloseThePopUp() {
        new BuildYourOwnComputerPage().clickOnCloseBar();
    }

    @And("^User mouse hover on shopping cart$")
    public void userMouseHoverOnShoppingCart() {
        new BuildYourOwnComputerPage().mouseHoverOnShoppingCart();
    }

    @And("^User click on shopping cart$")
    public void userClickOnShoppingCart() {
        new BuildYourOwnComputerPage().clickOnShoppingCart();
    }

    @Then("^Verify text \"([^\"]*)\"$")
    public void verifyText(String cartText) {
        Assert.assertEquals("Text not found", cartText, new ShoppingCartPage().verifyShoppingCartText());
    }

    @And("^User clears the quantity$")
    public void userClearsTheQuantity() {
        new ShoppingCartPage().clearTextInQuantityField();
    }

    @And("^User enters new quantity$")
    public void userEntersNewQuantity() {
        new ShoppingCartPage().sendTextToQuantityField();
    }

    @And("^User click on Update cart$")
    public void userClickOnUpdateCart() {
        new ShoppingCartPage().UpdateShoppingCart();
    }

    @Then("^Verify the total price \"([^\"]*)\"$")
    public void verifyTheTotalPrice(String totalPrice) {
        Assert.assertEquals("Price dont match", totalPrice, new ShoppingCartPage().verifyTotalPrice());
    }

    @And("^User click on check box$")
    public void userClickOnCheckBox() {
        new ShoppingCartPage().clickOnCheckBox();
    }

    @And("^User click on check out button$")
    public void userClickOnCheckOutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @Then("^Verify welcome text \"([^\"]*)\"$")
    public void verifyWelcomeText(String textWelcome) {
        Assert.assertEquals("Text not found", textWelcome, new CheckOutAsGuest().verifyWelComeText());
    }

    @And("^User click on guest check out$")
    public void userClickOnGuestCheckOut() {
        new CheckOutAsGuest().clickOnAsGuestButton();
    }

    @And("^User enters billing first name \"([^\"]*)\"$")
    public void userEntersBillingFirstName(String billingFName) {
        new BillingCheckOutPage().enterBillingFirstName(billingFName);
    }

    @And("^User enters billing last name \"([^\"]*)\"$")
    public void userEntersBillingLastName(String billingLName) {
        new BillingCheckOutPage().enterBillingLastName(billingLName);
    }

    @And("^User enters billing email id \"([^\"]*)\"$")
    public void userEntersBillingEmailId(String billingEmail) {
        new BillingCheckOutPage().enterBillingEmailAddress(billingEmail);
    }

    @And("^User select country \"([^\"]*)\"$")
    public void userSelectCountry(String contry) {
        new BillingCheckOutPage().selectCountryFromDropDown(contry);
    }

    @And("^User select state \"([^\"]*)\"$")
    public void userSelectState(String state) {
        new BillingCheckOutPage().selectStateFromDropDown(state);
    }

    @And("^User enter billing city \"([^\"]*)\"$")
    public void userEnterBillingCity(String city) {
        new BillingCheckOutPage().enterBillingCity(city);
    }

    @And("^User enter billing Address \"([^\"]*)\"$")
    public void userEnterBillingAddress(String add) {
        new BillingCheckOutPage().enterBillingAddress(add);
    }

    @And("^User enter billing Zip code \"([^\"]*)\"$")
    public void userEnterBillingZipCode(String zipCode) {
        new BillingCheckOutPage().enterBillingZipcode(zipCode);
    }

    @And("^User enter billing Phone number \"([^\"]*)\"$")
    public void userEnterBillingPhoneNumber(String pNumber) {
        new BillingCheckOutPage().enterBillingPhoneNumber(pNumber);
    }

    @And("^User click on billing check out$")
    public void userClickOnBillingCheckOut() {
        new BillingCheckOutPage().clickOnCheckOutButton();
    }

    @And("^User click on day air radio$")
    public void userClickOnDayAirRadio() {
        new ShippingMethodCheckoutPage().clickOnRadioButtonTextDayAir();
    }

    @And("^User click on continue after radio$")
    public void userClickOnContinueAfterRadio() {
        new ShippingMethodCheckoutPage().clickOnContinue();
    }

    @And("^User click on credit card$")
    public void userClickOnCreditCard() {
        new PaymentMethodCheckOut().clickOnCreditCard();
    }

    @And("^User click on continue on credit card$")
    public void userClickOnContinueOnCreditCard() {
        new PaymentMethodCheckOut().clickOnContinue();
    }

    @And("^User enters card holder name \"([^\"]*)\"$")
    public void userEntersCardHolderName(String cardName) {
        new PaymentCheckOut().enterCardHolderName(cardName);
    }

    @And("^User enters card number \"([^\"]*)\"$")
    public void userEntersCardNumber(String cardNumber) {
        new PaymentCheckOut().enterCardNumber(cardNumber);
    }

    @And("^User select card expiry month from drop down \"([^\"]*)\"$")
    public void userSelectCardExpiryMonthFromDropDown(String month) {
        new PaymentCheckOut().selectExpiryMonthFromDropDown(month);
    }

    @And("^User select card expiry year from drop down \"([^\"]*)\"$")
    public void userSelectCardExpiryYearFromDropDown(String year) {
        new PaymentCheckOut().selectExpiryYearFromDropDown(year);
    }

    @And("^User enter card code \"([^\"]*)\"$")
    public void userEnterCardCode(String code) {
        new PaymentCheckOut().enterCardCode(code);
    }

    @And("^User click on continue on card payment page$")
    public void userClickOnContinueOnCardPaymentPage() {
        new PaymentCheckOut().clickOnContinueButton();
    }

    @Then("^Verify credit card payment method \"([^\"]*)\"$")
    public void verifyCreditCardPaymentMethod(String textCreditCard) {
        Assert.assertEquals("Text not found", textCreditCard, new ConfirmOrderPage().VerifyCreditCardPaymentMethod());
    }

    @And("^Verify shipping method \"([^\"]*)\"$")
    public void verifyShippingMethod(String textShippingMethod) {
        Assert.assertEquals("Text not found", textShippingMethod, new ConfirmOrderPage().VerifyShippingMethod());
    }

    @And("^Verify total price \"([^\"]*)\"$")
    public void verifyTotalPrice(String price) {
        Assert.assertEquals("Price not matched", price, new ConfirmOrderPage().VerifytheTotalPrice());
    }

    @And("^User click on confirm$")
    public void userClickOnConfirm() {
        new ConfirmOrderPage().clickOnConFirm();
    }

    @Then("^Verify Thank you text \"([^\"]*)\"$")
    public void verifyThankYouText(String textThankYou) {
        Assert.assertEquals("Text not found", textThankYou, new CompletedCheckoutPage().verifyThankYouText());
    }

    @And("^Verify success order text \"([^\"]*)\"$")
    public void verifySuccessOrderText(String success) {
        Assert.assertEquals("Text not Found", success, new CompletedCheckoutPage().verifySucessOrderText());
    }

    @And("^User click on continue on final page$")
    public void userClickOnContinueOnFinalPage() {
        new CompletedCheckoutPage().clickOnContinue();
    }


    @And("^Verify Welcome final text \"([^\"]*)\"$")
    public void verifyWelcomeFinalText(String welcome) {
        Assert.assertEquals("Text not found", welcome, new HomePage().verifyWelComeText());
    }
}
