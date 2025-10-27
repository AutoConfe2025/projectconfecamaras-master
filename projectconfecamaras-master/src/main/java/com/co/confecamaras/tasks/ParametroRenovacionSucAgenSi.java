package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.RobotCambioPestana;
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
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.ParametroRenovacionSucAgen.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ParametroRenovacionSucAgenSi implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSCAR_MENU_LATERAL),
                Enter.theValue("Commonxx").into(TXT_BUSCAR_MENU_LATERAL),
                Click.on(BTN_PRIMERA_OPCION),
                Switch.toNewWindow(),
                SelectFromOptions.byVisibleText("NO").from(MENU_DES_BLOQUEAR_PROPIETARIOS_NO_RENOVADOS_FORANEOS),
                Click.on(BTN_GRABAR_COMMONXX),
                Switch.toTheOtherWindow(),
                RobotCambioPestana.toTab()
        );

        //************************************** LOGIN CAJERO ****************************************************//

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_DATOS_USUARIOS),
                Click.on(BTN_DATOS_USUARIOS),
                WaitInteractions.untilAppears(BTN_SALIR_DATOS_USUARIOS),
                Click.on(BTN_SALIR_DATOS_USUARIOS),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(TXT_USUARIO),
                Enter.theValue("CAJAQA").into(TXT_USUARIO),
                WaitInteractions.untilAppears(TXT_IDENTIFICACION),
                Enter.theValue("11314260").into(TXT_IDENTIFICACION),
                WaitInteractions.untilAppears(TXT_CLAVE),
                Enter.theValue("2837279").into(TXT_CLAVE),
                WaitInteractions.untilAppears(BTN_INGRESAR),
                Click.on(BTN_INGRESAR),
                WaitSeconds.seconds(2)
        );
    }

    public static ParametroRenovacionSucAgenSi enCofecamaraSII (){
        return instrumented(ParametroRenovacionSucAgenSi.class);
    }
}
