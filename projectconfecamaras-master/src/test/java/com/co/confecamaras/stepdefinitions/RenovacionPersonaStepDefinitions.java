package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.database.QueryRenovacionPnEstCcDos;
import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaRenovacionMatriculaPnEstUsuarioExterno;
import com.co.confecamaras.questions.devdos.RenovacionPersonaNCEQuestion;
import com.co.confecamaras.tasks.*;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RenovacionPersonaStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    /*----------Renovacion Persona Natural con Establecimiento----------*/

    @Dado("^(.*) requiere realizar la Renovacion de Persona Natural con Establecimiento")
    public void confecamaras_requiere_consultar_los_recibos_de_caja(String actor) {
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionPnEstablecimiento.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la consulta e ingrese el numero de matricula comenzara la renovacion")
    public void seleccioneLaConsultaEIngreseElNumeroDeMatricula() {
        Excel excel = new Excel(Excel.rutaExcelDev, "RenovacionPersonaNaturalCE", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoRenovacionPersona.renovacionPersona(datos.get("Consulta"), DataBase.getNumeroMatriculaPnEstablecimiento(), datos.get("Activos Uno"),
                        datos.get("Activos Dos"), datos.get("Numero Empleados"), datos.get("EsEmprendimientoSocial"), datos.get("Autoriza"),
                        datos.get("Activos P"), datos.get("Patrimonio"), datos.get("Actividad Ordinaria"), datos.get("Identificacion"),
                        datos.get("Email"))
        );
    }

    @Entonces("finalizando la prueba validara el resultado")
    public void realizaraLasAcciones() {
        theActorInTheSpotlight().should(seeThat(RenovacionPersonaNCEQuestion.validacion()));
    }

    /*----------Renovacion PN Establecimiento Usuario Externo----------*/

    @Dado("^(.*) requiere realizar la Renovacion PN Establecimiento Usuario Externo")
    public void confecamarasRequiereRealizarLaRenovacionPNEstablecimientoUsuarioExterno(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenPNEstUsuarioExterno", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataQueryRenovacionPnEstCc.query());
        theActorCalled(actor).attemptsTo(RunDataQueryRenovacionPnEstCcDos.query());
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionPnEstUsuarioExterno.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("Confecamaras usa las credenciales de usuario externo para ingresar en la aplicacion")
    public void confecamarasUsaLasCredencialesDeUsuarioExternoParaIngresarEnLaAplicacion() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(datos.get("NumeroCamara"), datos.get("Usuario"),
                datos.get("Identificacion"), datos.get("Clave")));
    }
    @Cuando("seleccione Renovar matricula mercantil e ingrese el numero de matricula")
    public void seleccioneRenovarMatriculaMercantilEIngreseElNumeroDeMatricula() {
        withCurrentActor(RenovacionPnEstablecimientoUsuarioExterno.enConfecamaraSII(DataBase.getNumMatPnEstUsuarioExterno(), datos.get("NuevosActivos"),
                datos.get("NuevosActivosDos"), datos.get("NumeroEmpleados")));
        withCurrentActor(RenovacionPnEstablecimientoUsuarioExternoDos.enConfecamaraSII(datos.get("EsEmprendimientoSocial"),
                datos.get("AutorizaMensajesCorreo"), datos.get("ActivoCorriente"), datos.get("PatrimonioNeto"), datos.get("IngresosActividadOrdinaria"),
                datos.get("NroIdentificacion"), datos.get("EmailConfirmacion")));
        withCurrentActor(RenovacionPnEstablecimientoUsuarioExternoTres.enConfecamaraSII(datos.get("CodigoRegimen"), datos.get("ResponsabilidadFiscal"),
                datos.get("Celular"), datos.get("Pais"), datos.get("Ciudad"), datos.get("NumeroTarjeta"), datos.get("CodigoSeguridad")));
    }
    @Entonces("validara que la renovacion pn establecimiento usuario externo se realizo de manera exitosa")
    public void validaraQueLaRenovacionPnEstablecimientoUsuarioExternoSeRealizoDeManeraExitosa() {
        //theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaPnEstUsuarioExterno.enConfecamarasSII()));
    }
}