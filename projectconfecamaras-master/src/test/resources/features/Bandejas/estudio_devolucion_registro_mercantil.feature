Feature: Estudio Devolucion Registro Mercantil
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo estudio devolucion registro mercantil
  para realizar las diferentes validaciones sobre el modulo

  @estudioDevolucionRegistroMercantil @BloqueData @general
  Scenario Outline: Estudio Devolucion Registro Mercantil
    Given que Tester_uno ingresa en el aplicativo ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña                        |
      | src/test/resources/data/DataDevDos.xlsx | EstDevolucionRegistroMercantil |
    When Tester_uno ingresa sus credenciales correctas en el home
    Then puede ingresar al modulo de estudio devolucion registro mercantil
    And validar que la devolucion se realizo de manera correcta


    Examples:
      | Fila |
      | 1    |