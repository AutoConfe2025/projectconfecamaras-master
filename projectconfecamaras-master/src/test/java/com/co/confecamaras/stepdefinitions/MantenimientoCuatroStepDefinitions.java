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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MantenimientoCuatroStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /*----------Mantenimiento Municipios y Departamentos----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento Municipios y Departamentos")
    public void confecamarasRequiereRealizarElMantenimientoMunicipiosYDepartamentos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantenimientoMpioDepto", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingrese en la aplicacion con sus credenciales administrador")
    public void confecamarasIngreseEnLaAplicacionConSusCredencialesAdministrador() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione Parametrizacion ERP, Mantenimiento tablas basicas, Municipio y Departamentos")
    public void seleccioneParametrizacionERPMantenimientoTablasBasicasMunicipioYDepartamentos() {
        withCurrentActor(MantenimientoMunicipiosDepartamentos.enConfecamaraSII(data.get("Exento")));
    }

    @Entonces("validara que todas las opciones realizan su funcion correctamente")
    public void validaraQueTodasLasOpcionesRealizanSuFuncionCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoMunicipiosDepartamentos.enConfecamaraSII()));
    }

    /*----------Mantenimiento Sedes Biometria----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento Sedes Biometria")
    public void confecamarasRequiereRealizarElMantenimientoSedesBiometria(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantenimientoSedesBiometria", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos administracion, Sedes Biometria")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionSedesBiometria() {
        withCurrentActor(MantenimientoSedesBiometria.enConfecamaraSII(data.get("IdCod"), data.get("Descripcion")));
    }

    @Entonces("validara que las opciones funcionan adecuadamente")
    public void validaraQueLasOpcionesFuncionanAdecuadamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoSedesBiometria.enConfecamaraSII()));
    }

    /*----------Mantenimiento Barrios----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento Barrios")
    public void confecamarasRequiereRealizarElMantenimientoBarrios(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantenimientoBarrios", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos administracion, Barrios")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionBarrios() {
        withCurrentActor(MantenimientoBarrios.enConfecamaraSII(data.get("Municipio")));
    }

    @Entonces("validara que las opciones cumplen con su funcion")
    public void validaraQueLasOpcionesCumplenConSuFuncion() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoBarrios.enConfecamaraSII()));
    }

    /*----------Mantenimiento Terminos y Condiciones----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento Terminos Condiciones")
    public void confecamarasRequiereRealizarElMantenimientoTerminosCondiciones(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantTerminosCondiciones", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos administracion, T y C")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionTYC() {
        withCurrentActor(MantenimientoTerminosCondiciones.enConfecamaraSII(data.get("EdicionPantalla")));
    }

    @Entonces("verificara que la opcion cumpla su funcion")
    public void verificaraQueLaOpcionCumplaSuFuncion() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoTerminosCondiciones.enConfecamaraSII()));
    }

    /*----------Mantenimiento CommonXX----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento CommonXX")
    public void confecamarasRequiereRealizarElMantenimientoCommonXX(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantCommonXX", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Aseguramiento del SII, Mantenimiento del sii, Mantenimiento CommonXX")
    public void seleccioneAseguramientoDelSIIMantenimientoDelSiiMantenimientoCommonXX() {
        withCurrentActor(MantenimientoCommonXX.enConfecamaraSII());
    }

    @Entonces("verificara que se guarda la informacion correctamente")
    public void verificaraQueSeGuardaLaInformacionCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoCommonXX.enConfecamaraSII()));
    }

    /*----------Mantenimiento Claves Valor----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento Claves Valor")
    public void confecamarasRequiereRealizarElMantenimientoClavesValor(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantClavesValor", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Aseguramiento del SII, Mantenimiento del sii, Mantenimiento Claves Valor")
    public void seleccioneAseguramientoDelSIIMantenimientoDelSiiMantenimientoClavesValor() {
        withCurrentActor(MantenimientoClavesValor.enConfecamaraSII(data.get("EditarCuentaPublica"), data.get("EditarCuentaPublicaDos")));
    }

    @Entonces("verificara que la informacion se guardo correctamente")
    public void verificaraQueLaInformacionSeGuardoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoClavesValor.enConfecamaraSII()));
    }
}