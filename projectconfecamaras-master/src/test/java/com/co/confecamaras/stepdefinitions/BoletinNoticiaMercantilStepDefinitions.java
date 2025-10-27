package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaBoletinNoticiaMercantil;
import com.co.confecamaras.tasks.BoletinNoticiaMercantil;
import com.co.confecamaras.tasks.CorreoBoletinNoticiaMercantil;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
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

public class BoletinNoticiaMercantilStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el Boletin Noticia Mercantil")
    public void confecamarasRequiereRealizarElBoletinNoticiaMercantil(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "BoletinNoticiaMercantil", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa las credenciales de cajaqa en la aplicacion SII3")
    public void ingresaLasCredencialesDeCajaqaEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Boletin Noticia Mercantil")
    public void seleccioneModuloDeRegistroRegistrosPublicosEstadisticasExtraccionesBoletinNoticiaMercantil() {
        withCurrentActor(BoletinNoticiaMercantil.enConfecamarasSII(data.get("AnoMes"), data.get("EmailControl")));
        withCurrentActor(CorreoBoletinNoticiaMercantil.enConfecamarasSII(data.get("Email"), data.get("Contrasena")));
    }

    @Entonces("verificara que se genera el resporte")
    public void verificaraQueSeGeneraElResporte() {
        theActorInTheSpotlight().should(seeThat(RevisaBoletinNoticiaMercantil.enConfecamarasSII()));
    }
}