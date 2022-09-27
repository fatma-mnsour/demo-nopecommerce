package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_HomePage homePage = new P03_HomePage();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(60));
    String firstSliderExpectedPageUrl = "https://demo.nopcommerce.com/nokia-lumia-1020";
    String secondSliderExpectedPageUrl = " https://demo.nopcommerce.com/iphone-6";


    @When("User click on first slider")
    public void clickOnFirstSlider() {
        homePage.firstSlider().click();
    }

    @When("User click on second slider")
    public void clickOnSecondSlider() throws InterruptedException {
        Thread.sleep(4000);
        homePage.secondSlider().click();
    }

    @Then("User should be navigated to first slider details page")
    public void validateNavigationToFirstSliderURL() {
        wait.until(ExpectedConditions.urlToBe(firstSliderExpectedPageUrl));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), firstSliderExpectedPageUrl);
    }

    @Then("User should be navigated to second slider details page")
    public void validateNavigationToSecondSliderURL() {
        wait.until(ExpectedConditions.urlToBe(secondSliderExpectedPageUrl));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), secondSliderExpectedPageUrl);
    }
}
