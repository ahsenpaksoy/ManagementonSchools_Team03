Feature: US10 Vice Dean ders programi olusturabilmeli
  Background: Vice Dean hesabi ile siteye giris yapilir ve menuden Lesson Management secilir
    Given kullanici "https://managementonschools.com/" sayfasina gider
    Then kullanici login butonuna tiklar
    Then kullanici username ve password datalarini girer ve enter'a tiklar
    Then kullanici menu butonuna tiklar
    Then acilan pencereden lesson management'i secer

  Scenario: TC01 Vice Dean ders programi olusturabilmeli
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
    Then Lesson Program olusturuldugunu dogrular
    And  kullanici sayfayi kapatir

  Scenario: TC02 Dersin bitis saati dersin baslama saatinden once olmamali
    Given Lesson Program secenegine tiklar
    Then Select Lessons menusune tiklar
    Then Acilan drop down menuden bir ders secer
    Then Choose Education Term menusune tiklar
    Then Acilan menuden bir donem secer
    Then Choose Day menusune tiklar
    Then Acilan menuden gun secer
    Then Start Time menusune tiklar ve gecerli bir saat girer
    Then Stop Time menusune tikla, baslangic saatinde once bir data gir
    Then Submit butonuna tiklar
    Then Lesson Program olusturulamadigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC03 Education Term secilmeden Lesson Program olusturulamamali
    Given Lesson Program secenegine tiklar
    Then Select Lessons menusune tiklar
    Then Acilan drop down menuden bir ders secer
    Then Choose Day menusune tiklar
    Then Acilan menuden gun secer
    Then Start Time menusune tiklar ve gecerli bir saat girer
    Then Stop Time menusune tiklar ve gecerli bir saat girer
    Then Submit butonuna tiklar
    Then Education Term secilmedigin icin uyari yazisini gorur
    And kullanici sayfayi kapatir

  Scenario: TC04 Ders secilmeden Lesson Program olusturulamamali
    Given Lesson Program secenegine tiklar
    Then Choose Education Term menusune tiklar
    Then Acilan menuden bir donem secer
    Then Choose Day menusune tiklar
    Then Acilan menuden gun secer
    Then Start Time menusune tiklar ve gecerli bir saat girer
    Then Stop Time menusune tiklar ve gecerli bir saat girer
    Then Submit butonuna tiklar
    Then Ders secilmedigi icin uyari yazisi alir
    And  kullanici sayfayi kapatir

  Scenario: TC05 Gun secilmeden Lesson Program olusturulamamali
    Given Lesson Program secenegine tiklar
    Then Select Lessons menusune tiklar
    Then Acilan drop down menuden bir ders secer
    Then Choose Education Term menusune tiklar
    Then Acilan menuden bir donem secer
    Then Start Time menusune tiklar ve gecerli bir saat girer
    Then Stop Time menusune tiklar ve gecerli bir saat girer
    Then Submit butonuna tiklar
    Then Gun secilmedigi icin uyari yazisi alir
    And  kullanici sayfayi kapatir

  Scenario: TC06 Vice Dean ders secebilmeli
    Given Lesson Program secenegine tiklar
    Then Select Lessons menusune tiklar
    Then Acilan drop down menuden bir ders secer
    Then Ders secilebildigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC07 Vice Dean egitim donemi secebilmeli
    Given Lesson Program secenegine tiklar
    Then Choose Education Term menusune tiklar
    Then Acilan menuden bir donem secer
    Then Donem secilebildigini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC08 Vice Dean ders icin baslama ve bitis tarihi secebilmeli
    Given Lesson Program secenegine tiklar
    Then Start Time menusune tiklar ve gecerli bir saat girer
    Then Stop Time menusune tiklar ve gecerli bir saat girer
    Then Baslama ve bitis tarihi secilebilirligini dogrular
    And kullanici sayfayi kapatir

  Scenario: TC09 Vice Dean ders icin gun secebilmeli
    Given Lesson Program secenegine tiklar
    Then Choose Day menusune tiklar
    Then Acilan menuden gun secer
    Then Gun secebildigini dogrular
    And kullanici sayfayi kapatir









