# language: es

Característica: Ssietmas Externos

  @sistemasExternos @BloqueSeis @general
  Escenario: Sistemas Externos
    Dado Confecamaras requiere agregar un nuevo sistema externo
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de sistemas externos y agregue un nuevo sistema y luego lo elimine
    Entonces podra visualizar el nuevo sistema de prueba agregado ya no existe y los demas sistemas son visbles