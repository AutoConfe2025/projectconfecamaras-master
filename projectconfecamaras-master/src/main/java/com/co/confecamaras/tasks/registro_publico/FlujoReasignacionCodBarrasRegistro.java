package com.co.confecamaras.tasks.registro_publico;

import com.co.confecamaras.interactions.EnterTheValueNTimes;
import com.co.confecamaras.interactions.News.AcceptAlert;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.registros_publicos.ReasignacionCodBarrasPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class FlujoReasignacionCodBarrasRegistro implements Task {

    private final String codigo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_NUMERO_CODIGO_BARRAS,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_NUMERO_CODIGO_BARRAS),
                Enter.theValue(codigo).into(CAMPO_NUMERO_CODIGO_BARRAS),
                Click.on(BOTON_CONTINUAR_COD_BARRAS),
                WaitUntil.the(LISTA_ASIGNAR_USUARIO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(LISTA_ASIGNAR_USUARIO),
                Click.on(OPCION_ASIGNAR_USUARIO),
                Click.on(LISTA_ESTADO_A_APLICAR),
                Click.on(OPCION_ESTADO_A_APLICAR),
                Click.on(LISTA_TIPO),
                Click.on(OPCION_TIPO),
                Click.on(CAMPO_OBSERVACIONES),
                EnterTheValueNTimes.into(CAMPO_OBSERVACIONES,4),
                Click.on(BOTON_ACEPTAR),
                AcceptAlert.aceptar()
        );
    }

    public static FlujoReasignacionCodBarrasRegistro FlujoreasignacionCodigo(String codigo){
        return new FlujoReasignacionCodBarrasRegistro(codigo);
    }
}
