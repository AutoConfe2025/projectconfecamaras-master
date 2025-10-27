package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.co.confecamaras.userinterfaces.DesistimientosDecretados;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.MenuSistema.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class
DoDesistimientos implements Task {

    private final String numeroDesistimiento;

    public DoDesistimientos(String numeroDesistimiento){
        this.numeroDesistimiento = numeroDesistimiento;
    }

    public static Performable desistimientosDecretados(String numeroDesistimiento){
        return instrumented(DoDesistimientos.class, numeroDesistimiento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                Enter.theValue("Desistimientos decretados").into(MenuSistema.BUSQUEDA_INPUT),
                WaitSeconds.seconds(2),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Click.on(DesistimientosDecretados.BUSQUEDA_INPUT),
                Enter.theValue("1544").into(DesistimientosDecretados.BUSQUEDA_INPUT),
                Scroll.to(DesistimientosDecretados.VISUALIZACION_BTN),
                Click.on(DesistimientosDecretados.VISUALIZACION_BTN),
                WaitSeconds.seconds(3)
        );
    }
}