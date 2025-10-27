package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.userinterfaces.CrudProponente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.*;

public class BloqueTresInscripcionProponente implements Task {

    private final String fechaCorte;
    private final String activoCorriente;
    private final String patrimonioNeto;
    private final String ingresosActividad;
    private final String grupoNif;
    private final String numDocDos;
    private final String fechaDocDos;
    private final String origenDocDos;

    public BloqueTresInscripcionProponente(String fechaCorte, String activoCorriente, String patrimonioNeto,
                                           String ingresosActividad, String grupoNif, String numDocDos,
                                           String fechaDocDos, String origenDocDos) {
        this.fechaCorte = fechaCorte;
        this.activoCorriente = activoCorriente;
        this.patrimonioNeto = patrimonioNeto;
        this.ingresosActividad = ingresosActividad;
        this.grupoNif = grupoNif;
        this.numDocDos = numDocDos;
        this.fechaDocDos = fechaDocDos;
        this.origenDocDos = origenDocDos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CrudProponente.BLOQUE_TRES_BTN, WebElementStateMatchers.isPresent()).forNoMoreThan(60).seconds(),
                Scroll.to(CrudProponente.BLOQUE_TRES_BTN).andAlignToBottom(),
                JavaScriptClick.on(CrudProponente.BLOQUE_TRES_BTN),
                JavaScriptClick.on(CrudProponente.FECHA_CORTE_INPUT),
                Enter.theValue(fechaCorte).into(CrudProponente.FECHA_CORTE_INPUT),
                Enter.theValue(activoCorriente).into(CrudProponente.ACTIVO_CORRIENTE_INPUT).thenHit(Keys.TAB),
                Enter.theValue(patrimonioNeto).into(CrudProponente.PATROMONIO_NETO_INPUT).thenHit(Keys.TAB),
                Enter.theValue(ingresosActividad).into(CrudProponente.INGRESOS_ACTIVIDAD_INPUT),
                SelectFromOptions.byVisibleText(grupoNif).from(CrudProponente.GRUPO_NIFF_SLT),
                JavaScriptClick.on(CrudProponente.GRABAR_BLOQUETRES_BTN),
                //WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL),
                ModalLoader.modalLoader(),
                Click.on(CrudProponente.MODAL_OK_BTN),
                JavaScriptClick.on(CrudProponente.CONTABLE_LEY_BTN),
                Enter.theValue(numDocDos).into(CrudProponente.NUMERO_DOCUMENTO_INPUT),
                Enter.theValue(fechaDocDos).into(CrudProponente.FECHA_DOCUMENTO_INPUT),
                Enter.theValue(origenDocDos).into(CrudProponente.ORIGEN_DOCUMENTO_INPUT),
                Enter.theValue(FileUpload.subirArchivo().archivoDev()).into(CrudProponente.CARGA_ARCHIVO_INPUT),
                JavaScriptClick.on(CrudProponente.GRABAR_CARGA_BTN),
                ModalLoader.modalLoader(),
                //WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                WaitSeconds.seconds(3),
                JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                WaitSeconds.seconds(5)
        );
    }

    public static BloqueTresInscripcionProponente enConfecamarasSII(String fechaCorte, String activoCorriente, String patrimonioNeto,
                                                                    String ingresosActividad, String grupoNif, String numDocDos,
                                                                    String fechaDocDos, String origenDocDos) {
        return instrumented(BloqueTresInscripcionProponente.class, fechaCorte, activoCorriente, patrimonioNeto,
                ingresosActividad, grupoNif, numDocDos, fechaDocDos, origenDocDos);
    }
}