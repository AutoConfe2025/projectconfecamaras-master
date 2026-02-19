# language: es

Característica: Certificados especiales

  @tificadosespecialescer @BloqueCinco @general
  Escenario: Certificados especiales
    Dado Confecamaras requiere generar un certificado especial
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y Suna los anexos y henere el certificado
    Entonces podra ver la solicitud fue hecha correctamente