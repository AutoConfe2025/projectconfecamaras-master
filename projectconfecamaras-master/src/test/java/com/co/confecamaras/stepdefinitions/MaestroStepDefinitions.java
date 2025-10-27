package com.co.confecamaras.stepdefinitions;

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

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MaestroStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Maestro de alcaldias - CAE----------*/

    @Dado("^(.*) requiere realizar el maestro alcaldias cae")
    public void confecamarasRequiereRealizarElMaestroAlcaldiasCae(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MaestroAlcaldiasCae", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa a la aplicacion con sus credenciales asignadas")
    public void confecamarasIngresaALaAplicacionConSusCredencialesAsignadas() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuarios"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de alcaldias CAE")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdmimistracionMaestroDeAlcaldiasCAE() {
        withCurrentActor(MaestroAlcaldiasCae.enConfecamaraSII(data.get("PersonaResponsable"), data.get("CargoResponsable"),
                data.get("TipoWs"), data.get("Ws"), data.get("Método"), data.get("Cifrado"), data.get("CumpleEstandar"),
                data.get("RequiereAutenticacion"), data.get("Usuario"), data.get("Contrasena"), data.get("Email"),
                data.get("TelefonoFijo"), data.get("NroCelular"), data.get("TextoInformaCertificados")));
    }

    @Entonces("validara que las opciones realizan su funcion correspondiente")
    public void validaraQueLasOpcionesRealizanSuFuncionCorrespondiente() {
        theActorInTheSpotlight().should(seeThat(RevisaMaestroAlcaldiasCae.enConfecamaraSII()));
    }

    /*----------Maestro Clases Vínculos----------*/

    @Dado("^(.*) requiere realizar el maestro clases vinculos")
    public void confecamarasRequiereRealizarElMaestroClasesVinculos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MaestroClasesVinculos", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos admimistracion, Maestro clases vinculos")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdmimistracionMaestroClasesVinculos() {

    }

    @Entonces("validara que se realizo la edicion del maestro clases vinculos")
    public void validaraQueSeRealizoLaEdicionDelMaestroClasesVinculos() {

    }

    /*----------Maestro de Rutas----------*/

    @Dado("^(.*) requiere realizar el Maestro de Rutas")
    public void confecamarasRequiereRealizarElMaestroDeRutas(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MaestroRutas", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de Rutas")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdmimistracionMaestroDeRutas() {
        withCurrentActor(MaestroRutas.enConfecamaraSII());
    }

    @Entonces("validara que se guarda la informacion correctamente")
    public void validaraQueSeGuardaLaInformacionCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMaestroRutas.enConfecamaraSII()));
    }

    /*----------Maestro de Rutas - Pasos Ruta----------*/

    @Dado("^(.*) requiere ejecutar el Maestro de Rutas Pasos Ruta")
    public void confecamarasRequiereEjecutarElMaestroDeRutasPasosRuta(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MaestroRutasPasosRuta", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de Rutas - Pasos ruta")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdmimistracionMaestroDeRutasPasosRuta() {
        withCurrentActor(MaestroRutasPasosRuta.enConfecamaraSII(data.get("EditarFinEst"), data.get("EditarFinEstDos")));
    }

    @Entonces("validara que se edita y se guarda la informacion correctamente")
    public void validaraQueSeEditaYSeGuardaLaInformacionCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMaestroRutasPasosRuta.enConfecamaraSII()));
    }

    /*----------Maestro de Rutas - Digitacion----------*/

    @Dado("^(.*) requiere ejecutar el Maestro de Rutas Digitacion")
    public void confecamarasRequiereEjecutarElMaestroDeRutasDigitacion(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MaestroRutasDigitacion", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de Rutas - Digitacion")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdmimistracionMaestroDeRutasDigitacion() {
        withCurrentActor(MaestroRutasDigitacion.enConfecamaraSII(data.get("PasoUno"), data.get("PasoUnoDos")));
    }

    @Entonces("validara que la opcion edita y se guarda la informacion correctamente")
    public void validaraQueLaOpcionEditaYSeGuardaLaInformacionCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMaestroRutasDigitacion.enConfecamaraSII()));
    }

    /*----------Maestro de Devoluciones----------*/

    @Dado("^(.*) requiere ejecutar el Maestro de Devoluciones")
    public void confecamarasRequiereEjecutarElMaestroDeDevoluciones(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MaestroDevoluciones", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos admimistracion, Maestro de Devoluciones")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdmimistracionMaestroDeDevoluciones() {
        withCurrentActor(MaestroDevoluciones.enConfecamaraSII(data.get("TipoMotivo"), data.get("TipoMotivoDos")));
    }

    @Entonces("validara que la opcion edita y guarda la informacion correctamente")
    public void validaraQueLaOpcionEditaYGuardaLaInformacionCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMaestroDevoluciones.enConfecamaraSII()));
    }

    /*----------Maestro Vínculos----------*/

    @Dado("^(.*) requiere ejecutar el Maestro Vinculos")
    public void confecamarasRequiereEjecutarElMaestroVinculos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MaestroVinculos", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos admimistracion, Maestro Vinculos")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdmimistracionMaestroVinculos() {
        withCurrentActor(MaestroVinculos.enConfecamaraSII(data.get("Descripcion"), data.get("DescripcionDos")));
    }

    @Entonces("validara que la opciones permiten editar y grabar la informacion correctamente")
    public void validaraQueLaOpcionesPermitenEditarYGrabarLaInformacionCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMaestroVinculos.enConfecamaraSII()));
    }
}