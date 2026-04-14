package com.co.confecamaras.tasks.Bandeja.registros_publicos;

import com.co.confecamaras.database.Bandeja.QueryDigitacionRegMtilCambiarEstadoCodBarras;
import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.News.ChangeToLastWindow;
import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.interactions.log.Log;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones.*;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.AdicionarComentariosTask;
import com.co.confecamaras.tasks.Bandeja.registros_publicos.acciones.VerRutaTask;
import com.co.confecamaras.tasks.Consulta.ConsultaGrillaTask;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.confecamaras.userinterfaces.mercantil.LiquidacionRenovacionPage.CARGAR_ANEXO;

public class DigitacionRegMtilTask implements Task {
    private final String codigo_barras;

    public DigitacionRegMtilTask(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                QueryDigitacionRegMtilCambiarEstadoCodBarras.cambiarEstado(codigo_barras), // COMENTAREAR LINEA SI NO TIENE ACCESO A LA BD
                Switch.toNewWindow(),
                ConsultaGrillaTask.consultar(codigo_barras),
                VerRutaTask.verRuta("Ver ruta", codigo_barras),
                AdicionarComentariosTask.adicionar("Ver comentarios", "Adicionar comentarios", codigo_barras, "TEST COMENTARIO AUTOMATIZACION"),
                ConsultaGrillaTask.consultar(codigo_barras),
                JavaScriptClick.on(AccionesPage.LINK_ACCION.of("Digitar informacion")),
                ChangeToLastWindow.changeToLastWindow(),
                LogEvent.recordevent(Reportes.DONE, "Se ha ingresado a la acción: Digitar informacion"),
                // IMPORTAAR VUE/CTCE
                Log.message("Ingreso ImportacionVueCtCeTask"),
                ImportacionVueCtCeTask.importacion(),
//                //INFORMACION QUANTUM
                 //ImportacionQuantumTask.importacion("C:\\Users\\BrunoIsaacGomezMangu\\Documents\\Documento AUTO\\qa.pdf")
                ImportacionQuantumTask.importacion("C:\\Users\\USER\\Automatizacion\\projectconfecamaras\\src\\test\\resources\\data\\CertificadoPJ.pdf"),
                // DIGITAR INFORMACION
                Log.message("Ingreso DigitarInformacionTask"),
                DigitarInformacionTask.digitarInformacion(),
                // GRABAR ANEXO CAE
                GrabarAnexoTask.grabar("Digitación RegMtil", codigo_barras, "Digitar informacion"),
                // ADICIONAR VUNCULO
                Log.message("Ingreso AdicionarVinculosTask"),
                AdicionarVinculosTask.adicionar(),
                // DIGITAR CERTIFICAS
                Log.message("Ingreso DigitarCertificasTask"),
                DigitarCertificasTask.digitar(),
                // DIGITAR FINANCIERA
                Log.message("Ingreso DigitarFinancieraTask"),
                DigitarFinancieraTask.digitar(),
                // DIGITAR CAPITALES
                Log.message("Ingreso DigitarCapitalesTask"),
                DigitarCapitalesTask.digitar(),
                // REVISAR EXPEDIENTE
                Log.message("Ingreso RevisarExpedientesTask"),
                RevisarExpedientesTask.revisar(codigo_barras),
                // SOLICITUD NIT A LA DIAN
                Log.message("Ingreso SolicitudNitTask"),
                SolicitudNitTask.solicitar(),
                // ACTUALIZACION RUES
                Log.message("Ingreso ActualizacionRuesTask"),
                ActualizacionRuesTask.actualizar()
                // FINALIZAR
//                Log.message("Ingreso FinalizarTask"),
//                FinalizarTask.finalizar()
        );
    }

    public static DigitacionRegMtilTask digitar(String codigo_barras) {
        return new DigitacionRegMtilTask(codigo_barras);
    }
}
