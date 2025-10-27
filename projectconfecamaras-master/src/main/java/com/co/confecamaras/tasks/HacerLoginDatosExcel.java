package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.AccesoSistemaIntegradoInformacion.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerLoginDatosExcel implements Task {

    private String camara;
    private String usuario;
    private String identificacion;
    private String clave;

    public HacerLoginDatosExcel(String camara, String usuario, String identificacion, String clave) {
        this.camara = camara;
        this.usuario = usuario;
        this.identificacion = identificacion;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(TXT_NUMERO_CAMARA),
                Enter.theValue(camara).into(TXT_NUMERO_CAMARA),
                WaitInteractions.untilAppears(BTN_BUSCAR),
                Click.on(BTN_BUSCAR),
                WaitInteractions.untilAppears(BTN_CAMARA_VEINTE),
                Click.on(BTN_CAMARA_VEINTE),
                WaitInteractions.untilAppears(TXT_USUARIO),
                Enter.theValue(usuario).into(TXT_USUARIO),
                WaitInteractions.untilAppears(TXT_IDENTIFICACION),
                Enter.theValue(identificacion).into(TXT_IDENTIFICACION),
                WaitInteractions.untilAppears(TXT_CLAVE),
                Enter.theValue(clave).into(TXT_CLAVE),
                WaitInteractions.untilAppears(BTN_INGRESAR),
                Click.on(BTN_INGRESAR)
        );
    }

    public static HacerLoginDatosExcel enConfecamaraSII(String camara, String usuario, String identificacion, String clave){
        return instrumented(HacerLoginDatosExcel.class, camara, usuario, identificacion, clave);
    }
}
