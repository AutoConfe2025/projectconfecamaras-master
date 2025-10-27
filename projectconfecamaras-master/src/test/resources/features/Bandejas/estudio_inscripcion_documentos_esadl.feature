Feature: Estudio Inscripcion Documentos Esadl
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo estudio e inscripcion de documentos Esadl
  para realizar las diferentes validaciones sobre el modulo

  @estudioInscripcionDocumentosEsadl @BloqueData @general
  Scenario Outline: Estudio Inscripcion Documentos Esadl
    Given que Confecamaras ingresa en el aplicativo de ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña                       |
      | src/test/resources/data/DataDevDos.xlsx | EstInscripcionDocumentosEsadl |
    When Confecamaras ingresa sus credenciales correctas en el home
    Then puede ingresar al modulo de Estudio Inscripcion Documentos Esadl
    And validar que la inscripcion se realizo de manera correcta


    Examples:
      | Fila |
      | 1    |