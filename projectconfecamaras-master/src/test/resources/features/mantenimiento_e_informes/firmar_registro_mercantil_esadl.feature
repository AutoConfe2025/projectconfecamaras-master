# language: es

Característica: realiza el flujo de firmar registrro mercantil Esadl

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @RealizoElProcesoDeRegistroMercantilEdasl @SII4
  Escenario: se realiza el flujo de firmar registro mercantil Esadl
    Y ingreso al sistema SII3 como usuario admin27
    Cuando ingreso solo bandeja "Firmar RegMercantil/Esadl"
    Entonces realizo el flujo de validacio de firma de registro