package com.co.confecamaras.stepdefinitions.Certificados.UsuarioPublico;

import com.co.confecamaras.interactions.login.LoginUsuarioPublico;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Certificados.UsuarioPublico.ValidacionCoCertificadoCdSucursalUsPu;
import com.co.confecamaras.tasks.Certificados.UsuarioPublico.CoCertificadoCdSucursalUsPu;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CoCertificadoCdSucursalUsPuStepsDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) que un usuario publico realice la comprar de un certificado por consulta detallada Sucursal")
    public void confecamarasQueUnUsuarioPublicoRealiceLaComprarDeUnCertificadoPorConsultaDetalladaSucursal(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese al sistema SII3 como usuario publico por la consulta detallada y realizar la compra de un certificado Sucursal")
    public void ingreseAlSistemaSII3ComoUsuarioPublicoPorLaConsultaDetalladaYRealizarLaCompraDeUnCertificadoSucursal(Map<String, String> data) {
        withCurrentActor(LoginUsuarioPublico.enConfecamaras(data));
        withCurrentActor(CoCertificadoCdSucursalUsPu.coCertificadoCdSucursalUsPu(data));
    }
    @Entonces("el sistema debe generar un certificado por opcion Consulta Detallada de Sucursal")
    public void elSistemaDebeGenerarUnCertificadoPorOpcionConsultaDetalladaDeSucursal() {
        theActorInTheSpotlight().should(seeThat(ValidacionCoCertificadoCdSucursalUsPu.mensejeFinalvalidacio()));
    }
}
