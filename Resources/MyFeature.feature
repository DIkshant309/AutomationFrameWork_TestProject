Feature: MyFeature_File

  Scenario Outline: Spicejet Getting the rates for flights from A to B
    Given  landing on the SpiceJet HomePage
    When   entering the <destination> and the <arrival> information to get the rates
    And making the Assertions and validations for the information that was added
    Then on the results page the validations were made and the results were presented
    Examples:
      | destination | arrival    |
      |  Delhi      | Chennai    |
     # |  Amritsar   | Chennai    |
     # |  Chennai    | Delhi      |
    #  |  Pune       | Delhi      |
    #  |  Mumbai     | Delhi      |
    #  |  Kolkata    | Delhi      |


  Scenario Outline: Indigo Getting the rates for flights from A to B
    Given  landing on the SpiceJet HomePage
    When   entering the <destination> and the <arrival> information to get the rates
    And making the Assertions and validations for the information that was added
    Then on the results page the validations were made and the results were presented
    Examples:
      | destination | arrival    |
      |  Delhi      | Chennai    |
     # |  Amritsar   | Chennai    |
     # |  Chennai    | Delhi      |
    #  |  Pune       | Delhi      |
    #  |  Mumbai     | Delhi      |
    #  |  Kolkata    | Delhi      |
