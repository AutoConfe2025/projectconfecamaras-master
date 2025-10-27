package com.co.confecamaras.tasks.Certificados.Demas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.util.Map;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa.*;


public class CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa implements Task {

    public final Map<String, String> data;

    public CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //LoginUsuarioPublico.enConfecamaras(),
                JavaScriptClick.on(BTN_TRAMITES_Y_CONSULTAS_DEL_EXPEDIENTE),
                Enter.theValue(data.get("Matricula")).into(TXT_BUSQUEDA),
                Click.on(BTN_CONSULTAR),
                Click.on(BTN_ACCIONES),
                Click.on(BTN_OPCIONES_MERCANTIL),
                Click.on(BTN_SOLICITAR_CERTIFICADO),
                Click.on(BTN_CERTIFICADO_AUTOMATICO),
                Enter.theValue("1").into(TXT_CERTIFICADOS),
                Click.on(BTN_CUPO_AFILIADO),
                Enter.theValue(data.get("Clave cupo afiliado")).into(TXT_CLAVE_AFILIADO),
                Click.on(BTN_APLICAR),
                Click.on(BTN_SI)
        );
    }
    public static CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa compraCertificadoMenuAccionesCupoAfiliadoClaveFalsa(Map<String, String> data) {
        return Tasks.instrumented(CompraCertificadoMenuAccionesCupoAfiliadoClaveFalsa.class, data);
    }
}
