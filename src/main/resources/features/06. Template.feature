Feature: Template
  Scenario: View Template Page
    Given click data master4
    When click template
    Then validate view page template

#  Scenario: Input data
#    Given click input data template
#    When set dd kategori
#    When set dd departemen
#    When input nama template
#    When input format nomor surat
#    When click simpan template
#    Then validate input data template

  Scenario: Next Page
    Given click next template
    Then validate next page template

  Scenario: Previous Page
    Given click previous template
    Then validate previous page template

  Scenario: search
    Given input keywoad template
    When click search template
    Then validate search template

    Scenario: Edit
      Given click edit template
      When set ddE kategori
      When set ddE departemen
      When input Enama template
      When input Enomor surat
      When click simpan Etemplate
      Then validate edit template