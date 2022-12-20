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

public class CellPhonesPage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[text() = 'Cell phones']")
    WebElement cellPhonesText;

    @CacheLookup
    @FindBy(xpath = "//div/a[text()='List']")
    WebElement listViewLink;

    @CacheLookup
    @FindBy(xpath = "//h2/a[text()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;


    public String verifyCellPhonesText() {
        log.info("Get Text cell Phones" + cellPhonesText.toString());
        return getTextFromElement(cellPhonesText);
    }

    public void clickOnListView() {
        log.info("Click On List View" + listViewLink.toString());
        clickOnElement(listViewLink);
    }

    public void clickOnNokiaLumia() {
        log.info("Click On Nokia Lumia" + nokiaLumiaText.toString());
        clickOnElement(nokiaLumiaText);
    }
}
