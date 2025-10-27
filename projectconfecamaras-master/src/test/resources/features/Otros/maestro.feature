# language: es

Característica: Maestro Alcaldias Cae / Maestro Clases Vinculos / Maestro de Rutas / Maestro de Rutas Pasos Ruta /
  Maestro de Rutas Digitacion / Maestro de Devoluciones / Maestro Vinculos

  @alcaldiasCae @BloqueTres @general
  Escenario: Maestro Alcaldias Cae
    Dado Confecamaras requiere realizar el maestro alcaldias cae
    Cuando Confecamaras ingresa a la aplicacion con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de alcaldias CAE
    Entonces validara que las opciones realizan su funcion correspondiente

  # @clasesVinculos
  Escenario: Maestro Clases Vinculos
    Dado Confecamaras requiere realizar el maestro clases vinculos
    Cuando Confecamaras ingresa a la aplicacion con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos admimistracion, Maestro clases vinculos
    Entonces validara que se realizo la edicion del maestro clases vinculos

  @rutas @BloqueTres @general
  Escenario: Maestro de Rutas
    Dado Confecamaras requiere realizar el Maestro de Rutas
    Cuando Confecamaras ingresa a la aplicacion con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de Rutas
    Entonces validara que se guarda la informacion correctamente

  @pasosRuta @BloqueTres @general
  Escenario: Maestro de Rutas Pasos Ruta
    Dado Confecamaras requiere ejecutar el Maestro de Rutas Pasos Ruta
    Cuando Confecamaras ingresa a la aplicacion con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de Rutas - Pasos ruta
    Entonces validara que se edita y se guarda la informacion correctamente

  @digitacion @BloqueTres @general
  Escenario: Maestro de Rutas Digitacion
    Dado Confecamaras requiere ejecutar el Maestro de Rutas Digitacion
    Cuando Confecamaras ingresa a la aplicacion con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de Rutas - Digitacion
    Entonces validara que la opcion edita y se guarda la informacion correctamente

  @devoluciones @BloqueTres @general
  Escenario: Maestro de Devoluciones
    Dado Confecamaras requiere ejecutar el Maestro de Devoluciones
    Cuando Confecamaras ingresa a la aplicacion con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de Devoluciones
    Entonces validara que la opcion edita y guarda la informacion correctamente

  @vinculos @BloqueTres @general
  Escenario: Maestro Vinculos
    Dado Confecamaras requiere ejecutar el Maestro Vinculos
    Cuando Confecamaras ingresa a la aplicacion con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos admimistracion, Maestro Vinculos
    Entonces validara que la opciones permiten editar y grabar la informacion correctamente