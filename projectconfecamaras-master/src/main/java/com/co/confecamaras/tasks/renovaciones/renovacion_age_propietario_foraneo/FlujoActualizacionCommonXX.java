package com.co.confecamaras.tasks.renovaciones.renovacion_age_propietario_foraneo;

import com.co.confecamaras.interactions.CloseCurrentTab;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgePropietarioForaneo.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoActualizacionCommonXX implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LISTA_SELECCION_BLOQUEO_PROPIETARIO_NO_RENOADO_FORANEO).andAlignToBottom(),
                SelectFromOptions.byValue("SI").from(LISTA_SELECCION_BLOQUEO_PROPIETARIO_NO_RENOADO_FORANEO),
                Scroll.to(BOTON_DE_GRABAR_CAMBIOS).andAlignToBottom(),
                Click.on(BOTON_DE_GRABAR_CAMBIOS),
                WaitUntil.the(BOTON_CERRAR_MENSAJE_GRABADO_EXITOSO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CERRAR_MENSAJE_GRABADO_EXITOSO),
                CloseCurrentTab.now(),
                SwitchToWindow.at(0)

        );
    }

    public static FlujoActualizacionCommonXX FlujoActualizarCommon(){
        return instrumented(FlujoActualizacionCommonXX.class);
    }
}
