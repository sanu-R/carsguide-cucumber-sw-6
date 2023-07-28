@regression
Feature: Search functionality

  Background: I am on homepage

  @smoke
  Scenario Outline: Search the buy car with model
    When I mouse hover on buy sell tab
    And I click Search Cars link
    Then I navigate to New & Used Car Search - carsguide page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the "<make>" in results
    Examples:
      | make    | model    | location            | price   |
      | Audi    | A4       | NSW - Central Coast | $60,000 |
      | BMW     | 2 Series | NSW - Far West      | $60,000 |
      | Ford    | Explorer | NSW - Far West      | $45,000 |
      | Honda   | Beat     | NSW - South Coast   | $40,000 |
      | Hyundai | Coupe    | NSW - Hunter        | $50,000 |
      | Mazda   | Axela    | NSW - Central West  | $50,000 |

  @sanity
  Scenario Outline: : Search the used car with model
    When I mouse hover on buy sell tab
    And  I click used link
    Then I navigate to Used Cars For Sale page
    And  I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the "<make>" in results
    Examples:
      | make    | model    | location            | price   |
      | Audi    | A4       | NSW - Central Coast | $30,000 |
      | BMW     | 2 Series | NSW - Far West      | $40,000 |
      | Ford    | Explorer | NSW - Far West      | $15,000 |
      | Honda   | Beat     | NSW - South Coast   | $20,000 |
      | Hyundai | Coupe    | NSW - Hunter        | $15,000 |
      | Mazda   | Axela    | NSW - Central West  | $15,000 |