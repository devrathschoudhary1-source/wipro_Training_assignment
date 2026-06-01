
package class_assi_day28;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class LimitSkipUsersTest {

    ExtentReports extent = ExtentManager.getReportObject();

    @Test
    public void getLimitedUsers() {

        ExtentTest test = extent.createTest("Limit and Skip Users Test");

        given()
            .queryParam("limit", 5)
            .queryParam("skip", 10)
            .queryParam("select", "firstName,age")

        .when()
            .get("https://dummyjson.com/users")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("Users fetched successfully");

        extent.flush();
    }
}