# language: es
Característica: Validar que me permita extraer el
  archivo de detallados gastos afiliados

  @DetalladoGastosAfiliados @BloqueSiete @general
  Escenario: Validar gastos afiliados
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | admin    |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Detallado Gastos Afiliados que abrira una nueva ventana
    Entonces generara el documento de gastos afiliados