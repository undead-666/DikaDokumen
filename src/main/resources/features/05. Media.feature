Feature: Media
  Scenario: View Media Page
    Given click data master3
    When click media
    Then validate view page media

#  Scenario: Input data
#    Given click input data media
#    When input data media
#    When click simpan media
#    Then validate input data media

  Scenario: Next Page
    Given click next media
    Then validate next page media

  Scenario: Previous Page
    Given click previous media
    Then validate previous page media

  Scenario: search
    Given input keywoad media
    When click search media
    Then validate search media

    Scenario: Edit
      Given click edit media
      When input dataE media
      When click simpanE media
      Then validate edit media