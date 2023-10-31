package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ManagementOnSchoolAuthentication {
    public static void main(String[] args) {
        System.out.println(generateToken());
    }

    public static String generateToken(){
        String postBody = "{ \"password\": \"Batch171+\",  \"username\": \"AdminBatch1713\"\n" +"}";

        Response response = given().contentType(ContentType.JSON).body(postBody).post("http://164.92.252.42:8080/auth/login");

       return response.jsonPath().getString("token");

    }

    public static String generateToken1(){
        String postBody1 = "{ \"password\": \"Batch171+\",  \"username\": \"AdminBatch1713\"\n" +"}";

        Response response = given().contentType(ContentType.JSON).body(postBody1).post("http://164.92.252.42:8080/auth/login");

        return response.jsonPath().getString("token");

    }

}
