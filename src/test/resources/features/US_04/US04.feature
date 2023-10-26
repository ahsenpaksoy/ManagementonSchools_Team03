Feature: US04 Admin Dean Ekleyebilmeli
  Background: Admin olarak siteye giriş yapılır ve menü ye basılarak Dean Management seçilir
    Given Kullanıcı Managementonschools adresine gider
    Then Kullanici Login butonuna basar
    Then Username ve password kutularını doldurarak enter tuşuna basar
    Then Açılan sayfadan menu tusuna basar
    Then Dashboard kısmından Dean Management seçilir

    Scenario: Admin Dean Ekleyebilmeli
      Given Admin add Dean bolumundeki name kismina bir veri girer
      Then Admin add Dean bolumundeki surname kismina bir verir girer
      Then Admin add Dean bolumundeki birth place kismina bir verir girer
      Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler
      Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer
      Then Admin add Dean bolumundeki phone kismina bir verir girer
      Then Admin add Dean bolumundeki Ssn kismina bir verir girer
      Then Admin add Dean bolumundeki username kismina bir verir girer
      Then Admin add Dean bolumundeki password kismina bir verir girer
      Then Admin add Dean bolumundeki submit butonuna tıklar
      Then Dean eklenebildigini dogrula
      Then sayfayi kapatir






