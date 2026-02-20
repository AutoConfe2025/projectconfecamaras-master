# language: es
Característica: Validar que permita ver las noticias
  no publicadas en RUE

  @NoNoticiasEnRUE @BloqueSiete @general
  Escenario: Validar noticias no publicadas RUE
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Noticias No Publicadas En RUE que abrira una nueva ventana
    Entonces buscara el registro RP01-35566-1 para validar las acciones de Noticias RUE

