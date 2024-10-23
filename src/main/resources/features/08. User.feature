Feature: User
  Scenario: View User Page
    Given click data master6
    When click user
    Then validate view page user

#  Scenario: Input data
#    Given click input data user
#    When input nik
#    When input namaU
#    When set dd departemenU
#    When set dd tingkat akses
#    When input email
#    When input usernameU
#    When input passwordU
#    When input CpasswordU
#    When set dd tipe akses
#    When click simpan user
#    Then validate input data user

  Scenario: Next Page
    Given click next user
    Then validate next page user

  Scenario: Previous Page
    Given click previous user
    Then validate previous page user

  Scenario: search
    Given input keywoad user
    When click search user
    Then validate search user

#    Scenario: Edit
#      Given click edit user
#      When input Enik
#      When input Enama
#      When set ddE departemenU
#      When set ddE tingkat aksesU
#      When input Eusername
#      When input Eemail
#      When set ddE status
#      When click simpan Euser
#      Then validate edit user