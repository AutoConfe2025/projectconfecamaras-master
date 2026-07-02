# language: es
Característica: Validar el registro Esadl pendientes de digitación

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @DigitacionRegEsadl @Bandejas @SII4
  Escenario: Digitacion registro Esadl
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Digitacion RegEsadl
    #Entonces validara las acciones de mercantil pendiente relacionados al codigo de barras 745517
    Entonces validara las acciones de mercantil pendiente relacionados al codigo de barras 74





