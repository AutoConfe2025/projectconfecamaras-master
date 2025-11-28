# language: es

Característica: revision ingresos por servio

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionIngresoPorServicio
  Escenario: valido el flujo con el boton de notificar
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Ingresos por Servicio"
    Entonces realizo la validacion del modulo ingreso por servicio