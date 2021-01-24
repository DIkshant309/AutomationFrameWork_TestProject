Feature: MyFeature_File

  Scenario: Getting the rates for flights from A to B
    Given  landing on the SpiceJet HomePage
    When   entering the destination and the arrival information to get the rates
    And making the Assertions and validations for the information that was added
    Then on the results page the validations were made and the results were presented
