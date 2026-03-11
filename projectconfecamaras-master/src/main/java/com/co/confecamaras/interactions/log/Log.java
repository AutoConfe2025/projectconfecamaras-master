package com.co.confecamaras.interactions.log;

import net.serenitybdd.screenplay.Interaction;

public class Log {
    private Log() {} // Prevenir instanciación

    public static Interaction message(String message) {
        return new LogMessage(message);
    }
}
