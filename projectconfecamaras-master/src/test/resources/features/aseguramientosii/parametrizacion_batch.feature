# language: es

Característica: Parametrizacion Batch

  @parametrizacionBatch @BloqueSeis @general
  Escenario:Parametrizacion Batch
    Dado Confecamaras requiere consultar o editar un proceso batch
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al apartado de procesos batch y realice la accion necesaria
    Entonces podra visualizar los parametros existentes