package com.co.confecamaras.stepdefinitions.ConsultasTransacciones;

import com.co.confecamaras.tasks.ConsultasTransacciones.*;
import io.cucumber.java.es.Cuando;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class ExpedienteStepDefinitions {


    @Cuando("ingrese los datos correspondientes a la consulta de expediente por matricula")
    public void ingreseLosDtosCorrespondientesALaConsultaDeExpedientePorMatricula() {
        withCurrentActor(ConsultaExpedientesMatricula.matricula());
    }
    @Cuando("ingrese los datos correspondientes a la consulta de expediente por Nombre")
    public void ingreseLosDatosCorrespondientesALaConsultaDeExpedientePorNombre() {
        withCurrentActor(ConsultaExpedientesNombre.nombre());
    }
    @Cuando("ingrese los datos correspondientes a la consulta de expediente por Proponente")
    public void ingreseLosDtosCorrespondientesALaConsultaDeExpedientePorProponente() {
        withCurrentActor(ConsultaExpedientesProponente.proponente());
    }
        @Cuando("ingrese los datos correspondientes a la consulta de expediente por Palabras")
    public void ingreseLosDtosCorrespondientesALaConsultaDeExpedientePorPalabra() {
        withCurrentActor(ConsultaExpedientesPalabras.palabras());
    }
    @Cuando("ingrese los datos correspondientes a la consulta de expediente por Identificacion NIT")
    public void ingreseLosDtosCorrespondientesALaConsultaDeExpedientePorIdentificacionNIT() {
        withCurrentActor(ConsultaExpedientesIdentificacionNit.identificacionNit());
    }
}
