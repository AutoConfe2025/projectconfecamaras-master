# language: es

Característica: revision de ingresos por municipio

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionIngresosPorMunicipio @SII4
  Escenario: valido el flujo de ingresos por municipio
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Ingresos por Municipio"
    Entonces valido el flujo de ingresos por municipio "2025-06-01" "2025-06-03"