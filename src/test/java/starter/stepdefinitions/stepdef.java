package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;


public class stepdef {



    @Steps
    Get get;

    @Given("I set an endpoint for GET detail user")
    public void iSetAnEndpointForGETDetailUser() {
        get.setAnEndpointGet();
    }

    @When("I request GET detail user")
    public void iRequestGETDetailUser() {
        get.requestGetDetail();
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs(int arg0) {
        get.validateStatusCode(200);
    }

    @And("I validate the data detail")
    public void iValidateTheDataDetail() {
        get.validateDataDetail();
    }

}
