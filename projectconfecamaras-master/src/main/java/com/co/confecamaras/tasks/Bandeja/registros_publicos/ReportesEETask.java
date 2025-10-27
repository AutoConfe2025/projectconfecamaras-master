package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.AlertHandler;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ReportesEEPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.ReportesEEPage.*;

public class ReportesEETask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(ReportesEEPage.BTN_VER_EXPEDIENTE),
                Click.on(ReportesEEPage.BTN_VER_EXPEDIENTE),
                WaitSeconds.seconds(2)
        );
        if(actor.asksFor(ElementoElegible.para(BTN_REGISTRAR))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BTN_REGISTRAR),
                    Click.on(BTN_REGISTRAR),
                    AlertHandler.dismiss(),
                    WaitInteractions.untilBeEnable(BTN_PUBLICAR_NOTICIA_RUES),
                    Click.on(BTN_PUBLICAR_NOTICIA_RUES),
                    AlertHandler.dismiss(),
                    WaitInteractions.untilBeEnable(BTN_CARGAR_REPOSITORIO_RUES),
                    Click.on(BTN_CARGAR_REPOSITORIO_RUES),
                    AlertHandler.dismiss(),
                    WaitInteractions.untilBeEnable(BTN_REGRESAR_AUDITORIA),
                    Click.on(BTN_REGRESAR_AUDITORIA)
            );
        }
    }

    public static ReportesEETask verificarReporte() {
        return Tasks.instrumented(ReportesEETask.class);
    }
}
