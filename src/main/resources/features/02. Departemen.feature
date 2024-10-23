Feature: Departemen
  Scenario: View Departemen Page
    Given click data master
    When click departemen
    Then validate view page departemen

#  Scenario: Input data
#    Given click input data
#    When input data
#    When click simpan
#    Then validate input data

  Scenario: Next Page
    Given click next
    Then validate next page

  Scenario: Previous Page
    Given click previous
    Then validate previous page

  Scenario: search
    Given input keywoad
    When click search
    Then validate search

    Scenario: Edit
      Given click edit
      When input dataE
      When click simpanE
      Then validate edit