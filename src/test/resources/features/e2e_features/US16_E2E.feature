@vicedean @e2eTestleriUS16
Feature:US16 Vicedean mesajlari görebilmelidir.(E2E)

  Scenario Outline: US16 Vice Dean in Mesaji Görebilmesi(API)
    Given Mesaj eklemek icin Post request hazirligi yapilir
    And Gonderilecek mesaj bilgileri hazirlanir
    When Mesaj eklemek icin Post request gonderilir
    Then Mesaj bolumlerini dogrulama: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

    Examples:
      | name         | email         | subject         | message         | date         |
      | studentname | studentemail | studentsubject | studentmessage | studentdate |


  Scenario: TC01 Vice Dean mesajlari görme (UI)
    Given Vice Dean, "school_url" sayfasina gider
    When Login butonuna tiklar
    Then Menü butonuna tiklar
    And Contact Get All secenegini tiklar
    And Olusturulan mesaj bilgilerini görüntüler.


  Scenario: Olusturulan MesajBilgileri DB ile test edilebilir(DB)
    Given Kayitli mesaj email ile sorgulanir
    Then Mesaj bilgileri dogrulanir DB