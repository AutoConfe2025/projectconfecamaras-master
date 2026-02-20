# language: es
Característica: Validar el registro Mercantil pendientes de digitación

  @DigitacionRegMtil @BloqueData3
  Escenario: Validar digitacion registro mercantil pendiente
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Digitación RegMtil que abrira una nueva ventana
    Entonces validara las acciones de mercantil pendiente relacionados al codigo de barras 699