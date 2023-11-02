Feature: US21 Students ders secebilmeli,notlarini ve danismaninin olusturdugu toplantilari gorebilmeli
  Background: Student hesabi ile siteye giris yapilir ve menuye tiklanir
    Given kullanici "schoolsUrl" sayfasina properties ile gider_Ep
    Then kullanici login butonuna tiklar_Ep
    And kullanici user name ve password ile siteye ogrenci olarak giris yapar_Ep
    Then kullanici Login oldugunu dogrular_Ep
    And kullanici menu butonuna tiklar_Ep
  @a3
  Scenario: TC01 Student dersleri gorebilmeli ve secebilmeli
    Given kullanici acilan pencereden choose lesson secer_Ep
    Then Kullanici ders secme kutucugunun tiklanabilirligini dogrular_Ep
    Then kullanici ders bilgisinin gorunurlugunu dogrular_Ep
    Then kullanici teacher bilgisinin gorunurlugunu dogrular_Ep
    And kullanici day bilgisinin gorunurlugunu dogrular_Ep
    And kullanici start time bilgisinin gorunurlugunu dogrular_Ep
    And kullanici stop time bilgisinin gorunurlugunu dogrular_Ep



