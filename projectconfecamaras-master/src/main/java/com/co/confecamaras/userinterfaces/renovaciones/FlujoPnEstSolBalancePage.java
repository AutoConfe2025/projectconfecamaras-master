package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoPnEstSolBalancePage {

    public static final Target PARAMETRO_SOL_BALANCE_CAJEROS_TODAS = Target.the("parametro actualizar solicitud balance")
            .locatedBy("//select[@id='RENOVACION_SOLICITAR_BALANCE_TODAS_CAJEROS']");

    public static final Target BOTON_GRABAR_PARAMETROS = Target.the("boton de grabar parametro")
            .locatedBy("//a[contains(text(),'GRABAR CAMBIOS')]");

    public static final Target BOTON_CERRAR_GRABAR_PARAMETROS = Target.the("boton cerrar grabar parametro correctamente")
            .locatedBy("(//button[contains(text(),'Cerrar')])[1]");

    //FLUJO CERRAR SESION

    public static final Target BOTON_CERRAR_DATOS_USUARIO = Target.the("boton datos de usuario")
            .locatedBy("//button[@id='btn_datos_usuario']");

    public static final Target BOTON_CERRAR_SESION_SALIR = Target.the("boton cerrar sesion salir")
            .locatedBy("(//a[@class='txt_cerrarS'])[2]");

}
