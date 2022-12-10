package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Search;
import org.testng.Assert;

public class SearchStepDefintion {
    P04_Search search = new P04_Search();


    @When("user click on search box")
    public void user_click_on_search_box()
    {
        search.searchBox().click();
    }


    @And("user type name of product")
    public void user_type_name_of_product()
    {
        search.searchBox().sendKeys("shirt");
        search.searchButton().click();
    }


    @Then("user should find relative results")
    public void user_should_find_relative_results()
    {
        int countOfProduct = search.resultsOfSearch().size();
        System.out.println(countOfProduct);
        Assert.assertTrue(countOfProduct > 0);
        for (int i = 0; i < countOfProduct; i++)
        {
            System.out.println(search.resultsOfSearch().get(i).getText());
            Assert.assertTrue(search.resultsOfSearch().get(i).getText().toLowerCase().contains("shirt"));
        }
    }

    @And("user type what he or she want to search using sku of product")
    public void user_type_what_want_to_search_using_sku_of_product() throws InterruptedException
    {
        search.searchBox().sendKeys("CS_TSHIRT");
        search.searchButton().click();
        Thread.sleep(3000);
    }

    @Then("user could find the correct product")
    public void user_could_find_correct_product()
    {

        Assert.assertTrue(search.productName().getText().toLowerCase().contains("shirt"));
        search.productName().click();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/custom-t-shirt");
        Assert.assertTrue(search.productSKU().getText().toLowerCase().contains("tshirt"));
    }
}