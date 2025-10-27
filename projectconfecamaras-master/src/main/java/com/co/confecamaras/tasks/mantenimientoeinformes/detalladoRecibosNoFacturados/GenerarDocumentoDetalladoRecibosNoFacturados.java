package com.co.confecamaras.tasks.mantenimientoeinformes.detalladoRecibosNoFacturados;

import com.co.confecamaras.interactions.News.GetTextOfElement;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.tasks.utils.ControlDescargas;
import com.co.confecamaras.userinterfaces.mantenimientoeinformes.DetalladoRecibosNoFacturablesPage;
import com.co.confecamaras.utils.News.evidencias.BaseEvidencias;
import com.co.confecamaras.utils.News.gestion_archivos.GuardarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GenerarDocumentoDetalladoRecibosNoFacturados implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(DetalladoRecibosNoFacturablesPage.TXT_INFORMATIVO),
                GetTextOfElement.de(DetalladoRecibosNoFacturablesPage.TXT_INFORMATIVO),
                Click.on(DetalladoRecibosNoFacturablesPage.LINK_DESCARGAR),
                GuardarArchivo.guardar(),
                ControlDescargas.hastaTerminar(BaseEvidencias.RUTA_EVIDENCIAS)
        );
    }

    public static GenerarDocumentoDetalladoRecibosNoFacturados descargar() {
        return new GenerarDocumentoDetalladoRecibosNoFacturados();
    }
}