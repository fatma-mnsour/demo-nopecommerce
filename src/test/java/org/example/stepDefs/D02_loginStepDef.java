package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {
    P02_Login login = new P02_Login();


    @Given("user go to login page")
    public void goToLoginPage(){
        login.loginLink().click();
    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String type, String username, String password) {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
    }



    @And("user press on login button")
    public void clickOnLoginBtn() {
        login.logInButton().click();
    }


    @Then("user login to the system successfully")
    public void userLoginSuccessfully() {
        SoftAssert softAssert= new SoftAssert();
        //validate My Account Tab
        String myAccountTabactualResult = login.myAccountTab().getText();
        String myAccountTabexpectedResult = "My account";
        softAssert.assertEquals(myAccountTabactualResult,myAccountTabexpectedResult);
        //validate current URL
        String currentURLActualResult = login.getCurrentURL();
        String currentURLexpectedResult = "https://demo.nopcommerce.com/";
        softAssert.assertEquals(currentURLActualResult,currentURLexpectedResult);
        softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLogin() {
        SoftAssert softAssert= new SoftAssert();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = login.unSuccessfullLoginMsg().getText();
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String MsgColor = login.unSuccessfullLoginMsg().getCssValue("color");
        softAssert.assertEquals(actualResult,expectedResult);
        softAssert.assertEquals(MsgColor,"rgba(228, 67, 75, 1)");
        System.out.println("Color = " + MsgColor);
        softAssert.assertAll();

    }


}
