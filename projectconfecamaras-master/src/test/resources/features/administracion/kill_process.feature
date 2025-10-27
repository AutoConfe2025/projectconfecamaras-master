# language: es

Característica: Kill Process

  @killProcess @BloqueSiete @general
  Escenario: Kill Process
    Dado Confecamaras requiere terminar una tarea
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de kill process y selecione el proceso a finalizar
    Entonces podra visualizar que el proceso ha sido finalizado