Feature: Radicacion de Documentos - Reforma de Capital

  @radicacionDocumentosReformaCapital @BloqueTres @general
  Scenario Outline: Radicacion de Documentos - Reforma de Capital
    Given que Confecamaras se encuentra en el aplicativo de ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña                     |
      | src/test/resources/data/DataDevDos.xlsx | RadicacionDocReformaCapital |
    When el usuario radica el formulario de reformas comerciales capital suscrito
    Then se genera una liquidacion del documento reforma capital
    And valida que se pago de manera correcta


    Examples:
      | Fila |
      | 1    |