package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DataInscripcionDocumentosMercantil;
import com.co.confecamaras.tasks.DataInscripcionDocumentosMercantilDos;
import com.co.confecamaras.tasks.DataInscripcionDocumentosMercantilTres;
import com.co.confecamaras.tasks.DoInscripcionDocumentosMercantil;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class EstudioInscripcionDocumentosMercantilStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el Estudio e Inscripcion de Documentos Mercantil")
    public void confecamarasRequiereRealizarElEstudioEInscripcionDeDocumentosMercantil(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Estudio Mercantil")
    public void seleccioneModuloDeRegistroRegistrosPublicosEstudioMercantil() {
        Excel excel = new Excel(Excel.rutaExcelDev, "DocumentosMercantil", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(DataInscripcionDocumentosMercantil.enConfecamaraSII(datos.get("ConsultaPor"), datos.get("Matricula"),
                datos.get("Filtrar"), datos.get("Tipo"), datos.get("OrigenDocumento"), datos.get("Vinculo"),
                datos.get("PrimerApellido")));
        withCurrentActor(DataInscripcionDocumentosMercantilDos.enConfecamaraSII(datos.get("SegundoApellido"),
                datos.get("PrimerNombre"), datos.get("OtroNombre"), datos.get("Renglon"), datos.get("Aceptacion"),
                datos.get("FechaExpedicion"), datos.get("Email")));
        withCurrentActor(DataInscripcionDocumentosMercantilTres.enConfecamaraSII(datos.get("TelefonoFijo"),
                datos.get("NroCelular"), datos.get("Usuario")));
        withCurrentActor(
                DoInscripcionDocumentosMercantil.inscripcionDocumentosMercantil(datos.get("Codigo Barras"), datos.get("Correo"), datos.get("Numero"))
        );
    }

    @Entonces("ingresara el codigo de barras mercantil y los datos necesarios")
    public void ingresara_el_codigo_de_barras() {

    }
}