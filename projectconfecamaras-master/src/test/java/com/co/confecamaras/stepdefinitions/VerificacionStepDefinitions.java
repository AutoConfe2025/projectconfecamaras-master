package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaVerificacionAni;
import com.co.confecamaras.questions.RevisaVerificacionMultasVencidasPonal;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.VerificacinMultasVencidasPonal;
import com.co.confecamaras.tasks.VerificacionAni;
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

public class VerificacionStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Verificacion Multas Vencidas (PONAL)----------*/

    @Dado("^(.*) requiere realizar la Verificacion Multas Ponal")
    public void confecamarasRequiereRealizarLaVerificacionMultasPonal(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "VerificacionMultasVencidasPonal", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa en la aplicacion Sii3 con sus credenciales")
    public void ingresaEnLaAplicacionSii3ConSusCredenciales() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos consultas internas, Verificacion Multas Vencidas")
    public void seleccioneModuloDeRegistroRegistrosPublicosConsultasInternasVerificacionMultasVencidas() {
        withCurrentActor(VerificacinMultasVencidasPonal.enConfecamaraSII(data.get("TipoIdentificacion"),
                data.get("IdentificacionVerificacion")));
    }

    @Entonces("validara que la consulta de las multas se realizo de manera correcta")
    public void validaraQueLaConsultaDeLasMultasSeRealizoDeManeraCorrecta() {
        theActorInTheSpotlight().should(seeThat(RevisaVerificacionMultasVencidasPonal.enConfecamaraSII()));
    }

    /*----------Verificacion ANI----------*/

    @Dado("^(.*) requiere realizar la Verificacion ANI")
    public void confecamarasRequiereRealizarLaVerificacionANI(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "VerificacionAni", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos consultas internas, Verificacion ANI")
    public void seleccioneModuloDeRegistroRegistrosPublicosConsultasInternasVerificacionANI() {
        withCurrentActor(VerificacionAni.enConfecamaraSII(data.get("Cedula1"), data.get("Cedula2")));
    }

    @Entonces("validara que la consulta de ANI se realizo de manera correcta")
    public void validaraQueLaConsultaDeANISeRealizoDeManeraCorrecta() {
        theActorInTheSpotlight().should(seeThat(RevisaVerificacionAni.enConfecamaraSII()));
    }
}