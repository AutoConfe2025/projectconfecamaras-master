Feature: Radicar Actualizacion de Datos Mutacion
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo radicar actualizacion de datos mutacion
  para realizar las diferentes validaciones sobre el modulo

  @radicarActualizacionDatosMutacion @BloqueData2 @general
  Scenario: Radicar Actualizacion de Datos Mutacion
    Given Confecamaras desea ingresar al aplicativo ConfecamaraSII
    When Confecamaras ingresa sus credenciales asignadas en el home
    Then puede ingresar al modulo de Radicar Actualizacion Datos Mutacion
    And validar que la radicacion de realizo de manera correcta