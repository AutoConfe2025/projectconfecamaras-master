package com.co.confecamaras.tasks.Bandeja.oficios_requerimientos;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.FileUploadLimpio;
import com.co.confecamaras.interactions.SetInputDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.MENSAJE_ARCHIVAR_PROCESO_FINALIZADO;
import static com.co.confecamaras.userinterfaces.Bandejas.oficios_reclamaciones.Page.*;
import static com.co.confecamaras.utils.bandejas.oficios_requerimientos.constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

public class ResponderOficio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_RESPONDER_OFICIO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_RESPONDER_OFICIO),
                WaitUntil.the(CAMPO_CARGUE_ARCHIVOS, WebElementStateMatchers.isPresent()).forNoMoreThan(20).seconds(),
                SendKeys.of(FileUploadLimpio.archivoDoc()).into(CAMPO_CARGUE_ARCHIVOS),
                Click.on(CAMPO_COMENTARIO),
                Enter.theValue(TEXTO_COMENTARIO).into(CAMPO_COMENTARIO),
                Click.on(CAMPO_DOCUMENTO_RESPUESTA),
                Enter.theValue(TEXTO_NUMERO_DEL_DOCUMENTO).into(CAMPO_DOCUMENTO_RESPUESTA),
                Click.on(CAMPO_FECHA_RESPUESTA),
                SetInputDate.with(CAMPO_FECHA_RESPUESTA, FECHA),
                Click.on(BOTON_ACTUALIZAR_ARCHIVAR)
        );

        actor.should(
                seeThat("Mensaje archivado correctamente",
                        of(MENSAJE_ARCHIVAR_PROCESO_FINALIZADO), containsString(MENSAJE_ARCHIVACION_EXITOSA_OFICIOS))
        );
    }

    public static ResponderOficio respondeOficio() {
        return new ResponderOficio();
    }
}
