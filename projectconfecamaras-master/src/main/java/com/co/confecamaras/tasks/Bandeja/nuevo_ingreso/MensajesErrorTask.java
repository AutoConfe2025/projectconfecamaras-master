package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.RefreshPage;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import java.util.Random;

import static com.co.confecamaras.userinterfaces.Bandejas.MantenimientoTablasBasicas.MaestroClavesPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.MantenimientoTablasBasicas.MensajesErrorPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MensajesErrorTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        Random random = new Random();
        int min = 1;
        int max = 999;
        int idAleatorio = random.nextInt(max - min + 1) + min;
        String idOpcion = String.valueOf(idAleatorio);

        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_NUEVO_MENSAJE_ERROR),
                Click.on(BOTON_NUEVO_MENSAJE_ERROR),
                Enter.theValue("QA"+idOpcion).into(ERROR_TITULO),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso el valor: "+"QA"+idOpcion ),
                WaitSeconds.seconds(2),
                Enter.theValue("QA "+idOpcion).into(MENSAJE_ERROR),
                WaitSeconds.seconds(2),
                Scroll.to(BOTON_GRABAR),
                WaitSeconds.seconds(3),
                Click.on(BOTON_GRABAR),
                Click.on(BOTON_ACEPTAR_SWAL),
                WaitSeconds.seconds(3),
                RefreshPage.refresh(),
                WaitSeconds.seconds(3),
                RefreshPage.refresh()
        );
        actor.attemptsTo(
                Enter.theValue(idOpcion).into(CAMPO_FILTRAR_)
        );
        actor.should(
                seeThat(
                        Text.of(CELDA_RESULTADO_PRIMERA_FILA_COLUMNA_QA),
                        Matchers.equalTo("QA "+idOpcion)
                )
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_ACTUALIZAR_ERROR),
                Click.on(BOTON_ACTUALIZAR_ERROR),
                WaitSeconds.seconds(3),
                Enter.theValue("QA edit"+idOpcion).into(ERROR_TITULO),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso el valor: "+"QA"+idOpcion ),
                WaitSeconds.seconds(2),
                Enter.theValue("QA edit"+idOpcion).into(MENSAJE_ERROR),
                WaitSeconds.seconds(2),
                Scroll.to(BOTON_GRABAR),
                WaitSeconds.seconds(3),
                Click.on(BOTON_GRABAR),
                Click.on(BOTON_ACEPTAR_SWAL)

        );
        actor.attemptsTo(
                Enter.theValue(idOpcion).into(CAMPO_FILTRAR_),
                LogEvent.recordevent(Reportes.INFO, "Se Filtro el valor "+"QA"+idOpcion )
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_ELIMINAR_ERROR),
                Click.on(BOTON_ELIMINAR_ERROR),
                WaitSeconds.seconds(3),
                Click.on(BOTON_SI_SWAL),
                WaitSeconds.seconds(2),
                Click.on(BOTON_ACEPTAR_SWAL),
                LogEvent.recordevent(Reportes.PASSED, "se Realizo la verificacion correctamnete de Mensaje de error" )
        );

    }

    public static MensajesErrorTask tablasBacisas() {
        return new MensajesErrorTask();
    }
}
