# language: es

Característica: Mtto Alcaldia

  @mttoAlcaldia @BloqueSeis @general
  Escenario: Mtto Alcaldia
    Dado Confecamaras requiere editar info de documentacion de alcaldia
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de mtto alcaldia e ingrese la info
    Entonces podra visualizar la nueva info agregada