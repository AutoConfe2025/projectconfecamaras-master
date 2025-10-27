package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaGestionUsuariosExternos;
import com.co.confecamaras.tasks.GestionUsuariosExternos;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.RunDataBaseQueryGestionUsuariosExternos;
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

public class GestionUsuariosExternosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar una Gestion Usuarios Externos")
    public void confecamarasRequiereRealizarUnaGestionUsuariosExternos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "GestionUsuariosExternos", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryGestionUsuariosExternos.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa a la aplicacion Sii3 con sus credenciales")
    public void confecamarasIngresaALaAplicacionSii3ConSusCredenciales() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos admimistracion, Gestion de Usuarios Externos")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdmimistracionGestionDeUsuariosExternos() {
        withCurrentActor(GestionUsuariosExternos.enConfecamaraSII(data.get("EstadoUsuarios"), data.get("EstadoUsuariosDos"),
                data.get("Apellido"), data.get("IdentificacionUsuario"), data.get("Email"), data.get("Celular"),
                data.get("IdentificacionUsuarioDos"), data.get("TipoIdentificacion"), data.get("IdentificacionDos"), data.get("EmailDos"),
                data.get("NroMovil"), data.get("PrimerNombre"), data.get("SegundoNombre"), data.get("PrimerApellido"),
                data.get("SegundoApellido"), data.get("Direccion"), data.get("Municipio")));
    }

    @Entonces("validara que las opciones de busqueda y agregar ususario funcionan correctamente")
    public void validaraQueLasOpcionesDeBusquedaYAgregarUsusarioFuncionanCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaGestionUsuariosExternos.enConfecamaraSII()));
    }
}