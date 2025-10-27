package com.co.confecamaras.interactions.News;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class LogEvent implements Interaction {
    private final int eventStatus;
    private final String message;

    public LogEvent(int eventStatus, String message) {
        this.eventStatus = eventStatus;
        this.message = message;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        Reportes.reportEvent(eventStatus, message);
    }

    /**
     * Adaptado a Screenplay, reporta el evento [eventStatus] en la consola y el archivo LOG,<br>
     *
     * @param eventStatus
     * @param message
     * @return
     * @author: Isaac Gomez
     */
    public static LogEvent recordevent(int eventStatus, String message) {
        return Tasks.instrumented(LogEvent.class, eventStatus, message);
    }
}
