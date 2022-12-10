package org.example.pages;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class P01_Registeration {
    public WebElement registrationLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }


    public WebElement firstName()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }


    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }


    public WebElement Email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }



    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }


    public WebElement confirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }


    public WebElement genderFemale()
    {
        return Hooks.driver.findElement(By.id("gender-female"));
    }


    public Select DateOfBirthDay()
    {
       WebElement DateOfBirthDay= Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        Select Day = new Select(DateOfBirthDay);
        return Day;
    }


    public Select DateOfBirthMonth()
    {
        WebElement DateOfBirthMonth= Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
        Select Month=new Select(DateOfBirthMonth);
        return Month;
    }

    public Select DateOfBirthYear()
    {
        WebElement DateOfBirthYear= Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
        Select Year=new Select(DateOfBirthYear);
        return Year;
    }

    public WebElement registerButton()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement success_register()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]"));
    }
}


