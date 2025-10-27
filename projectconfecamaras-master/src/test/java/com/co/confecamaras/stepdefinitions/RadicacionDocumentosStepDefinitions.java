package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.questions.devdos.RadicacionDocumentosQuestion;
import com.co.confecamaras.questions.devdos.RadicacionRenovacionProponenteQuestion;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.tasks.DoRadicacionDocumentos;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RadicacionDocumentosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere radicar documentos")
    public void confecamaras_requiere_radicar_documentos(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Consultas y Transacciones, Tramites Registros Publicos, Radicar documentos")
    public void seleccione_consultas_y_transacciones_tramites_registros_publicos_radicar_documentos() {}

    @Entonces("comenzara con el proceso de radicar documentos con los siguientes datos")
    public void comenzara_con_el_proceso_de_radicar_documentos() {
        Excel excel = new Excel(Excel.rutaExcelDev, "ConstitucionSociedad", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoRadicacionDocumentos.radicacionDocumentos(datos.get("Razon Social"), datos.get("Organización Juridica"), datos.get("Domicilio"),
                        datos.get("Tipo"), datos.get("Numero"), datos.get("Junta Socios"),
                        datos.get("Municipio"), datos.get("Activos Vinculados"), datos.get("Personal "), datos.get("Ingresos"),
                        datos.get("Codigo Buscar"), datos.get("Beneficiario"), datos.get("Capital Suscrito"),
                        datos.get("Numero Identificacion"), datos.get("Apellido"), datos.get("Apellido Dos"), datos.get("Nombre"), datos.get("Nombre Dos"),
                        datos.get("Email"), datos.get("Numero"), datos.get("BIC"), datos.get("Nomenclatura"),
                        datos.get("Num Direccion"), datos.get("Num Direccion Dos"), datos.get("Municipio SL"), datos.get("Barrio"),
                        datos.get("Telefono"), datos.get("Telefono Dos"), datos.get("Zona"), datos.get("Email Corp"),
                        datos.get("Ubicación"), datos.get("Sede"), datos.get("Autorizacion"), datos.get("Activos Corrientes"),
                        datos.get("Patrimonio"), datos.get("Ingresos Operacionales"), datos.get("Grupo Nif"), datos.get("Capital Nacional"),
                        datos.get("Capital Nacional Priv"), datos.get("Codigo Buscar Dos"), datos.get("Ciu Genera"), datos.get("Aportante"),
                        datos.get("Tipo Identificacion P"), datos.get("Identificacion P"), datos.get("Correo P"), datos.get("Emprendimiento"))
        );
        theActorInTheSpotlight().should(seeThat(RadicacionDocumentosQuestion.validacion()));
    }
}