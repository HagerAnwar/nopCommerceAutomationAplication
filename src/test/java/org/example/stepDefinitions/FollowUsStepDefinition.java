package org.example.stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.example.stepDefinitions.Hooks.driver;

import org.example.pages.P07_FollowUs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class FollowUsStepDefinition {
P07_FollowUs followUs=new P07_FollowUs();
WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @When("user click on Facebook icon")
    public void user_click_on_facebook_icon() throws InterruptedException
    {
        followUs.facebook().click();
        Thread.sleep(3000);
    }

    @Then("user should be redirected Facebook")
    public void user_should_redirect_to_facebook()
    {
        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://web.facebook.com/nopCommerce?_rdc=1&_rdr"));
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user click on Twitter icon")
    public void user_click_on_twitter_icon()
    {
        followUs.twitter().click();
    }


    @Then("user should be redirected Twitter")
    public void user_should_redirect_to_twitter()
    {
        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://twitter.com/nopCommerce"));
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user click on News icon")
    public void user_click_on_news_icon()
    {
        followUs.news().click();
    }


    @Then("user should be redirected News")
    public void user_should_redirect_to_news()
    {

        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(1));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(0));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/news/rss/1"));
    }

    @When("user click on YouTube icon")
    public void user_click_on_youtube_icon()
    {
        followUs.youtube().click();

    }

    @Then("user should be redirected YouTube")
    public void user_should_redirect_to_youtube()
    {
        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.youtube.com/user/nopCommerce"));
        Hooks.driver.switchTo().window(tabs.get(0));

    }
}
