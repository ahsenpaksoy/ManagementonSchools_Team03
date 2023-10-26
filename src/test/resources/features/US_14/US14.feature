Feature: US14
  Background: Managementon Schools sayfasinda Vice Dean olarak login olup Teacher Management sayfasina gidilir
    Given kullanici Managementon Schools sayfasina giderSA
    Then  kullanici anasayfadaki login butonuna tiklarSA
    And   kullanici user name ve password ile login olurSA
    And   kullanici Login oldugunu dogrularSA
    But   Menu butonuta tiklarSA
    And   Teacher Management sayfasina giderSA

    Scenario: TC01 Vice Dean olusturdugu ogretmenin Name, Phone Number, SSN, User Name bilgileri görülebilmeli
      Given Sayfayi asagi kaydirarak Teacher List gorulur
      Then  Ogretmenin "Name" bilgisi gorulur
      And   Ogretmenin "Phone Number" bilgisi gorulur
      And   Ogretmenin "SSN" bilgisi gorulur
      And   Ogretmenin "User Name" bilgisi gorulur