package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;



import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AsignarXMLacodigodebarrasProponentesPage.*;


public class AsignarXMLaCodigoDeBarrasProponentesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                SwitchToNewWindow.switchToNewTab(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Asignar XML a codigo de barras (proponentes)" )
                      );


        actor.attemptsTo(


                WaitSeconds.seconds(1),
                Enter.theValue("WGQVOX").into(CAMPO_NUMERO_RECUPERACION),
                Enter.theValue("750683").into(CAMPO_CODIGO_BARRAS),
                Click.on(BOTON_CONTINUAR_ASIGNAR),
                WaitSeconds.seconds(1),
                Click.on(SEGUNDO_BOTON_CONTINUAR),
                WaitSeconds.seconds(2),

                LogEvent.recordevent(Reportes.PASSED, "Se Finalizo corectamente las validaciones a Asignar XML a codigo de barras (proponentes)" )



        );







    }

    public static AsignarXMLaCodigoDeBarrasProponentesTask Abogados() {
        return new AsignarXMLaCodigoDeBarrasProponentesTask();
    }
}