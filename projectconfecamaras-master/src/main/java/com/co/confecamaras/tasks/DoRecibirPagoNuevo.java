package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.RecibirPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.models.VariableRecibirPagoNuevo.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRecibirPagoNuevo implements Task {

    private final String cobroFormularios;
    private final String forzar;
    private final String cc;
    private final String identificacion;
    private final String email;

    public DoRecibirPagoNuevo(String cobroFormularios, String forzar, String cc, String identificacion, String email) {
        this.cobroFormularios = cobroFormularios;
        this.forzar = forzar;
        this.cc = cc;
        this.identificacion = identificacion;
        this.email = email;
    }

    String numRecuperacion = getNumRecuperacion();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_MENU_LATERAL),
                WaitInterrupted5Segundos.esperaConstante5(),
                Enter.theValue("Recibir Pago (NUEVO)").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Enter.theValue(numRecuperacion).into(RecibirPago.NUMERO_RECUPERACION_INPUT),
                SelectFromOptions.byVisibleText(cobroFormularios).from(RecibirPago.INCLUIR_COBRO_SLC),
                //WaitUntil.the(RecibirPago.FORZAR_DESCUENTO_SLC, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                //SelectFromOptions.byVisibleText(forzar).from(RecibirPago.FORZAR_DESCUENTO_SLC),
                Click.on(RecibirPago.CONTINUAR_BTN),
                Scroll.to(RecibirPago.IDENTIFICACION_INPUT),
                SelectFromOptions.byValue(cc).from(RecibirPago.TIPO_IDENTIFICACION_SLC),
                Clear.field(RecibirPago.IDENTIFICACION_INPUT).then(Enter.theValue("1026265083").into(RecibirPago.IDENTIFICACION_INPUT)),
                JavaScriptClick.on(RecibirPago.VERIFICAR_IDENT_BTN),
                Enter.theValue("analistaqa@confecamaras.org.co").into(RecibirPago.EMAIL_CONFIRMACION_INPUT),
                WaitConstant.esperaConstante(),
                //JavaScriptClick.on(RecibirPago.DUPLICAR_DATOS_BTN),
                JavaScriptClick.on(RecibirPago.GENERAR_RECIBO_DOS_BTN),
                JavaScriptClick.on(RecibirPago.CONTINUAR_BTN),
                WaitConstant.esperaConstante()
        );
    }

    public static Performable recibirPagoNuevo(String cobroFormularios, String forzar, String cc, String identificacion,
                                               String email){
        return instrumented(DoRecibirPagoNuevo.class, cobroFormularios, forzar, cc, identificacion, email);
    }

}