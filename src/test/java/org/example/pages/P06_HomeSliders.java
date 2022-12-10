package org.example.pages;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class P06_HomeSliders {
    public WebElement nokiaSlider()
    {
        return Hooks.driver.findElement(By.cssSelector("div[id=\"nivo-slider\"] a[style=\"display: block;\"]"));

    }


    public WebElement iphoneSlider()
    {
        return Hooks.driver.findElement(By.cssSelector("div[id=\"nivo-slider\"] a[style=\"display: none;\"]"));

    }
}
