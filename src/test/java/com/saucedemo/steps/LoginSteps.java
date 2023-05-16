package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I enter username\"([^\"]*)\"$")
    public void iEnterUsername(String username){
        new LoginPage().enterUsername(username);
    }


    @And("^I enter password\"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }


    @Then("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expected) {
       Assert.assertEquals(new LoginPage().getProductText(),expected);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }
}
