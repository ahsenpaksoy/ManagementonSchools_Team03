Feature: Vice Dean ders listesini görebilmeli ve güncellemeler yapabilmelidir.(Lessons - Lesson List)

  Background: Kullanici ManagementSchools sayfasina giderSo
    Given kullanici ManagementSchools sayfasina giderSo
    And kullanici 2 saniye beklerSo
    Given Login butonuna tiklarSo
    And Vice Dean olarak giris yaparSo
    And kullanici 2 saniye beklerSo
    And Menü alanina tiklarSo
    And kullanici 2 saniye beklerSo
    And Cikan seceneklerden LessonManagement tiklanirSo

 Scenario: Vice Dean ders listesini görebilmeli
   Given Acilan Sayfada Lesson alanina tiklanirSo
   And Kullanici ders listesini(LessonName,Compulsory,CreditScore) gordugunu dogrularSo
   And kullanici sayfayi kapatirSo

 Scenario: Vice Dean ders listesinden ders silebilmeli
   Given Acilan Sayfada Lesson alanina tiklanirSo
   Then kullanici ders listesinde ders silebilmeliSo



