package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.MantenimientoTresAdmin;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.DesistimientosDecretados.BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.MantenimientoTresAdmin.*;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoAlertas implements Task {

    private final String detalle;
    private final String numero = "1";

    public DoMantenimientoAlertas(String detalle) {
        this.detalle = detalle;
    }

    public static Performable mantenimientoAlerta(String detalle){
        return instrumented(DoMantenimientoAlertas.class, detalle);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Mantenimiento Alertas Administrativas").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow()
        );
        if(actor.asksFor(ElementoElegible.para(EDITAR_AA_BTN))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(EDITAR_AA_BTN),
                    Click.on(EDITAR_AA_BTN),
                    Enter.theValue(numero).into(MantenimientoTresAdmin.DETALLE_AA_INPUT),
                    Click.on(MantenimientoTresAdmin.GRABAR_AA_BTN),
                    WaitConstant.esperaConstante(),
                    Click.on(EDITAR_AA_BTN),
                    Clear.field(MantenimientoTresAdmin.DETALLE_AA_INPUT).then(Enter.theValue(detalle).into(MantenimientoTresAdmin.DETALLE_AA_INPUT)),
                    Click.on(MantenimientoTresAdmin.GRABAR_AA_BTN),
                    WaitConstant.esperaConstante()
            );
        }else {
            actor.attemptsTo(
                    Click.on(BTN_ADICIONAR_REGISTRO),
                    WaitInteractions.untilBeEnable(TXT_ID_ALERTAS),
                    Enter.theValue("10222628").into(TXT_ID_ALERTAS),
                    Enter.theValue("42105").into(TXT_MATRICULA_ALERTAS),
                    Enter.theValue("PRUEBA DE ALERTA AUTOMATIZADA").into(TXT_DETALLE_ALERTAS),
                    Clear.field(TXT_VALOR_ALERTAS),
                    Enter.theValue("50000").into(TXT_VALOR_ALERTAS),
                    Click.on(BTN_SERVICIO),
                    Switch.toFrame(0),
                    WaitInteractions.untilBeEnable(BTN_SERVICIO_ALERTAS),
                    Click.on(BTN_SERVICIO_ALERTAS),
                    Switch.toParentFrame(),
                    WaitInteractions.untilBeEnable(MENU_DES_TIPO_ALERTA),
                    SelectFromOptions.byVisibleText("1.- Menor valor (resta)").from(MENU_DES_TIPO_ALERTA),
                    WaitSeconds.seconds(5),
                    Click.on(BTN_GUARDAR_ALERTA)
            );
        }
    }
}
