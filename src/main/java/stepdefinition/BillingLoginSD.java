package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingLoginSD {
    @Given("^login page of billing is opened$")
    public void login_page_of_billing_is_opened() throws Throwable {


        System.out.println("login page of billing is opened");

    }

    @When("^I enter correct username and correct password on billing page$")
    public void i_enter_correct_username_and_correct_password_on_billing_page() throws Throwable {
        System.out.println("I enter correct username and correct password on billing page");
    }

    @Then("^I should be redirected to Dashboard$")
    public void i_should_be_redirected_to_dashboard() throws Throwable {
        System.out.println("I should be redirected to Dashboard");
    }

    @And("^I click the login button on billing page$")
    public void i_click_the_login_button_on_billing_page() throws Throwable {
        System.out.println("I click the login button on billing page");
    }

    @Then("^I should get error message$")
    public void i_should_get_error_message() throws Throwable {
        System.out.println("I should get error message");
    }

    @Then("^I should get another error message$")
    public void i_should_get_another_error_message() throws Throwable {
        System.out.println("I should get another error message");
    }


    @When("^I enter \"([^\"]*)\" as username and \"([^\"]*)\" as password on billing page$")
    public void i_enter_something_as_username_and_something_as_password_on_billing_page(String user, String pass)
             {
                 System.out.println("Username:"+user);
                 System.out.println("password:"+pass);

    }


}
