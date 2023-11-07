@API
Feature: Vice Dean Controller

  Scenario: Dean kullanicisi ile Vice Dean olusturma testi
    Given "Dean" yetkisi ile giris yapildiKI
    And Vice Dean hesabi olusturmak icin URL duzenlenirKI
    And  Vice Dean hesabi olusturmak icin payload duzenlenirKI
    When Vice Dean hesabi olusturmak icin POST Request gonderilir ve Reponse alinirKI
    Then Status code un 200 oldugu dogrulanirKI
    And Vice Dean Save icin gelen Response body dogrulanirKI
    And Sayfayi kapatirKI
@Api
    Scenario: Olusturlan Vice Dean hesap bilgisini alma testi
      Given Kayitli Vice Dean hesab bilgisinin ID nosu alinirKI
      And Vice Dean GetManagerById icin URL duzenlenirKI
      And Vice Dean GetManagerById icin beklenen veriler duzenlenirKI
      When Vice Dean GetManagerById icin GET Request gonderilir ve Response alinirKI
      Then Status code un 200 oldugu dogrulanirKI
      And Vice Dean GetManagerById icin gelen Response body dogrulanirKI


