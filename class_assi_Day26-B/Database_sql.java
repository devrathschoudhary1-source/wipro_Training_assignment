
package class_assi_Day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database_sql {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/seleniumdb";
        String user = "root";
        String pass = "Dev@3002";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, pass);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM login_data");

        while(rs.next()) {

            String username = rs.getString("username");
            String password = rs.getString("password");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.saucedemo.com");

            driver.findElement(By.id("user-name"))
                  .sendKeys(username);

            driver.findElement(By.id("password"))
                  .sendKeys(password);

            driver.findElement(By.id("login-button"))
                  .click();

            Thread.sleep(3000);

            driver.quit();
        }

        rs.close();
        stmt.close();
        con.close();
    }
}
