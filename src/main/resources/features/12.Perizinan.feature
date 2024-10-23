Feature: Perizinan

  Scenario: View page perizinan
    Given click perizinan
    Then validate page perizinan

  Scenario: Next Page perizinan
    Given click next perizinan
    Then validate next page perizinan

  Scenario: Previous Page perizinan
    Given click previous perizinan
    Then validate previous page perizinan

  Scenario: input data perizinan
    Given click input data perizinan
    When input no perizinan
    When input nama perizinan
    When set tgl mulai perizinan
    When set tgl berakhir perizinan
    When input diterbitkan oleh
    When input deskripsi perizinan
    When input pemilik dokumen perizinan
    When set tgl reminder perizinan
    When upload file perizinan
    When set dd status perizinan
    When click simpan perizinan
    Then validate input data perizinan


  Scenario: Search No perizinan
    Given search no perizinan
    When click search no perizinan
    Then validate search no dokumen perizinan

  Scenario: Search Nama Dokumen perizinan
    Given search nama dokumen perizinan
    When click search na dok perizinan
    Then validate search na dok perizinan


  Scenario: Filter dd departemen perizinan
    Given set dd di departemen perizinan
    When click search dd departemen perizinan
    Then validate filter departemen perizinan

  Scenario: Filter Ketersediaan File perizinan
    Given set dd ketfile perizinan
    When click search ketfile perizinan
    Then validate filter ketfile perizinan

  Scenario: View Data perizinan
    Given click view perizinan
    Then validate view data perizinan

  Scenario: Edit data perizinan
    Given click edit perizinan
    When input Enomor perizinan
    When input Enama perizinan
    When set Etgl mulai perizinan
    When set Etgl berakhir perizinan
    When input Editerbitkan oleh
    When input Edeskripsi perizinan
    When input Epemilik dokumen perizinan
    When set Etgl reminder perizinan
    When set Edd status perizinan
    When click simpan Eperizinan
    Then validate edit perizinan

    Scenario: Send Selected Email perizinan
      Given click send selected email perizinan
      Then validate send selected email perizinan
