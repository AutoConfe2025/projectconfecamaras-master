package com.co.confecamaras.interactions.News;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class ContainsText implements Interaction {
    private final Target target;
    private final String texto;

    public ContainsText(Target target, String texto) {
        this.target = target;
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String texto_target = target.resolveFor(actor).getText();
        if (texto_target.contains(texto))
            Reportes.reportEvent(Reportes.PASSED, "Se encontro el texto: " + texto);
        else
            Reportes.reportEvent(Reportes.WARNING, "No se encontro el texto: " + texto);
    }

    public static ContainsText contains(Target target, String texto) {
        return Tasks.instrumented(ContainsText.class, target, texto);
    }
}
