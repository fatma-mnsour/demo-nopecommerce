package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class P02_Login {

    public WebElement loginLink(){
        By loginLink = By.className("ico-login");
        return driver.findElement(loginLink);
    }

    public WebElement logInButton() {
        By logInBtn = By.cssSelector("button[class=\"button-1 login-button\"]");
        return driver.findElement(logInBtn);
    }

    public WebElement myAccountTab() {
        By myAccountTab = By.cssSelector("a[class=\"ico-account\"]");
        return driver.findElement(myAccountTab);
    }
    public String getCurrentURL(){
        String strUrl = driver.getCurrentUrl();
        return strUrl;
    }

    public WebElement unSuccessfullLoginMsg() {
        By unSuccessfullLoginMsg = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
        return driver.findElement(unSuccessfullLoginMsg);
    }

}
