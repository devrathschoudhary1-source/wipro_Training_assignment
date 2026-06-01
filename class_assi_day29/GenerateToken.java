package class_assi_day29;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GenerateToken {

    @Test
    public void generateToken() {

        // Base URI
        RestAssured.baseURI = "https://dummyjson.com";

        // Request Body
        String requestBody = "{\n" +
                "  \"username\": \"emilys\",\n" +
                "  \"password\": \"emilyspass\",\n" +
                "  \"expiresInMins\": 30\n" +
                "}";

        // Send POST Request
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)

                .when()
                .post("/user/login")

                .then()
                .statusCode(200)
                .extract()
                .response();

        // Print Full Response
        System.out.println("===== FULL RESPONSE =====");
        System.out.println(response.asPrettyString());

        // Extract Token
        String token = response.jsonPath().getString("token");

        // Print Token
        System.out.println("Generated Token : " + token);

        // Extract User Details
        int id = response.jsonPath().getInt("id");
        String username = response.jsonPath().getString("username");
        String email = response.jsonPath().getString("email");

        // Print User Details
        System.out.println("User ID : " + id);
        System.out.println("Username : " + username);
        System.out.println("Email : " + email);
    }
}