# language: es
Característica: Validar que me permita extraer el
  archivo de recibos no facturables

  @DetalladoRecibosNoFacturable @BloqueSiete @general
  Escenario: Validar recibos no facturables
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | admin    |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Detallado Recibos No Facturables que abrira una nueva ventana
    Y enviara una fecha inicial 2024-11-02 y fecha final 2024-11-06 dando click en generar
    Entonces decargara el documento verificando que tenga contenido