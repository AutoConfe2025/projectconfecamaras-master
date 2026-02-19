# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Consultas internas - Georeferenciar Censo Empresarial (Armenia)

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @GeoreferenciarCensoEmpresarial_Armenia @SII4
  Escenario:  Registros Públicos - Consultas internas - Georeferenciar Censo Empresarial (Armenia)
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Georeferenciar Censo Empresarial (Armenia)
    Entonces realizara acciones de Georeferenciar Censo Empresarial Armenia
