# language: es

Característica: Mtto Cert Especiales

  @mttoCertEspeciales @BloqueSeis @general
  Escenario: Mtto Cert Especiales
    Dado Confecamaras requiere editar info de un certificado especial
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de mtto cert especiales e ingrese la infp
    Entonces podra visualizar la nueva info agregada del certificado