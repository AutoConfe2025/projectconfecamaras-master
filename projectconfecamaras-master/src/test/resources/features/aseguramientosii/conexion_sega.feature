# language: es

Característica: Conexion Sega

  @conexionSega @BloqueSeis @general
  Escenario: Conexion Sega
    Dado Confecamaras requiere realizar conexion con el sega
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese a la edicion
    Entonces podra visualizar el contenido de las conexiones