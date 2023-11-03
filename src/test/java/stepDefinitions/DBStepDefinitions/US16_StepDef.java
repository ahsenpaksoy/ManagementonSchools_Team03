package stepDefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US16_StepDef {

    Connection connection ;
    Statement statement ;
    ResultSet resultSet ;

    @Given("Find messages By ID US16")
    public void find_messages_by_id_us16() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM contact_message WHERE id = 1");
        resultSet.next();



    }
    @Then("Validate data US16")
    public void validate_data_us16() throws SQLException {

        assertEquals("mustafa@gmail.com",resultSet.getString("email"));
        assertEquals("2023-04-28",resultSet.getString("date"));
        assertEquals("Automation Test Message",resultSet.getString("message"));
        assertEquals("Automation Test Message",resultSet.getString("message"));



    }

}
