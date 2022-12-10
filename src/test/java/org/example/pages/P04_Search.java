package org.example.pages;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public class P04_Search {
    public WebElement searchBox()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }



    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }


    public WebElement productSKU()
    {
        return Hooks.driver.findElement(By.id("sku-29"));
    }

    public WebElement productName()
    {
        return Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"] a"));
    }

    public List<WebElement> resultsOfSearch()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
    }

}
