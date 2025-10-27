package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaModulosAprIntegracionRestFull;
import com.co.confecamaras.questions.RevisaUsuariosApiIntegracionRestFull;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.ModulosApiIntegracionRestFull;
import com.co.confecamaras.tasks.UsuariosApiIntegracionRestFull;
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

public class ApiIntegracionRestFullStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Modulos Api Integracion Rest Full----------*/

    @Dado("^(.*) requiere realizar los Modulos API Integracion Rest Full")
    public void confecamarasRequiereRealizarLosModulosAPIIntegracionRestFull(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ModulosApiIntegracionRestFull", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa en la aplicacion Sii3 con sus credenciales asignadas")
    public void ingresaEnLaAplicacionSii3ConSusCredencialesAsignadas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos administracion, Modulos API de Integracion Rest Full")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionModulosAPIDeIntegracionRestFull() {
        withCurrentActor(ModulosApiIntegracionRestFull.enConfecamaraSII(data.get("Inactivar"), data.get("Activar")));
    }

    @Entonces("validara que la activacion e inactivacion se realizo correctamente")
    public void validaraQueLaActivacionEInactivacionSeRealizoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaModulosAprIntegracionRestFull.enConfecamaraSII()));
    }

    /*----------Usuarios API Integración Rest Full----------*/

    @Dado("^(.*) requiere realizar los Usuarios API Integracion Rest Full")
    public void confecamarasRequiereRealizarLosUsuariosAPIIntegracionRestFull(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "UsuariosApiIntegracionRestFull", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos administracion, Usuarios API de Integración Rest Full")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionUsuariosAPIDeIntegraciónRestFull() {
        withCurrentActor(UsuariosApiIntegracionRestFull.enConfecamaraSII());
    }

    @Entonces("validara que las opciones de los usuarios funcionan correctamente")
    public void validaraQueLasOpcionesDeLosUsuariosFuncionanCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaUsuariosApiIntegracionRestFull.enConfecamaraSII()));
    }
}