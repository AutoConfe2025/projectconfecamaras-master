package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
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
import static com.co.confecamaras.userinterfaces.MantenimientoTresAdmin.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMantenimientoAlertaRegistro implements Task {

    private final String detalle;
    private final String numero = "1";
    private final String id = "30270951";
    private final String matricula = "100058";
    private final String tipoAlerta = "1.- Informativa";

    public DoMantenimientoAlertaRegistro(String detalle) {
        this.detalle = detalle;
    }

    public static Performable mantenimientoRegistro(String detalle){
        return instrumented(DoMantenimientoAlertaRegistro.class, detalle);
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Mantenimiento Alertas Registro").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitSeconds.seconds(3)
        );
        if(actor.asksFor(ElementoElegible.para(EDITAR_AR_BTN))){
            actor.attemptsTo(
                    Click.on(EDITAR_AR_BTN),
                    Enter.theValue(numero).into(MantenimientoTresAdmin.DETALLE_AA_INPUT),
                    Click.on(MantenimientoTresAdmin.GRABAR_AR_BTN),
                    toAlert(),
                    WaitConstant.esperaConstante(),
                    Click.on(EDITAR_AR_BTN),
                    Clear.field(MantenimientoTresAdmin.DETALLE_AA_INPUT).then(Enter.theValue(detalle).into(MantenimientoTresAdmin.DETALLE_AA_INPUT)),
                    Click.on(MantenimientoTresAdmin.GRABAR_AR_BTN),
                    toAlert(),
                    WaitSeconds.seconds(5)
            );
        } else  {
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BTN_ADICIONAR),
                    Click.on(BTN_ADICIONAR),
                    WaitInteractions.untilBeEnable(TXT_ID),
                    Enter.theValue(id).into(TXT_ID),
                    Enter.theValue(matricula).into(TXT_MATRICULA_ALERTA),
                    Enter.theValue(numero).into(MantenimientoTresAdmin.DETALLE_AA_INPUT),
                    SelectFromOptions.byVisibleText(tipoAlerta).from(MEN_DES_TIPO_ALERTA),
                    Click.on(MantenimientoTresAdmin.GRABAR_AR_BTN),
                    toAlert(),
                    WaitConstant.esperaConstante(),
                    Click.on(EDITAR_AR_BTN),
                    Clear.field(MantenimientoTresAdmin.DETALLE_AA_INPUT).then(Enter.theValue(detalle).into(MantenimientoTresAdmin.DETALLE_AA_INPUT)),
                    Click.on(MantenimientoTresAdmin.GRABAR_AR_BTN),
                    toAlert(),
                    WaitSeconds.seconds(5)
            );

        }
    }
}
