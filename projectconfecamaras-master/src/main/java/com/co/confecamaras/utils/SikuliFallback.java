package com.co.confecamaras.utils;

import net.serenitybdd.screenplay.Actor;

public class SikuliFallback {
    public static void ejecutarConFallback(Actor actor, Runnable serenityActions, Runnable sikuliFallbackActions) {
        try {
            serenityActions.run();
            System.out.println("INFO: Bloque Serenity/Healenium ejecutado con éxito.");
        } catch (Throwable t) {
            System.out.println("WARN: Serenity/Healenium falló -> " + t.getClass().getSimpleName() + ": " + t.getMessage());

            try {
                sikuliFallbackActions.run();
                System.out.println("INFO: Fallback Sikuli ejecutado correctamente.");
            } catch (Exception ex) {
                System.out.println("ERROR: También falló el fallback con Sikuli -> " + ex.getMessage());
                throw new RuntimeException("El fallback de Sikuli también falló después de un error inicial.", t);
            }
        }
    }
}