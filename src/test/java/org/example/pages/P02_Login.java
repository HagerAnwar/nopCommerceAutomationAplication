package org.example.pages;
import io.cucumber.messages.types.Hook;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class P02_Login {


    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }

    public WebElement email()
    {
        return   Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password()
    {
        return   Hooks.driver.findElement(By.id("Password"));
    }

    public  WebElement myAccount()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement errorMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
