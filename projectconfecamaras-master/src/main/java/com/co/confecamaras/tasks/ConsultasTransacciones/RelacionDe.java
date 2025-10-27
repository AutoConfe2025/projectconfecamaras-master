package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.RelacionesRebovadosPage.RELACIONES_RENOVADOS_OPCION;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.relacionesPage.*;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.relacionesPage.BTN_IMPRIMIR;

public class RelacionDe  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
                Enter.theValue("Relacion De Renovados").into(TXT_BUSQUEDA_INPUT),
                WaitInteractions.untilBeEnable(RELACIONES_RENOVADOS_OPCION),
                Click.on(RELACIONES_RENOVADOS_OPCION)
        );

        //Relacion matriculados  fechas de consulta
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(FECHA_INICIAL_MATRICULADOS),
                Enter.theValue("20240101").into(FECHA_INICIAL_MATRICULADOS),
                WaitInteractions.untilBeEnable(FECHA_FINAL_MATRICULADOS),
                Enter.theValue("20240124").into(FECHA_FINAL_MATRICULADOS),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_CONSULTA_RELACIONES),
                Click.on(BTN_CONTINUAR_CONSULTA_RELACIONES)
        );

        //Tabla de resultados
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_IMPRIMIR),
                Click.on(BTN_IMPRIMIR),
                CambiarALaSiguientePestana.siguiente(),
                CerrarPestana.cerrar()
        );
    }

    public static RelacionDe renovados(){
        return Tasks.instrumented(RelacionDe.class);
    }
}
