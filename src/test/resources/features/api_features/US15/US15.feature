Feature: Student Controller
  Scenario: Vice Dean Student oluşturabilmelidir
    Given  Stdudent olusturmak icin URL duzenlenir_DR
    And    Stdudent olusturmak icin payload duzenlenir_DR
    When   Stdudent olusturmak icin POST Request gonderili_DR
    Then   Status kodun 200 oldugu dogrulanir_DR
    And    Stdudent olusturma icin gelen Response body dogrulanir_DR
















