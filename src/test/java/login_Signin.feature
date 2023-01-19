Feature: Login Test

  Scenario:Mizu.com login sign in happy path

    Given Mizu.com sitesine git
    When signin butonuna tıkla
    And email gir
    And password gir
    And signin butonuna tıkla
    Then login verify et

  Scenario:Mizu.com login sign in ekranı hatalı Password kontrolü
    Given Mizu.com sitesine git
    When email gir
    And hatalı password gir
    And signin butonuna tıkla
    Then hata mesajı verify et

  Scenario: Mizu.com login sign in ekranı Forgot Password kontrolü
    Given Mizu.com sitesine git
    When forgot password öğesine tıklarsam
    Then forgot verify et