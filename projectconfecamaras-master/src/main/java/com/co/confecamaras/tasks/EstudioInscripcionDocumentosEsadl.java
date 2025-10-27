package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted7Segundos;
import com.co.confecamaras.questions.devdos.InscripcionDocumentosMercantilQuestion;
import com.co.confecamaras.userinterfaces.InscripcionDocumentos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.getBarcode;
import static com.co.confecamaras.tasks.DoInscripcionDocumentosMercantil.toToAlert;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.EstudioInscripcionDocumentosEsadlUI.*;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.BTN_CONTINUAR_FIN_ESTUDIO;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.BTN_REFRESCAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EstudioInscripcionDocumentosEsadl implements Task {

    String barcode = getBarcode();
    private String idCodigoBarras;
    private String idEmail;
    private String idCelular;

    public EstudioInscripcionDocumentosEsadl(String idCodigoBarras, String idEmail, String idCelular) {
        this.idCodigoBarras = idCodigoBarras;
        this.idEmail = idEmail;
        this.idCelular = idCelular;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_ESTUDIO_REGESADL),
                Scroll.to(BTN_ESTUDIO_REGESADL).andAlignToBottom(),
                Click.on(BTN_ESTUDIO_REGESADL),
                SwitchToNewWindow.switchToNewTab(),
                WaitInteractions.untilAppears(InscripcionDocumentos.BTN_CODIGO_BARRAS_ID),
                Enter.theValue(barcode).into(InscripcionDocumentos.BTN_CODIGO_BARRAS_ID).thenHit(Keys.ENTER),
                Click.on(InscripcionDocumentos.INICIAR_ESTUDIO_IMG),
                WaitInterrupted3Segundos.esperaConstante3(),
                Switch.toFrame(2),
                Enter.theValue(idEmail).into(InscripcionDocumentos.EMAIL_INPUT),
                Enter.theValue(idCelular).into(InscripcionDocumentos.TELEFONO_INPUT),
                Click.on(InscripcionDocumentos.ASOCIAR_BTN),
                toToAlert(),
                Click.on(InscripcionDocumentos.INSCRIBIR_ACTOS_BTN),
                toToAlert(),
                Click.on(InscripcionDocumentos.TERMINAR_INSCRIPCION_BTN),
                WaitConstant.esperaConstante(),
                toToAlert(),
                Switch.toParentFrame(),
                Click.on(InscripcionDocumentos.REGRESAR_BANDEJA_BTN),
                WaitInterrupted7Segundos.esperaConstante7(),
                WaitInteractions.untilAppears(BTN_REFRESCAR),
                Click.on(BTN_REFRESCAR),
                WaitInteractions.untilAppears(InscripcionDocumentos.BTN_CODIGO_BARRAS_ID),
                Enter.theValue(barcode).into(InscripcionDocumentos.BTN_CODIGO_BARRAS_ID).thenHit(Keys.ENTER),
                Click.on(InscripcionDocumentos.FINALIZAR_ESTUDIO_IMG_ESADL),
                WaitInteractions.untilAppears(BTN_CONTINUAR_FIN_ESTUDIO),
                Click.on(BTN_CONTINUAR_FIN_ESTUDIO)
        );
    }

    public static EstudioInscripcionDocumentosEsadl enConfecamaraSII(String idCodigoBarras, String idEmail, String idCelular){
        return Tasks.instrumented(EstudioInscripcionDocumentosEsadl.class, idCodigoBarras, idEmail, idCelular);
    }
}