package org.example.pages;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class P08_Wishlist {

    
    public WebElement productHTC()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }

    
    public WebElement wishlistAddButton()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-18"));
    }

    public WebElement wishlistProductsLabel()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }
    public WebElement productAddedToWishlistMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement quantityOfProduct()
    {
        return Hooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
