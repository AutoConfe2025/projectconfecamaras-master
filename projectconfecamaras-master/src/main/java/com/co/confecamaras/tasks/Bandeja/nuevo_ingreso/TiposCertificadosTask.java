package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.interactions.News.AcceptAlert;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SubirArchivoDoc;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.confecamaras.userinterfaces.Bandejas.CertificadosEspecialesPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.Jsp7.GeneralPage.*;


public class TiposCertificadosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                WaitSeconds.seconds(2),
                Scroll.to(CAMPO_ID),
                Enter.theValue("00").into(CAMPO_ID),
                Enter.theValue("Pruebas-automatizada").into(CAMPO_DESCRIPCION),
                SelectFromOptions.byVisibleText("RegMercantil")
                        .from(DROPDOWN_TIPO_REGISTRO),

                SelectFromOptions.byVisibleText("01010000 - **** CERTIFICADOS ****")
                        .from(DROPDOWN_ID_SERVICIO),
                SelectFromOptions.byVisibleText("Activo - Todos")
                        .from(DROPDOWN_ESTADO),

                Click.on(ENLACE_GRABAR),
                WaitSeconds.seconds(2)

        );


        actor.attemptsTo(
                Click.on(ICONO_CARGAR_MODELO_FILA_1),
                Scroll.to(SUBIDA_ARCHIVOS),
                LogEvent.recordevent(Reportes.INFO, "Clic en la zona de carga para generar el input 'file'."),
                SubirArchivoDoc.enConfecamaraSII(),
                LogEvent.recordevent(Reportes.INFO, "Cargo el archivo correctamente'."),
                WaitSeconds.seconds(2),
                Click.on(ENLACE_TERMINAR_CARGA)
        );
        actor.attemptsTo(
                Click.on(ICONO_VER_PLANTILLA),
                WaitSeconds.seconds(2),
                Click.on(ICONO_BORRAR),
                AcceptAlert.aceptar(),
                WaitSeconds.seconds(2)
        );


    }

    public static TiposCertificadosTask especiales() {
        return new TiposCertificadosTask();
    }
}