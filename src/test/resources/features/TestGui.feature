Feature: test gui

#  Scenario: First test
#    Given I login
#    Then I search a registration number
#
#
#  Scenario Outline: Second test
#    Given I login
#    Then test "<data1>" and "<data2>"
#
#    Examples:
#      | data1 | data2 |
#      | unu   | doi   |
#
#  @test
#  Scenario: Third test
#    Given I login
#    Then I search reg nr
#      | reg 1 | reg 11 |
#      | reg 2 | reg22  |
#      | reg 3 | erg23  |
#    And I get a a car with licence nr
#      | lic1 |
#      | lic2 |


  @test1
  Scenario: Login test
    Given I login on dispatcher with admin credentials
    Then I check if page title is "Transmiterea fara drept a datelor catre terti se pedepseste penal"
