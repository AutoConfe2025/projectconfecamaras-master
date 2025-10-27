# language: es

Característica: Reparto de Documentos

  @repartoDocumentos @BloqueData @general
  Escenario: Reparto de Documentos
    Dado Confecamaras requiere realizar el Reparto de Documentos
    Cuando Confecamaras ingresa en la aplicacion con las credenciales
    Y seleccione Bandejas, Registros Publicos, Reparto y Escaneo
    Entonces validara que todas las opciones realizan su funcion