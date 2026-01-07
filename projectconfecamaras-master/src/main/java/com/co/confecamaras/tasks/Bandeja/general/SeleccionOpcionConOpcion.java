package com.co.confecamaras.tasks.Bandeja.general;

import com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.BOTON_BUSQUEDA;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.ICONO_BUSQUEDA_NOMBRE;

@AllArgsConstructor
public class SeleccionOpcionConOpcion implements Task {

    private final String bandeja;
    private final String texto;
    private final String opcion;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(bandeja).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                Click.on(PaginaPrincial.opcionServicios(texto,opcion))
        );

    }

    public static SeleccionOpcionConOpcion conOpcionLocalizador(String bandeja,String texto, String opcion){
        return new SeleccionOpcionConOpcion(bandeja,texto, opcion);
    }
}
