package org.example.stepDefinitions;
import org.example.pages.P01_Registeration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegisterStepDefintion {


        P01_Registeration registeration =new P01_Registeration();
        SoftAssert softAssert=new SoftAssert();

    @Given("user click on registration page")
        public void register_page()
        {
            registeration.registrationLink().click();
        }
    @When("user choose gender")
    public void select_female_gender()
    {
        registeration.genderFemale().click();
    }

    @And("^user enter valid \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
        public void Enter_firstName_lastName_email_password(String firstName, String lastName, String Email,
                                                    String password,String confirmPassword)
        {
            registeration.firstName().sendKeys(firstName);
            registeration.lastName().sendKeys(lastName);
            registeration.Email().sendKeys(Email);
            registeration.password().sendKeys(password);
            registeration.confirmPassword().sendKeys(confirmPassword);
        }


    @And ("^user enter his or her date of birth \"(.*?)\"")
    public void user_enter_his_her_date_of_birth(String date)
    {
        String[] dateFields = date.split("/");
        registeration.DateOfBirthDay().selectByValue(dateFields[0]);
        registeration.DateOfBirthMonth().selectByValue(dateFields[1]);
        registeration.DateOfBirthYear().selectByValue(dateFields[2]);
    }
    @And("user click on register button")
    public void click_on_register_button()
    {
        registeration.registerButton().click();
    }

    @Then("user should see success message")
    public void success_register()
    {
        softAssert.assertTrue(registeration.success_register().getText().toLowerCase().contains("Your registration completed"));
    }
    }

