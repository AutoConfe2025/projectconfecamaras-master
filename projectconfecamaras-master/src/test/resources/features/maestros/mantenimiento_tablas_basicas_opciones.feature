# language: es

Característica: valida el modulo de mentanimiento maestros / claves

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  #@mantenimiento_tablas_basicas_maestro_claves_valor @SII4
  Escenario: ingreso a la bandeja inscripcion no esta en firme XML
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Maestro de Claves - Valor"
    Entonces Adiciono un registro nuevo en claves
    Y hago el proceso de modificacion y eliminacion
