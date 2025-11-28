package com.co.confecamaras.tasks.mantenimientoeinformes.firma_registro_mercantil_esadl;

import com.co.confecamaras.models.UsuarioPublicoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.Bandejas.estudio_general.PaginaPrincial.*;
import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.FirmaRegistrolMercantilEsadl.*;
import static com.co.confecamaras.utils.estudio_general.constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.TextContent.of;
import static org.hamcrest.Matchers.containsString;

public class FlujoFirmasRegistroMercantilEsadl implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_FIRMAR_INSCRIPCION, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_FIRMAR_INSCRIPCION)
        );

        String textoClave = CLAVE_FIRMADO.resolveFor(actor).getText();


        String clave = textoClave
                .replace("Clave de firmado:", "")
                .replace("\"", "")
                .trim();

        actor.attemptsTo(
                Click.on(CAMPO_CLAVE_USUARIO),
                Enter.theValue(UsuarioPublicoModel.usuarioAdmin27().getContrasena()).into(CAMPO_CLAVE_USUARIO),
                Click.on(CAMPO_CLAVE_FIRMADO),
                Enter.theValue(clave).into(CAMPO_CLAVE_FIRMADO),
                Click.on(BOTON_FIRMAR)
        );

        actor.should(
                seeThat("mensaje de firma correcta",
                        of(MENSAJE_GRABACION_COMENTARIO), containsString(MENSAJE_FIRMA_EXITOSA))
        );

    }

    public static FlujoFirmasRegistroMercantilEsadl FlujRegistroEsadl(){
        return new FlujoFirmasRegistroMercantilEsadl();
    }
}
