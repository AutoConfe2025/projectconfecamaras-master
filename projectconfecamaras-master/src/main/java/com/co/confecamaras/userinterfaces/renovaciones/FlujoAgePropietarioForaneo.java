package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoAgePropietarioForaneo {

    public static final Target LISTA_SELECCION_BLOQUEO_PROPIETARIO_NO_RENOADO_FORANEO  = Target.the("lista de seleccion de bloqueo propietario foraneo")
            .locatedBy("//select[@id='BLOQUEAR_PROPIETARIOS_NO_RENOVADOS_FORANEOS']");

    public static final Target BOTON_DE_GRABAR_CAMBIOS  = Target.the("boton de grabar cambios")
            .locatedBy("//a[contains(text(),'GRABAR CAMBIOS')]");

    public static final Target BOTON_CERRAR_MENSAJE_GRABADO_EXITOSO  = Target.the("boton de mensaje exitoso grabar cambios")
            .locatedBy("(//button[contains(text(),'Cerrar')])[1]");
}
