Feature: US21 Students ders secebilmeli,notlarini ve danismaninin olusturdugu toplantilari gorebilmeli
  Background: Student hesabi ile siteye giris yapilir ve menuye tiklanir
    Given kullanici "schoolsUrl" sayfasina properties ile gider_Ep
    Then kullanici login butonuna tiklar_Ep
    And kullanici user name ve password ile siteye ogrenci olarak giris yapar_Ep
    Then kullanici Login oldugunu dogrular_Ep
    And kullanici menu butonuna tiklar_Ep
