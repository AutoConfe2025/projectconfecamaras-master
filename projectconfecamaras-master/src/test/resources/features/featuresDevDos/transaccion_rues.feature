Feature: Transacciones RUES
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo transacciones rues
  para realizar las diferentes validaciones sobre el modulo

  @transaccionesRUES @BloqueTres @SinDataDevDosUno @general
  Scenario Outline: Transacciones RUES
    Given que Tester_uno desea ingresar en el aplicativo ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña           |
      | src/test/resources/data/DataDevDos.xlsx | TransaccionesRues |
    When Tester_uno ingresa sus credenciales exitosas en el home page
    Then puede ingresar al modulo de transacciones rues
    And validar que la transaccion rues se realizo de manera correcta


    Examples:
      | Fila |
      | 1    |