package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productText;



   /* By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginLink = By.id("login-button");
    By productText = By.xpath("//span[@class='title']");*/

    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
        log.info("EnterUsername : " + username.toString());


    }

    public void enterPassword(String password)
    {
        sendTextToElement(passwordField,password);
        log.info("Enter Password : " + password.toString());


    }

    public void clickOnLoginButton(){

        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());

    }

    public String getProductText(){
        log.info("Get Product Text : " + productText.toString());
        return  getTextFromElement(productText);

    }
}
