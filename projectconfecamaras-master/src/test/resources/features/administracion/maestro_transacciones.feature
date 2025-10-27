# language: es

Característica: Maestro Transacciones - orden


  @maestroTransaccionesOrdem @BloqueSeis @general
  Escenario: Maestro Transacciones - orden
    Dado Confecamaras requiere editar la informacion de un maestro transacciones
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN    |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese al apartado de maestro transacciones e ingrese la info
    Entonces podra visualizar los cambios realzados en el maestro transacciones ordem