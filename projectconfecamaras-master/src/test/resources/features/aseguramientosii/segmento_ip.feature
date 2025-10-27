# language: es

Característica: Segmento IP

  @segmentoIp @BloqueSeis @general
  Escenario:Segmento IP
    Dado Confecamaras requiere consultar las ip disponibles
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al apartado de segmento ip
    Entonces podra visualizar las ip disponibles