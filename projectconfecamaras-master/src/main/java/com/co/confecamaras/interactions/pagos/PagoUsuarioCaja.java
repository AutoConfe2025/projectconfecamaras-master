package com.co.confecamaras.interactions.pagos;

import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.RecibirPago;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.RecibirPagoUI.*;
import static com.co.confecamaras.userinterfaces.RecibirPagoUI.BTN_CONTINUAR_PAGO;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.BTN_VER_RADICADO_SOCIEDAD;

public class PagoUsuarioCaja implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(BTN_POP_UP_ATENCION_CERRAR))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BTN_POP_UP_ATENCION_CERRAR),
                    Click.on(BTN_POP_UP_ATENCION_CERRAR)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(SELECT_TIPO_IDENTIFICACION_PAGO),
                SelectFromOptions.byVisibleText("Cédula de ciudadania").from(SELECT_TIPO_IDENTIFICACION_PAGO),
                Enter.theValue("1026265083").into(TXT_IDENTIFICACION_PAGO),
                Scroll.to(BTN_VERIFICAR_IDENTIFICACION_PAGO).andAlignToBottom(),
                Click.on(BTN_VERIFICAR_IDENTIFICACION_PAGO),
                WaitMilliseconds.milliseconds(500),
                Scroll.to(TXT_EMAIL_CONFIRMACION_PAGO).andAlignToBottom(),
                Enter.theValue("analistaqa@confecamaras.org.co").into(TXT_EMAIL_CONFIRMACION_PAGO),
                Scroll.to(BTN_GENERAR_RECIBO_PAGO).andAlignToBottom(),
                Click.on(BTN_GENERAR_RECIBO_PAGO),
                WaitSeconds.seconds(1)
        );
        if(actor.asksFor(ElementoElegible.para(BTN_OK_DATOS_INCOMPLETA))){
            actor.attemptsTo(
                    Click.on(BTN_OK_DATOS_INCOMPLETA),
                    WaitInteractions.untilBeEnable(TXT_NOMBRE_CLIENTE),
                    Scroll.to(TXT_NOMBRE_CLIENTE).andAlignToBottom(),
                    Enter.theValue("RIOS MAYORGA DIEGO ALBERTO").into(TXT_NOMBRE_CLIENTE),
                    Enter.theValue("DIEGO").into(TXT_PRIMER_NOMBRE),
                    Enter.theValue("ALBERTO").into(TXT_SEGUNDO_NOMBRE),
                    Enter.theValue("RIOS").into(TXT_PRIMER_APELLIDO),
                    Enter.theValue("MAYORGA").into(TXT_SEGUUNDO_APELLIDO),
                    Enter.theValue("CALLE 20 12 71 # 123 BIS QA").into(TXT_DIRECCION_COMERCIAL),
                    SelectFromOptions.byVisibleText("MANIZALES (CAL)").from(MENU_DES_MUNICIPIO),
                    Enter.theValue("170001").into(TXT_CODIGO_POSTAL),
                    Click.on(BTN_DUPLICAR),
                    Enter.theValue("6744221").into(TXT_TEL_FIJO),
                    Enter.theValue("3165376606").into(TXT_NUM_CELULAR),
                    SelectFromOptions.byVisibleText("Colombia").from(MEN_DES_PAIS),
                    SelectFromOptions.byVisibleText("Español").from(MEN_DES_LENGUAJE),
                    Enter.theValue("analistaqa@confecamaras.org.co").into(TXT_EMAIL)
            );
            if(actor.asksFor(ElementoElegible.para(MENU_DES_CODIGO_REGIMEN))) {
                actor.attemptsTo(
                        SelectFromOptions.byVisibleText("Responsable de IVA").from(MENU_DES_CODIGO_REGIMEN),
                        SelectFromOptions.byVisibleText("No responsable").from(MENU_DES_RESPONSABILIDAD_FISCAL)
                );
            }
            actor.attemptsTo(
                    Scroll.to(BTN_GENERAR_RECIBO_PAGO).andAlignToBottom(),
                    Click.on(BTN_GENERAR_RECIBO_PAGO)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_CONTINUAR_PAGO),
                Click.on(BTN_CONTINUAR_PAGO),
                Switch.toTheOtherWindow()
        );
    }
    public static PagoUsuarioCaja pagoUsuarioCaja() {
        return Tasks.instrumented(PagoUsuarioCaja.class);
    }
}
