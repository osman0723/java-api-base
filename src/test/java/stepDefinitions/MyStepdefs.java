package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


import static io.restassured.RestAssured.given;

public class MyStepdefs {

    private static Response response;
    private static RequestSpecification request;

    @Given("url {string}")
    public void url(String string) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
    @When("param {string}")
    public void param(String string) {
        request = given().
                param("id",3);
    }
    @And("method get {string}")
    public void method_get(String string) {

        response = request.get("/posts");
    }
    @Then("status should be {int}")
    public void status_should_be(int status) {
        Assert.assertEquals(status, response.getStatusCode());
    }

    @And("request new resource")
    public void requestNewResource() {
        request = given();
        String body = "{ \"title\":\"story\",\"body\":\"osman osman\", \"userId\":\"11\"}";
        request = request.body(body);

    }
    @When("method post {string}")
    public void methodPost(String arg0) {

        response = request.post(arg0);
    }


}
