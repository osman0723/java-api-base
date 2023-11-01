package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import utils.ApiUtils;


import static io.restassured.RestAssured.given;

public class MyStepdefs extends ApiUtils {

    @Given("baseURL")
    public void url() {
        RestAssured.baseURI = baseURL;
    }
    @When("param {string}")
    public void param(String string) {
        request = given().
                param("id",3);
    }
    @And("method get {string}")
    public void method_get(String endpoint) {
        getMethod(endpoint);
    }
    @Then("status should be {int}")
    public void status_should_be(int status) {
        assertStatus(status);
    }
    @And("request new resource")
    public void requestNewResource() {
        String body = "{ \"title\":\"story\",\"body\":\"osman osman\", \"userId\":\"11\"}";
        setRequest(body);
    }
    @When("method post {string}")
    public void methodPost(String endpoint) {
        postMethod(endpoint);
    }


}
