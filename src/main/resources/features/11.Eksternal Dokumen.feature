Feature: Eksternal Dokumen

  Scenario: View page eksternal dokumen
    Given click eksternal dokumen
    Then validate page eksternal dokumen

  Scenario: Next Page ed
    Given click next ed
    Then validate next page ed

  Scenario: Previous Page ed
    Given click previous ed
    Then validate previous page ed

#  Scenario: input data eksternal dokumen
#    Given click input data ed
#    When input nama klien
#    When set dd jenis kerjasama
#    When input nama project
#    When set dd jenis dokumen
#    When input no dokumen ed
#    When input nama dokumen ed
#    When set tgl mulai ed
#    When set tgl berakhir ed
#    When set tgl reminder ed
#    When input tim terkait
#    When upload file ed
#    When set dd share ed
#    When set dd status ed
#    When click simpan ed
#    Then validate input data ed


#  Scenario: Search No Dokumen ed
#    Given search no dokumen ed
#    When click search no dok ed
#    Then validate search no dokumen ed
#
#  Scenario: Search Nama Dokumen ed
#    Given search nama dokumen ed
#    When click search na dok ed
#    Then validate search na dok ed
#
#  Scenario: Search Nama Klien ed
#    Given input nama klien ed
#    When click search na klien ed
#    Then validate search na klien ed
#
#  Scenario: Filter dd departemen ed
#    Given set dd di departemen ed
#    When click search dd di departemen ed
#    Then validate filter departemen ed
#
#  Scenario: Filter Ketersediaan File ed
#    Given set dd ketfile ed
#    When click search ketfile ed
#    Then validate filter ketfile ed
#
#  Scenario: View Data ed
#    Given click view ed
#    Then validate view data ed
#
#  Scenario: Edit data ed
#    Given click edit ed
#    When input Enama klien
#    When set Edd jenis kerjasama
#    When input Enama project
#    When input Enama dokumen
#    When set Etgl mulai ed
#    When set Etgl berakhir ed
#    When set Etgl reminder ed
#    When input Etim terkait
#    When set Edd share
#    When set Edd status
#    When click simpan Eed
#    Then validate edit ed
#
#    Scenario: Send Selected Email
#      Given click send selected email
#      Then validate send selected email
