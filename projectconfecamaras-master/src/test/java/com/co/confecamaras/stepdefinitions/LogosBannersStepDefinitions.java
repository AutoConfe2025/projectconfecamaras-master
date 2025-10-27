package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaLogosBanners;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.LogosBanners;
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

public class LogosBannersStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar los Logos y Banners")
    public void confecamarasRequiereRealizarLosLogosYBanners(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "LogosBanners", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa a la aplicacion Sii3 con las credenciales correctas")
    public void ingresaALaAplicacionSii3ConLasCredencialesCorrectas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Aseguramiento del SII, Mantenimiento del sii, Logos y Banners")
    public void seleccioneAseguramientoDelSIIMantenimientoDelSiiLogosYBanners() {
        withCurrentActor(LogosBanners.enConfecamaraSII());
    }

    @Entonces("validara que se carga la firma")
    public void validaraQueSeCargaLaFirma() {
        theActorInTheSpotlight().should(seeThat(RevisaLogosBanners.enConfecamaraSII()));
    }
}