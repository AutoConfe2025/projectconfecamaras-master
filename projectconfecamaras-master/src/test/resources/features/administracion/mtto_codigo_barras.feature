# language: es

Característica:Mtto Codigos Barras


  @mttoCodBarras @BloqueSeis @general
  Escenario: Mtto Codigos Barras
    Dado Confecamaras requiere editar la informacion de un codigo de barras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al apartado de mtto codigo de barras e ingrese la nueva informacion
    Entonces podra visualizar los cambios realzados en el codigo de barras