# language: es
Característica: Tramite de regingresados
  como usuario quiero observar el reparto de tramites reingresados


  @TramitesReingresados @BandejaRegistrosPublicos @BloqueSiete @general
  Escenario: Validar el tramite de reingresados
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Tramites reingresados que abrira una nueva ventana
    Entonces validara las acciones de tramites reingresados al codigo de barras 6996
