package com.co.confecamaras.interactions.News;

import com.co.confecamaras.utils.News.Acciones.TypeKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class PressKey implements Interaction {
    private final String key;

    public PressKey(String key) {
        this.key = key;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        TypeKey.EnterKey(key);
    }

    public static PressKey press(String key) {
        return Tasks.instrumented(PressKey.class, key);
    }


}
