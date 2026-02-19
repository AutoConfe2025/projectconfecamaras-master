# language: es

Característica: revision de proceso de registros publicos administracion tablas

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoAdministracionTablas
  Escenario: valido el flujo de administracion de tablas
    Y ingreso al sistema SII3 como usuario publico16
    Cuando ingreso solo bandeja "tablas (SII)"
    Entonces se realiza el proceso adminitracion de tablas