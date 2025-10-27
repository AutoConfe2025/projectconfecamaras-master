# language: es

Característica: Suscriptores Nacionales


  @SuscriptoresNacionales @BloqueData3 @general
  Escenario: Suscriptores nacionales
    Dado Confecamaras requiere modificar un usuario nacional
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | Admin  |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y realice las modificaciones necesarias
    Entonces podra ver que las modificaciones fueron realizadas