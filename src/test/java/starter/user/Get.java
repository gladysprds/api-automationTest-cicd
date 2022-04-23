package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.equalTo;
public class Get {

    private static String base_url = "https://reqres.in/api/";

    @Step("I set an endpoint for GET detail user")
    public String setAnEndpointGet(){
        return base_url + "users/3";
    }

    @Step("I request GET detail user")
    public void requestGetDetail(){
        SerenityRest.given().get(setAnEndpointGet());
    }

    @Step("I validate the status code is {int}")
    public void validateStatusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("I validate the data detail")
    public void validateDataDetail(){
        SerenityRest.then().body("'data'.'id'",equalTo(3));
    }
}
