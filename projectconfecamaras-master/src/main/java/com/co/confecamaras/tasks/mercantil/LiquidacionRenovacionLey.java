package com.co.confecamaras.tasks.mercantil;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.mercantil.LiquidacionRenovacionLeyConstans;
import com.co.confecamaras.utils.mercantil.RenovacionAniosConstans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.poi.hssf.record.PageBreakRecord;

import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.*;
import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.BTN_ACCIONES;
import static com.co.confecamaras.userinterfaces.RecibirPagoUI.BTN_POP_UP_ATENCION_CERRAR;
import static com.co.confecamaras.userinterfaces.RenovacionMatriculaSociedadUI.*;
import static com.co.confecamaras.userinterfaces.RenovacionPNRenov.RENOVAR_SI_BTN;
import static com.co.confecamaras.userinterfaces.mercantil.LiquidacionRenovacionPage.*;
import static com.co.confecamaras.userinterfaces.mercantil.LiquidacionRenovacionPage.BTN_GENERAR_RECIBO;
import static com.co.confecamaras.userinterfaces.mercantil.LiquidacionRenovacionPage.BTN_LIQUIDAR;
import static com.co.confecamaras.userinterfaces.mercantil.RenovacionESADLPage.DIV_DESPLEGAR_ACCIONES;
import static com.co.confecamaras.userinterfaces.mercantil.RenovacionMatriculaPage.*;
import static com.co.confecamaras.utils.mercantil.LiquidacionRenovacionLeyConstans.VALOR_ACTIVOS;

public class LiquidacionRenovacionLey implements Task {
    private String matriculaLey;

    public LiquidacionRenovacionLey(String matriculaLey) {
        this.matriculaLey = matriculaLey;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(CHECK_BOX_CONSULTA),
                Click.on(CHECK_BOX_CONSULTA),
                WaitInteractions.untilBeEnable(TXT_INFORMACION),
                Enter.theValue(matriculaLey).into(TXT_INFORMACION),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR),
                WaitInteractions.untilBeEnable(BTN_ACCIONES),
                Click.on(BTN_ACCIONES),
                WaitInteractions.untilBeEnable(DIV_DESPLEGAR_ACCIONES),
                Click.on(DIV_DESPLEGAR_ACCIONES),
                WaitInteractions.untilBeEnable(BTN_RENOVAR_MATRICULA),
                Click.on(BTN_RENOVAR_MATRICULA),
                Scroll.to(BTN_CONTINUAR_RENOVACION_MATRICULA).then(Click.on(BTN_CONTINUAR_RENOVACION_MATRICULA)),
                ModalLoader.modalLoader()
        );

        //********************* NUEVOS ACTIVOS ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilAppears(RENOVAR_SI_BTN),
                Click.on(RENOVAR_SI_BTN),
                WaitInteractions.untilBeEnable(NUEVOS_ACTIVOS_INPUT_PERSONA_NATURAL),
                Enter.theValue(VALOR_ACTIVOS).into(NUEVOS_ACTIVOS_INPUT_PERSONA_NATURAL),
                WaitInteractions.untilBeEnable(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                Enter.theValue(VALOR_ACTIVOS).into(TXT_NUEVOS_ACTIVOS_DOS_SOCIEDAD),
                WaitInteractions.untilBeEnable(CUMPLE_REQUISITOS_SELECT),
                Ensure.that(CUMPLE_REQUISITOS_SELECT).textContentValues().contains(LiquidacionRenovacionLeyConstans.CUMPLO_REQUISITOS_TEXT),
                Click.on(CHECKBOX_CUMPLE_REQUISITOS_SELECT),
                Ensure.that(MANTENGO_REQUISITOS_SELECT).textContentValues().contains(LiquidacionRenovacionLeyConstans.MANTENGO_REQUISITOS_TEXT),
                Click.on(CHECKBOX_MANTENGO_REQUISITOS_SELECT),
                Ensure.that(RENUNCIO_VOLUNTARIAMENTE_SELECT).textContentValues().contains(LiquidacionRenovacionLeyConstans.RENUNCIO_VOLUNTARIEMNTE_TEXT),
                WaitInteractions.untilBeEnable(NUMERO_DE_EMPLEADOS_INPUT),
                Scroll.to(NUMERO_DE_EMPLEADOS_INPUT).then(Clear.field(NUMERO_DE_EMPLEADOS_INPUT).then(Enter.theValue("1").into(NUMERO_DE_EMPLEADOS_INPUT))),
                WaitInteractions.untilBeEnable(BTN_LIQUIDAR_SOCIEDAD),
                Scroll.to(BTN_LIQUIDAR_SOCIEDAD).then(Click.on(BTN_LIQUIDAR_SOCIEDAD)),
                ModalLoader.modalLoader()
        );

        //********************* VALIDACION SERVICIO  ************************************************//
        actor.attemptsTo(
                Ensure.that(HEADER_01090111).textContentValues().contains(LiquidacionRenovacionLeyConstans.NUMERO_SERVICIO),
                Ensure.that(DSCTO_RENOV_LEY_1780_CELL).textContentValues().contains(LiquidacionRenovacionLeyConstans.NOMBRE_SERVICIO)
        );

        //********************* CARGA SOPORTES ************************************************//

        for (int i = 0; i <= 50; i++){
            System.out.println("Cargo Soporte: " + i);
            if(actor.asksFor(ElementoElegible.para(CARGAR_SOPORTES_DOCUMENTALES))){
                actor.attemptsTo(
                        WaitInteractions.untilBeEnable(CARGAR_SOPORTES_DOCUMENTALES),
                        Scroll.to(CARGAR_SOPORTES_DOCUMENTALES).andAlignToBottom(),
                        Click.on(CARGAR_SOPORTES_DOCUMENTALES)
                );
            }
            else {
                break;
            }
            actor.attemptsTo(
                    //Boque Cargar Anexol
                    WaitInteractions.untilBeEnable(CARGAR_SOPORTES_DOCUMENTALES),
                    SendKeys.of(FileUpload.subirArchivo().archivoPj()).into(CARGAR_ANEXO),
                    WaitInteractions.untilBeEnable(TXT_OBSERVACIONES),
                    Enter.theValue("CARGUE SOPORTE").into(TXT_OBSERVACIONES),
                    WaitInteractions.untilBeEnable(BTN_CARGAR),
                    Scroll.to(BTN_CARGAR).andAlignToBottom(),
                    Click.on(CALENDAR_SELECT),
                    //WaitInteractions.untilBeEnable(MES_ANTERIOR),
                    //Click.on(MES_ANTERIOR),
                    WaitInteractions.untilBeEnable(SELECT_FECHA),
                    Click.on(SELECT_FECHA),
                    Enter.theValue("EL COMERCIANTE").into(ENTIDAD_PERSONA_QUE_EXPIDE),
                    Click.on(BTN_CARGAR),
                    ModalLoader.modalLoader(),
                    WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                    Click.on(BTN_CERRAR_FORMULARIO),
                    ModalLoader.modalLoader()
            );
        }

        //********************* FORMULARIO ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(FORMULARIO_PERSONA),
                Scroll.to(FORMULARIO_PERSONA).andAlignToBottom().then(Click.on(FORMULARIO_PERSONA))
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(SELECT_ADM_DIAN))){
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(SELECT_ADM_DIAN),
                SelectFromOptions.byValue("01").from(SELECT_ADM_DIAN),
                WaitInteractions.untilBeEnable(AUTORIZACION_EVIO_EMAIL),
                SelectFromOptions.byValue("NO").from(AUTORIZACION_EVIO_EMAIL),
                WaitInteractions.untilBeEnable(INPUT_ACTIVOS),
                Scroll.to(INPUT_ACTIVOS).andAlignToBottom(),
                Enter.theValue(VALOR_ACTIVOS).into(INPUT_ACTIVOS),
                WaitInteractions.untilBeEnable(INPUT_ACTIVOS_NETO),
                Enter.theValue(VALOR_ACTIVOS).into(INPUT_ACTIVOS_NETO),
                WaitInteractions.untilBeEnable(INPUT_CANTIDAD_PERSONAL),
                Scroll.to(INPUT_CANTIDAD_PERSONAL).andAlignToBottom(),
                Clear.field(INPUT_CANTIDAD_PERSONAL).then(Enter.theValue("2").into(INPUT_CANTIDAD_PERSONAL)),
                WaitInteractions.untilBeEnable(INPUT_CAMTIDAD_MUJERES),
                Clear.field(INPUT_CAMTIDAD_MUJERES).then(Enter.theValue("1").into(INPUT_CAMTIDAD_MUJERES)),
                WaitInteractions.untilBeEnable(BTN_ALMACENAR),
                Scroll.to(BTN_ALMACENAR).andAlignToBottom().then(Click.on(BTN_ALMACENAR))
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(BTN_CERRAR_CARGA))){
                int indexFila = i = 50;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_CERRAR_CARGA),
                Click.on(BTN_CERRAR_CARGA)
                );

        //********************* FORMULARIO ESTABLECIMIENTO ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(FORMULARIO_ESTABLECIMIENTO),
                Scroll.to(FORMULARIO_ESTABLECIMIENTO).andAlignToBottom().then(Click.on(FORMULARIO_ESTABLECIMIENTO))
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(TXT_ACTIVO_VINCULADO_EST))){
                int indexFila = i = 50;
                System.out.println("Ingreso al formulario");
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_ACTIVO_VINCULADO_EST),
                Scroll.to(TXT_ACTIVO_VINCULADO_EST).andAlignToBottom(),
                Enter.theValue(VALOR_ACTIVOS).into(TXT_ACTIVO_VINCULADO_EST),
                WaitInteractions.untilBeEnable(INPUT_CANTIDAD_PERSONAL),
                Scroll.to(INPUT_CANTIDAD_PERSONAL).andAlignToBottom().then(Enter.theValue("2").into(INPUT_CANTIDAD_PERSONAL)),
                WaitInteractions.untilBeEnable(BTN_ALMACENAR),
                Scroll.to(BTN_ALMACENAR).andAlignToBottom().then(Click.on(BTN_ALMACENAR))
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(BTN_CERRAR_CARGA))){
                int indexFila = i = 50;
            } else {
                int indexFila = i+1;
                actor.attemptsTo(WaitSeconds.seconds(2));
                System.out.println("Espera implicita de 2 segundos " + indexFila + " repeticiones");
            }
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_CERRAR_CARGA),
                Click.on(BTN_CERRAR_CARGA)
        );

        //********************* RECIBIR PAGO ************************************************//
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_RECIBIR_PAGO),
                Scroll.to(BTN_RECIBIR_PAGO).andAlignToBottom().then(Click.on(BTN_RECIBIR_PAGO)),
                Switch.toNewWindow()
        );
        if(actor.asksFor(ElementoElegible.para(BTN_POP_UP_ATENCION_CERRAR))){
            actor.attemptsTo(
                    WaitInteractions.untilAppears(BTN_POP_UP_ATENCION_CERRAR),
                    Click.on(BTN_POP_UP_ATENCION_CERRAR)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(DESCUENTO_TEXTO),
                Scroll.to(DESCUENTO_TEXTO).andAlignToBottom(),
                Ensure.that(DESCUENTO_TEXTO).text().contains("$ -569,000"),
                WaitInteractions.untilBeEnable(BTN_FACTURA),
                Scroll.to(BTN_FACTURA).andAlignToBottom().then(Click.on(BTN_FACTURA)),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_LIQUIDACION),
                Click.on(BTN_CONTINUAR_LIQUIDACION),
                WaitInteractions.untilBeEnable(BTN_GENERAR_RECIBO),
                Scroll.to(BTN_GENERAR_RECIBO).andAlignToBottom().then(Click.on(BTN_GENERAR_RECIBO)),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_GENERAR_RECIBO),
                Click.on(BTN_CONTINUAR_GENERAR_RECIBO),
                WaitInterrupted2Segundos.esperaConstante2(),
                CerrarPestana.cerrar(),
                WaitInteractions.untilBeEnable(CERRAR_VENTANA),
                Click.on(CERRAR_VENTANA),
                WaitInterrupted5Segundos.esperaConstante5()
        );
    }

    public static LiquidacionRenovacionLey conMatricula(String matriculaLey) {
        return Tasks.instrumented(LiquidacionRenovacionLey.class, matriculaLey);
    }
}

