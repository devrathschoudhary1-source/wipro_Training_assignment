
package class_assi_day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class SearchUsersTest {

    @Test
    public void searchUsers() {

        given()
            .queryParam("q", "John")

        .when()
            .get("https://dummyjson.com/users/search")

        .then()
            .statusCode(200)
            .log().all();
    }
}