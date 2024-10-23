Feature: Jenis Kerjasama
  Scenario: View Kerjasama Page
    Given click data master7
    When click jenis kerjasama
    Then validate view page jenis kerjasama

#  Scenario: Input data
#    Given click input data kerjasama
#    When input data kerjasama
#    When click simpan kerjasama
#    Then validate input data kerjasama

#  Scenario: Next Page
#    Given click next
#    Then validate next page
#
#  Scenario: Previous Page
#    Given click previous
#    Then validate previous page

  Scenario: search
    Given input keywoad kerjasama
    When click search kerjasama
    Then validate search kerjasama

#    Scenario: Edit
#      Given click edit
#      When input dataE
#      When click simpanE
#      Then validate edit