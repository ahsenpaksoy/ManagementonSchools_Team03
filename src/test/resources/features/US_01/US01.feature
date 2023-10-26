Feature: US01 Aday öğrenciler sisteme kayıt olabilmelidir.

Background:
  Given kullanici "https://managementonschools.com/" e gider
  And kullanici Register butonuna tiklar
@a
Scenario: TC01 Web sitesine yeni bir kullanıcı kaydi yapma
  Then kullanici name alanina isim girer
  And kullanici surname alanina soyisim girer
  And kullanici Birth Place alanina dogum yeri girer
  And kullanici Phone Number alanina telefonnumarasi girer
  And kullanici Gender alanindan cinsiyet secer
  And kullanici Birth Date alanina dogum gunu girer
  And kullanici SSN alanina ssn girer
  And kullanici User Name alanina username girer
  And kullanici Password alanina password girer
  And kullanici Register dugmesine tiklar
  And Kayit islemi basariyla tamamlanir
  And Kullanici sayfayi kapatir

Scenario: TC02 Name Kutusu bos birakilarak sisteme kayit olunmaz
  Then kullanici surname alanina soyisim girer
  And kullanici Birth Place alanina dogum yeri girer
  And kullanici Phone Number alanina telefonnumarasi girer
  And kullanici Gender alanindan cinsiyet secer
  And kullanici Birth Date alanina dogum gunu girer
  And kullanici SSN alanina ssn girer
  And kullanici User Name alanina username girer
  And kullanici Password alanina password girer
  And kullanici Register dugmesine tiklar
  And Name kutusu bos olunca kayit isleminin tamamlanmadigini dogrular
  And Kullanici sayfayi kapatir

  Scenario: TC03 SurName Kutusu bos birakilarak sisteme kayit olunmaz
    Then kullanici name alanina isim girer
    And kullanici Birth Place alanina dogum yeri girer
    And kullanici Phone Number alanina telefonnumarasi girer
    And kullanici Gender alanindan cinsiyet secer
    And kullanici Birth Date alanina dogum gunu girer
    And kullanici SSN alanina ssn girer
    And kullanici User Name alanina username girer
    And kullanici Password alanina password girer
    And kullanici Register dugmesine tiklar
    And Surname kutusu bos olunca kayit isleminin tamamlanmadigini dogrular
    And Kullanici sayfayi kapatir

    Scenario: TC04 "Birth Place" alani bos birakilarak sisteme kayit olunamamali
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanini bos birakir
      And kullanici Phone Number alanina telefonnumarasi girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanina password girer
      And kullanici Register dugmesine tiklar
      And Birth Place kutusu bos olunca kayit isleminin tamamlanmadigini dogrular
      And Kullanici sayfayi kapatir

      Scenario: TC05 "Phone Number" alani bos birakilarak sisteme kayit olunamamali
        Then kullanici name alanina isim girer
        And kullanici surname alanina soyisim girer
        And kullanici Birth Place alanina dogum yeri girer
        And kullanici Phone Number alanini bos birak
        And kullanici Gender alanindan cinsiyet secer
        And kullanici Birth Date alanina dogum gunu girer
        And kullanici SSN alanina ssn girer
        And kullanici User Name alanina username girer
        And kullanici Password alanina password girer
        And kullanici Register dugmesine tiklar
        And phone Number kutusu bos olunca kayit isleminin tamamlanmadigini dogrular
        And Kullanici sayfayi kapatir

    Scenario: TC06 "Phone Number" alanina patterne uygun olmayan bir numara girerek kayit olunamamali
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Phone Number alanina patterne uygun olmayan bir numara girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanina password girer
      And kullanici Register dugmesine tiklar
      And Phone Number alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular
      And Kullanici sayfayi kapatir

   Scenario: TC07 "SSN" alanina patterne uygun olmayan bir numara girerek kayit olunamamali
     Then kullanici name alanina isim girer
     And kullanici surname alanina soyisim girer
     And kullanici Birth Place alanina dogum yeri girer
     And kullanici Phone Number alanina telefonnumarasi girer
     And kullanici Gender alanindan cinsiyet secer
     And kullanici Birth Date alanina dogum gunu girer
     And kullanici SSN alanina patterne uygun olmayan bir numara girer
     And kullanici User Name alanina username girer
     And kullanici Password alanina password girer
     And kullanici Register dugmesine tiklar
     And SSN alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular
     And Kullanici sayfayi kapatir

     Scenario: TC08 "SSN" alanina bos birakilarak kayit olunamamali
       Then kullanici name alanina isim girer
       And kullanici surname alanina soyisim girer
       And kullanici Birth Place alanina dogum yeri girer
       And kullanici Phone Number alanina telefonnumarasi girer
       And kullanici Gender alanindan cinsiyet secer
       And kullanici Birth Date alanina dogum gunu girer
       And kullanici SSN alanini bos birakir
       And kullanici User Name alanina username girer
       And kullanici Password alanina password girer
       And kullanici Register dugmesine tiklar
       And  ssn kutusu bos olunca kayit isleminin tamamlanmadigini dogrular
       And Kullanici sayfayi kapatir

       Scenario: TC09 "Birth Date" alani bos birakilarak kayit olunamaz
         Then kullanici name alanina isim girer
         And kullanici surname alanina soyisim girer
         And kullanici Birth Place alanina dogum yeri girer
         And kullanici Phone Number alanina telefonnumarasi girer
         And kullanici Gender alanindan cinsiyet secer
         And kullanici Birth Date alanini bos birakir
         And kullanici SSN alanina ssn girer
         And kullanici User Name alanina username girer
         And kullanici Password alanina password girer
         And kullanici Register dugmesine tiklar
         And Birth Date alanini bos birakinca kayit olunamadigini dogrular
         And Kullanici sayfayi kapatir

     Scenario: TC10 "User Name" alani bos birakilarak kayit olunamamali
       Then kullanici name alanina isim girer
       And kullanici surname alanina soyisim girer
       And kullanici Birth Place alanina dogum yeri girer
       And kullanici Phone Number alanina telefonnumarasi girer
       And kullanici Gender alanindan cinsiyet secer
       And kullanici Birth Date alanina dogum gunu girer
       And kullanici SSN alanina ssn girer
       And kullanici User Name alanini bos birakir
       And kullanici Password alanina password girer
       And kullanici Register dugmesine tiklar
       And User Name alani bos birakilarak kayit olunamadigini dogrular
       And Kullanici sayfayi kapatir

    Scenario: TC11 "Password" alani bos birakilarak kayit olunamamali
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Phone Number alanina telefonnumarasi girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanini bos birakir
      And kullanici Register dugmesine tiklar
      And Password alani bos birakilarak kayit olunamadigini dogrular
      And Kullanici sayfayi kapatir

    Scenario: TC12 Kullanici 8 karakterden az sifre ile kayit olamaz
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Phone Number alanina telefonnumarasi girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanina yedi karakterli bir  "password" girer
      And kullanici Register dugmesine tiklar
      And Sekiz karakterden daha az karakterli bir sifre ile kayit olunamadigini dogrular
      And Kullanici sayfayi kapatir

    Scenario: TC13 Kullanici sadece rakamlardan olusan bir sifre ile kayit olamaz
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Phone Number alanina telefonnumarasi girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanina sadece rakamlardan olusan bir sifre girer
      And kullanici Register dugmesine tiklar
      And Kayit isleminin tamamlanmadigini dogrular
      And Kullanici sayfayi kapatir

    Scenario: TC14 Kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Phone Number alanina telefonnumarasi girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanina sadece kucuk harflerden olusan bir sifre girer
      And kullanici Register dugmesine tiklar
      And kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz
      And Kullanici sayfayi kapatir

      Scenario: TC15 Kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz
        Then kullanici name alanina isim girer
        And kullanici surname alanina soyisim girer
        And kullanici Birth Place alanina dogum yeri girer
        And kullanici Phone Number alanina telefonnumarasi girer
        And kullanici Gender alanindan cinsiyet secer
        And kullanici Birth Date alanina dogum gunu girer
        And kullanici SSN alanina ssn girer
        And kullanici User Name alanina username girer
        And kullanici Password alanina sadece buyuk harflerden olusan bir sifre girer
        And kullanici Register dugmesine tiklar
        And kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz
        And Kullanici sayfayi kapatir

    Scenario: TC16 Kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Phone Number alanina telefonnumarasi girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanina sadece buyuk ve kucuk harflerden olusan bir sifre girer
      And kullanici Register dugmesine tiklar
      And kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz
      And Kullanici sayfayi kapatir

    Scenario: TC17 Kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Phone Number alanina telefonnumarasi girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanina sadece rakam ve buyuk harflerden olusan bir sifre girer
      And kullanici Register dugmesine tiklar
      And kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz
      And Kullanici sayfayi kapatir

    Scenario: TC18 Daha once kayitli bir SSN number ile kayit olunamamali
      Then kullanici name alanina isim girer
      And kullanici surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Phone Number alanina telefonnumarasi girer
      And kullanici Gender alanindan cinsiyet secer
      And kullanici Birth Date alanina dogum gunu girer
      And kullanici SSN alanina kayitli bir ssn girer
      And kullanici User Name alanina username girer
      And kullanici Password alanina password girer
      And kullanici Register dugmesine tiklar
      And Daha once kayitli bir SSN ile kayit olunamadigini dogrular
      And Kullanici sayfayi kapatir









