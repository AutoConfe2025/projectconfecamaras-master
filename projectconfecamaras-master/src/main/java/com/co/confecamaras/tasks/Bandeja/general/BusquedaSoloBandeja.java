package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.General.OPCION_BANDEJA;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.BOTON_CONTROL;
import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.CAMPO_INGRESO_BUSQUEDA_CONTROL;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.BOTON_BUSQUEDA;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.ICONO_BUSQUEDA_NOMBRE;

@AllArgsConstructor
public class BusquedaSoloBandeja implements Task {

    private final String bandeja;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(bandeja).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                Click.on(OPCION_BANDEJA),
                SwitchToNewWindow.switchToNewTab()
        );
    }

    public static BusquedaSoloBandeja SoloBandeja(String bandeja){
        return new BusquedaSoloBandeja(bandeja);
    }
}
