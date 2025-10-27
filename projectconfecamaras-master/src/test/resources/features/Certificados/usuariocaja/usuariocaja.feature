# language: es

Característica: Compra certificado con cargo a gasto administrativo

  @compracertificadogastodministrativo @BloqueCinco @general
  Escenario: comprar certificado a gasto administrativo
    Dado Confecamaras requiere comprar un certificado a gasto administrativo
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |

    Y haga la compra y genere la facturacion
    Entonces podra ver no tendra costo el certificado