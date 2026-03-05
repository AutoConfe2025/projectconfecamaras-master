# language: es

Característica: Expediente Digital

  @expedienteDigital @BloqueCinco @general
  Escenario: Expediente Digital
    Dado Confecamaras requiere consuktar expediente digital
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese los dtos correspondientes a la consulta de expediente
    Entonces podra ver los datos del expediente