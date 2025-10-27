package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.*;
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

public class RenovacionMatriculaStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Renovacion Matricula Pn ya Renovada (Reliquidacion)----------*/

    @Dado("^(.*) requiere realizar la Renovacion de matricula PN ya renovada")
    public void confecamarasRequiereRealizarLaRenovacionDeMatriculaPNYaRenovada(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "RenovacionPnRenov", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaPnRenovadaReliquidacion.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la consulta e ingrese el numero de renovacion")
    public void seleccioneLaConsultaEIngreseElNumeroDeRenovacion() {}

    @Entonces("realizara la renovacion de matricula pn renovada")
    public void realizaraLaRenovacionDeMatriculaPnRenovada() {
        withCurrentActor(
                DoRenovacionMRenovada.enConfecamaras(datos.get("Consulta"), DataBase.getNumMatriculaPnRenovadaReliquidacion(), datos.get("Activo Uno"),
                        datos.get("Activo Dos"), datos.get("N Empleados"), datos.get("ActivosCorrientes"), datos.get("PatrimonioNeto"),
                        datos.get("ActividadOrdinaria"), datos.get("Identificacion"), datos.get("Correo"))
        );
        /*theActorInTheSpotlight().should(seeThat(RenovacionPersonaNCEQuestion.validacion()));*/
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaPNRenovada.enConfecamarasSii()));
    }

    /*----------Renovacion Matricula Sociedad----------*/

    @Dado("^(.*) requiere realizar la Renovacion matricula sociedad")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaSociedad(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenovacionMatriculaSociedad", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaSociedad.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingrese a la aplicacion con sus credenciales correctas")
    public void confecamarasIngreseALaAplicacionConSusCredencialesCorrectas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(datos.get("NumeroCamara"), datos.get("Usuarios"),
                datos.get("Identificacion"), datos.get("Clave")));
    }

    @Cuando("seleccione la consulta e ingrese el numero de la informacion")
    public void seleccioneLaConsultaEIngreseElNumeroDeLaInformacion() {
        withCurrentActor(RenovacionMatriculaSociedad.enConfecamaraSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaSociedad(),
                datos.get("NuevosActivos"), datos.get("NuevosActivosDos"), datos.get("NumerosEmpleados"),
                datos.get("EsEmprendimientoSocial"), datos.get("AutorizaMensajesCorreo"), datos.get("ActivoCorriente"),
                datos.get("PatrimonioNeto"), datos.get("IngresosActividadOrdinaria"), datos.get("TipoIdentificacion"),
                datos.get("NroIdentificacion"), datos.get("EmailConfirmacion")));
    }

    @Entonces("realizara la renovacion de la matricula sociedad")
    public void realizaraLaRenovacionDeLaMatriculaSociedad() {
        //theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaSociedad.enConfecamarasSii()));
    }

    /*----------Renovacion Matricula Sucursal----------*/

    @Dado("^(.*) requiere realizar la Renovacion Matricula Sucursal")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaSucursal(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenovacionMatriculaSucursal", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaSucursal.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la consulta de la matricula e ingrese el numero de la informacion")
    public void seleccioneLaConsultaDeLaMatriculaEIngreseElNumeroDeLaInformacion() {
        withCurrentActor(ParametroRenovacionSucAgenSi.enCofecamaraSII());
        withCurrentActor(RenovacionMatriculaSucursal.enConfecamaraSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaSucursal(),
                datos.get("NuevosActivos"), datos.get("NroEmpleados"), datos.get("AutorizaMensajesCorreo"),
               datos.get("TipoIdentificacion"), datos.get("NroIdentificacion"), datos.get("EmailConfirmacion"),
                datos.get("Nombre")));
        withCurrentActor(ParametroRenovacionSucAgenNo.enCofecamaraSII());
    }

    @Entonces("realizara la renovacion de la matricula sucursal")
    public void realizaraLaRenovacionDeLaMatriculaSucursal() {

//        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaSucursal.enConfecamarasSii()));
    }

    /*----------Renovacion Matricula Agencia----------*/

    @Dado("^(.*) requiere realizar la Renovacion Matricula Agencia")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaAgencia(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenovacionMatriculaAgencia", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaAgencia.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la consulta de la matricula e ingrese el numero de la matricula")
    public void seleccioneLaConsultaDeLaMatriculaEIngreseElNumeroDeLaMatricula() {
        withCurrentActor(ParametroRenovacionSucAgenSi.enCofecamaraSII());
        withCurrentActor(RenovacionMatriculaAgencia.enConfecamaraSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaAgencia(),
                datos.get("NuevosActivos"), datos.get("NroEmpleados"), datos.get("TipoIdentificacion"),
                datos.get("NroIdentificacion"), datos.get("EmailConfirmacion")));
        withCurrentActor(ParametroRenovacionSucAgenNo.enCofecamaraSII());
    }

    @Entonces("realizara la renovacion de la matricula agencia")
    public void realizaraLaRenovacionDeLaMatriculaAgencia() {
        //theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaAgencia.enConfecamarasSii()));
    }

    /*----------Renovacion Matricula PN Afiliada----------*/

    @Dado("^(.*) requiere realizar la Renovacion Matricula PN Afiliada")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaPNAfiliada(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenovacionMatriculaPNAfiliada", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaAfiliada.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la consulta de la matricula e ingrese la informacion del numero de la matricula")
    public void seleccioneLaConsultaDeLaMatriculaEIngreseLaInformacionDelNumeroDeLaMatricula() {
        System.out.println("Este es el numero de matricula: " + DataBase.getNumeroMatricula());
        withCurrentActor(RenovacionMatriculaPNAfiliada.enConfecamarasSII(datos.get("ConsultaPor"), DataBase.getNumeroMatricula(),
                datos.get("NuevosActivos"), datos.get("NuevosActivosDos"), datos.get("NroEmpleados"), datos.get("EsEmprendimientoSocial"),
                datos.get("AutorizaMensajesCorreo"), datos.get("ActivoCorriente"), datos.get("PatrimonioNeto"),
                datos.get("IngresosActividadOrdinaria"), datos.get("TipoIdentificacion"), datos.get("NroIdentificacion"),
                datos.get("EmailConfirmacion")));
    }

    @Entonces("realizara la renovacion de la matricula afiliada")
    public void realizaraLaRenovacionDeLaMatriculaAfiliada() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaPNAfiliada.enConfecamarasSII()));
    }

    /*----------Renovacion Matricula PN Baja Activos----------*/

    @Dado("^(.*) requiere realizar la Renovacion Matricula PN Baja Activos")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaPNBajaActivos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenovacionMatriculaPNBajaActivo", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaBajaActivos.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la matricula e ingrese la informacion del numero de la matricula")
    public void seleccioneLaMatriculaEIngreseLaInformacionDelNumeroDeLaMatricula() {
        System.out.println("Este es el numero de matricula: " + DataBase.getNumeroMatriculaBajaActivos());
        withCurrentActor(RenovacionMatriculaPNBajaActivos.enConfecamarasSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaBajaActivos(),
                datos.get("NuevosActivos"), datos.get("NuevosActivosDos"), datos.get("NroEmpleados"), datos.get("EsEmprendimientoSocial"),
                datos.get("AutorizaMensajesCorreo"), datos.get("ActivoCorriente"), datos.get("PatrimonioNeto"),
                datos.get("IngresosActividadOrdinaria"), datos.get("TipoIdentificacion"), datos.get("NroIdentificacion"),
                datos.get("EmailConfirmacion")));
    }

    @Entonces("realizara la renovacion de la matricula baja activos")
    public void realizaraLaRenovacionDeLaMatriculaBajaActivos() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaPNBajaActivos.enConfecamarasSII()));
    }

    /*----------Renovacion Matricula Sociedad Baja Activos----------*/

    @Dado("^(.*) requiere realizar la Renovacion Matricula Sociedad Baja Activos")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaSociedadBajaActivos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenMatriculaSociedadBajaActivos", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaSociedadBajaActivos.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la matricula e ingrese el numero de la matricula")
    public void seleccioneLaMatriculaEIngreseElNumeroDeLaMatricula() {
        withCurrentActor(RenovacionMatriculaSociedadBajaActivos.enConfecamarasSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaSociedadBajaActivos(),
                datos.get("NuevosActivos"), datos.get("NuevosActivosDos"), datos.get("NroEmpleados"), datos.get("EsEmprendimientoSocial"),
                datos.get("AutorizaMensajesCorreo"), datos.get("ActivoCorriente"), datos.get("PatrimonioNeto"),
                datos.get("IngresosActividadOrdinaria"), datos.get("TipoIdentificacion"), datos.get("NroIdentificacion"),
                datos.get("EmailConfirmacion")));
    }

    @Entonces("realizara la renovacion de la matricula sociedad baja activos")
    public void realizaraLaRenovacionDeLaMatriculaSociedadBajaActivos() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaSociedadBajaActivos.enConfecamarasSII()));
    }

    /*----------Renovacion ESADL Org 12----------*/

    @Dado("^(.*) requiere realizar la Renovacion ESADL ORG Doce")
    public void confecamarasRequiereRealizarLaRenovacionESADLORGDoce(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenovacionEsadlOrgDoce", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionEsadlOrgDoce.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la opcion matricula e ingrese el numero de matricula")
    public void seleccioneLaOpcionMatriculaEIngreseElNumeroDeMatricula() {
        withCurrentActor(RenovacionEsadlOrgDoce.enConfecamaraSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaEsadlOrgDoce(),
                datos.get("NuevosActivos"), datos.get("NroEmpleados"), datos.get("EsEmprendimientoSocial"),
                datos.get("AutorizaMensajesCorreo"), datos.get("ActivoCorriente"), datos.get("PatrimonioNeto"),
                datos.get("IngresosActividadOrdinaria"), datos.get("Correo"), datos.get("Celular"),
                datos.get("TipoIdentificacion"), datos.get("NroIdentificacion"), datos.get("EmailConfirmacion")));
    }

    @Entonces("realizara la renovacion esadl org Doce")
    public void realizaraLaRenovacionEsadlOrgDoce() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionEsadlOrgDoce.enConfecamarasSii()));
    }

    /*----------Renovacion ESADL Org 14----------*/

    @Dado("^(.*) requiere realizar la Renovacion ESADL ORG Catorce")
    public void confecamarasRequiereRealizarLaRenovacionESADLORGCatorce(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenovacionEsadlOrgCatorce", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionEsadlOrgCatorce.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la opcion de matricula e ingrese el numero de matricula")
    public void seleccioneLaOpcionDeMatriculaEIngreseElNumeroDeMatricula() {
        withCurrentActor(RenovacionEsadlOrgCatorce.enConfecamaraSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaEsadlOrgCatorce(),
                datos.get("NuevosActivos"), datos.get("NroEmpleados"), datos.get("EsEmprendimientoSocial"),
                datos.get("AutorizaMensajesCorreo"), datos.get("ActivoCorriente"), datos.get("PatrimonioNeto"),
                datos.get("IngresosActividadOrdinaria"), datos.get("Correo"), datos.get("Celular"),
                datos.get("TipoIdentificacion"), datos.get("NroIdentificacion"), datos.get("EmailConfirmacion")));
    }

    @Entonces("realizara la renovacion esadl org catorce")
    public void realizaraLaRenovacionEsadlOrgCatorce() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionEsadlOrgCatorce.enConfecamarasSii()));
    }

    /*----------Renovacion Matricula PN en Estado Inactivo----------*/

    @Dado("^(.*) requiere realizar la Renovacion Matricula PN Estado Inactivo")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaPNEstadoInactivo(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenMatriculaPnEstadoInactivo", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaPNEstadoInactivo.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la opcion matricula e ingrese el numero de la matricula")
    public void seleccioneLaOpcionMatriculaEIngreseElNumeroDeLaMatricula() {
        withCurrentActor(RenovacionMatriculaPNEstadoInactivo.enConfecamarasSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaPnEstadoInactivo(),
                datos.get("NuevosActivos"), datos.get("NuevosActivosDos"), datos.get("NuevosActivosTres"), datos.get("NuevosActivosCuatro"),
                datos.get("NuevosActivosCinco"), datos.get("NuevosActivosSeis"), datos.get("NroEmpleados")));
    }

    @Entonces("realizara la renovacion de la matricula pn estado inactivo")
    public void realizaraLaRenovacionDeLaMatriculaPnEstadoInactivo() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaPNEstadoInactivo.enConfecamarasSII()));
    }

    /*----------Renovacion Matricula PJ en Estado Inactivo----------*/

    @Dado("^(.*) requiere realizar la Renovacion Matricula PJ Estado Inactivo")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaPJEstadoInactivo(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenMatriculaPjEstadoInactivo", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaPJEstadoInactivo.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la opcion matricula e ingrese el numero de la matricula correspondiente")
    public void seleccioneLaOpcionMatriculaEIngreseElNumeroDeLaMatriculaCorrespondiente() {
        withCurrentActor(RenovacionMatriculaPJEstadoInactivo.enConfecamarasSII(datos.get("ConsultaPor"), DataBase.getNumeroMatriculaPjEstadoInactivo(),
                datos.get("NuevosActivos"), datos.get("NuevosActivosDos"), datos.get("NuevosActivosTres"), datos.get("NuevosActivosCuatro"),
                datos.get("NuevosActivosCinco"), datos.get("NuevosActivosSeis"), datos.get("NroEmpleados")));
    }

    @Entonces("realizara la renovacion de la matricula pj estado inactivo")
    public void realizaraLaRenovacionDeLaMatriculaPjEstadoInactivo() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaPJEstadoInactivo.enConfecamarasSII()));
    }

    /*----------Renovacion Matricula con Actividad No Comercial----------*/

    @Dado("^(.*) requiere realizar la Renovacion Matricula Actividad No Comercial")
    public void confecamarasRequiereRealizarLaRenovacionMatriculaActividadNoComercial(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenMatriculaActNoComercial", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaActividadNoComercial.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("escribe el numero de matricula en la opcion matricula")
    public void escribeElNumeroDeMatriculaEnLaOpcionMatricula() {
        withCurrentActor(RenovacionMatriculaActividadNoComercial.enConfecamarasSII(datos.get("ConsultaPor"),
                DataBase.getNumeroMatriculaActividadNoComercial(), datos.get("NuevosActivos"), datos.get("NuevosActivosDos"),
                datos.get("NroEmpleados")));
    }

    @Entonces("realizara la renovacion matricula actividad no comercial")
    public void realizaraLaRenovacionMatriculaActividadNoComercial() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaActividadNoComercial.enConfecamarasSII()));
    }

    /*----------Renovacion Matricula con Actividad No Comercial + Comercial----------*/

    @Dado("^(.*) requiere realizar una Renovacion Matricula Actividad No Comercial Comercial")
    public void confecamarasRequiereRealizarUnaRenovacionMatriculaActividadNoComercialComercial(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "RenMatActNoComercialComercial", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionComercialComercial.query());
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionComercialComercialDos.query());
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRenovacionMatriculaActividadNoComercialComercial.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("escriba el numero de matricula en la opcion matricula")
    public void escribaElNumeroDeMatriculaEnLaOpcionMatricula() {
        withCurrentActor(RenovacionMatriculaActividadNoComercialComercial.enConfecamaraSII(datos.get("ConsultaPor"),
                DataBase.getNumMatActividadNoComercialComercial(), datos.get("NuevosActivos"), datos.get("NroEmpleados"),
                datos.get("EsEmprendimientoSocial"), datos.get("AutorizaMensajesCorreo"), datos.get("Fecha"), datos.get("ActivoCorriente"),
                datos.get("PatrimonioNeto"), datos.get("IngresosActividadOrdinaria"), datos.get("Correo"), datos.get("Celular"),
                datos.get("TipoIdentificacion"), datos.get("NroIdentificacion"), datos.get("EmailConfirmacion")));
    }

    @Entonces("realizara la renovacion matricula actividad no comercial comercial")
    public void realizaraLaRenovacionMatriculaActividadNoComercialComercial() {
        theActorInTheSpotlight().should(seeThat(RevisaRenovacionMatriculaActividadNoComercialComercial.enConfecamarasSii()));
    }
}