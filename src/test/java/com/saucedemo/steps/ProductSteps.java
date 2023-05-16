package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ProductSteps {
    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @Then("^Verify products per page \"([^\"]*)\"$")
    public void verifyProductsPerPage(String expected)  {
        Assert.assertEquals(new ProductPage().getProductsPerPage(),expected);
    }

    @When("^I enter Username\"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new LoginPage().enterUsername(username);
    }

    @And("^I enter Password\"([^\"]*)\"$")
    public void iEnterPassword(String password){
        new LoginPage().enterPassword(password);
    }

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
}
