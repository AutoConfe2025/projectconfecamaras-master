package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaInactivarExpedientesSipref;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.InactivarExpedientesSipref;
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

public class InactivarExpedientesSiprefStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere Inactivar expedientes SIPREF")
    public void confecamarasRequiereInactivarExpedientesSIPREF(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "InactivarExpedientesSIPREF", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa en la aplicacion Sii3 con las credenciales")
    public void ingresaEnLaAplicacionSii3ConLasCredenciales() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Procesos sipref gobernabilidad, Inactivar expedientes sipref")
    public void seleccioneModuloDeRegistroProcesosSiprefGobernabilidadInactivarExpedientesSipref() {
        withCurrentActor(InactivarExpedientesSipref.enConfecamaraSII());
    }

    @Entonces("validara que la inactivacion se realizo correctamente")
    public void validaraQueLaInactivacionSeRealizoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaInactivarExpedientesSipref.enConfecamaraSII()));
    }
}