package class_assi_day28;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
public class SortUserTest {

    ExtentReports extent = ExtentManager.getReportObject();

    @Test
    public void sortUsers() {

        ExtentTest test = extent.createTest("Sort Users API Test");

        given()
            .queryParam("sortBy", "firstName")
            .queryParam("order", "asc")

        .when()
            .get("https://dummyjson.com/users")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("Users sorted successfully");

        extent.flush();
    }
}
