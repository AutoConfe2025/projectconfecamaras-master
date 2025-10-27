# language: es

Característica: Solicitud Certificado Persona Natural - Matricula / Solicitud Certificados ESADL / Solicitud Certificados ESADL Libros Existencia /
  Solicitud Certificados Persona Juridica - Existencia / Solicitud Certificados Persona Juridica - Matricula y Existencia/
  Solicitud Certificados Proponentes

  @solicitudCertificadoMatricula @BloqueCuatro @general
  Escenario: Solicitud Certificado Persona Natural - Matricula
    Dado Confecamaras requiere realizar la Solicitud Certificado Persona Natural - Matricula
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione la consulta e ingrese el numero de matricula comenzara con la solicitud
    Entonces podra visualizar el soporte generado

  @solicitudCertificadoEsadl @BloqueCuatro @general
  Escenario: Solicitud Certificados ESADL
    Dado Confecamaras requiere realizar la Solicitud Certificado ESADL
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione la consulta e ingrese el numero de matricula comenzara con la solicitud ESADL
    Entonces podra visualizar el soporte generado

  @solicitudCertificadoEsadlLibros @BloqueCuatro @general
  Escenario: Solicitud Certificados ESADL Libros Existencia
    Dado Confecamaras requiere realizar la Solicitud Certificado ESADL Libros/Existencia
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione la consulta e ingrese el numero de matricula comenzara con la solicitud ESADL Libros
    Entonces podra visualizar el soporte generado

  # NP

  @personaJuridicaExistencia @BloqueCuatro @general
  Escenario: Solicitud Certificados Persona Juridica - Existencia
    Dado Confecamaras requiere realizar la Solicitud Certificados Persona Juridica - Existencia
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales correctas
    Y seleccione la consulta e ingrese el numero de matricula correspondiente
    Entonces podra visualizar el soporte generado

  @personaJuridicaMatriculaExistencia @BloqueCuatro @general
  Escenario: Solicitud Certificados Persona Juridica - Matricula y Existencia
    Dado Confecamaras requiere realizar la Solicitud Certificados Persona Juridica - Matricula y Existencia
    Cuando Confecamaras ingresa en la aplicacion con sus credenciales correctas
    Y seleccione la consulta por matricula e ingrese el numero correspondiente
    Entonces podra visualizar el soporte generado

  @proponentes @BloqueCuatro @general
  Escenario: Solicitud Certificados Proponentes
    Dado Confecamaras requiere realizar la Solicitud Certificados Proponentes
    Cuando Confecamaras ingresa en la aplicacion con sus credenciales asignadas
    Y seleccione la consulta por proponente e ingrese el numero correspondiente
    Entonces podra visualizar el soporte generado