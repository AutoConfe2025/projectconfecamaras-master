# language: es
Característica: Validar el registro Esadl pendientes de digitación

  @DigitacionRegEsadl @BloqueData3
  Escenario: Validar digitacion pendiente Esadl
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Digitación RegEsadl que abrira una nueva ventana
    Entonces validara las acciones de Esadl pendiente relacionados al codigo de barras 701283