package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_Register {

    public WebElement registerLink(){
        By registerLink = By.className("ico-register");
        return driver.findElement(registerLink);
    }

    public WebElement genderCheckBox() {
        By genderCheckBox = By.id("gender-female");
        return driver.findElement(genderCheckBox);
    }

    public WebElement FirstNameTxtField() {
        By FirstName = By.id("FirstName");
        return driver.findElement(FirstName);
    }

    public WebElement LastNameTxtField() {
        By LastName = By.id("LastName");
        return driver.findElement(LastName);
    }

    public WebElement birthDayDropDown() {
        By BirthDay = By.name("DateOfBirthDay");
        return driver.findElement(BirthDay);
    }

    public WebElement BirthMonthDropDown() {
        By BirthMonth = By.name("DateOfBirthMonth");
        return driver.findElement(BirthMonth);
    }

    public WebElement BirthYearDropDown() {
        By BirthYear = By.name("DateOfBirthYear");
        return driver.findElement(BirthYear);
    }

    public WebElement emailAddressTxtField() {
        By emailAddress = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddress);
    }

    public String validEmail() {
        return "test123@TEST.com";
    }

    public WebElement passwordTxtField() {
        By passwordTxt = By.id("Passw0rd");
        return driver.findElement(passwordTxt);
    }

    public String validPassword() {
        return "testpassword123";
    }

    public WebElement confirmPassTxtField() {
        By confirmPassword = By.id("ConfirmPassword");
        return driver.findElement(confirmPassword);
    }

    public WebElement registerButton() {
        By registerBTN = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerBTN);
    }

    public WebElement successMsg() {
        By successMSG = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(successMSG);
    }

}
