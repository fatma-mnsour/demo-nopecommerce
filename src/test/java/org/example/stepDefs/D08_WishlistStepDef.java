package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class D08_WishlistStepDef {
    P03_HomePage homePage = new P03_HomePage();


    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    SoftAssert softAssert = new SoftAssert();


    @When("User click on add to wishlist button of HTC phone product")
    public void clickOnWishListBtn() {
        homePage.HTCWishListBtn().click();
    }

    @And("User click on Wishlist tab")
    public void clickOnWishListTab() throws InterruptedException {
        Thread.sleep(500);
        wait.until(ExpectedConditions.invisibilityOf(homePage.successMessage()));
        homePage.wishListTab().click();
    }

    @Then("Green success message should be shown to the user")
    public void validateSuccessMessage() throws InterruptedException {
        Thread.sleep(500);
        softAssert.assertTrue(homePage.successMessage().isDisplayed());
        softAssert.assertEquals(homePage.successMessage().
                getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        softAssert.assertAll();
    }


    @Then("User should be navigated to wishlist page")
    public void validateProductQuantity() {
        int productQuantity = Integer.parseInt(homePage.productQty().getAttribute("value"));
        softAssert.assertTrue(productQuantity > 0);
        softAssert.assertAll();
    }
}
