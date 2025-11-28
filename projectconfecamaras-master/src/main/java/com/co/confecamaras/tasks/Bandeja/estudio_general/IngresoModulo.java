package com.co.confecamaras.tasks.Bandeja.estudio_general;

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
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.*;
import static com.co.confecamaras.utils.estudio_general.constant.ESTUDIO_GENERAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class IngresoModulo implements Task {

    private final String codigo_barras;
    private final String estado;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(ESTUDIO_GENERAL).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                WaitUntil.the(SELECCION_OPCION_GENERAL, isVisible()).forNoMoreThan(10).seconds(),
                SafeActions.click(SELECCION_OPCION_GENERAL, OPCION_ESTADO_GENERAL_SIKULLI),
                SwitchToNewWindow.switchToNewTab(),
                QueryGeneralBaseDatos.cambiarEstado(codigo_barras,estado),
                WaitUntil.the(BOTON_REFRESCAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_REFRESCAR),
                Enter.theValue(codigo_barras).into(CAMPO_BUSQUEDA)
        );
    }

    public static IngresoModulo ingresoAlModulo(String codigo_barras, String estado) {
        return new IngresoModulo(codigo_barras, estado);
    }
}
