package com.co.confecamaras.tasks.Bandeja.nuevo_ingreso;

import com.co.confecamaras.database.Bandeja.QueryGeneralBaseDatos;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.SubirArchivoTTRP_RGContratos;
import com.co.confecamaras.interactions.SwitchToNewWindow;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.co.confecamaras.userinterfaces.Bandejas.ReingresoGenericoDeTramitesPage.*;

public class TramitesRegistrosPublicosReingresoGenericoDeTask implements Task {
    private final String codigo_barras;
    private final String estado;


    public TramitesRegistrosPublicosReingresoGenericoDeTask(String codigo_barras, String estado) {
        this.codigo_barras = codigo_barras;
        this.estado = estado;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                QueryGeneralBaseDatos.cambiarEstado(codigo_barras,estado),
                Click.on(TITULO_REINGRESO_GENERICO),
                LogEvent.recordevent(Reportes.INFO, "Clic exitoso en 'Reingreso Genérico Trámites'."),
                SwitchToNewWindow.switchToNewTab(),
                Enter.theValue(codigo_barras).into(INP_NUMERO_RADICADO),
                Enter.theValue("UCWET4").into(INP_NUMERO_RECUPERACION),
                Click.on(BTN_CONTINUAR),
                Scroll.to(INP_CARGA_ARCHIVO),
                LogEvent.recordevent(Reportes.INFO, "Clic en la zona de carga para generar el input 'file'."),
                SubirArchivoTTRP_RGContratos.enConfecamaraSII(),
                LogEvent.recordevent(Reportes.INFO, "Cargo el archivo correctamente'."),
                WaitSeconds.seconds(2),
                Scroll.to(BTN_CONTINUAR_PROCESO),
                WaitSeconds.seconds(2),
                Click.on(BTN_CONTINUAR_PROCESO)


        );

    }

    public static TramitesRegistrosPublicosReingresoGenericoDeTask devueltos(String codigo_barras, String estado) {
        return new TramitesRegistrosPublicosReingresoGenericoDeTask(codigo_barras, estado);
    }
}
