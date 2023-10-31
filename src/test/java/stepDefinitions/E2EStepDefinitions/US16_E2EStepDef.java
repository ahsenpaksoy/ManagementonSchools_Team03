package stepDefinitions.E2EStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.StudentPage;
import utilities.ConfigReader;

import java.sql.*;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.ApiStepDefinitions.US16_StepDef.expectedData;

public class US16_E2EStepDef {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    static String email;

    StudentPage studentPage = new StudentPage();

    @And("Olusturulan mesaj bilgilerini görüntüler.")
    public void olusturulanMesajBilgileriniGoruntuler() {
        Object studentInfoPage = null;
        List<WebElement> mesajBilgileri;
        mesajBilgileri = studentInfoPage.studentMesajBilgileri;
        assertEquals(ConfigReader.getProperty("student_name"),mesajBilgileri.get(0).getText());
        assertEquals(ConfigReader.getProperty("student_email"),mesajBilgileri.get(1).getText());
        assertEquals(ConfigReader.getProperty("student_date"),mesajBilgileri.get(2).getText());
        assertEquals(ConfigReader.getProperty("student_subject"),mesajBilgileri.get(3).getText());
        assertEquals(ConfigReader.getProperty("student_message"),mesajBilgileri.get(4).getText());

    }

    @Given("Kayitli mesaj email ile sorgulanir")
    public void kayitliMesajEmailIleSorgulanir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

        email="merhaba@gmail.com";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(" select * from contact_message where email='merhaba@gmail.com' order by id desc");
        resultSet.next();

    }

    @Then("Mesaj bilgileri dogrulanir")
    public void mesajBilgileriDogrulanir() throws SQLException {

        assertEquals(expectedData.getEmail(),resultSet.getString("email"));
        assertEquals(expectedData.getMessage(),resultSet.getString("message"));
        assertEquals(expectedData.getName(),resultSet.getString("name"));
        assertEquals(expectedData.getSubject(),resultSet.getString("subject"));


    }
}
