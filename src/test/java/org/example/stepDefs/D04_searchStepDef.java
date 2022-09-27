package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P03_HomePage search = new P03_HomePage();
    SoftAssert softAssert = new SoftAssert();


    @When("User search with product name {string} in search field")
    public void searchWithProductName(String name) {
        search.searchField().sendKeys(name);
    }

    @When("User search with product sku {string} in search field")
    public void searchWithProductSKU(String sku) {
        search.searchField().sendKeys(sku);
    }

    @And("User click search button")
    public void clickSearchButton() {
        search.searchBtn().click();
    }

    @Then("Search results appear with products related to the product name {string}")
    public void searchResultsRelatedToProductName(String name) {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/search?q="));
        List<WebElement> products = search.searchResults();
        for (WebElement product : products) {
            softAssert.assertTrue(product.getText().toLowerCase().contains(name));
        }

        softAssert.assertAll();
    }

    @Then("Search results appear with products related to the product sku {string}")
    public void searchResultsRelatedToProductSKU(String sku) {
        search.searchResults().get(0).click();
        Assert.assertTrue(search.getProductSku().getText().contains(sku));
    }
}
