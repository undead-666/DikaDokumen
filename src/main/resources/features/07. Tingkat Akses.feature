Feature: Tingkat akses
  Scenario: View Tingkat Akses Page
    Given click data master5
    When click tingkat akses
    Then validate view page tingkat akses

#  Scenario: Input data
#    Given click input data tingkat akses
#    When set dd departemen1
#    When input nama tingkat akses
#    When click simpan tingkat akses
#    Then validate input data tingkat akses

  Scenario: Next Page
    Given click next tingkat akses
    Then validate next page tingkat akses

  Scenario: Previous Page
    Given click previous tingkat akses
    Then validate previous page tingkat akses

  Scenario: search
    Given input keywoad tingkat akses
    When click search tingkat akses
    Then validate search tingkat akses

    Scenario: Edit
      Given click edit tingkat akses
      When set ddE departemen TA
      When input Enama TA
      When click simpan ETA
      Then validate edit tingkat akses