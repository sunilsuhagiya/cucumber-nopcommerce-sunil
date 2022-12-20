package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NokiaLumiaPage extends Utility {

    private static final Logger log = LogManager.getLogger(NokiaLumiaPage.class.getName());

    public NokiaLumiaPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumiaText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaPrice;
    @CacheLookup
    @FindBy(css = "#add-to-cart-button-20")
    WebElement nokiaAddToCartLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedText;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButtonLink;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverShoppingCart;


    public String verifyNokiaLumiaText() {
        log.info("Verify Nokia Lumia Text" + nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyNokiaPrice() {
        log.info("Verify Nokia Price" + nokiaPrice.toString());
        return getTextFromElement(nokiaPrice);
    }

    public void changeNokiaQuantity() {
        log.info("Change Quantity");
        driver.findElement(By.cssSelector("#product_enteredQuantity_20")).clear();
        sendTextToElement(By.cssSelector("#product_enteredQuantity_20"), "2");
    }

    public void nokiaAddToCartButton() {
        log.info("Click on Cart" + nokiaAddToCartLink.toString());
        clickOnElement(nokiaAddToCartLink);
    }

    public String productAddedToTheCartMessage() {
        log.info("Product Added To The Cart Message" + productAddedText.toString());
        return getTextFromElement(productAddedText);
    }

    public void clickOnCrossButton() {
        log.info("Click on Cross Button" + crossButtonLink.toString());
        clickOnElement(crossButtonLink);
    }

    public void clickOnShoppingCartLink() {
        log.info("Click on Shopping cart link" + shoppingCartLink.toString());
        mouseHoverToElement(mouseHoverShoppingCart);
        clickOnElement(shoppingCartLink);
    }
}
