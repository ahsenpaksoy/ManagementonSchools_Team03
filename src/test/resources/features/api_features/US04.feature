Feature: Dean Controller

  Scenario: Admin kullanicisi ile Dean hesabi olusturma Testi
    Given "Admin" yetkisi ile giris yapilir
    And Kayitli olan Dean hesap bilgisinin ID nosu alinir
    And GetManagerById icin URL duzenlenir
    When GetManagerById icin beklenen veriler duzenlenir
    Then GetManagerById icin GET Request gonderilir ve Response body alinir
    Then Status code un 200 oldugu dogrulanir
    And GetManagerById icin gelen Response body dogrulanir