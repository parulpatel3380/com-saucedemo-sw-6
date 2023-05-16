package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    @CacheLookup
    @FindBy(xpath ="//span[@class='title']" )
    WebElement productText;


    public String getProductText() {
        log.info("Clicking on login link : " + productText.toString());
        return getTextFromElement(productText);
    }

    public String getProductsPerPage() {
        List<WebElement> totalItems = driver.findElements(By.xpath("//div[@class='inventory_item_label']"));
        int size = totalItems.size();
        return String.valueOf(size);
    }
}
