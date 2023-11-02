package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import utils.ApiUtils;
import utils.JsonReader;

public class MyStepdefs extends ApiUtils {

    @Given("baseURL")
    public void url() {
        RestAssured.baseURI = baseURL;
    }
    @When("param {string} = {int}")
    public void param(String arg0, int arg1) {
        setParam(arg0, arg1);
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
        JsonReader js = new JsonReader("src/test/resources/data/resource.json");
        setRequest(js.toJSONString());
    }
    @When("method post {string}")
    public void methodPost(String endpoint) {
        postMethod(endpoint);
    }

}
