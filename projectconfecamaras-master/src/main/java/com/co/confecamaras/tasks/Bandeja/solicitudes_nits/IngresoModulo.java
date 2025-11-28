package com.co.confecamaras.tasks.Bandeja.solicitudes_nits;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.BOTON_BUSQUEDA;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.ICONO_BUSQUEDA_NOMBRE;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.OficiosRequerimientos.OPCION_OFICIOS_REQUERIMIENTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class IngresoModulo implements Task {

    private final String bandeja;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(bandeja).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                WaitUntil.the(SELECCION_OPCION_GENERAL, isVisible()).forNoMoreThan(10).seconds(),
                SafeActions.click(SELECCION_OPCION_GENERAL, OPCION_OFICIOS_REQUERIMIENTOS),
                SwitchToNewWindow.switchToNewTab()
        );
    }

    public static IngresoModulo ingresoNits(String bandeja){
        return new IngresoModulo(bandeja);
    }
}
