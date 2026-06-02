package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.log.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.DataInscripcionDocumentosMercantilUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DataInscripcionDocumentosMercantilDos implements Task {

    private final String idSegundoApellido;
    private final String idPrimerNombre;
    private final String idOtrosNombres;
    private final String selectRenglon;
    private final String selectAceptacion;
    private final String idFechaExpedicion;
    private final String idEmail;

    public DataInscripcionDocumentosMercantilDos(String idSegundoApellido, String idPrimerNombre, String idOtrosNombres,
                                                 String selectRenglon, String selectAceptacion, String idFechaExpedicion,
                                                 String idEmail) {
        this.idSegundoApellido = idSegundoApellido;
        this.idPrimerNombre = idPrimerNombre;
        this.idOtrosNombres = idOtrosNombres;
        this.selectRenglon = selectRenglon;
        this.selectAceptacion = selectAceptacion;
        this.idFechaExpedicion = idFechaExpedicion;
        this.idEmail = idEmail;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Log.message("Inicio DataInscripcionDocumentosMercantilDos"),
                WaitInteractions.untilAppears(TXT_SEGUNDO_APELLIDO_DIDM),
                Enter.theValue(idSegundoApellido).into(TXT_SEGUNDO_APELLIDO_DIDM),
                WaitInteractions.untilAppears(TXT_PRIMER_NOMBRE_DIDM),
                Enter.theValue(idPrimerNombre).into(TXT_PRIMER_NOMBRE_DIDM),
                WaitInteractions.untilAppears(TXT_OTRO_NOMBRE_DIDM),
                Enter.theValue(idOtrosNombres).into(TXT_OTRO_NOMBRE_DIDM),
                WaitInteractions.untilAppears(SELECT_RENGLON_DIDM),
                Scroll.to(SELECT_RENGLON_DIDM).andAlignToBottom(),
                SelectFromOptions.byVisibleText(selectRenglon).from(SELECT_RENGLON_DIDM),
                WaitInteractions.untilAppears(SELECT_ACEPTACION_DIDM),
                SelectFromOptions.byVisibleText(selectAceptacion).from(SELECT_ACEPTACION_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_DIDM),
                Scroll.to(BTN_CONTINUAR_DOS_DIDM).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_DOS_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_DIDM),
                Scroll.to(BTN_CONTINUAR_TRES_DIDM).andAlignToBottom(),
                Click.on(BTN_CONTINUAR_TRES_DIDM),
                WaitInteractions.untilAppears(BTN_RECIBIR_PAGO_DIDM),
                Scroll.to(BTN_RECIBIR_PAGO_DIDM),
                Click.on(BTN_RECIBIR_PAGO_DIDM),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_DIDM),
                Click.on(BTN_CONTINUAR_TRES_DIDM),
                WaitInteractions.untilAppears(MENU_DESPLEGABLE_ID),
                Scroll.to(MENU_DESPLEGABLE_ID).andAlignToBottom(),
                SelectFromOptions.byVisibleText("Cédula de ciudadania").from(MENU_DESPLEGABLE_ID),
                Enter.theValue("1026265083").into(TXT_ID),
                Click.on(BTN_VERIFICAR_ID),
                Clear.field(TXT_EMAIL_CONFIRMACION),
                Enter.theValue("analistaqa@confecamaras.org.co").into(TXT_EMAIL_CONFIRMACION),
                WaitInteractions.untilAppears(BTN_DUPLICAR_DATOS_CLIENTE_DIDM),
                Scroll.to(BTN_DUPLICAR_DATOS_CLIENTE_DIDM).andAlignToBottom(),
                Click.on(BTN_DUPLICAR_DATOS_CLIENTE_DIDM),
                Log.message("FIN DataInscripcionDocumentosMercantilDos")
        );
    }

    public static DataInscripcionDocumentosMercantilDos enConfecamaraSII(String idSegundoApellido, String idPrimerNombre, String idOtrosNombres,
                                                                         String selectRenglon, String selectAceptacion, String idFechaExpedicion,
                                                                         String idEmail) {
        return instrumented(DataInscripcionDocumentosMercantilDos.class, idSegundoApellido, idPrimerNombre, idOtrosNombres,
                selectRenglon, selectAceptacion, idFechaExpedicion, idEmail);
    }
}