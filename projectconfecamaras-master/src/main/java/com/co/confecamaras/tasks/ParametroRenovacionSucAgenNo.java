package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.RobotCambioPestana;
import com.co.confecamaras.utils.RobotRecargarPestana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Switch;
import static com.co.confecamaras.userinterfaces.AccesoSistemaIntegradoInformacion.*;
import static com.co.confecamaras.userinterfaces.AccesoSistemaIntegradoInformacion.BTN_INGRESAR;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.BTN_PRIMERA_OPCION;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.TXT_BUSCAR_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTNS_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.ParametroRenovacionSucAgen.*;
import static com.co.confecamaras.userinterfaces.ParametroRenovacionSucAgen.BTN_SALIR_DATOS_USUARIOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ParametroRenovacionSucAgenNo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        //********************************* LOGIN ADMINISTRODAR ****************************************************//
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_DATOS_USUARIOS),
                Click.on(BTN_DATOS_USUARIOS),
                WaitInteractions.untilAppears(BTN_SALIR_DATOS_USUARIOS),
                Click.on(BTN_SALIR_DATOS_USUARIOS),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(TXT_USUARIO),
                Enter.theValue("ADMIN").into(TXT_USUARIO),
                WaitInteractions.untilAppears(TXT_IDENTIFICACION),
                Enter.theValue("11314260").into(TXT_IDENTIFICACION),
                WaitInteractions.untilAppears(TXT_CLAVE),
                Enter.theValue("2837279").into(TXT_CLAVE),
                WaitInteractions.untilAppears(BTN_INGRESAR),
                Click.on(BTN_INGRESAR)
        );

        //*********************************** CAMBIO PARAMETRO ***************************************************//
        for (int i = 0; i <= 50; i++){
            actor.attemptsTo(
                    ModalLoader.modalLoader(),
                    WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                    Click.on(BTN_MENU_LATERAL),
                    WaitSeconds.seconds(5)
            );
            if(actor.asksFor(ElementoElegible.para(BTNS_MENU_LATERAL))){
                int indexFila = i = 50;
                //break;
            } else {
                int indexFila = i+1;
                System.out.println("Espera implicita de 5 segundos " + indexFila + " repeticiones");
                actor.attemptsTo(
                        RobotRecargarPestana.toCloseTab()
                );
            }
        actor.attemptsTo(
                    WaitInteractions.untilBeEnable(TXT_BUSCAR_MENU_LATERAL),
                    Enter.theValue("Commonxx").into(TXT_BUSCAR_MENU_LATERAL),
                    Click.on(BTN_PRIMERA_OPCION),
                    Switch.toNewWindow(),
                    SelectFromOptions.byVisibleText("SI").from(MENU_DES_BLOQUEAR_PROPIETARIOS_NO_RENOVADOS_FORANEOS),
                    Click.on(BTN_GRABAR_COMMONXX),
                    Switch.toTheOtherWindow(),
                    RobotCambioPestana.toTab()
            );
        }
    }

    public static ParametroRenovacionSucAgenNo enCofecamaraSII (){
        return instrumented(ParametroRenovacionSucAgenNo.class);
    }
}
