# language: es

Característica: revision de proceso de registros publicos servicios

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @Servicios @SII4
  Escenario: valido el flujo de
    Y ingreso al sistema SII3 como usuario publico16
    Cuando ingreso solo bandeja "Servicios" seleccionada "servicios" "3"
    Y lleno el formulario de agregar servicio
    Entonces realiza las validaciones en el modulo