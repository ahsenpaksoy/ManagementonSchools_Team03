@US16UITest  @Smoke2
Feature: ViceDean verify messages

  Background: navigation to url
    Given user on homepoge
    Then user click on logibutton
    And user login with valid username
    And user login with valid password
    And user clicks on loginbutton

  Scenario Outline: TC01 vicedean_verify_teacher_messages
    Given user clicks menu button
    Then user clicks contact get all button
    Then  dean verifies contact messages "<Name>" , "<Email>", "<Date>", "<Subject>", "<Message>" visibility
    And close the website

    Examples:
      | Name        | Email                       | Date       | Subject                    | Message    |
      | mustafa        | mustafa@gmail.com        | 2023-11-22 | English                    | Message from mustafa |
