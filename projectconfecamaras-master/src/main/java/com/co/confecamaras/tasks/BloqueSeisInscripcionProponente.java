package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
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

public class BloqueSeisInscripcionProponente implements Task {

    private final String celebrado;
    private final String contratante;
    private final String fechaEjecucion;
    private final String valorPesos;
    private final String valor;
    private final String campoTexto;
    private final String numDocTres;
    private final String fechaDocTres;
    private final String origenDocTres;

    public BloqueSeisInscripcionProponente(String celebrado, String contratante, String fechaEjecucion, String valorPesos,
                                           String valor, String campoTexto, String numDocTres, String fechaDocTres,
                                           String origenDocTres) {
        this.celebrado = celebrado;
        this.contratante = contratante;
        this.fechaEjecucion = fechaEjecucion;
        this.valorPesos = valorPesos;
        this.valor = valor;
        this.campoTexto = campoTexto;
        this.numDocTres = numDocTres;
        this.fechaDocTres = fechaDocTres;
        this.origenDocTres = origenDocTres;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(CrudProponente.ESPERA_SIGUIENTE_BLOQUE),
                JavaScriptClick.on(CrudProponente.SIGUIENTE_BLOQUE),
                JavaScriptClick.on(CrudProponente.SIGUIENTE_BLOQUE),
                JavaScriptClick.on(CrudProponente.ADICIONAR_CONTRATO_BTN),
                Click.on(CrudProponente.CELEBRADO_SLT),
                SelectFromOptions.byVisibleText(celebrado).from(CrudProponente.CELEBRADO_SLT),
                Enter.theValue(contratante).into(CrudProponente.CONTRATANTE_INPUT),
                Enter.theValue(fechaEjecucion).into(CrudProponente.FECHA_EJECUCION_INPUT),
                Enter.theValue(valorPesos).into(CrudProponente.VALOR_PESOS_INPUT),
                Enter.theValue(valor).into(CrudProponente.VALOR_INPUT),
                Enter.theValue(campoTexto).into(CrudProponente.CAMPO_TXT),
                WaitInterrupted2Segundos.esperaConstante2(),
                JavaScriptClick.on(CrudProponente.GRABAR_FORM_BTN),
                WaitSeconds.seconds(2),
                //WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                //WaitInteractions.untilBeEnable(CrudProponente.ESPERA_CARGAR_SOPORTE),
                WaitSeconds.seconds(2),
                JavaScriptClick.on(CrudProponente.CARGAR_SOPORTE_BTN),
                WaitSeconds.seconds(2),
                Enter.theValue(numDocTres).into(CrudProponente.NUMERO_DOCUMENTO_INPUT),
                Enter.theValue(fechaDocTres).into(CrudProponente.FECHA_DOCUMENTO_INPUT),
                Enter.theValue(origenDocTres).into(CrudProponente.ORIGEN_DOCUMENTO_INPUT),
                Enter.theValue(FileUpload.subirArchivo().archivoPj()).into(CrudProponente.CARGA_ARCHIVO_INPUT),
                JavaScriptClick.on(CrudProponente.GRABAR_CARGA_BTN),
                WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                WaitSeconds.seconds(5),
                JavaScriptClick.on(CrudProponente.VALIDAR_FORMULARIO_DOS_BTN),
                WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                JavaScriptClick.on(CrudProponente.VALIDAR_SOPORTES_BTN),
                WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                WaitSeconds.seconds(5),
                JavaScriptClick.on(CrudProponente.IMPRIMIR_FORMULARIO_FINAL_BTN),
                WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_FORM),
                WaitSeconds.seconds(5),
                JavaScriptClick.on(CrudProponente.MODAL_OK_DOS_BTN),
                ModalLoader.modalLoader(),
                //WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                WaitSeconds.seconds(3),
                WaitUntil.the(CrudProponente.BTN_CERRAR_BTN, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds(),
                JavaScriptClick.on(CrudProponente.BTN_CERRAR_BTN),
                WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                WaitSeconds.seconds(5)
        );
    }

    public static BloqueSeisInscripcionProponente enConfecamaras(String celebrado, String contratante, String fechaEjecucion, String valorPesos,
                                                                 String valor, String campoTexto, String numDocTres, String fechaDocTres,
                                                                 String origenDocTres) {
        return instrumented(BloqueSeisInscripcionProponente.class, celebrado, contratante, fechaEjecucion, valorPesos,
                valor, campoTexto, numDocTres, fechaDocTres, origenDocTres);
    }
}