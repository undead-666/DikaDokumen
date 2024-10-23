Feature: Internal Dokumen

  Scenario: View page Internal dokumen
    Given click internal dokumen
    Then validate page internal dokumen

#  Scenario: input data internal dokumen
#    Given click input data ID
#    When dd TI
#    When dd GD
#    When set tgl reminder
#    When input nodok
#    When input nadok
#    When input desdok
#    When set tgl mulai
#    When set tgl berakhir
#    When input owner
#    When set tgl dok
#    When dd LA
#    When dd JM
#    When inout jumlah
#    When upload file
#    When dd share
#    When dd status
#    When click simpan ID
#    Then validate input data DI

#  Scenario: Search No Dokumen
#    Given input no dokumen
#    When click search no dok
#    Then validate search no dokumen
#
#  Scenario: Search Nama Dokumen
#    Given input nama dokumen
#    When click search na dok
#    Then validate search na dok
#
#  Scenario: Filter No Dokumen
#    Given set dd di departemen
#    When click search dd di departemen
#    Then validate filter departemen
#
#  Scenario: Filter Ketersediaan File
#    Given set dd ketfile
#    When click search ketfile
#    Then validate filter ketfile

  Scenario: View Data
    Given click view
    Then validate view data DI

  Scenario: Edit data
    Given click edit di
    When input Enodok
    When input Enadok
    When input Edesdok
    When set Etgl mulai
    When set Etgl berakhir
    When input Eowner
    When set Etgl dokumen
    When set Elokasi arsip
    When set Etgl reminder
    When set Ejenis media
    When input Ejumlah
    When set Eshare
    When set Estatus
    When click Esimpan
    Then validate edit di