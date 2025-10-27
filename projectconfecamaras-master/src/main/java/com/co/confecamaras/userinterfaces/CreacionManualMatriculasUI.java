package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreacionManualMatriculasUI extends PageObject {

    public static final Target BTN_COMERCIAL_CREACION_MATRICULAS = Target.the("Boton comercial")
            .located(By.xpath("//button[text()='Comercial']"));

    public static final Target BTN_CONTINUAR_CREACION_MATRICULAS = Target.the("Boton continuar")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target SELECT_ORGANIZACION_CREACION_MATRICULAS = Target.the("Seleccionar organizacion")
            .located(By.id("organizacioncrear"));

    public static final Target SELECT_CATEGORIA_CREACION_MATRICULAS = Target.the("Seleccionar categoria")
            .located(By.id("categoriacrear"));

    public static final Target BTN_CREAR_CREACION_MATRICULAS = Target.the("Boton crear")
            .located(By.xpath("//button[text()='Crear']"));

    public static final Target SELECT_ESTADO_MATRICULA_REGISTRO_CREACION_MATRICULAS = Target.the("Seleccionar estado matricula en registro")
            .located(By.id("estadomatricula"));

    public static final Target TXT_FECHA_MATRICULA_CREACION_MATRICULAS = Target.the("Escribir fecha de matricula")
            .located(By.id("fechamatricula"));

    public static final Target BTN_GRABAR_CREACION_MATRICULAS = Target.the("Boton grabar")
            .located(By.xpath("//button[text()='Grabar']"));

    public static final Target BTN_OK_CREACION_MATRICULAS = Target.the("Boton OK")
            .located(By.xpath("//button[text()='OK']"));

    public static final Target BTN_CIVIL_CREACION_MATRICULAS = Target.the("Boton civil")
            .located(By.xpath("//button[text()='Civil']"));

    public static final Target BTN_ESADL_CREACION_MATRICULAS = Target.the("Boton esadl")
            .located(By.xpath("//button[text()='Esadl']"));

    public static final Target LBL_MENSAJE_CREACION_MATRICULAS = Target.the("Mesaje creacion matriculas")
            .located(By.xpath("//a[text()='Auto consulta de responsabilidades tributarias']"));
}
