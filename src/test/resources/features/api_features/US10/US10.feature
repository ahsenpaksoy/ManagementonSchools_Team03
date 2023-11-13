Feature: US10 Ders atama kontrol

  #Vıce Dean ile olusturulan  kayit listesi doğrulanır
  Scenario: Vıce Dean teacher a ders atandıgını doğrular
    Given "Vıce Dean" ile giris yapilir YD
    And Kayitli Vıce Dean icin URL duzenlenir YD
    When Kayitli Vıce Dean icin GET Request gonderilir ve response alinir YD
    Then GetAll icin Status kodun 200 oldugu dogrulanir YD
