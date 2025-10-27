package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRepartoDocumentos;
import com.co.confecamaras.tasks.DataRepartoDocumentos;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.RepartoDocumentos;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RepartoDocumentosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el Reparto de Documentos")
    public void confecamarasRequiereRealizarElRepartoDeDocumentos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RepartoDocumentos", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion con las credenciales")
    public void confecamarasIngresaEnLaAplicacionConLasCredenciales() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Bandejas, Registros Publicos, Reparto y Escaneo")
    public void seleccioneBandejasRegistrosPublicosRepartoYEscaneo() {
        withCurrentActor(DataRepartoDocumentos.cancelacionProponente(data.get("Consulta"), data.get("Numero"),
                data.get("Identificacion"), data.get("Correo")));
        withCurrentActor(RepartoDocumentos.enConfecamaraSII(data.get("Tipo"), data.get("Comentario"),
                data.get("UsuarioDos")));
    }

    @Entonces("validara que todas las opciones realizan su funcion")
    public void validaraQueTodasLasOpcionesRealizanSuFuncion() {
        theActorInTheSpotlight().should(seeThat(RevisaRepartoDocumentos.enConfecamaraSII()));
    }
}