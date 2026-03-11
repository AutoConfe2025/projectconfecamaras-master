# language: es
Característica: Validar la sincronizacion de alarma de registro
  como usuario quiero validar que me muestre informacion pendiente

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @AlarmasRegistro @Bandejas @SII4
  Escenario: alarma registro
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Alarmas Registro
    Entonces validara la sincronizacion e informacion encontrada