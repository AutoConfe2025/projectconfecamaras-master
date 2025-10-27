package com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones;

import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.WaitSeconds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class ConfirmarAlertaAccionTask implements Task {
    private final Target texto;
    private final Target elemento;

    public ConfirmarAlertaAccionTask(Target texto, Target elemento) {
        this.texto = texto;
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                GetTextOfElement.de(texto),
                WaitSeconds.seconds(1),
                Click.on(elemento)
        );
    }

    public static ConfirmarAlertaAccionTask confirmar(Target texto, Target accion) {
        return new ConfirmarAlertaAccionTask(texto, accion);
    }
}
