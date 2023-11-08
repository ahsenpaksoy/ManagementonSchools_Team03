package stepDefinitions.DataBaseStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US06_StepDefinition.object;

public class ViceDeanManagementDB {
    Connection connection;
    ResultSet resultSet;
    Statement statement;
    @Given("Database baglantisi kurulurKI")
    public void databaseBaglantisiKurulurKI() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                "select_user", "43w5ijfso");
    }

    @When("Kayitli Vice Dean almak icni Query gonderilirKI")
    public void kayitliViceDeanAlmakIcniQueryGonderilirKI() throws SQLException {
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from vice_dean where username='AhmetBaku'");
    }

    @Then("Kayitli Vice Dean bilgisi dogrulanirKI")
    public void kayitliViceDeanBilgisiDogrulanirKI() throws SQLException {
        resultSet.next();
        assertEquals(object.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(object.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(0, resultSet.getInt("gender"));
        assertEquals(object.getName(), resultSet.getString("name"));
        assertEquals(object.getSsn(), resultSet.getString("ssn"));
        assertEquals(object.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(object.getSurname(), resultSet.getString("surname"));
        assertEquals(object.getUsername(), resultSet.getString("username"));

    }

    @And("Baglanti kesilir")
    public void baglantiKesilir() throws SQLException {
        statement.close();
        connection.close();
    }
}
