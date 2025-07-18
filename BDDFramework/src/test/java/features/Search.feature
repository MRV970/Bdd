Feature: Search
@Regression
Scenario Outline:

 Validate when user enters text in search text field then search result 
 must be displayed
 
 Given Welcome page is displayed
 When user enters "<Search text>" in search text field
 Then Search results must be displayed
 Examples:
       | Search text |
       | Computer    |
       | Books       |
       |    10       |
       | 12.02       |
