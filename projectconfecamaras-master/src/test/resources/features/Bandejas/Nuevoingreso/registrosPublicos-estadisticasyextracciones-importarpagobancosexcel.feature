# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Importar pago bancos excel

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @ImportarPagoBancosExcel
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Importar pago bancos excel
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Importar pago en bancos Renovación (excel)
    Entonces realizara acciones de Importar pago bancos excel
