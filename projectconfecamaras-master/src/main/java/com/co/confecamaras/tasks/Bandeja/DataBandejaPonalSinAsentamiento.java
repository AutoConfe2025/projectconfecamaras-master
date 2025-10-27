package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.CapturarEvidenciaUI;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_EXPEDIENTES;
import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.BTN_CERRAR_PROCESO_PAGO;
import static com.co.confecamaras.userinterfaces.CapturarEvidenciaUI.LBL_MENSAJE_FINAL_TRANSACCION_DOS;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class DataBandejaPonalSinAsentamiento implements Task {

    private final String numCodigoBarras;

    public DataBandejaPonalSinAsentamiento(String numCodigoBarras) {
        this.numCodigoBarras = numCodigoBarras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_EXPEDIENTES),
                Click.on(BTN_EXPEDIENTES),
                SelectFromOptions.byVisibleText("Matricula").from(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(numCodigoBarras).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACTUALIZACION_DATOS_MUTACION_EXPEDIENTES),
                JavaScriptClick.on(BTN_ACTUALIZACION_DATOS_MUTACION_EXPEDIENTES),
                WaitSeconds.seconds(2),
                Click.on(BTN_CONTINUAR_DOS_EXPEDIENTES)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(TXT_DIRECCION_EXPEDIENTES))){
                int indexFila = i = 50;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_DIRECCION_EXPEDIENTES),
                Enter.theValue("CALLE 196C # 18 - 37 CASA PISO 2").into(TXT_DIRECCION_EXPEDIENTES),
                Scroll.to(BTN_CONTINUAR_TRES_EXPEDIENTES),
                JavaScriptClick.on(BTN_CONTINUAR_TRES_EXPEDIENTES)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(BTN_VER_SOPORTE_EXPEDIENTES))){
                int indexFila = i = 50;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_VER_SOPORTE_EXPEDIENTES),
                JavaScriptClick.on(BTN_VER_SOPORTE_EXPEDIENTES),
                WaitUntil.the(BTN_CERRAR_EXPEDIENTES, isCurrentlyVisible()).forNoMoreThan(120).seconds(),
                Click.on(BTN_CERRAR_EXPEDIENTES),
                JavaScriptClick.on(BTN_RECIBIR_PAGO_EXPEDIENTES),
                Switch.toNewWindow(),
                Click.on(CapturarEvidenciaUI.BTN_CONTINUAR_CAPTURAR_EVIDENCIA),
                PagoUsuarioCaja.pagoUsuarioCaja(),
                RobotCambioPestanaDos.toTab(),
                WaitInteractions.untilBeEnable(BTN_CERRAR_PROCESO_PAGO),
                Click.on(BTN_CERRAR_PROCESO_PAGO),
                WaitSeconds.seconds(2)
        );
    }
    public static final DataBandejaPonalSinAsentamiento dataBandejaPonalSinAsentamiento(String numCodigoBarras) {
        return Tasks.instrumented(DataBandejaPonalSinAsentamiento.class, numCodigoBarras);
    }
}
