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
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MaestroClavesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        Random random = new Random();
        int min = 1;
        int max = 999;
        int idAleatorio = random.nextInt(max - min + 1) + min;

        // 3. Convertir el ID a String para la interacción Enter
        String idOpcion = String.valueOf(idAleatorio);

        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_NUEVA_OPCION),
                Click.on(BOTON_NUEVA_OPCION),
                Enter.theValue("00."+idOpcion).into(CAMPO_ID_OPCION),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso el valor: "+"00."+idOpcion ),
                WaitSeconds.seconds(2),
                Enter.theValue("QA "+idOpcion).into(CAMPO_NOMBRE_),
                WaitSeconds.seconds(2),
                Enter.theValue("QA").into(CAMPO_PATH_SCRIPT),
                WaitSeconds.seconds(2),
                Enter.theValue("QA").into(CAMPO_SCRIPT),
                WaitSeconds.seconds(2),
                SelectFromOptions.byVisibleText("Accion")
                        .from(SELECT_TIPO_OPCION),
                WaitSeconds.seconds(2),
                Click.on(SWITCH_ESTADO),
                Click.on(LABEL_CONSULTA),
                Click.on(SWITCH_MOSTRAR_ICONOS),
                Scroll.to(SWITCH_TIPO_USUARIO),
                WaitSeconds.seconds(2),
                Click.on(SWITCH_TIPO_USUARIO),
                WaitSeconds.seconds(2),
                Click.on(SWITCH_TIPO_ADMINISTRADOR),
                WaitSeconds.seconds(2),
                Click.on(SWITCH_TIPO_VENTAS),
                WaitSeconds.seconds(2),
                Click.on(SWITCH_TIPO_REGISTRO),
                Enter.theValue("QA").into(CAMPO_TOOLTIP),

                Enter.theValue("QA").into(CAMPO_ENLACE_GENERAL),

                Enter.theValue("QA").into(CAMPO_PARAMETROS_PHP),
                Scroll.to(LABEL_NUEVA_PANTALLA),
                Click.on(LABEL_NUEVA_PANTALLA),
                Scroll.to(DROPDOWN_TIPO_EMPRESA),
                SelectFromOptions.byVisibleText("Todas (general)")
                        .from(DROPDOWN_TIPO_EMPRESA),
                Scroll.to(DROPDOWN_TIPO_EMPRESA_2),
                SelectFromOptions.byVisibleText("Asistencia Vial")
                        .from(DROPDOWN_TIPO_EMPRESA_2),
                Scroll.to(DROPDOWN_TIPO_EMPRESA_3),
                SelectFromOptions.byVisibleText("Todas las Cámaras de Comercio")
                        .from(DROPDOWN_TIPO_EMPRESA_3),

                Scroll.to(SWITCH_MOSTRAR_MENU_MOVIL),
                Click.on(SWITCH_MOSTRAR_MENU_MOVIL),
                Click.on(SWITCH_MOSTRAR_ICONOS_2),
                Scroll.to(SWITCH_SII2_MOSTRAR),
                Click.on(SWITCH_SII2_MOSTRAR),
                Enter.theValue("QA").into(CAMPO_CLASE_PHP),
                Scroll.to(BOTON_GRABAR_OPCION),
                WaitSeconds.seconds(3),
                Click.on(BOTON_GRABAR_OPCION),
                Click.on(BOTON_ACEPTAR_SWAL),
                WaitSeconds.seconds(3),
                RefreshPage.refresh(),
                WaitSeconds.seconds(3),
                RefreshPage.refresh()
        );
        actor.attemptsTo(
                Enter.theValue(idOpcion).into(CAMPO_FILTRAR)
        );
        actor.should(
                seeThat(
                        Text.of(CELDA_RESULTADO_PRIMERA_FILA_COLUMNA_QA),
                        // Verificamos que el texto obtenido sea igual a "QA"
                        Matchers.equalTo("QA "+idOpcion)
                )
        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_INACTIVAR_OPCION),
                Click.on(BOTON_INACTIVAR_OPCION),
                WaitSeconds.seconds(3),
                Click.on(BOTON_SI_SWAL),
                WaitSeconds.seconds(2),
                Click.on(BOTON_ACEPTAR_SWAL)

        );
        actor.attemptsTo(
                WaitInteractions.untilAppears(BOTON_ELIMINAR_OPCION),
                Click.on(BOTON_ELIMINAR_OPCION),
                WaitSeconds.seconds(3),
                Click.on(BOTON_SI_SWAL),
                WaitSeconds.seconds(2),
                Click.on(BOTON_ACEPTAR_SWAL)

        );

    }

    public static MaestroClavesTask tablasBasicas() {
        return new MaestroClavesTask();
    }
}
