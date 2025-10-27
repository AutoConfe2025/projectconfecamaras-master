Feature: Revision CFE
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo revision cfe
  para realizar las diferentes validaciones sobre el modulo

  /*@revisionCFE @BloqueTres @ConDataDevDosUno @general*/
  Scenario Outline: Revision CFE
    Given que Confecamaras desea ingresar en el aplicativo de ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña     |
      | src/test/resources/data/DataDevDos.xlsx | RevisionCFE |
    When Confecamaras ingresa sus credenciales correctas en el home page
    Then puede ingresar al modulo de Revision CFE
    And validar que la reversion se realizo de manera correcta


    Examples:
      | Fila |
      | 1    |