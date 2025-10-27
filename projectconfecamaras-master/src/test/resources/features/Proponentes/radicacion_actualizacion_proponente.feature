Feature: Radicacion Actualizacion de proponente
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo radicacion actualizacin de proponente
  para realizar las diferentes validaciones sobre el modulo

  @radicacionActualizacionProponente @BloqueTres @general @proponetes
  Scenario Outline: Radicacion Actualizacion de proponente
    Given que Tester ingresa en el aplicativo de ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña                         |
      | src/test/resources/data/DataDevDos.xlsx | RadicacionActualizacionProponen |
    When ingresa sus credenciales asignadas en el home page
    Then puede ingresar al modulo de Radicacion Actualizacion de proponente
    And validar que la actualizacion se realizo de manera correcta


    Examples:
      | Fila |
      | 1    |