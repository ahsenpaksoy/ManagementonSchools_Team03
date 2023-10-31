Feature: US07

  Background: Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
   Given Kullanıcı Managementonschools adresine giderKI
    Given Kullanici Login butonuna basarKI
    * Kullanici username ve password girerKI
    * Kullanici Login oldugunu dogrularKI
    * Sayfa basliginin "Vice Dean Management" oldugu dogrulanirKI
    And Menu butonuna tiklanilir.
    Then "Contact Get All" a tiklanilir.
    Then Basligin "Contact Message" icerdgi kontrol edilir.


  Scenario: TC01 Dean silme butonunu gorebilmeli.
    And Silme butonu gozukmuyor.
    * Sayfa kapanirKI

  Scenario: TC02 Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir
    Given Olusturulan  "Name"  bilgilerinin görüntülendiğini doğrula.
    And Olusturulan "Email" bilgilerinin görüntülendiğini doğrula.
    Then Olusturulan "Date" bilgilerinin görüntülendiğini doğrula.
    And Olusturulan "Subject" bilgilerinin görüntülendiğini doğrula.
    And Olusturulan "Massage" bilgilerinin görüntülendiğini doğrula.
    Then Contact Message listesinin 2 sayfasina git
    Then Contact Message listesinin göründüğünü doğrula
    Then Contact Message listesinin 3  sayfasina git
    And Contact Message listesinin göründüğünü doğrula
    And Contact Message listesinin son sayfasina git.
    And Contact Message listesinin göründüğünü doğrula
    *  Sayfa kapanirKI

    Scenario: TC03 Dean mesajları silebilmelidir.
      And Mesajlari silme butonu mevcut deyil.

