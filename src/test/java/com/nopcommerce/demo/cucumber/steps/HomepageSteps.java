package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class HomepageSteps {
    @When("^User select menu \"([^\"]*)\"$")
    public void userSelectMenu(String menu) {
        new HomePage().selectMenu(menu);
    }
}
