# language: es

Característica: Exportar Estructura SII

  @exportarEstructuraSII @BloqueSeis @general
  Escenario: Exportar Estructura SII
    Dado Confecamaras requiere exportar la estructura del SII
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMIN      |
      | Identificacion | 11314260   |
      | Contraseña     | 2837279    |
    Y haga la consulta
    Entonces podra visualizar el enlace de descarga