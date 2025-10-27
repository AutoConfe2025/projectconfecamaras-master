package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted3Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted7Segundos;
import com.co.confecamaras.questions.devdos.InscripcionDocumentosMercantilQuestion;
import com.co.confecamaras.userinterfaces.InscripcionDocumentos;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.utils.RobotPegar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.getBarcode;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DoInscripcionDocumentosMercantil implements Task {

    String barcode = getBarcode();
    private final String codBarras;
    private final String correo;
    private final String numero;

    public DoInscripcionDocumentosMercantil(String codBarras, String correo, String numero){
        this.codBarras = codBarras;
        this.correo = correo;
        this.numero = numero;
    }

    public static Performable inscripcionDocumentosMercantil(String codBarras, String correo, String numero){
        return instrumented(DoInscripcionDocumentosMercantil.class, codBarras, correo, numero);
    }

    public static Performable toToAlert() {
        return new DriverTask( driver -> driver.switchTo().alert().accept() );
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Estudio RegMtil").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(InscripcionDocumentos.BTN_CODIGO_BARRAS_ID),
                Enter.theValue(barcode).into(InscripcionDocumentos.BTN_CODIGO_BARRAS_ID).thenHit(Keys.ENTER),
                Click.on(InscripcionDocumentos.INICIAR_ESTUDIO_IMG),
                WaitInterrupted3Segundos.esperaConstante3(),
                Switch.toFrame(2),
                Enter.theValue(correo).into(InscripcionDocumentos.EMAIL_INPUT),
                Enter.theValue(numero).into(InscripcionDocumentos.TELEFONO_INPUT),
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
                Click.on(InscripcionDocumentos.FINALIZAR_ESTUDIO_IMG)
        );
        theActorInTheSpotlight().should(seeThat(InscripcionDocumentosMercantilQuestion.validacion()));
        actor.attemptsTo(
                Click.on(BTN_CONTINUAR_FIN_ESTUDIO)
        );
    }
}
