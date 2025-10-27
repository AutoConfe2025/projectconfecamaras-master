# language: es

Característica: Solicitar clave de afiliado

  @generarNuevaClave @BloqueCinco @general
  Escenario: Solicitar clave de afiliado
    Dado Confecamaras requiere generar nueva clave al afiliado
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese matricula y correo
    Entonces podra generar nueva clave