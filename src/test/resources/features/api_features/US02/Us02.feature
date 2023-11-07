Feature: Guest User Controller
  @apiSK
  Scenario: Admin Guest User List bilgilerini doğrular
    Given "Admin" yetkisi ile giris yapilir_SK
    And Kayitli Guest User icin URL duzenlenir_SK
    When Kayitli Guest User icin GET Request gonderilir ve Response alinir_SK
    Then Status kodun 200 oldugu dogrulanir_SK
    And Kayitli Guest User icin gelen Response body dogrulanir_SK