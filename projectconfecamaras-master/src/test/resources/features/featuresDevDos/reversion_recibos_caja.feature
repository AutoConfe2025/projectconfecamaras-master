Feature: Reversion de Recibos de Caja
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo reversion de recibos de caja
  para realizar las diferentes validaciones sobre el modulo

  @reversionRecibosCaja @BloqueTres @ConDataDevDosUno @general
  Scenario: Reversion de Recibos de Caja
    Given Confecamaras desea ingresar en el aplicativo ConfecamaraSII
    When ingresa sus credenciales asignadas en el home
    Then puede ingresar al modulo de Reversion de Recibos de Caja
    And validar que la reversion de realizo de manera correcta