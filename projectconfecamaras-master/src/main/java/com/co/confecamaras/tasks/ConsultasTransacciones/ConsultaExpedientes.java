package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.Expediente.*;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.ExpedienteDigitalPage.*;
import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.MATRICULA_EXP;
import static com.co.confecamaras.utils.consultasytransacciones.ConsultarExpedienteConstants.NOMBRE;

public class ConsultaExpedientes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(BTN_MATRICULA),
                WaitInteractions.untilBeEnable(INPUT_DATO_BUSQUEDA),
                Enter.theValue(MATRICULA_EXP).into(INPUT_DATO_BUSQUEDA),
                Click.on(BTN_CONSULTAR_EXPEDIENTE)


        );
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_NUMERO_MATRICULA),
                Click.on(BTN_NUMERO_MATRICULA),
                Click.on(ESTADO_EXPEDIENTE),
                Click.on(SEGURIDAD_SOCIAL),
                Click.on(AUTORIZACION_ENVIO_EMAILS),
                Click.on(UBICACION_COMERCIAL),
                Click.on(NOTIFICACION_JUDICIAL),
                Click.on(SITIO_DE_OPERACION),
                Click.on(ACTIVIDAD_ECONOMICA_Y_CIIUS),
                Click.on(PARTICIPACION),
                Click.on(INFORMACION_FINANCIERA),
                Click.on(REPRESENTACION_LEGAL_Y_OTROS_VINCULOS),
                Click.on(INSCRIPCION_DE_DOCUMENTOS),
                Click.on(RESENA_CASA_PRINCIPAL),
                Click.on(FORMULARIOS_Y_EXPEDIENTE_GRAFICO),
                Click.on(OPERACIONES_DEL_REGISTRO_MERCANTIL_ESADL)
  );
    }

    public static ConsultaExpedientes matricula(){
        return Tasks.instrumented(ConsultaExpedientes.class);
    }
}
