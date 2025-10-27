package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.pagos.PagoUsuarioCaja;
import com.co.confecamaras.userinterfaces.CrudProponente;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.models.VariableRepartoDocumentos.*;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.TXT_BUSCAR_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.ESPERA;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DataRepartoDocumentos implements Task {

    private final String consulta;
    private final String numProponente;
    private final String identificacion;
    private final String correo;

    public DataRepartoDocumentos(String consulta, String numProponente, String identificacion, String correo) {
        this.consulta = consulta;
        this.numProponente = numProponente;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    public static Performable cancelacionProponente(String consulta, String numProponente, String identificacion, String correo) {
        return instrumented(DataRepartoDocumentos.class, consulta, numProponente, identificacion, correo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                SelectFromOptions.byVisibleText(consulta).from(CrudProponente.CONSULTA_POR_SLC),
                Enter.theValue(numProponente).into(CrudProponente.PROPONENTE_INPUT),
                JavaScriptClick.on(CrudProponente.CONTINUAR_BTN),
                //JavaScriptClick.on(CrudProponente.ESTADO_PROPONENTE_TH),
                JavaScriptClick.on(CrudProponente.ACCIONES_BTN),
                JavaScriptClick.on(CrudProponente.OPERACIONES_PROPONENTES_SLT),
                WaitSeconds.seconds(5),
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
                WaitSeconds.seconds(2),
                //JavaScriptClick.on(CrudProponente.RECIBIR_PAGO_BTN),
                JavaScriptClick.on(CrudProponente.RECIBIR_PAGO_BTN_CANCELACION),
                WaitSeconds.seconds(2),
                Switch.toNewWindow(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(CrudProponente.CONTINUAR_TRES_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                Scroll.to(CrudProponente.TIPO_IDENTIFICACION_SLC),
                SelectFromOptions.byVisibleText("Cédula de ciudadania").from(CrudProponente.TIPO_IDENTIFICACION_SLC),
                //Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC),
                //Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC),
                //Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC),
                Clear.field(CrudProponente.IDENTIFICACION_INPUT),
                Enter.theValue("1026265083").into(CrudProponente.IDENTIFICACION_INPUT),
                Click.on(CrudProponente.VERIFICAR_IDENT_BTN),
                Scroll.to(CrudProponente.EMAIL_CONFIR_INPUT),
                Enter.theValue("analistaqa@confecamaras.org.co").into(CrudProponente.EMAIL_CONFIR_INPUT),
                Scroll.to(CrudProponente.DUPLICAR_DATOS_CLIENT_BTN),
                Click.on(CrudProponente.DUPLICAR_DATOS_CLIENT_BTN),
                Hit.the(Keys.SPACE).into(CrudProponente.FECHA_EXPEDICION_INPUT),
                Hit.the(Keys.ENTER).into(CrudProponente.FECHA_EXPEDICION_INPUT),
                Click.on(CrudProponente.GENERAR_RECIBO_BTN),
                Click.on(CrudProponente.CONTINUAR_MODAL_BTN),
                Ensure.that(CrudProponente.LBL_CODIGO_BARRAS_CRUD).isEnabled()
        );

        String barcode = CrudProponente.LBL_CODIGO_BARRAS_CRUD.resolveFor(actor).getText();
        System.out.println("¡ESTE ES EL CODDIGO!: " + barcode);
        setBarcode(barcode);

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                Switch.toTheOtherWindow(),
                RobotCambioPestanaDos.toTab(),
                WaitSeconds.seconds(2),
                WaitInteractions.untilAppears(CrudProponente.BTN_CERRAR_CRUD),
                Click.on(CrudProponente.BTN_CERRAR_CRUD),
                ModalLoader.modalLoader()
        );
    }
}