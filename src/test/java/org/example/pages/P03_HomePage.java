package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_HomePage {



    public WebElement currencyDropDown(){
        By currencyDropDown = By.id("customerCurrency");
        return driver.findElement(currencyDropDown);
    }

    public List<WebElement> itemsPrices(){
        By itemsPrices = By.className("prices");
        return driver.findElements(itemsPrices);
    }

    public WebElement searchField(){
        By searchField = By.id("small-searchterms");
        return driver.findElement(searchField);
    }

    public WebElement searchBtn(){
        By searchBtn = By.xpath("//*[@class=\"button-1 search-box-button\"]");
        return driver.findElement(searchBtn);
    }

    public List<WebElement> searchResults(){
        By searchResults = By.className("item-box");
        return driver.findElements(searchResults);
    }

    public WebElement getProductSku(){
        By ProductSku = By.xpath("//*[@class=\"sku\"]/span[2]");
        return driver.findElement(ProductSku);
    }

    public WebElement electronicsMainCategory(){
        By electronicsMainCategory = By.xpath("//ul[@class='top-menu notmobile']/li[2]/a");
        return driver.findElement(electronicsMainCategory);
    }

    public WebElement cellPhonesSubCategory(){
        By cellPhonesSubCategory = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a");
        return driver.findElement(cellPhonesSubCategory);
    }

    public WebElement subCategoryPageTitle(){
        By subCategoryPageTitle = By.xpath("//*[@class='page-title']");
        return driver.findElement(subCategoryPageTitle);
    }

    public WebElement firstSlider(){
        By firstSlider = By.xpath("//*[@class='nivoSlider']/a[1]");
        return driver.findElement(firstSlider);
    }

    public WebElement secondSlider(){
        By secondSlider = By.xpath("//*[@class='nivoSlider']/a[2]");
        return driver.findElement(secondSlider);
    }

    public WebElement faceBookFollowIcon(){
        By faceBookFollowIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[1]");
        return driver.findElement(faceBookFollowIcon);
    }

    public WebElement twitterFollowIcon(){
        By twitterFollowIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[2]");
        return driver.findElement(twitterFollowIcon);
    }

    public WebElement RSSFollowIcon(){
        By twitterFollowIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[3]");
        return driver.findElement(twitterFollowIcon);
    }

    public WebElement youTubeFollowIcon(){
        By twitterFollowIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[4]");
        return driver.findElement(twitterFollowIcon);
    }

    public WebElement HTCWishListBtn(){
        By HTCWishListBtn = By.xpath("(//*[@class=\"button-2 add-to-wishlist-button\"])[3]");
        return driver.findElement(HTCWishListBtn);
    }

    public WebElement successMessage(){
        By successMessage = By.xpath("//*[@class=\"bar-notification success\"]");
        return driver.findElement(successMessage);
    }

    public WebElement wishListTab(){
        By wishListTab = By.xpath("//*[@class=\"wishlist-label\"]");
        return driver.findElement(wishListTab);
    }

    public WebElement productQty(){
        By productQty = By.xpath("//*[@class=\"qty-input\"]");
        return driver.findElement(productQty);
    }


}
