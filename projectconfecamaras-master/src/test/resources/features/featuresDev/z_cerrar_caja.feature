# language: es

Característica: Cerrar Caja

  @cerrarCaja @BloqueCuatro @general
  Escenario: Cerrar Caja
    Dado Confecamaras requiere cerrar la caja
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Gestion de caja
    Entonces cerrara la caja indicando el valor recaudado
    Y validara que se haya realizado el cierre exitoso de la caja