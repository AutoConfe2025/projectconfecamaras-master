package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import com.co.confecamaras.interactions.cerrarpestana.CloseCurrentWindow;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.TransaccionesRUESPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.News.gestion_archivos.CargarArchivo;
import com.co.confecamaras.utils.RobotCambiarPestanaTres;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Alert;

import static com.co.confecamaras.userinterfaces.mercantil.LiquidacionRenovacionPage.CARGAR_ANEXO;

public class TransaccionesRuesAccionesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Alert alert = null;

        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_CONSULTA_RUTA_NACIONAL))) {
            actor.attemptsTo(
                    LogEvent.recordevent(Reportes.PASSED, "Acción: Consulta de ruta nacional"),
                    Click.on(AccionesPage.LINK_CONSULTA_RUTA_NACIONAL),
                    SwitchToWindow.at(2),
                    WaitSeconds.seconds(3),
                    //Switch.toFrame(0),//Switch.toFrame(0)
                    WaitInteractions.untilAppears(TransaccionesRUESPage.TXT_NUMERO_UNICO),
                    GetTextOfElement.de(TransaccionesRUESPage.TXT_NUMERO_UNICO),
                    CloseCurrentWindow.now(),
                    SwitchToWindow.at(1)
                    //Click.on(TransaccionesRUESPage.BTN_CERRAR_POPUP)
            );
            String msg = GetTextOfElement.getText();
            actor.attemptsTo(
                    LogEvent.recordevent(Reportes.INFO, "Número unico encontrado: " + msg)
            );
        }
        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_CARGAR_IMAGENES))) {
            actor.attemptsTo(
                    LogEvent.recordevent(Reportes.PASSED, "Acción: Cargar imagenes"),
                    Click.on(AccionesPage.LINK_CARGAR_IMAGENES),
                    WaitSeconds.seconds(2),
                    CargarArchivo.cargar(TransaccionesRUESPage.FORM_CARGAR_ARCHIVO, "F:\\PDF\\2-Qa1.pdf"),
                    WaitSeconds.seconds(1),
                    Click.on(TransaccionesRUESPage.BTN_SOBRE)
            );
            alert = BrowseTheWeb.as(actor).getAlert();
            try {
                if (alert != null) {
                    Reportes.reportEvent(Reportes.INFO, "Mensaje de confirmacion: " + alert.getText());
                    alert.accept();
                    actor.attemptsTo(
                            Click.on(TransaccionesRUESPage.LINK_VOLVER)
                    );
                }
            } catch (Exception e) {
                actor.attemptsTo(
                        Click.on(TransaccionesRUESPage.BTN_VOLVER),
                        LogEvent.recordevent(Reportes.WARNING, "No fue posible cargar el archivo")
                );
            }
        }

        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_CAMBIAR_ESTADO))) {
            actor.attemptsTo(
                    LogEvent.recordevent(Reportes.PASSED, "Acción: Cambiar de estado"),
                    Click.on(AccionesPage.LINK_CAMBIAR_ESTADO),
                    SwitchToWindow.at(2)
                    //Click.on(TransaccionesRUESPage.BTN_CERRAR_POPUP)
            );
        }

        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_ACTUALIZAR_ESTADOS))) {
            actor.attemptsTo(
                    LogEvent.recordevent(Reportes.PASSED, "Acción: Actualizar estados"),
                    Click.on(AccionesPage.LINK_ACTUALIZAR_ESTADOS)
            );

            alert = BrowseTheWeb.as(actor).getAlert();
            try {
                Reportes.reportEvent(Reportes.INFO, "Mensaje de confirmacion: " + alert.getText());
                alert.accept();
            } catch (Exception e) {

            }
        }

        if (actor.asksFor(ElementoElegible.para(AccionesPage.LINK_DESCARGAR_IMAGEN))) {
            actor.attemptsTo(
                    SwitchToWindow.at(1 ),
                    LogEvent.recordevent(Reportes.PASSED, "Acción: Descargar Imagen"),
                    Click.on(AccionesPage.LINK_DESCARGAR_IMAGEN)
            );

            if (actor.asksFor(ElementoElegible.para(TransaccionesRUESPage.TXT_IMAGENES_ENCONTRADAS))) {
                actor.attemptsTo(
                        GetTextOfElement.de(TransaccionesRUESPage.TXT_IMAGENES_ENCONTRADAS)
                );
                String msg = GetTextOfElement.getText();
                Reportes.reportEvent(Reportes.WARNING, "No se esperaba: " + msg);
            }
            actor.attemptsTo(
                    Click.on(TransaccionesRUESPage.LINK_VOLVER)
            );
        }
    }

    public static TransaccionesRuesAccionesTask acciones() {
        return new TransaccionesRuesAccionesTask();
    }
}
