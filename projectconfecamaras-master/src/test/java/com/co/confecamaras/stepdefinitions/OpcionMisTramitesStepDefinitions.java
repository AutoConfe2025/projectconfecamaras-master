package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaOpcionMisTramitesUsuarioCajero;
import com.co.confecamaras.questions.RevisaOpcionMisTramitesUsuarioExterno;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.OpcionMisTramitesUsuarioCajero;
import com.co.confecamaras.tasks.OpcionMisTramitesUsuarioCajeroDos;
import com.co.confecamaras.tasks.OpcionMisTramitesUsuarioExterno;
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

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class OpcionMisTramitesStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Opción "Mis trámites" Usuario Cajero----------*/

    @Dado("^(.*) requiere realizar la Opcion Mis Tramites Usuario Cajero")
    public void confecamarasRequiereRealizarLaOpcionMisTramitesUsuarioCajero(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "OpcionMisTramitesUsuarioCajero", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa las credenciales de usuario cajero en la aplicacion SII3")
    public void ingresaLasCredencialesDeUsuarioCajeroEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("busque una sociedad para realizar una inscripcion de documentos")
    public void busqueUnaSociedadParaRealizarUnaInscripcionDeDocumentos() {
        withCurrentActor(OpcionMisTramitesUsuarioCajero.enConfecamaraSII(data.get("ConsultaPor"), data.get("Matricula"),
                data.get("Filtrar"), data.get("Tipo"), data.get("Numero"), data.get("OrigenDocumento"),
                data.get("CapitalSuscrito")));
        withCurrentActor(OpcionMisTramitesUsuarioCajeroDos.enConfecamaraSII(data.get("TipoIdentificacion"),
                data.get("NroIdentificacion"), data.get("EmailConfirmacion"), data.get("FechaExpedicion"),
                data.get("UsuarioDos")));
    }

    @Entonces("validara que las opciones me permiten ver la ruta del documento y finalizar su digitalizacion")
    public void validaraQueLasOpcionesMePermitenVerLaRutaDelDocumentoYFinalizarSuDigitalizacion() {
        theActorInTheSpotlight().should(seeThat(RevisaOpcionMisTramitesUsuarioCajero.enConfecamaraSII()));
    }

    /*----------Opción "Mis trámites" Usuario Externo----------*/

    @Dado("^(.*) requiere realizar la Opcion Mis Tramites Usuario Externo")
    public void confecamarasRequiereRealizarLaOpcionMisTramitesUsuarioExterno(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "OpcionMisTramitesUsuarioExterno", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa sus credenciales de usuario externo en la aplicacion SII3")
    public void ingresaSusCredencialesDeUsuarioExternoEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("busque una matricula para realizar una actualizacion de datos mutacion")
    public void busqueUnaMatriculaParaRealizarUnaActualizacionDeDatosMutacion() {
        withCurrentActor(OpcionMisTramitesUsuarioExterno.enConfecamaraSII(data.get("Matricula"), data.get("Telefono")));
    }

    @Entonces("validara que la opcion mis tramites me permite continuar con la mutacion")
    public void validaraQueLaOpcionMisTramitesMePermiteContinuarConLaMutacion() {
        theActorInTheSpotlight().should(seeThat(RevisaOpcionMisTramitesUsuarioExterno.enConfecamaraSII()));
    }
}