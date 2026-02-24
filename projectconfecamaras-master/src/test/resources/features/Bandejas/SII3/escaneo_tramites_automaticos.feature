# language: es
Característica: Escaneo de tramites automaticos
  como usuario quiero observar el escaneo de tramites automaticos


  @EscaneoTramitesAutomaticos @BandejaRegistrosPublicos @BloqueSiete @general
  Escenario: Validar el escaneo de tramites automaticos
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Escaneo trámites automáticos que abrira una nueva ventana
    Entonces validara las acciones de escaneo de tramites al codigo de barras 7003
