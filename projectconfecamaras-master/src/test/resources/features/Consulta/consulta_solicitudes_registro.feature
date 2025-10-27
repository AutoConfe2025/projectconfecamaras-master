# language: es

Característica: Consulta Solicitudes Registro

  @consultaSolicitudesRegistro @BloqueDos @general
  Escenario: Consulta Solicitudes Registro
    Dado Confecamaras requiere realizar la Consulta Solicitudes Registro
    Cuando ingresa las credenciales correctas en el aplicativo
    Y seleccione el modulo Solicitudes Registro para realizar una busqueda
    Entonces validara que la consulta se realizo de manera exitosa