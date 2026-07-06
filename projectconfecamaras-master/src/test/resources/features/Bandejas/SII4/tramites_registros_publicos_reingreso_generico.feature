# language: es
Característica: Validar Proceso Tramites registros publicos reingreso generico



  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Tramitesderegistrospublicosreingresogenerico @Bandejas @SII4
  Escenario: Tramites registros publicos reingreso generico
    Y ingreso al sistema SII3 como analista
    Entonces validar las acciones de tramites de registros publicos Reingreso generico con codigo de barras  "747127" "05"