package org.example.stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_HomeSliders;
import org.testng.Assert;


public class HomeSlidersStepDefinition {
    P06_HomeSliders homeSliders =new P06_HomeSliders();


    @When("user click on Nokia slider")
    public void user_click_on_Nokia_slider() throws InterruptedException
    {
        Thread.sleep(3000);
        homeSliders.nokiaSlider().click();
    }


    @Then("user should navigate to Nokia related page")
    public void user_should_navigate_to_Nokia_related_page() throws InterruptedException
    {
        Thread.sleep(3000);
        Assert.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/nokia-lumia-1020"));
        Thread.sleep(2000);
    }



    @When("user click on Iphone slider")
    public void user_click_on_Iphone_slider() throws InterruptedException
    {
        Thread.sleep(3000);
        homeSliders.iphoneSlider().click();
        Thread.sleep(3000);
    }



    @Then("user should navigate to Iphone related page")
    public void user_should_navigate_to_Iphone_related_page() throws InterruptedException
    {
        Thread.sleep(3000);
        Assert.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/iPhone6"));
        Thread.sleep(3000);
    }
}
