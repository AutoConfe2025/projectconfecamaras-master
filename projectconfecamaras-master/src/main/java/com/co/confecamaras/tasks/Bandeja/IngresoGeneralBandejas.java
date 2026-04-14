package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.News.PressKey;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.Acciones.TypeKey;
import com.co.confecamaras.utils.sikulli.SafeActions;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.renovaciones.GeneralPage.CAMPO_NUEVO_VALOR_PERSONA;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.BOTON_BUSQUEDA;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.EstadoGeneral.ICONO_BUSQUEDA_NOMBRE;
import static com.co.confecamaras.userinterfaces.sikuli.bandejas.OficiosRequerimientos.OPCION_OFICIOS_REQUERIMIENTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class IngresoGeneralBandejas implements Task {
    private final String codigoBarras;
    private final String estadoFinal;
    private final String bandeja;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(codigoBarras, estadoFinal),
                SafeActions.click(BOTON_CONTROL, BOTON_BUSQUEDA),
                SafeActions.click(CAMPO_INGRESO_BUSQUEDA_CONTROL, ICONO_BUSQUEDA_NOMBRE),
                Enter.theValue(bandeja).into(CAMPO_INGRESO_BUSQUEDA_CONTROL),
                WaitUntil.the(SELECCION_OPCION_GENERAL, isVisible()).forNoMoreThan(10).seconds(),
                SafeActions.click(SELECCION_OPCION_GENERAL, OPCION_OFICIOS_REQUERIMIENTOS),
                SwitchToNewWindow.switchToNewTab(),
                Enter.theValue(codigoBarras).into(CAMPO_BUSQUEDA_COD_BARRAS_INICIAL_1),
                PressKey.press(TypeKey.TAB)
        );
    }

    public static IngresoGeneralBandejas    ingresoBandeja(String codigoBarras, String estadoFinal, String bandeja) {
        return new IngresoGeneralBandejas(codigoBarras, estadoFinal, bandeja);
    }
}
