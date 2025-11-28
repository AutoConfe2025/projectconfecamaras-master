package com.co.confecamaras.tasks.Bandeja.recursos_reposicion;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.BOTON_BUSQUEDA;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.ICONO_BUSQUEDA_NOMBRE;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.OficiosRequerimientos.OPCION_OFICIOS_REQUERIMIENTOS;
import static com.co.confecamaras.utils.bandejas.recursos_reposicion.Constants.REPOSICION_REQUERIMIENTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class IngresoBandeja implements Task {
    private final String codigoBarras;
    private final String estadoFinal;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(REPOSICION_REQUERIMIENTOS).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                WaitUntil.the(SELECCION_OPCION_GENERAL, isVisible()).forNoMoreThan(10).seconds(),
                SafeActions.click(SELECCION_OPCION_GENERAL, OPCION_OFICIOS_REQUERIMIENTOS),
                SwitchToNewWindow.switchToNewTab(),
                QueryGeneralBaseDatos.cambiarEstado(codigoBarras, estadoFinal),
                WaitUntil.the(BOTON_REFRESCAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_REFRESCAR),
                Enter.theValue(codigoBarras).into(CAMPO_BUSQUEDA)
        );
    }

    public static IngresoBandeja ingresoRecursos(String codigoBarras, String estadoFinal) {
        return new IngresoBandeja(codigoBarras, estadoFinal);
    }
}
