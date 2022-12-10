package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_HoverCategories;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HoveringCategoriesStepDefinition {
    P05_HoverCategories hoveringCategories = new P05_HoverCategories();
    Actions action = new Actions(Hooks.driver);


    @When("user hover on Apparel category")
    public void user_hover_on_Apparel_category() throws InterruptedException
    {
        hoveringCategories.apparelCategory();
        action.moveToElement(hoveringCategories.apparelCategory());
        Thread.sleep(3000);

    }

    @And("user select clothing sub category")
    public void select_clothing_sub_category()
    {
        hoveringCategories.clothesSubCategory();
        action.moveToElement(hoveringCategories.clothesSubCategory());
        action.click().build().perform();
    }

    @Then("user navigate to clothing page successfully")
    public void user_navigate_to_clothing_page_successfully()
    {
        String urlOfClothing = "https://demo.nopcommerce.com/clothing";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),urlOfClothing.toLowerCase().trim());
    }
}
