package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import com.co.confecamaras.userinterfaces.CrudProponente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.*;

public class BloqueUnoInscripcionProponente implements Task {

    private final String empresa;
    private final String numDoc;
    private final String fechaDoc;
    private final String origenDoc;

    public BloqueUnoInscripcionProponente(String empresa, String numDoc, String fechaDoc, String origenDoc) {
        this.empresa = empresa;
        this.numDoc = numDoc;
        this.fechaDoc = fechaDoc;
        this.origenDoc = origenDoc;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CrudProponente.TAMANO_EMPRESA_SLT, WebElementStateMatchers.isEnabled()).forNoMoreThan(60).seconds(),
                SelectFromOptions.byVisibleText(empresa).from(CrudProponente.TAMANO_EMPRESA_SLT),
                JavaScriptClick.on(CrudProponente.GRABAR_BTN),
                ModalLoader.modalLoader(),
                Click.on(CrudProponente.MODAL_OK_BTN),
                JavaScriptClick.on(CrudProponente.RUT_PROPONENTE_BTN),
                WaitUntil.the(CrudProponente.NUMERO_DOCUMENTO_INPUT, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(numDoc).into(CrudProponente.NUMERO_DOCUMENTO_INPUT),
                Enter.theValue(fechaDoc).into(CrudProponente.FECHA_DOCUMENTO_INPUT),
                Enter.theValue(origenDoc).into(CrudProponente.ORIGEN_DOCUMENTO_INPUT),
                Enter.theValue(FileUpload.subirArchivo().archivoRut()).into(CrudProponente.CARGA_ARCHIVO_INPUT),
                JavaScriptClick.on(CrudProponente.GRABAR_CARGA_BTN),
                WaitSeconds.seconds(3),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                WaitSeconds.seconds(5)
        );
    }

    public static BloqueUnoInscripcionProponente enConfecamarasSII(String empresa, String numDoc, String fechaDoc, String origenDoc) {
        return instrumented(BloqueUnoInscripcionProponente.class, empresa, numDoc, fechaDoc, origenDoc);
    }
}