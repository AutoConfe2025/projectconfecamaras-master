package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import com.co.confecamaras.userinterfaces.CrudProponente;
import com.co.confecamaras.userinterfaces.MenuSistema;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CrudProponente.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRenovacionProponente implements Task {

    private final String consulta;
    private final String numProponente;
    private final String fechaCorteBs;
    private final String numDoc;
    private final String fechaDoc;
    private final String origenDoc;
    private final String numDocDos;
    private final String fechaDocDos;
    private final String origenDocDos;
    private final String numDosTres;
    private final String fechaDocTres;
    private final String origenDocTres;
    private final String ident;
    private final String email;

    public DoRenovacionProponente(String consulta, String numProponente, String fechaCorteBs, String numDoc,
                                  String fechaDoc, String origenDoc, String numDocDos, String fechaDocDos,
                                  String origenDocDos, String numDosTres, String fechaDocTres, String origenDocTres,
                                  String ident, String email){
        this.consulta = consulta;
        this.numProponente = numProponente;
        this.fechaCorteBs = fechaCorteBs;
        this.numDoc = numDoc;
        this.fechaDoc = fechaDoc;
        this.origenDoc = origenDoc;
        this.numDocDos = numDocDos;
        this.fechaDocDos = fechaDocDos;
        this.origenDocDos = origenDocDos;
        this.numDosTres = numDosTres;
        this.fechaDocTres = fechaDocTres;
        this.origenDocTres = origenDocTres;
        this.ident = ident;
        this.email = email;
    }

    public static Performable renovacionProponente(String consulta, String numProponente, String fechaCorteBs, String numDoc,
                                                   String fechaDoc, String origenDoc, String numDocDos, String fechaDocDos,
                                                   String origenDocDos, String numDosTres, String fechaDocTres, String origenDocTres,
                                                   String ident, String email){
        return instrumented(DoRenovacionProponente.class, consulta, numProponente, fechaCorteBs, numDoc, fechaDoc, origenDoc,
                numDocDos, fechaDocDos, origenDocDos, numDosTres, fechaDocTres, origenDocTres, ident, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitSeconds.seconds(2),
                SelectFromOptions.byVisibleText(consulta).from(CrudProponente.CONSULTA_POR_SLC),
                Enter.theValue(numProponente).into(CrudProponente.PROPONENTE_INPUT),
                WaitSeconds.seconds(2),
                Click.on(CrudProponente.CONTINUAR_BTN),
                WaitUntil.the(CrudProponente.ACCIONES_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(CrudProponente.ACCIONES_BTN),
                WaitUntil.the(CrudProponente.OPERACIONES_PROPONENTES_SLT, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(CrudProponente.OPERACIONES_PROPONENTES_SLT),
                WaitUntil.the(CrudProponente.RENOVAR_REGISTRO_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                Click.on(CrudProponente.RENOVAR_REGISTRO_BTN),
                WaitInteractions.untilAppears(CrudProponente.BTN_CONTINUAR_NIT),
                JavaScriptClick.on(CrudProponente.BTN_CONTINUAR_NIT),
                WaitSeconds.seconds(3),
                Scroll.to(ACCIONES_RENOVACION_BTN).andAlignToBottom(),
                JavaScriptClick.on(CrudProponente.ACCIONES_RENOVACION_BTN),
                ModalLoader.modalLoader()
        );

        if(actor.asksFor(ElementoElegible.para(FORMULARIO_BTN))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(FORMULARIO_BTN),
                    JavaScriptClick.on(FORMULARIO_BTN),

                    //------Bloque 7------//
                    //WaitUntil.the(CrudProponente.BLOQUE_SIETE_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                    ModalLoader.modalLoader(),
                    Scroll.to(CrudProponente.BLOQUE_SIETE_BTN),
                    JavaScriptClick.on(CrudProponente.BLOQUE_SIETE_BTN),
                    JavaScriptClick.on(CrudProponente.FECHA_CORTE_BS_INPUT),
                    Enter.theValue(fechaCorteBs).into(CrudProponente.FECHA_CORTE_BS_INPUT),
                    JavaScriptClick.on(CrudProponente.GRABAR_BLOQUESIETE_BTN),
                    //WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                    ModalLoader.modalLoader(),
                    JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                    WaitMilliseconds.milliseconds(500),
                    Scroll.to(CrudProponente.CARGAR_SOPORTE_BS_BTN).andAlignToBottom(),
                    WaitInterrupted2Segundos.esperaConstante2(),
                    JavaScriptClick.on(CrudProponente.CARGAR_SOPORTE_BS_BTN),
                    Enter.theValue(numDoc).into(CrudProponente.NUMERO_DOCUMENTO_INPUT),

                    Enter.theValue(fechaDoc).into(CrudProponente.FECHA_DOCUMENTO_INPUT),
                    Enter.theValue(origenDoc).into(CrudProponente.ORIGEN_DOCUMENTO_INPUT),
                    Enter.theValue(FileUpload.subirArchivo().archivoPj()).into(CrudProponente.CARGA_ARCHIVO_INPUT),
                    JavaScriptClick.on(CrudProponente.GRABAR_CARGA_BTN),
                    WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                    WaitInterrupted2Segundos.esperaConstante2(),
                    JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                    WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM)
            );

            actor.attemptsTo(
                    //------Bloque 2------//
                    WaitUntil.the(CrudProponente.BLOQUE_DOS_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                    WaitInterrupted2Segundos.esperaConstante2(),
                    JavaScriptClick.on(CrudProponente.BLOQUE_DOS_BTN),
                    WaitUntil.the(CrudProponente.CARGAR_SOPORTE_BD_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                    Scroll.to(CrudProponente.CARGAR_SOPORTE_BD_BTN),
                    JavaScriptClick.on(CrudProponente.CARGAR_SOPORTE_BD_BTN),
                    Enter.theValue(numDocDos).into(CrudProponente.NUMERO_DOCUMENTO_INPUT),
                    Enter.theValue(fechaDocDos).into(CrudProponente.FECHA_DOCUMENTO_INPUT),
                    Enter.theValue(origenDocDos).into(CrudProponente.ORIGEN_DOCUMENTO_INPUT),
                    Enter.theValue(FileUpload.subirArchivo().archivoPj()).into(CrudProponente.CARGA_ARCHIVO_INPUT),
                    JavaScriptClick.on(CrudProponente.GRABAR_CARGA_BTN),
                    ModalLoader.modalLoader(),
                    WaitSeconds.seconds(2),
                    JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                    ModalLoader.modalLoader()
            );
            actor.attemptsTo(
                    //------Bloque 6------//
                    WaitUntil.the(CrudProponente.BLOQUE_SEIS_BTN, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds(),
                    JavaScriptClick.on(CrudProponente.BLOQUE_SEIS_BTN),
                    WaitUntil.the(CrudProponente.CARGAR_SOPORTE_BSEIS_BTN, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(60).seconds(),
                    Scroll.to(CrudProponente.CARGAR_SOPORTE_BSEIS_BTN),
                    JavaScriptClick.on(CrudProponente.CARGAR_SOPORTE_BSEIS_BTN),
                    Enter.theValue(numDosTres).into(CrudProponente.NUMERO_DOCUMENTO_INPUT),
                    Enter.theValue(fechaDocTres).into(CrudProponente.FECHA_DOCUMENTO_INPUT),
                    Enter.theValue(origenDocTres).into(CrudProponente.ORIGEN_DOCUMENTO_INPUT),
                    Enter.theValue(FileUpload.subirArchivo().archivoPj()).into(CrudProponente.CARGA_ARCHIVO_INPUT),
                    JavaScriptClick.on(CrudProponente.GRABAR_CARGA_BTN),
                    WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                    JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                    WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                    JavaScriptClick.on(CrudProponente.VALIDAR_FORMULARIO_DOS_BTN),
                    WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                    JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                    WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                    WaitConstantTwo.esperaConstante(),
                    JavaScriptClick.on(CrudProponente.VALIDAR_SOPORTES_BTN),
                    WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_TRES),
                    JavaScriptClick.on(CrudProponente.MODAL_OK_BTN),
                    WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM)
            );
            actor.attemptsTo(

                    WaitUntil.the(CrudProponente.IMPRIMIR_FORMULARIO_FINAL_BTN, WebElementStateMatchers.isClickable()),
                    JavaScriptClick.on(CrudProponente.IMPRIMIR_FORMULARIO_FINAL_BTN),
                    WaitInteractions.untilBeEnable(CrudProponente.ESPERA_MODAL_FORM),
                    WaitInterrupted3Segundos.esperaConstante3(),
                    JavaScriptClick.on(CrudProponente.MODAL_OK_DOS_BTN),
                    WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                    WaitInterrupted2Segundos.esperaConstante2()

                    //JavaScriptClick.on(CrudProponente.BTN_SI_POPAD)
                    //JavaScriptClick.on(CrudProponente.MODAL_REPRESENTANTE_BTN),
                    //WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                    //JavaScriptClick.on(CrudProponente.MODAL_CERRAR_BTN)
            );
        /*
        actor.attemptsTo(
                //------Recibir pago------//
                WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                JavaScriptClick.on(CrudProponente.RECIBIR_PAGO_BTN),

                Switch.toNewWindow(),
                //Click.on(CrudProponente.CONTINUAR_TRES_BTN)
                Scroll.to(CrudProponente.TIPO_IDENTIFICACION_SLC),
                Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC),
                Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC),
                Hit.the(Keys.UP).into(CrudProponente.TIPO_IDENTIFICACION_SLC),
                Clear.field(CrudProponente.IDENTIFICACION_INPUT),
                Enter.theValue(ident).into(CrudProponente.IDENTIFICACION_INPUT),
                Click.on(CrudProponente.VERIFICAR_IDENT_BTN),
                Scroll.to(CrudProponente.EMAIL_CONFIR_INPUT),
                Enter.theValue(email).into(CrudProponente.EMAIL_CONFIR_INPUT),
                Click.on(CrudProponente.GENERAR_RECIBO_DOS_BTN),
                Click.on(CrudProponente.CONTINUAR_MODAL_BTN),
                Click.on(CrudProponente.DESCARGAR_DOS_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                Switch.toTheOtherWindow(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(CrudProponente.MODAL_CERRAR_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                JavaScriptClick.on(CrudProponente.SERVICIOS_FINAL_BTN),
                JavaScriptClick.on(CrudProponente.SOPORTES_FINAL_BTN)//*/
 //       );
        } else {
            actor.attemptsTo(
                    JavaScriptClick.on(BTN_CAMBIAR)
            );
        }

    }

}