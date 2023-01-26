@AmazonPage
Feature: Amazon page funcationality

  Background: Common Details

  @SearchCarSuccess
  Scenario: Testing funcationality of Amazon page
    Given On Home page of Amazon "https://www.amazon.com/"
    When Validate the title
   