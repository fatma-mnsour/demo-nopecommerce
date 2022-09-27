package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class D07_followUsStepDef {
    P03_HomePage homePage = new P03_HomePage();


    @When("User click on Facebook icon")
    public void clickOnFacebookFollowIcon() {
        homePage.faceBookFollowIcon().click();
    }

    @When("User click on Twitter icon")
    public void clickOnTwitterFollowIcon() {
        homePage.twitterFollowIcon().click();
    }

    @When("User click on RSS icon")
    public void clickOnRSSFollowIcon() {
        homePage.RSSFollowIcon().click();
    }

    @When("User click on Youtube icon")
    public void clickOnYoutubeFollowIcon() {
        homePage.youTubeFollowIcon().click();
    }

    @Then("New tab with this URL {string} is opened")
    public void validateOpenedURL(String url) {

        List<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        try {
            Thread.sleep(2000);
            ArrayList<String> openedTabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
            if(openedTabs.size()>1) {
                Hooks.driver.switchTo().window(tabs.get(1));
            }
            else {
                Hooks.driver.switchTo().window(tabs.get(0));
            }

        }
        catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), url);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }
}
