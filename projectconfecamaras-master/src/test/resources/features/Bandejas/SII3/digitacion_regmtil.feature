# language: es
Característica: Validar el registro Mercantil pendientes de digitación

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @DigitacionRegMtil @Bandejas @SII4
  Escenario: Digitacion registro mercantil
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Digitacion RegMtil
    Entonces validara las acciones de mercantil pendiente relacionados al codigo de barras 744732