Feature: US12 Vice Dean ogretmene ders atayabilmeli
  Background: Vice Dean hesabi ile siteye giris yapilir ve menuden Lesson Management secilir
    Given kullanici "https://managementonschools.com/" sayfasina gider
    Then kullanici login butonuna tiklar
    Then kullanici username ve password datalarini girer ve enter'a tiklar
    Then kullanici menu butonuna tiklar
    Then acilan pencereden lesson management'i secer




  Scenario: TC01 Vice Dean ogretmene ders atayabilmeli
    Given Lesson Program secenegine tiklar
    Then Select Lessons menusune tiklar
    Then Acilan drop down menuden bir ders secer
    Then Choose Education Term menusune tiklar
    Then Acilan menuden bir donem secer
    Then Choose Day menusune tiklar
    Then Acilan menuden gun secer
    Then Start Time menusune tiklar ve gecerli bir saat girer
    Then Stop Time menusune tiklar ve gecerli bir saat girer
    Then Submit butonuna tiklar
    Then Choose Lessons bolumunden olusturulan dersin geldigini dogrular
    Then Choose Lessons bolumunden olusturulan derse tiklar
    Then Choose Teacher menusune tiklar
    Then Choose Teacher drop down menuden bir teacher secer
    Then Ders icin ogretmen secilebilirligini dogrular
    Then Submit butonuna tiklar
    Then Lesson added to Teacher yazisinin gorunur oldugunu dogrular
    And  kullanici sayfayi kapatir

  Scenario: TC02 Ayni ogretmene, ayni gun ve saatte baska bir ders daha atanamamali
    Given Lesson Program secenegine tiklar
    Then Select Lessons menusune tiklar
    Then Acilan drop down menuden iki ders secer
    Then Choose Education Term menusune tiklar
    Then Acilan menuden bir donem secer
    Then Choose Day menusune tiklar
    Then Acilan menuden gun secer
    Then Start Time menusune tiklar ve gecerli bir saat girer
    Then Stop Time menusune tiklar ve gecerli bir saat girer
    Then Submit butonuna tiklar
    Then Choose Lessons bolumunden olusturulan dersin geldigini dogrular
    Then Choose Lessons bolumunden ayni gun ve saate ait iki derse tiklar
    Then Choose Teacher menusune tiklar
    Then Choose Teacher drop down menuden onceden secilen teacher'i secer
    Then Ders icin ogretmen secilebilirligini dogrular
    Then Submit butonuna tiklar
    Then Ayni ogretmene ayni gun ve saatte baska bir ders atanamadigini dogrular
    And kullanici sayfayi kapatir

