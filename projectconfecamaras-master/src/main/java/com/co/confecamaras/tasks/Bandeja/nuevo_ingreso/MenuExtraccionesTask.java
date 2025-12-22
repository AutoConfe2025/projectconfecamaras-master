package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;


import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.MenuExtraccionesPage.*;


public class MenuExtraccionesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                SwitchToNewWindow.switchToNewTab(),
                LogEvent.recordevent(Reportes.INFO, "Se ingreso correctammete a Menu Extracciones " )
                      );


        actor.attemptsTo(

                Scroll.to(ENLACE_EXTRACCION_MATRICULAS).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(ENLACE_EXTRACCION_MATRICULAS),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Extraccion de Matriculas" )

        );
        actor.attemptsTo(
                RefreshPage.refresh(),
                Click.on(ENLACE_ACTOS_INSCRIPCIONES),
                WaitSeconds.seconds(1),
                LogEvent.recordevent(Reportes.INFO, "dio click en Actos e inscripciones" ),
                Scroll.to(ENLACE_RELACION_ACTOS).andAlignToBottom(),
                Click.on(ENLACE_RELACION_ACTOS),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Extraccion de Matriculas" )

        );
        actor.attemptsTo(

                Scroll.to(ELACE_CONTEO_INSCRIPCIONES).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(ELACE_CONTEO_INSCRIPCIONES),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Conteo inscripciones" )

        );
        actor.attemptsTo(

                Scroll.to(EXPORTACION_EXPERIAN).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(EXPORTACION_EXPERIAN),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Exportacion Expirian" )

        );
        actor.attemptsTo(

                Scroll.to(EXTRACCION_INFORMA_COLOMBIA).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(EXTRACCION_INFORMA_COLOMBIA),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Extracción Informa Colombia" )

        );
        actor.attemptsTo(

                Scroll.to(RELACION_PAGOS_VIRTUALES_FORZADOS).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(RELACION_PAGOS_VIRTUALES_FORZADOS),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Relación de pagos virtuales forzados" )

        );
        actor.attemptsTo(

                Scroll.to(RESUMEN_REGISTROS_TABLA).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(RESUMEN_REGISTROS_TABLA),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Resumen de registros por tabla" )

        );
        actor.attemptsTo(

                Scroll.to(INFORME_PRODUCTIVIDAD_FINAL).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(INFORME_PRODUCTIVIDAD_FINAL),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Informe de productividad final del periodo" )

        );
        actor.attemptsTo(

                Scroll.to(INFORME_PRODUCTIVIDAD_ACTUAL).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(INFORME_PRODUCTIVIDAD_ACTUAL),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Informe de productividad actual" )

        );
        actor.attemptsTo(

                Scroll.to(ESTADOS_LIDA).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(ESTADOS_LIDA),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente Estados Lida" )

        );
        actor.attemptsTo(

                Scroll.to(BARRAS_FRANKLIN).andAlignToBottom(),
                WaitSeconds.seconds(1),
                Click.on(BARRAS_FRANKLIN),
                WaitSeconds.seconds(2),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBack.closeAndSwitchBack(),
                LogEvent.recordevent(Reportes.PASSED, "Se verifico correctamente \"Barras - Franklin" )

        );





    }

    public static MenuExtraccionesTask EstadisticasyExtracciones() {
        return new MenuExtraccionesTask();
    }
}