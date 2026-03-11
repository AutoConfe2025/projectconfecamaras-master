# language: es

Característica: revision de proceso de registros publicos servicios RUES

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoAdministracionServiciosRues @SII4
  Escenario: valido el flujo de administracion de servicios Rues
    Y ingreso al sistema SII3 como usuario publico16
    Cuando ingreso solo bandeja "Servicios RUES"
    Entonces lleno el formulario de mantenimiento de servicios RUES