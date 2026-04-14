package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.AceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.interactions.VolverPaginaAnterior;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;


import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.contabilizacvion_ingresos.PageContabilizacionIngresos.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ContabilizacionIngresosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2));

        actor.attemptsTo(
                Click.on(BOTON_SELECCIONAR_DIA),
                VolverPaginaAnterior.ir(),
                Click.on(BOTON_VERIFICAR_RECIBOS),
                AceptAlert.aceptar(),
                Click.on(BOTON_DESCARGAR_RECIBOS),
                VolverPaginaAnterior.ir(),
                Click.on(BOTON_RELACION_DOCUMENTOS),
                AceptAlert.aceptar(),
                Click.on(BOTON_DESCARGAR_RECIBOS)
        );
    }

    public static ContabilizacionIngresosTask jsp7() {
        return new ContabilizacionIngresosTask();
    }
}
