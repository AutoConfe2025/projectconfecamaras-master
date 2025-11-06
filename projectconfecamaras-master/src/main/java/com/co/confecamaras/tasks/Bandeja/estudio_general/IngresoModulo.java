package com.co.confecamaras.tasks.Bandeja.estudio_general;

import com.co.confecamaras.database.Bandeja.QueryDigitacionRegEsadlCambiarEstadoCodBarras;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estado_general.Pagina_Princial.*;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.*;
import static com.co.confecamaras.utils.estudio_general.constant.ESTUDIO_GENERAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class IngresoModulo implements Task {

    private final String codigo_barras;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(ESTUDIO_GENERAL).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                WaitUntil.the(OPCION_ESTUDIO_GENERAL, isVisible()).forNoMoreThan(10).seconds(),
                SafeActions.click(OPCION_ESTUDIO_GENERAL, OPCION_ESTADO_GENERAL_SIKULLI),
                SwitchToNewWindow.switchToNewTab(),
                QueryDigitacionRegEsadlCambiarEstadoCodBarras.cambiarEstado(codigo_barras),
                WaitUntil.the(BOTON_REFRESCAR, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_REFRESCAR),
                Enter.theValue(codigo_barras).into(CAMPO_BUSQUEDA)
        );
    }

    public static IngresoModulo ingresoAlModulo(String codigo_barras) {
        return new IngresoModulo(codigo_barras);
    }
}
