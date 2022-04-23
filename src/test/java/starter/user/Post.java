package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    private static String base_url = "https://reqres.in/api/";

    @Step("I set an endpoint for GET detail user")
    public String setAnEndpointPost(){
        return base_url + "users";
    }

    @Step("I request POST detail user")
    public void requestPostCreateUser() {
        JSONObject requestUser = new JSONObject();
        
        requestUser.put("name", "morpheus");
        requestUser.put("job", "leader");

        SerenityRest.given().header("Content-Type", "application/json").body(requestUser.toJSONString());
        SerenityRest.when().post(setAnEndpointPost());
    }

    @Step("I validate the status code is {int}")
    public void validateStatusCodeCreate(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the data detail after create user")
    public void validateDataAfterCreate(){
            SerenityRest.then().body("name", equalTo("morpheus"));
    }






}
