# language: es

Característica: Modulos API Integracion Rest Full / Usuarios API Integracion Rest Full

  @modulosApiIntegracionRestFull @BloqueDos @general
  Escenario: Modulos API Integracion Rest Full
    Dado Confecamaras requiere realizar los Modulos API Integracion Rest Full
    Cuando ingresa en la aplicacion Sii3 con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos administracion, Modulos API de Integracion Rest Full
    Entonces validara que la activacion e inactivacion se realizo correctamente

  @usuariosApiIntegracionRestFull @BloqueDos @general
  Escenario: Usuarios API Integracion Rest Full
    Dado Confecamaras requiere realizar los Usuarios API Integracion Rest Full
    Cuando ingresa en la aplicacion Sii3 con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos administracion, Usuarios API de Integración Rest Full
    Entonces validara que las opciones de los usuarios funcionan correctamente