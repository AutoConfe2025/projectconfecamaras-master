package com.co.confecamaras.userinterfaces.Bandejas;

import net.serenitybdd.screenplay.targets.Target;

public class CalendarioPage {

    // Inputs y Abrir Panel
    public static final Target INP_FECHA_INICIAL = Target.the("Input Fecha Inicial")
            .locatedBy("//*[@id='fechaInicial']/input");

    // Navegación del Calendario
    public static final Target BTN_MES_ANTERIOR = Target.the("Botón Mes Anterior")
            .locatedBy("//*[@id='fechaInicial_panel']/div/div/div[1]/button[1]/*[name()='svg']");

    public static final Target BTN_MES_SIGUIENTE = Target.the("Botón Mes Siguiente")
            .locatedBy("//*[@id='fechaInicial_panel']/div/div/div[1]/button[2]/*[name()='svg']");

    // Display Mes y Año (El xpath que proporcionaste selecciona el mes, por lo que usaremos ese)
    // El texto del mes/año puede estar en el atributo textContent del botón.
    public static final Target TXT_MES_ANIO_ACTUAL = Target.the("Mes y Año Actual del Panel")
            .locatedBy("//*[@id='fechaInicial_panel']/div/div/div[1]/div/button[1]");

    // Target Dinámico para el DÍA (CRUCIAL: Busca el span con el texto del día)
    public static final Target DIA_CALENDARIO = Target.the("Día {0} en el calendario")
            .locatedBy("//*[@id='fechaInicial_panel']//span[text()='{0}']");
}