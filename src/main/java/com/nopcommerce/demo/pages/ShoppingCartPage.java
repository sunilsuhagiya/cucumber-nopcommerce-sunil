package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal'][text()='$2,950.00']")
    WebElement price;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkboxTerms;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/child::input")
    WebElement productQuantityText;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(id = "//button[@id='updatecart']")
    WebElement quantity1;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement clickTermOfServices;

    public String verifyShoppingCartText() {
        log.info("Verify shopping cart text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearText;

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(By.xpath("//input[@value='1']"));
        quantity.clear();
    }
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;

    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }
  /*  public void updateQuantity() throws InterruptedException {
        Reporter.log("Update quantity");
       // Thread.sleep(3000);
        WebElement Quantity = driver.findElement((By) quantity1);
        Quantity.clear();
        Quantity.sendKeys("2");
        CustomListeners.test.log(Status.PASS, "Update Quantity");
    } */

    public void UpdateShoppingCart() {
        log.info("Update Shopping Cart" + updateCart.toString());
        clickOnElement(updateCart);
    }

    public String VerifytheTotalPrice() {
        log.info("Verify the TotalPrice" + price.toString());
        return getTextFromElement(price);
    }

    public void clickOnCheckBox() {
        log.info("Click On CheckBox" + checkboxTerms.toString());
        clickOnElement(checkboxTerms);
    }

    public void clickOnCheckOutButton() {
        log.info("Click On Check out" + checkout.toString());
        clickOnElement(checkout);
    }

    public String verifyProductQuantity() {
        log.info("verify Product Quantity" + productQuantityText.toString());
        WebElement wb = driver.findElement(By.xpath ("//td[@class='quantity']/child::input"));
        String actualQuantity = wb.getAttribute("value");
        return actualQuantity;
    }

    public String verifyTotalPrice() {
        log.info("Verify total Price" + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService() {
        log.info("Click Term Of Services" + totalPrice.toString());
        clickOnElement(clickTermOfServices);
    }
}
