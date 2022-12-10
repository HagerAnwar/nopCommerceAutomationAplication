package org.example.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_CurrecnyHomePage;
import org.testng.asserts.SoftAssert;

public class CurrenciesStepDefintion {

P03_CurrecnyHomePage currencyHomePage=new P03_CurrecnyHomePage();
    SoftAssert appearedProductsPricesSoftAssert =new SoftAssert();
    @Given("user can change current currency to EURO")
    public void user_can_Change_Current_Currency_To_EURO()
    {
        currencyHomePage.switchCurrencies().selectByVisibleText("Euro");
    }



    @Then("user should found all products prices in EURO")
    public void user_Should_Found_All_Products_Prices_In_EURO()
    {
        int products=currencyHomePage.priceOfProducts().size();
        for(int i=0;i<products;i++)
        {
            appearedProductsPricesSoftAssert.assertEquals(currencyHomePage.priceOfProducts().get(i).getText().substring(0,1),"€");
            appearedProductsPricesSoftAssert.assertAll();
        }
    }



    @Given("user can change current currency to US Dollar")
    public void user_Can_Change_Current_Currency_To_US_Dollar()
    {
        currencyHomePage.switchCurrencies().selectByVisibleText("US Dollar");
    }



    @Then("user should found all products prices in US Dollar")
    public void user_Should_Found_All_Products_Prices_In_USDollar()
    {
        int products=currencyHomePage.priceOfProducts().size();
        for(int i=0;i<products;i++)
        {
            appearedProductsPricesSoftAssert.assertEquals(currencyHomePage.priceOfProducts().get(i).getText().substring(0,1),"$");
            appearedProductsPricesSoftAssert.assertAll();
        }
    }



}
