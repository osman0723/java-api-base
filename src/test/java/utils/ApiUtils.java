package utils;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ApiUtils {
    public static String baseURL = PropertiesFile.getProperty("baseURL");
    public static RequestSpecification request;
    public static Response response;


    public static void setRequest(String reqBody){

        request = given().body(reqBody);
    }

    public static void getMethod(String endpoint){
        response = request.get(endpoint);
    }
    public static void postMethod(String endpoint){
        response = request.post(endpoint);
    }
    public static void putMethod(String endpoint){
        response = request.put(endpoint);
    }
    public static void deleteMethod(String endpoint){
        response = request.delete(endpoint);
    }
    public static void assertStatus(int expectedStatus){
       Assert.assertEquals(expectedStatus, response.getStatusCode());
    }
    public static void setParam(String key, int value){
        request = given().param(key, value);
    }
    public static void setParam(String key, String value){
        request = given().param(key, value);
    }
}
