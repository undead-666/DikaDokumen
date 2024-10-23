Feature: Group Dokumen
  Scenario: View group dokumen page
    Given click data master1
    When  click group dokumen
    Then validate page GD

#  Scenario: Input data
#    Given click input data1
#    When input kode
#    When input nama
#    When input retensi
#    When click simpan1
#    Then validate input data GD

  Scenario: Next Page
    Given click next page GD
    Then validate next page GD

  Scenario: Previous Page
    Given click previous page GD
    Then validate previous page GD

  Scenario: Search
    Given input keywoad GD
    When click search GD
    Then validate search GD

#  Scenario: Edit
#    Given click edit GD
#    When edit kode
#    When edit nama
#    When edit retensi
#    When click simpan2
#    Then validate edit GD