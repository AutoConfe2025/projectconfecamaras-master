package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted7Segundos;
import com.co.confecamaras.questions.devdos.InscripcionDocumentosProponentesQuestion;
import com.co.confecamaras.userinterfaces.InscripcionDocumentos;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;


import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.BTN_CONTINUAR_FINALIZAR_ESTUDIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoInscripcionDocumentos implements Task {

    String barcode = getBarcode();

    public static Performable inscripcionDocumentos(){
        return instrumented(DoInscripcionDocumentos.class);
    }

    public static Performable toToAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(MenuSistema.BUSQUEDA_INPUT),
                Enter.theValue("Estudio RegPro").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Enter.theValue(barcode).into(InscripcionDocumentos.COD_BARRAS_INPUT).thenHit(Keys.ENTER),
                Click.on(InscripcionDocumentos.INICIAR_ESTUDIO_IMG),
                WaitSeconds.seconds(2),
                Switch.toFrame(0),
                Click.on(InscripcionDocumentos.REVISADO_BTN),
                Scroll.to(InscripcionDocumentos.REVISADO_DIR_COMERCIAL_BTN),
                Click.on(InscripcionDocumentos.REVISADO_DIR_COMERCIAL_BTN),
                Scroll.to(InscripcionDocumentos.REVISADO_DIR_NOTIFICACION_BTN),
                Click.on(InscripcionDocumentos.REVISADO_DIR_NOTIFICACION_BTN),
                Click.on(InscripcionDocumentos.REVISADO_UNSPSC_BTN),
                Click.on(InscripcionDocumentos.REVISADO_CAPACIDAD_FINAN_BTN),
                Scroll.to(InscripcionDocumentos.REVISADO_EXPERIENCIA_BTN),
                Click.on(InscripcionDocumentos.REVISADO_EXPERIENCIA_BTN),
                Scroll.to(InscripcionDocumentos.RUT_BTN),
                Click.on(InscripcionDocumentos.RUT_BTN),
                Click.on(InscripcionDocumentos.DOCUMENTO_IDENT_BTN),
                Click.on(InscripcionDocumentos.CERT_EMPRESA_BTN),
                Click.on(InscripcionDocumentos.DOC_APODERADO_BTN),
                Click.on(InscripcionDocumentos.PODER_BTN),
                Scroll.to(InscripcionDocumentos.PODER_BTN),
                Click.on(InscripcionDocumentos.REVISOR_FISCAL_BTN),
                Click.on(InscripcionDocumentos.TARJETA_PROF_BTN),
                Click.on(InscripcionDocumentos.JUNTA_CENTRAL_BTN),
/*
                Scroll.to(InscripcionDocumentos.SOPORTES_UNO_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_UNO_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_DOS_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_TRES_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_CUATRO_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_CINCO_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_SEIS_BTN),
                Scroll.to(InscripcionDocumentos.SOPORTES_SIETE_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_SIETE_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_OCHO_BTN),
                Click.on(InscripcionDocumentos.SOPORTES_NUEVE_BTN),
                Click.on(InscripcionDocumentos.SOPORT_EXP_BTN),
*/
                Switch.toParentFrame(),
                Click.on(InscripcionDocumentos.INSCRIBIR_BTN),
                toToAlert(),
                WaitConstant.esperaConstante(),
                WaitSeconds.seconds(7),
                Switch.toFrame(1),
                Scroll.to(InscripcionDocumentos.HORA_PUBLI_TXT));
        actor.should(seeThat(InscripcionDocumentosProponentesQuestion.validacion()));
        actor.attemptsTo(
                Switch.toParentFrame(),
                Click.on(InscripcionDocumentos.REGRESAR_BANDEJA_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue(barcode).into(InscripcionDocumentos.COD_BARRAS_INPUT).thenHit(Keys.ENTER),
                Click.on(InscripcionDocumentos.FINALIZAR_ESTUDIO_IMG),
                WaitInteractions.untilAppears(BTN_CONTINUAR_FINALIZAR_ESTUDIO),
                Click.on(BTN_CONTINUAR_FINALIZAR_ESTUDIO),
                WaitInterrupted2Segundos.esperaConstante2()
        );
    }
}
