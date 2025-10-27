# language: es

Característica: Repositorio Imagenes

  #@repositorioImagenes
  Escenario:Repositorio Imagenes
    Dado Confecamaras requiere consultar o descargar una imagen
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al repositorio de imagenes
    Entonces podra visualizar los repositorios existentes