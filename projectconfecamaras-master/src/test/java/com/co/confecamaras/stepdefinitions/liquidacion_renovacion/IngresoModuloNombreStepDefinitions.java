package com.co.confecamaras.stepdefinitions.liquidacion_renovacion;

import com.co.confecamaras.models.liquidacion_renovacion.TablaRenovacionModel;
import com.co.confecamaras.questions.liquidacion_renovacion.TablaDataQuestion;
import com.co.confecamaras.tasks.liquidacion_renovacion.IngresoModuloLiquidacionRenovacion;
import com.co.confecamaras.userinterfaces.liquidacion_renovacion.TablaServiciosUI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Optional;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.assertj.core.api.Assertions.assertThat;

public class IngresoModuloNombreStepDefinitions {
    @When("realizo el ingreso al modulo por {string}")
    public void realizoElIngresoAlModuloPorNombre(String nombre) {
        theActorInTheSpotlight().attemptsTo(IngresoModuloLiquidacionRenovacion.moduloRenovacion(nombre));
    }

    @Then("valido el proceso de matricula")
    public void validoElProcesoDeMatricula() {
        List<TablaRenovacionModel> tabla =
                theActorInTheSpotlight().asksFor(
                        TablaDataQuestion.from(TablaServiciosUI.FILAS_TABLA, TablaRenovacionModel.class)
                );

        System.out.println("📋 Datos capturados de la tabla:");
        tabla.forEach(System.out::println);

        validaServicioYValor(tabla, "01020201", "$ 581.000");
        validaServicioYValor(tabla, "01010102", "$ 12.100");
        validaServicioYValor(tabla, "01050106", "$ 8.500");
    }

    private void validaServicioYValor(List<TablaRenovacionModel> tabla, String servicioId, String valorEsperado) {

        Optional<TablaRenovacionModel> fila = tabla.stream()
                .filter(r -> r.getServicio().equals(servicioId))
                .findFirst();

        assertThat(fila)
                .as("El servicio " + servicioId + " debería estar presente en la tabla")
                .isPresent();

        assertThat(fila.get().getValor())
                .as("El valor para el servicio " + servicioId)
                .isEqualTo(valorEsperado);
    }
}