# language: es

Característica: Carga de metas y presupuestos

  @cargaPresupuesto @BloqueCinco @general
  Escenario: Cargar tablero de metas y presupuesto
    Dado Confecamaras requiere cargar un archivo de metas y presupuestos
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y busque la seccion de cargas y suba el archivo
    Entonces podra ver que la informacion cargo exitosamente