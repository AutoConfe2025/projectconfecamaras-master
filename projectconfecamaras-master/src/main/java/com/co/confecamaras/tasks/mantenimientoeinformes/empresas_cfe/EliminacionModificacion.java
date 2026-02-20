package com.co.confecamaras.tasks.mantenimientoeinformes.empresas_cfe;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.EmpresasCfePage.*;
import static com.co.confecamaras.utils.mantenimientoeinformes.EmpresasCFE.*;
import static com.co.confecamaras.utils.mantenimientoeinformes.EmpresasCFE.CIRECCION_COMERCIAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class EliminacionModificacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_BUSAR_REGISTRO, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(CAMPO_BUSAR_REGISTRO),
                WaitUntil.the(BOTON_EDITAR, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_EDITAR),
                Click.on(LISTA_CODIGO_CAMARA),
                Click.on(OPCION_MEDELLIN),
                Click.on(CAMPO_CORREO_1),
                Enter.theValue(CORREO).into(CAMPO_CORREO_1),
                Click.on(CAMPO_TELEFONO_1_1),
                Enter.theValue(NUMERO).into(CAMPO_TELEFONO_1_1),
                Scroll.to(BOTON_GRABAR_),
                Click.on(BOTON_GRABAR_)
        );
    }

    public static EliminacionModificacion EliminaModificaCFE(){
        return new EliminacionModificacion();
    }
}
