# language: es

Característica: Desbloqueo Background

  #@desbloqueoBackground
  Escenario: Desbloqueo Background
    Dado Confecamaras requiere terminar un proceso de generacion de data
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de desbloqueo background y selecione el proceso
    Entonces podra visualizar que el proceso ya no existe