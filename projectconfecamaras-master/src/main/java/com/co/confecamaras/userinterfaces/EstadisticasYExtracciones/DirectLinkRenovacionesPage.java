package com.co.confecamaras.userinterfaces.EstadisticasYExtracciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DirectLinkRenovacionesPage {

    public static final Target INPUT_IDENTIFICADOR = Target.the("Input identificador")
            .located(By.id("_identificador"));
    public static final Target IMPUT_ANO_RENOVADO = Target.the("Selector de año de renovacion")
            .located(By.id("_anorenovado"));
    public static final Target INPUT_MINIMO_ACTIVOS = Target.the("Campo minimo activos")
            .located(By.id("_minimoactivos"));
    public static final Target INPUT_FECHA_RENOVACION = Target.the("Campo fecha renovaciono")
            .located(By.id("_fecharenovacion"));
    public static final Target SELECT_TIPO_COMERCIANTE = Target.the("Selector de tipo comerciante")
            .located(By.id("_tipocomerciante"));
    public static final Target BTN_ENVIAR = Target.the("Boton Enviar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Enviar')\"]"));
    public static final Target BTN_BLANQUEAR= Target.the("Boton Blanquear")
            .located(By.xpath("//*[@onmouseover=\"Tip('Blanquear')\"]"));
    public static final Target BTN_SELECCIONAR= Target.the("Boton Regresar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Seleccionar')\"]"));
    public static final Target BTN_EXPORTAR_EXCEL= Target.the("Boton Exportar excel")
            .located(By.xpath("//*[@onmouseover=\"Tip('Exportar excel')\"]"));
    public static final Target BTN_ADMINISTRAR_REPO= Target.the("Boton cargar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Administrar repositorio')\"]"));




}
