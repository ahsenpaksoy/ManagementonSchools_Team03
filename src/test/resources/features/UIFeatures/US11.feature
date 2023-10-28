@us11
Feature: US11_The Vice Dean should be able to view and update the lesson program

  Background:
    Given User navigates to the homepage
    When Clicks on the Login button
    And Enters their username
    And Enters their password
    And Clicks on the Login
    And Clicks on the Lesson program tab

  Scenario: TC01_The created entity should be able to display Lesson, Day, Start Time, and Stop Time.
    Then Sees the Lesson column under the Lesson Program List heading
    Then Sees the Day column
    Then Sees the Start time column
    Then Sees the Stop time button
    And Sign out

  Scenario:TC02_They should be able to update from the Lesson Program List.




  Scenario: TC03_Deletion should be possible from the Lesson Program List.

