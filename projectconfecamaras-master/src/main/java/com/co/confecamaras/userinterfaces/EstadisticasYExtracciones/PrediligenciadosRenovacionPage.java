package com.co.confecamaras.userinterfaces.EstadisticasYExtracciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrediligenciadosRenovacionPage {

    public static final Target SELECT_BANCO = Target.the("Selector de Banco")
            .located(By.id("_banco"));
    public static final Target SELECT_OPERADOR = Target.the("Selector de Operador")
            .located(By.id("_operador"));
    public static final Target INPUT_FECHA_RECIBIDOS = Target.the("Campo fecha recibidos")
            .located(By.id("_fecharecibo"));
    public static final Target INPUT_FECHA_RENOVACION = Target.the("Campo fecha renovaciono")
            .located(By.id("_fecharenovacion"));

    public static final Target BTN_PRECALCULAR = Target.the("Boton Precalcular")
            .located(By.xpath("//*[@onmouseover=\"Tip('Precalcular')\"]"));
    public static final Target BTN_ABANDONAR= Target.the("Boton Abandonar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Abandonar')\"]"));
    public static final Target BTN_REGRESAR= Target.the("Boton Regresar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Regresar')\"]"));
    public static final Target BTN_SELECCIONAR_INFORME= Target.the("Boton Seleccionar informe")
            .located(By.xpath("//*[@onmouseover=\"Tip('Seleccionar informe')\"]"));
    public static final Target BTN_ADMINISTRAR_REPO= Target.the("Boton cargar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Administrar repositorio')\"]"));
    public static final Target BTN_ADMINISTRAR= Target.the("Boton cargar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Administrar')\"]"));



}
