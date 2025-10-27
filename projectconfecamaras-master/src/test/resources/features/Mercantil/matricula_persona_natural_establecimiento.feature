Feature: Matricula Persona Natural Establecimiento
  Yo como usuario del portal ConfecamaraSII
  deseo ingresar al modulo matricula persona natural establecimiento
  para realizar las diferentes validaciones sobre el modulo

  @matriculaPersonaNaturalEstablecimiento @BloqueCuatro @general
  Scenario Outline: Matricula Persona Natural Establecimiento
    Given que Andrey ingresa en el aplicativo ConfecamaraSII <Fila>
      | Ruta Excel                              | Pestaña                         |
      | src/test/resources/data/DataDevDos.xlsx | MatriculaPersonaNaturalEstablec |
    When ingresa sus credenciales correctas en el home
    Then puede ingresar al modulo de Matricula Persona Natural Establecimiento
    And validar que el proceso se realizo de manera exitosa


    Examples:
      | Fila |
      | 1    |