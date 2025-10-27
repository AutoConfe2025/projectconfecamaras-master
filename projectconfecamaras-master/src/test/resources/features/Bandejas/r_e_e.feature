# language: es
Característica: Validar que se genere el Reporte E.E
  como usuario quiero validar la generacion de un documento

  @ReporteEE @BandejaRegistrosPublicos @BloqueSiete @general
  Escenario: Validar el Reporte E.E
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Auditorías R.E.E. que abrira una nueva ventana
    Entonces exportara el archivo excel y finaliza validando