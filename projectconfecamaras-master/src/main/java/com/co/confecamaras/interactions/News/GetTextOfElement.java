package com.co.confecamaras.interactions.News;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class GetTextOfElement implements Interaction {
    private final Target target;
    private static String text;

    public GetTextOfElement(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        text = target.resolveFor(actor).getText().trim();
        Reportes.reportEvent(Reportes.INFO,text);
    }

    public static String getText() {
        return text;
    }

    /**
     * Por medio del elemento solicitado se podra visualizar el texto que contiene
     *
     * @param target
     * @return
     * @author: Isaac Gomez
     */
    public static GetTextOfElement de(Target target) {
        return new GetTextOfElement(target);
    }
}
