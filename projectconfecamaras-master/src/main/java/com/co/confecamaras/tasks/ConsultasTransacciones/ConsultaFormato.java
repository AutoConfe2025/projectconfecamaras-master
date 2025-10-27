package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.FormulariosYFoematosPage.*;

public class ConsultaFormato implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilBeEnable(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                WaitInteractions.untilBeEnable(BTN_FORMULARIOS_Y_FORMATOS_EN_BLANCO),
                Scroll.to(BTN_FORMULARIOS_Y_FORMATOS_EN_BLANCO),
                JavaScriptClick.on(BTN_FORMULARIOS_Y_FORMATOS_EN_BLANCO)

                );
        //Primer bloque de formularios+
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_FORMULARIO_EN_BLANCO_REGISTRO_MERCANTIL),
                Click.on(BTN_FORMULARIO_EN_BLANCO_REGISTRO_MERCANTIL),
                WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                Click.on(BTN_CERRAR_FORMULARIO),
                WaitInteractions.untilBeEnable(BTN_FORMULARIO_EN_BLANCO_MERCANTIL_ESTABLECIMEINTO),
                Click.on(BTN_FORMULARIO_EN_BLANCO_MERCANTIL_ESTABLECIMEINTO),
                WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                Click.on(BTN_CERRAR_FORMULARIO),
                WaitInteractions.untilBeEnable(BTN_FORMULARIO_EN_BLANCO_REGISTRO_ENTIDADES),
                Click.on(BTN_FORMULARIO_EN_BLANCO_REGISTRO_ENTIDADES),
                WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                Click.on(BTN_CERRAR_FORMULARIO)
        );
        //Bloque 2 de formularios y ber tabla de formularios
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_FORMULARIO_ANIOS_ANTERIORES_PERSONA),
                Click.on(BTN_FORMULARIO_ANIOS_ANTERIORES_PERSONA),
                WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                Click.on(BTN_CERRAR_FORMULARIO),
                WaitInteractions.untilBeEnable(BTN_FORMULARIO_ANIOS_ANTERIORES_ESTABLECIMIENTO),
                Click.on(BTN_FORMULARIO_ANIOS_ANTERIORES_ESTABLECIMIENTO),
                WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                Click.on(BTN_CERRAR_FORMULARIO),
                WaitInteractions.untilBeEnable(BTN_PAGINAS_DEL_FORMULARIO_RUES),
                Click.on(BTN_PAGINAS_DEL_FORMULARIO_RUES),
                WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                Click.on(BTN_CERRAR_FORMULARIO),
                WaitInteractions.untilBeEnable(BTN_ANEXO_DEL_REGISTRO),
                Click.on(BTN_ANEXO_DEL_REGISTRO),
                WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                Click.on(BTN_CERRAR_FORMULARIO),
                WaitInteractions.untilBeEnable(BTN_FORMATO_DECRETO_DNP),
                Click.on(BTN_FORMATO_DECRETO_DNP),
                WaitInteractions.untilBeEnable(BTN_CERRAR_FORMULARIO),
                Click.on(BTN_CERRAR_FORMULARIO),
                WaitInteractions.untilBeEnable(BTN_VER_FORMATOS),
                Click.on(BTN_VER_FORMATOS)
        );
    }

    public static ConsultaFormato formularioEnBlanco(){
        return Tasks.instrumented(ConsultaFormato.class);
    }
}
