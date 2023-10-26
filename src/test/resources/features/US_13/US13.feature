Feature: US13
  Background: Managementon Schools sayfasinda Vice Dean olarak login olup Teacher Management sayfasina gidilir
    Given kullanici Managementon Schools sayfasina giderSA
    Then  kullanici anasayfadaki login butonuna tiklarSA
    And   kullanici user name ve password ile login olurSA
    And   kullanici Login oldugunu dogrularSA
    But   Menu butonuta tiklarSA
    And   Teacher Management sayfasina giderSA

  Scenario:TC01 Vice Dean öğretmen oluşturabilmelidir.
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Name ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    Teacher olustugu dogrulanirSA
    And    3 saniye bekle



