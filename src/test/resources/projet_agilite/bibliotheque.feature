Feature: Bibliothèque functionality

  Scenario: Adding a book to the library
    Given the library name is "François Mitterrand"
    And the library is located in "Paris"
    When a book with title "Le deal", author "Albert Cogan", and ISBN "1026244374" is added
    Then the total number of books should be 1
    And the library location in uppercase should be "PARIS"

  Scenario: Modifying library details
    Given the library name is "François Mitterrand"
    And the library is located in "Paris"
    When the library name is changed to "Bibliothèque Nationale"
    And the library location is changed to "Amiens"
    Then the library name should be "Bibliothèque Nationale"
    And the library location should be "Amiens"
