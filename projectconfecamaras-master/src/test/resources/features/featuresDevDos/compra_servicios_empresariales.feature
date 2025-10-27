Feature: Compra de Servicios Empresariales
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo compra de servicios empresariales
  para realizar las diferentes validaciones sobre el modulo

  @compraServiciosEmpresariales @BloqueDos @general
  Scenario Outline: Compra de Servicios Empresariales
    Given que Tester_uno ingresa en el aplicativo de ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña                      |
      | src/test/resources/data/DataDevDos.xlsx | CompraServiciosEmpresariales |
    When Tester_uno ingresa sus credenciales correctas en el home page
    Then puede ingresar al modulo de compra de servicios empresariales
    And validar que la compra se realizo de manera correcta


    Examples:
      | Fila |
      | 1    |