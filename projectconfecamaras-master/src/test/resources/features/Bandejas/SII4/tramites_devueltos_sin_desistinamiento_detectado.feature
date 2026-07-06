# language: es
Característica: Validar Proceso tramites devueltos sin destinamineto detectados


  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @TramitesdevueltosSindesitinamientodetectadoPDF @Bandejas @SII4
  Escenario: Tramites devueltos sin destinamiento detectado
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "742982" "06" "Tramites Devueltos SIN Desistimiento Decretado"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaDesistimientosAgregarComentario @Bandejas @SII4
  Escenario: ingreso a la bandeja recursos agergar comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "742982" "06" "Tramites Devueltos SIN Desistimiento Decretado"
    Entonces realizo la validacion de agregar un comentario

  @ValidacionBandejaDesistimientosArchivar @Bandejas @SII4
  Escenario: ingreso a la bandeja archivar
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "742982" "06" "Tramites Devueltos SIN Desistimiento Decretado"
    Entonces  realizo el proceso para archivar el tramite "742982" "06"

#  se comenta codigo inicial de automatizacion por validacion de refactorizacion
#    Cuando Buscamos por el boton principal de busqueda la bandeja Tramites Devueltos SIN Desistimiento Decretado
#    Entonces validar las acciones de tramites   devueltos sin desistimiento detectado con codigo de barras "744143" "06"