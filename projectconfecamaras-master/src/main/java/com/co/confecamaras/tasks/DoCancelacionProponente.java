package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.userinterfaces.CrudProponente;
import com.co.confecamaras.userinterfaces.MenuSistema;

import java.util.Map;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoCancelacionProponente implements Task {

    public final Map<String, String> data;

    public DoCancelacionProponente(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Expedientes").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_DOS_OPT),
                SelectFromOptions.byVisibleText(data.get("Consulta")).from(CrudProponente.CONSULTA_POR_SLC),
                Enter.theValue(data.get("Proponente")).into(CrudProponente.PROPONENTE_INPUT),
                WaitInterrupted2Segundos.esperaConstante2(),
                JavaScriptClick.on(CrudProponente.CONTINUAR_BTN),
                //JavaScriptClick.on(CrudProponente.ESTADO_PROPONENTE_TH),
                JavaScriptClick.on(CrudProponente.ACCIONES_BTN),
                JavaScriptClick.on(CrudProponente.OPERACIONES_PROPONENTES_SLT),
                WaitConstant.esperaConstante(),
                WaitInterrupted3Segundos.esperaConstante3(),
                WaitUntil.the(CrudProponente.SOLICITUD_CANCELACION_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CrudProponente.SOLICITUD_CANCELACION_BTN),
                WaitUntil.the(CrudProponente.CONTINUAR_DOS_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CrudProponente.CONTINUAR_DOS_BTN),
                WaitUntil.the(CrudProponente.ACCIONES_DOS_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CrudProponente.ACCIONES_DOS_BTN)
        );
        actor.attemptsTo(
                WaitUntil.the(CrudProponente.IMPRIMIR_FORMULARIO_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Scroll.to(CrudProponente.IMPRIMIR_FORMULARIO_BTN).andAlignToBottom(),
                JavaScriptClick.on(CrudProponente.IMPRIMIR_FORMULARIO_BTN),
                //WaitUntil.the(CrudProponente.REPRESENTANTE_LEGAL_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                //JavaScriptClick.on(CrudProponente.REPRESENTANTE_LEGAL_BTN),
                WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                WaitUntil.the(CrudProponente.CERRAR_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CrudProponente.CERRAR_BTN),
                WaitInterrupted3Segundos.esperaConstante3(),
                JavaScriptClick.on(CrudProponente.RECIBIR_PAGO_BTN_CANCELACION),

                WaitInterrupted3Segundos.esperaConstante3(),
                Switch.toNewWindow(),
                Click.on(CrudProponente.CONTINUAR_TRES_BTN),
                Scroll.to(CrudProponente.TIPO_IDENTIFICACION_SLC),
                SelectFromOptions.byVisibleText("Cédula de ciudadania").from(CrudProponente.TIPO_IDENTIFICACION_SLC),
                //Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC),
                //Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC),
                //Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC)
                Clear.field(CrudProponente.IDENTIFICACION_INPUT),
                Enter.theValue(data.get("Identificacion")).into(CrudProponente.IDENTIFICACION_INPUT),
                Click.on(CrudProponente.VERIFICAR_IDENT_BTN),
                Scroll.to(CrudProponente.EMAIL_CONFIR_INPUT),
                Enter.theValue(data.get("Correo")).into(CrudProponente.EMAIL_CONFIR_INPUT),
                Scroll.to(CrudProponente.DUPLICAR_DATOS_CLIENT_BTN),
                Click.on(CrudProponente.DUPLICAR_DATOS_CLIENT_BTN),
                Hit.the(Keys.SPACE).into(CrudProponente.FECHA_EXPEDICION_INPUT),
                Hit.the(Keys.ENTER).into(CrudProponente.FECHA_EXPEDICION_INPUT),
                Click.on(CrudProponente.GENERAR_RECIBO_BTN),
                Click.on(CrudProponente.CONTINUAR_MODAL_BTN),
                WaitUntil.the(CrudProponente.DESCARGAR_RECIBO_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(CrudProponente.DESCARGAR_RECIBO_BTN),
                WaitInterrupted2Segundos.esperaConstante2()
        );
    }

    public static Performable cancelacionProponente(Map<String, String> data) {
        return instrumented(DoCancelacionProponente.class, data);
    }
}