# language: es
Característica: Validar caracteristicas de Recursos de reposición

  @RecursosReposicion @BloqueOcho
  Escenario: Validar recurso de reposicion
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Recursos de reposición que abrira una nueva ventana
    Entonces validara las acciones de recursos de reposicion relacionados al codigo de barras 701509