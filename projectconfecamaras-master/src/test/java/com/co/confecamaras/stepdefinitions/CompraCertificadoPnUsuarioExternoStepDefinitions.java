package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaCompraCertificadosPnUsuariosExternos;
import com.co.confecamaras.tasks.CompraCertificadoPnUsuarioExterno;
import com.co.confecamaras.tasks.CompraCertificadoPnUsuarioExternoDos;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraCertificadoPnUsuarioExternoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar la Compra Certificado Pn Usuario Externo")
    public void confecamarasRequiereRealizarLaCompraCertificadoPnUsuarioExterno(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "CompraCertificadoPnUsuExterno", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingresa las credenciales de usuario externo en la aplicacion SII3")
    public void ingresaLasCredencialesDeUsuarioExternoEnLaAplicacionSII3() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Certificados e ingrese el numero de la matricula")
    public void seleccioneCertificadosEIngreseElNumeroDeLaMatricula() {
        withCurrentActor(CompraCertificadoPnUsuarioExterno.enConfecamarasSii(data.get("Matricula"), data.get("CertificadosMatricula"),
                data.get("NroIdentificacion"), data.get("EmailConfirmacion")));
        withCurrentActor(CompraCertificadoPnUsuarioExternoDos.enConfecamarasSii(data.get("Celular"), data.get("Pais"),
                data.get("Ciudad"), data.get("NumeroTarjeta"), data.get("CodigoSeguridad")));
    }

    @Entonces("validara que realizo la compra del certificado con su usuario externo")
    public void validaraQueRealizoLaCompraDelCertificadoConSuUsuarioExterno() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(RevisaCompraCertificadosPnUsuariosExternos.enConfecamarasSii()));
    }
}