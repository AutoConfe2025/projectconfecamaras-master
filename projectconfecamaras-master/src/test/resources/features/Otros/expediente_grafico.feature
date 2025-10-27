# language: es

Característica: Expediente Grafico

  @ExpedienteGrafico
  Escenario: Validar Expediente Grafico
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese los datos dseados en el campo correspondiente
    Entonces podra ver el expediente