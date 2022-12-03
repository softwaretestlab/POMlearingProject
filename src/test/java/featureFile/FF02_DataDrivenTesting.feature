Feature: Data driven testing of Reg Screen

  Scenario Outline: Reg Screen
    Given open browser and navigate to Reg Screen
    Then enter Firstname as "<FirstName>"
  Then enter Lastname as "<LastName>"
  Then enter EmailAddress as "<EmailAddress>"

    Examples:
    |FirstName|LastName|EmailAddress|
    |FirstName01|LastName01|EmailAddress01@gmail.com|
    |FirstName02|LastName02|EmailAddress02@gmail.com|
    |FirstName03|LastName03|EmailAddress03@gmail.com|
    |FirstName04|LastName04|EmailAddress04@gmail.com|
    |FirstName05|LastName05|EmailAddress05@gmail.com|
    |FirstName06|LastName06|EmailAddress06@gmail.com|




