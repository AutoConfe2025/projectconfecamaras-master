# language: es

Característica: Bandeja (R) Ley 1780 + PONAL + NO-AUT / Bandeja (R) Ley 1780 + PONAL + NO-AUT Asentamiento completo


  @BandejaPonalSinAsentamiento @BloqueData3 @general
  Escenario: Bandeja PONAL sin asentamiento
    Dado Confecamaras requiere hacer una devolucion
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 16       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |

    Y ingrese la informacion necesaria para ser cargada
    Entonces podra ver el registro exitoso

  @BandejaPonalConAsentamiento @BloqueData3 @general
  Escenario: Bandeja PONAL con asentamiento
    Dado Confecamaras requiere hacer un asentamiento completo
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 16       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |

    Y ingrese la informacion necesaria para el asentamiento
    Entonces podra ver el asentamiento exitoso