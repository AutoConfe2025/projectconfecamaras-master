# language: es

Característica: Mtto Bas TipoDoc Hom Rues

  @tipoDocRues @BloqueSeis @general
  Escenario: Mtto Bas TipoDoc Hom Rues
    Dado Confecamaras requiere consultar o agregar un valor de tipo de documento
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de Mtto Bas TipoDoc Hom Rues y agregue un valor o consulte
    Entonces podra visualizar el valor del documento o solo visualizar los existentes