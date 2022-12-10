package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class LoginStepDefinition {

P02_Login login=new P02_Login();
SoftAssert softAssert=new SoftAssert();


    @Given("user click on login icon")
    public void go_to_login_page() throws InterruptedException {
        login.loginLink().click();
    }


    @When("^user login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void valid_username_password(String userName, String password)
    {
        login.email().sendKeys(userName);
        login.password().sendKeys(password);
    }


    @And("user click on login button")
    public void login_button()
    {
        login.password().sendKeys(Keys.ENTER);
    }


    @Then("user login to the system successfully and see my account tab")
    public void success_login()
    {

        softAssert.assertTrue(login.myAccount().isDisplayed());

    }

    @Then("user should see error message that Login was unsuccessful")
            public void user_should_see_error_message()

    {
        softAssert.assertTrue(login.errorMessage().getText().toLowerCase().contains("Login was unsuccessful"));

    }
}



