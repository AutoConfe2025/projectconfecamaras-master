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
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import java.util.Random;

import static com.co.confecamaras.userinterfaces.Bandejas.MantenimientoTablasBasicas.MaestroClavesPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.MantenimientoTablasBasicas.MaestroDeTramitesSinCostoPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.MantenimientoTablasBasicas.MensajesErrorPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MaestroDeTramitesSinCostoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        Random random = new Random();
        int min = 1;
        int max = 999;
        int idAleatorio = random.nextInt(max - min + 1) + min;

        String idOpcion = String.valueOf(idAleatorio);

        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_NUEVO_TRAMITE_SIN_COSTO),
                Click.on(BOTON_NUEVO_TRAMITE_SIN_COSTO),
                SelectFromOptions.byVisibleText("RegEsadl - ( Registro de ESADL, Economia Solidaria, ONGs extrangeras )")
                        .from(SELECT_TIPO_REGISTRO),
                SelectFromOptions.byVisibleText("aceptacionesesadl - ( Aceptaciones Registro de ESADL )")
                        .from(SELECT_TIPO_TRAMITE),
                SelectFromOptions.byVisibleText("01")
                        .from(SELECT_SUBTIPO_TRAMITE),
                Enter.theValue("QA "+idOpcion).into(CAMPO_DESCRIPCION_TRAMITE),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso el valor: "+"QA "+idOpcion ),
                Scroll.to(SELECT_RUTA_DE_REPARTO),
                SelectFromOptions.byVisibleText("13 - ( RESOLUCIONES Y CONCORDATOS )")
                        .from(SELECT_RUTA_DE_REPARTO),
                SelectFromOptions.byVisibleText("01010000 - ( CERTIFICADOS )")
                        .from(SELECT_SERVICIO_UNO),
                SelectFromOptions.byVisibleText("01010081 - ( CERTIFICADO ELECTRONICO CAPA 1 )")
                        .from(SELECT_SERVICIO_DOS),
                SelectFromOptions.byVisibleText("01010082 - ( CERTIFICADO ELECTRONICO CAPA 2 )")
                        .from(SELECT_SERVICIO_TRES),
                LogEvent.recordevent(Reportes.INFO, "Se Realizaron todos los selects" ),
                WaitSeconds.seconds(2),
                Scroll.to(CHECKBOX_ACEPTACION),
                Click.on(CHECKBOX_ACEPTACION),
                Click.on(CHECKBOX_DESEMBARGO),

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
                Enter.theValue(idOpcion).into(CAMPO_FILTRAR_),
                LogEvent.recordevent(Reportes.INFO, "Se Filtro el valor "+"QA"+idOpcion )
        );
        actor.should(
                seeThat(
                        Text.of(CELDA_RESULTADO_PRIMERA_FILA_COLUMNA_CUATRO),
                        Matchers.equalTo("QA "+idOpcion)
                )
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_ACTUALIZAR_TRAMITE_SIN_COSTO),
                Click.on(BOTON_ACTUALIZAR_TRAMITE_SIN_COSTO),
                WaitSeconds.seconds(3),
                Scroll.to(CHECKBOX_PIDE_PQR),
                Click.on(CHECKBOX_PIDE_PQR),
                Click.on(INPUT_TEXTO_LIBRE),
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
                WaitInteractions.untilAppears(BOTON_ELIMINAR_TRAMITE_SIN_COSTO),
                Click.on(BOTON_ELIMINAR_TRAMITE_SIN_COSTO),
                WaitSeconds.seconds(3),
                Click.on(BOTON_SI_SWAL),
                WaitSeconds.seconds(2),
                Click.on(BOTON_ACEPTAR_SWAL),
                LogEvent.recordevent(Reportes.PASSED, "se Realizo la verificacion correctamnete de tramite sin costo" )
        );

    }

    public static MaestroDeTramitesSinCostoTask EstadisticasyExtracciones() {
        return new MaestroDeTramitesSinCostoTask();
    }
}
