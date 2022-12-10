package org.example.pages;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class P03_CurrecnyHomePage {

    public Select switchCurrencies()
    {
        WebElement switchCurrencies= Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        Select Currencies = new Select(switchCurrencies);
        return Currencies;
    }

    public List<WebElement> priceOfProducts()
    {
        List <WebElement> priceOfProducts = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return priceOfProducts;
    }
}
