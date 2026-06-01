package class_assi_day28;




import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class FilterUsersTest {

    ExtentReports extent = ExtentManager.getReportObject();

    @Test
    public void filterUsers() {

        ExtentTest test = extent.createTest("Filter Users API Test");

        given()
            .queryParam("key", "hair.color")
            .queryParam("value", "Brown")

        .when()
            .get("https://dummyjson.com/users/filter")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("API Test Passed");
        
        extent.flush();
    }
}
