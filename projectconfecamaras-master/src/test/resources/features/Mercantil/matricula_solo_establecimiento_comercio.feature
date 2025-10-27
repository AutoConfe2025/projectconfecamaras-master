Feature: Matricula Solo Establecimiento Comercio
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo matricula solo establecimiento de comercio
  para realizar las diferentes validaciones sobre el modulo

  @matriculaSoloEstablecimientoComercio @BloqueData @general
  Scenario Outline: Matricula Solo Establecimiento Comercio
    Given que Tester ingresa en el aplicativo ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña                         |
      | src/test/resources/data/DataDevDos.xlsx | MatriculaSoloEstablecimientoCom |
    When ingresa sus credenciales correctas en el home page
    Then puede ingresar al modulo de Matricula Solo Establecimiento Comercio
    And validar que el proceso se realizo de manera correcta


    Examples:
      | Fila |
      | 1    |