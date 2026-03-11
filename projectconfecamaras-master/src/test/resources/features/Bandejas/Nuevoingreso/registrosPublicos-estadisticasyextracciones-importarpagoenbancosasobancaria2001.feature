# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Importar pago en bancos Asobancaria 2001

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @ImportarPagoEnBancosAsobancaria2001 @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Importar pago en bancos Asobancaria 2001
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Importar pago en bancos Asobancaria 2001
    Entonces realizara acciones de Importar Pago En Bancos Asobancaria 2001
