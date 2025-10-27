# language: es

Característica: Renovacion Matricula PN ya Renovada - Reliquidacion / Renovacion Matricula Sociedad /
  Renovacion Matricula Sucursal / Renovacion Matricula Agencia / Renovacion Matricula PN Afiliada /
  Renovacion Matricula PN Baja Activos / Renovacion Matricula Sociedad Baja Activos /
  Renovacion Matricula PN Estado Inactivo / Renovacion Matricula PJ Estado Inactivo / Renovacion ESADL ORG Doce /
  Renovacion ESADL ORG Doce / Renovacion Matricula Actividad No Comercial / Renovacion Matricula Actividad No Comercial Comercial

  @renovacionMatriculaPnRenovada @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion Matricula PN ya Renovada - Reliquidacion
    Dado Confecamaras requiere realizar la Renovacion de matricula PN ya renovada
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione la consulta e ingrese el numero de renovacion
    Entonces realizara la renovacion de matricula pn renovada

  @renovacionMatriculaSociedad @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion Matricula Sociedad
    Dado Confecamaras requiere realizar la Renovacion matricula sociedad
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la consulta e ingrese el numero de la informacion
    Entonces realizara la renovacion de la matricula sociedad


  @renovacionMatriculaSucursal @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion Matricula Sucursal
    Dado Confecamaras requiere realizar la Renovacion Matricula Sucursal
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la consulta de la matricula e ingrese el numero de la informacion
    Entonces realizara la renovacion de la matricula sucursal

  @renovacionMatriculaAgencia @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion Matricula Agencia
    Dado Confecamaras requiere realizar la Renovacion Matricula Agencia
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la consulta de la matricula e ingrese el numero de la matricula
    Entonces realizara la renovacion de la matricula agencia


  @renovacionMatriculaAfiliada @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion Matricula PN Afiliada
    Dado Confecamaras requiere realizar la Renovacion Matricula PN Afiliada
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la consulta de la matricula e ingrese la informacion del numero de la matricula
    Entonces realizara la renovacion de la matricula afiliada


  @renovacionMatriculaBajaActivos @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion Matricula PN Baja Activos
    Dado Confecamaras requiere realizar la Renovacion Matricula PN Baja Activos
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la matricula e ingrese la informacion del numero de la matricula
    Entonces realizara la renovacion de la matricula baja activos


  @renovacionMatriculaSociedadBajaActivos @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion Matricula Sociedad Baja Activos
    Dado Confecamaras requiere realizar la Renovacion Matricula Sociedad Baja Activos
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la matricula e ingrese el numero de la matricula
    Entonces realizara la renovacion de la matricula sociedad baja activos

  @renovacionEsadlOrgDoce @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion ESADL ORG Doce
    Dado Confecamaras requiere realizar la Renovacion ESADL ORG Doce
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la opcion matricula e ingrese el numero de matricula
    Entonces realizara la renovacion esadl org Doce


  @renovacionEsadlOrgCatorce @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion ESADL ORG Catorce
    Dado Confecamaras requiere realizar la Renovacion ESADL ORG Catorce
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la opcion de matricula e ingrese el numero de matricula
    Entonces realizara la renovacion esadl org catorce


  @renovacionMatriculaPNEstadoInactivo @BloqueData1 @general @renovacionMercantil
  Escenario: Renovacion Matricula PN Estado Inactivo
    Dado Confecamaras requiere realizar la Renovacion Matricula PN Estado Inactivo
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la opcion matricula e ingrese el numero de la matricula
    Entonces realizara la renovacion de la matricula pn estado inactivo

  @renovacionMatriculaPJEstadoInactivo @BloqueData2 @general @renovacionMercantil
  Escenario: Renovacion Matricula PJ Estado Inactivo
    Dado Confecamaras requiere realizar la Renovacion Matricula PJ Estado Inactivo
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y seleccione la opcion matricula e ingrese el numero de la matricula correspondiente
    Entonces realizara la renovacion de la matricula pj estado inactivo

  @renovacionMatriculaActividadNoComercial @BloqueData2 @general @renovacionMercantil
  Escenario: Renovacion Matricula Actividad No Comercial
    Dado Confecamaras requiere realizar la Renovacion Matricula Actividad No Comercial
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y escribe el numero de matricula en la opcion matricula
    Entonces realizara la renovacion matricula actividad no comercial

  @renMatriculaActNoComercialComercial @BloqueData2 @general @renovacionMercantil
  Escenario: Renovacion Matricula Actividad No Comercial Comercial
    Dado Confecamaras requiere realizar una Renovacion Matricula Actividad No Comercial Comercial
    Cuando Confecamaras ingrese a la aplicacion con sus credenciales correctas
    Y escriba el numero de matricula en la opcion matricula
    Entonces realizara la renovacion matricula actividad no comercial comercial

  @RenovacionMatriculaVariosanios @BloqueData2 @general
  Escenario: Renovacion Matricula Varios anios
    Dado Confecamaras requiere realizar una Renovacion varios anios
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y haga renovacion omitiendo un anio anterior
    Entonces debera ver un mensaje de aviso que no es posible realizar la renovacion