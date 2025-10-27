package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.devdos.CertificadoESADLExistenciaQuestion;
import com.co.confecamaras.questions.devdos.CertificadoESADLQuestion;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.tasks.DoLogin;
import com.co.confecamaras.tasks.DoMenu;
import com.co.confecamaras.tasks.DoSolicitudCertificadosEsadl;
import com.co.confecamaras.tasks.DoSolicitudCertificadosPNM;
import com.co.confecamaras.questions.RevisaSolicitudCertificados;
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

public class SolicitudCertificadosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Solicitud Certificado Persona Natural - Matricula")
    public void confecamarasRequiereRealizarLaSolicitudCertificadoPersonaNaturalMatricula(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("Confecamaras ingrese en la aplicacion con sus credenciales")
    public void confecamarasIngreseEnLaAplicacionConSusCredenciales() {
        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        withCurrentActor(DoLogin.login(data.get("Usuario"), data.get("Identificacion"), data.get("Clave")), DoMenu.menu());
    }
    @Cuando("seleccione la consulta e ingrese el numero de matricula comenzara con la solicitud")
    public void seleccioneLaConsultaEIngreseElNumeroDeMatriculaComenzaraConLaSolicitud() {
        Excel excel = new Excel(Excel.rutaExcelDev, "SolicitudCertificadoPNM", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
            DoSolicitudCertificadosPNM.solicitudCertificadosPNM(data.get("Consulta"), data.get("Numero"), data.get("No. Certificado Matricula"), data.get("Tipo Identificacion"), data.get("Identificacion"), data.get("Correo"))
        );

    }

    /*----------Solicitud Certificados Persona Jurídica - Existencia----------*/

    @Dado("^(.*) requiere realizar la Solicitud Certificados Persona Juridica - Existencia")
    public void confecamarasRequiereRealizarLaSolicitudCertificadosPersonaJuridicaExistencia(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "SolicitudCertPerJuriExistencia", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingrese en la aplicacion con sus credenciales correctas")
    public void confecamarasIngreseEnLaAplicacionConSusCredencialesCorrectas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione la consulta e ingrese el numero de matricula correspondiente")
    public void seleccioneLaConsultaEIngreseElNumeroDeMatriculaCorrespondiente() {
        withCurrentActor(SolicitudCertificadosPersonaJuridicaExistencia.enConfecamaraSII(data.get("ConsultarPor"),
                data.get("Matricula"), data.get("CertificadosExistencia"), data.get("TipoIdentificacion"), data.get("NumeroIdentificacion"),
                data.get("EmailConfirmacion")));
    }

    /*----------Solicitud Certificados Persona Jurídica - Matricula y Existencia----------*/

    @Dado("^(.*) requiere realizar la Solicitud Certificados Persona Juridica - Matricula y Existencia")
    public void confecamarasRequiereRealizarLaSolicitudCertificadosPersonaJuridicaMatriculaYExistencia(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "SolicitudCertPerJuriExistMatric", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion con sus credenciales correctas")
    public void confecamarasIngresaEnLaAplicacionConSusCredencialesCorrectas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione la consulta por matricula e ingrese el numero correspondiente")
    public void seleccioneLaConsultaPorMatriculaEIngreseElNumeroCorrespondiente() {
        withCurrentActor(SolicitudCertificadosPersonaJuridicaMatriculaExistencia.enConfecamaraSII(data.get("ConsultarPor"),
                data.get("Matricula"), data.get("CertificadosMatricula"), data.get("CertificadosExistencia"), data.get("TipoIdentificacion"), data.get("NumeroIdentificacion"),
                data.get("EmailConfirmacion")));
    }

    /*----------Solicitud Certificados Proponentes----------*/

    @Dado("^(.*) requiere realizar la Solicitud Certificados Proponentes")
    public void confecamarasRequiereRealizarLaSolicitudCertificadosProponentes(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "SolicitudCertProponentes", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion con sus credenciales asignadas")
    public void confecamarasIngresaEnLaAplicacionConSusCredencialesAsignadas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione la consulta por proponente e ingrese el numero correspondiente")
    public void seleccioneLaConsultaPorProponenteEIngreseElNumeroCorrespondiente() {
        withCurrentActor(SolicitudCertificadosProponentes.enConfecamaraSII(data.get("ConsultarPor"),
                data.get("Proponente"), data.get("CertificadosProponentes"), data.get("TipoIdentificacion"), data.get("NumeroIdentificacion"),
                data.get("EmailConfirmacion")));
    }

    @Entonces("podra visualizar el soporte generado")
    public void podraVisualizarElSoporteGenerado() {
        //theActorInTheSpotlight().should(seeThat(RevisaSolicitudCertificados.enConfecamaraSII()));
    }

    // ---- Solicitud Certificados Esadl ---- //

    @Dado("^(.*) requiere realizar la Solicitud Certificado ESADL")
    public void confecamarasRequiereRealizarLaSolicitudCertificadoESADL(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la consulta e ingrese el numero de matricula comenzara con la solicitud ESADL")
    public void seleccioneLaConsultaEIngreseElNumeroDeMatriculaComenzaraConLaSolicitudESADL() {
        Excel excel = new Excel(Excel.rutaExcelDev, "SolicitudCertificadoEsadl", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoSolicitudCertificadosEsadl.solicitudCertificadosEsadl(data.get("Consulta"), data.get("Numero"), data.get("Certificados Existencia"), data.get("Tipo Identificacion"), data.get("Identificacion"), data.get("Correo"))
        );
        //theActorInTheSpotlight().should(seeThat(CertificadoESADLQuestion.validacion()));
    }

    // ---- Solicitud Certificados Esadl Libros/Existencia ---- //

    @Dado("^(.*) requiere realizar la Solicitud Certificado ESADL Libros\\/Existencia")
    public void confecamarasRequiereRealizarLaSolicitudCertificadoESADLLibrosExistencia(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione la consulta e ingrese el numero de matricula comenzara con la solicitud ESADL Libros")
    public void seleccioneLaConsultaEIngreseElNumeroDeMatriculaComenzaraConLaSolicitudESADLLibros() {
        Excel excel = new Excel(Excel.rutaExcelDev, "SolicitudCertificadoEsadlEL", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoSolicitudCertificadosEsadlLibros.solicitudCertificadosEsadlLib(data.get("Consulta"), data.get("Numero"), data.get("Certificados Existencia"), data.get("Tipo Identificacion"), data.get("Identificacion"), data.get("Correo"))
        );
        theActorInTheSpotlight().should(seeThat(CertificadoESADLExistenciaQuestion.validacion()));
    }

}