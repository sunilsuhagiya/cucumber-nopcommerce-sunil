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

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutText;
    @CacheLookup
    @FindBy(xpath = "//div/ul[@class='top-menu notmobile']/li[2]/a[@href='/electronics']")
    WebElement hoverOnElectronic;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement clickOnCellPhone;

    public void selectMenu(String menu) {
        log.info("selectMenu");
        String mainmenu = menu.toLowerCase();
        String expression = "//a[@href ='/" + mainmenu + "']";
        driver.findElement(By.xpath(expression)).click();
        String currentUrl = driver.getCurrentUrl();
    }

    public void clickOnDeskTop() {
        log.info("Click on desktop" + desktop.toString());
        clickOnElement(desktop);
    }

    public void mouseHoverOnElectronics() {
        log.info("Mouse Hover On Electronics" + hoverOnElectronic.toString());
        mouseHoverToElement(hoverOnElectronic);
    }


    public void mouseHoverOnCellPhonesAndClick() {
        log.info("Click On Cell Phone" + clickOnCellPhone.toString());
        mouseHoverToElementAndClick(clickOnCellPhone);
    }

    public String verifyWelComeText() {
        log.info("Get welcome Text Message" + welcomeText.getText());
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogoutButton() {
        log.info("Click on logout" + logoutText.toString());
        clickOnElement(logoutText);
    }

}
