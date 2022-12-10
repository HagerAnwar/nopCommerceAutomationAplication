package org.example.stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.example.pages.P08_Wishlist;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.stepDefinitions.Hooks.driver;

public class WishlistStepDefinition {

    P08_Wishlist wishList =new P08_Wishlist();

    @When("user click on HTC One M8 Android L 5.0 Lollipop product")
    public void user_click_on_HTC_product()
    {
        wishList.productHTC().click();
    }

    @Then ("user click add to wishlist button")
    public void user_click_on_add_to_wishlist_button() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wishList.wishlistAddButton().click();
        Assert.assertTrue(wishList.productAddedToWishlistMessage().getText().contains("The product has been added to your"));
    }

    @And("user click on wishlist products label")
    public void user_click_on_wishlist_products_label()
    {
        driver.navigate().refresh();
        wishList.wishlistProductsLabel().click();
    }


    @Then("user could view wishlist product and quantity of it")
    public void user_could_view_wishlist_product_and_quantity(){
    wishList.quantityOfProduct().getCssValue("value");
    //System.out.println(wishList.quantityOfProduct().getCssValue("value"));
    Assert.assertNotEquals(wishList.quantityOfProduct().getCssValue("value"),0);
    }
}
