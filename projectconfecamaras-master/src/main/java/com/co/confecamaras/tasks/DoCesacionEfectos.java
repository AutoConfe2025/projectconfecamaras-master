package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.RevisarEfectos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.SELECCIONAR_OPT;
import static com.co.confecamaras.userinterfaces.RevisarEfectos.VAL_VER_ANTES_DEL_FIN_TEMPORADA;
import static com.co.confecamaras.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoCesacionEfectos implements Task {

    public static Performable cesacionEfectos(){
        return instrumented(DoCesacionEfectos.class);
    }
    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }
    public static Performable switchFrame() {
        return new DriverTask(driver -> driver.switchTo().frame("GB_frame"));
    }

    int age = 20;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue("Revisar Cesación de efectos").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(SELECCIONAR_OPT),
                Switch.toNewWindow()
        );
        if(actor.asksFor(ElementoElegible.para(VAL_VER_ANTES_DEL_FIN_TEMPORADA))){
            actor.attemptsTo(
                    WaitSeconds.seconds(3),
                    Ensure.that(VAL_VER_ANTES_DEL_FIN_TEMPORADA).text().isEqualTo("Aún no se debe ejecutar la cesación de efectos, esta se ejecuta pasado el 2025-04-07")
            );
        } else {
            actor.attemptsTo(
                    WaitUntil.the(RevisarEfectos.CONTINUAR_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                    Click.on(RevisarEfectos.CONTINUAR_BTN),
                    toAlert(),
                    Scroll.to(RevisarEfectos.TABLE_BTN),
                    DoubleClick.on(RevisarEfectos.ESTADO_BTN),
                    WaitConstant.esperaConstante(),
                    WaitConstant.esperaConstante(),
                    DoubleClick.on(RevisarEfectos.SELECT_ROW),
                    WaitUntil.the(RevisarEfectos.VER_BTN, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(), Click.on(RevisarEfectos.VER_BTN),
                    WaitConstant.esperaConstante(),
                    WaitConstant.esperaConstante(),
                    WaitConstant.esperaConstante(),
                    WaitUntil.the(RevisarEfectos.CERRAR_BTN, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(),
                    Click.on(RevisarEfectos.CERRAR_BTN),
                    //toAlert(),
                    WaitConstant.esperaConstante(),
                    WaitConstant.esperaConstante(),
                    WaitConstant.esperaConstante(),
                    DoubleClick.on(RevisarEfectos.TABLE_BTN),
                    DoubleClick.on(RevisarEfectos.TABLE_NOMBRE_BTN),
                    WaitConstant.esperaConstante(),
                    WaitUntil.the(RevisarEfectos.CESAR_EFECTOS_BTN, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(),
                    Click.on(RevisarEfectos.CESAR_EFECTOS_BTN),
                    toAlert(),
                    WaitUntil.the(RevisarEfectos.DIV_UNO, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(),
                    WaitConstant.esperaConstante(),
                    WaitConstant.esperaConstante(),
                    SwitchFrameCE.doFrame(),
                    //Switch.toParentFrame(),
                    //switchFrame(),
                    Ensure.that(RevisarEfectos.TEST).hasText(TITULO_CESACION)
                    /*Ensure.that(RevisarEfectos.TEST).isEnabled()*/
                    //DoubleClick.on(RevisarEfectos.TEST)
                    //WaitUntil.the(RevisarEfectos.VAL_VER, WebElementStateMatchers.isPresent()).forNoMoreThan(60).seconds()
            );
        }
    }
}