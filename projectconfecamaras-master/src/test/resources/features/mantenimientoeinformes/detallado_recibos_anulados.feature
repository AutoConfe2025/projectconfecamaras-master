# language: es
Característica: Validar que me permita extraer el
  archivo de recibos anulados

  @DetalladoRecibosAnulados @BloqueSiete @general
  Escenario: Validar recibos anulados
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | admin    |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Detallado Recibos Anulados que abrira una nueva ventana
    Entonces generara el documento de recibos anulados