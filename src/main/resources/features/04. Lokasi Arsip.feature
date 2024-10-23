Feature: Lokasi arsip
  Scenario: View Lokasi Arsip Page
    Given click data master2
    When click lokasi penyimpanan
    Then validate view page lokasi arsip

#  Scenario: Input data
#    Given click input data LA
#    When input data LA
#    When click simpan LA
#    Then validate input data LA

  Scenario: Next Page LA
    Given click next LA
    Then validate next page LA

  Scenario: Previous Page
    Given click previous LA
    Then validate previous page LA

  Scenario: search
    Given input keywoad LA
    When click search LA
    Then validate search LA

#  Scenario: Edit
#    Given click edit LA
#    When input dataE LA
#    When click simpanE LA
#    Then validate edit LA