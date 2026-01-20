package com.co.confecamaras.userinterfaces.EstadisticasYExtracciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ImportarPagoBancosExcelPage {

    public static final Target SELECT_BANCO = Target.the("Selector de Banco")
            .located(By.id("_banco"));
    public static final Target SELECT_OPERADOR = Target.the("Selector de Operador")
            .located(By.id("_operador"));
    public static final Target SELECT_USUARIO = Target.the("Selector de Usuario")
            .located(By.id("_usuarioX"));
    public static final Target SELECT_FORMA_PAGO = Target.the("Selector de Forma pago")
            .located(By.id("_formapago"));
    public static final Target SELECT_ESTADO_FINAL = Target.the("Selector de Estado Final")
            .located(By.id("_estadofinal"));
    public static final Target INPUT_FECHA_RECIBIDOS = Target.the("Campo fecha recibidos")
            .located(By.id("_fecharecibo"));
    public static final Target INPUT_FECHA_ = Target.the("Campo fecha recibidos")
            .located(By.id("_fecha"));
    public static final Target INPUT_FECHA_RENOVACION = Target.the("Campo fecha renovaciono")
            .located(By.id("_fecharenovacion"));

    public static final Target BTN_CARGAR_ARCHIVO_TARIFAS = Target.the("Boton cargar")
            .located(By.xpath("//input[@onmouseover=\"Tip('Cargar archivo de tarifas')\"]"));
    public static final Target BTN_GENERAR_TODOS= Target.the("Boton cargar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Generar todos los recibos')\"]"));
    public static final Target BTN_GENERAR_TODOS_DOS= Target.the("Boton cargar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Generar todos los recibos')\"]"));
    public static final Target BTN_EXPORTAR_EXCEL= Target.the("Boton cargar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Exportar a excel')\"]"));
    public static final Target BTN_EXPORTAR= Target.the("Boton cargar")
            .located(By.xpath("//*[@onmouseover=\"Tip('Exportar')\"]"));



}
