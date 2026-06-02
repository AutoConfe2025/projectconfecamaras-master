# language: es
Característica: Validar caracteristicas de Bandeja de asesorias
  como usuario quiero validar la bandeja de asesorias

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @BandejaAsesorias @Bandejas @SII4
  Escenario: Validar bandeja de asesorias
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Bandeja de asesorias
    Entonces validara las acciones de asesorias relacionados al id 337458