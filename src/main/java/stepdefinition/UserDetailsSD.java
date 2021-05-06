package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDetailsSD {

    @Given("^I am on user details page$")
    public void i_am_on_user_details_page() throws Throwable {
        System.out.println("I am on user details page");
    }

    @When("^I enter (.+) , (.+) ,(.+)$")
    public void i_enter_(String name, String email, String phone)
             {

                 System.out.println("Name:"+name);
                 System.out.println("Email:"+email);
                 System.out.println("Phone:"+phone);
    }

    @Then("^the form should be submitted$")
    public void the_form_should_be_submitted() throws Throwable {
        System.out.println("the form should be submitted");
    }

    @And("^I click on submit$")
    public void i_click_on_submit() throws Throwable {
        System.out.println("I click on submit");
    }


}
