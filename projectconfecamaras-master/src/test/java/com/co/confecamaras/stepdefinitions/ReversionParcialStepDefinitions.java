package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaReversionParcial;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReversionParcialStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Reversion Parcial")
    public void confecamarasRequiereRealizarLaReversionParcial(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ReversionParcial", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryReversionParcial.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa las credenciales en la aplicacion SII3")
    public void ingresaLasCredencialesEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Integracion ERP RUES CFE, Mantenimiento e Informes, Reversion parcial")
    public void seleccioneIntegracionERPRUESCFEMantenimientoEInformesReversionParcial() {
        withCurrentActor(ReversionParcial.enConfecamaraSII(DataBase.getNumReciboS(), data.get("ValorDevolver"),
                data.get("Justificacion")));
        withCurrentActor(ReversionParcialDos.enConfecamarasSII(data.get("Recibo"), data.get("TipoIdentificacion"),
                data.get("Identificacion"), data.get("Servicio"), data.get("Cantidad"), data.get("Valor"),
                data.get("JustificacionDos")));
    }

    @Entonces("validara que las opciones permiten realizar las funciones de reversar, editar y asignar")
    public void validaraQueLasOpcionesPermitenRealizarLasFuncionesDeReversarEditarYAsignar() {
        theActorInTheSpotlight().should(seeThat(RevisaReversionParcial.enConfecamaraSII()));
    }
}