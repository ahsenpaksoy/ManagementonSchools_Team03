@SenaAPI_US13
Feature: Teacher Management
  Scenario:Vice Dean öğretmen oluşturabilmelidir.
    Given  Teacher olusturmak icin URL duzenlenirSA
    And    Teacher olusturmak icin payload duzenlenirSA
    When   Teacher olusturmak icin POST Request gonderilirSA
    Then   Status kodun 200 oldugu dogrulanirSA
    And    Teacher olusturma icin gelen Response body dogrulanirSA