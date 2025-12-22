package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MenuExtraccionesPage {

    public static final Target ENLACE_EXTRACCION_MATRICULAS = Target.the("Enlace Extracción de Matrículas")
            .located(By.xpath("//*[@id='anchor_0']/div[1]/div/div[2]/div[1]/div/a"));
    public static final Target ENLACE_RELACION_ACTOS = Target.the("Enlace Relación de actos inscritos")
            .located(By.xpath("//*[@id='anchor_0']/div[5]/div/div[2]/div[1]/div/a"));
    public static final Target ELACE_CONTEO_INSCRIPCIONES = Target.the("Conteo de inscripciones")
            .located(By.xpath("//*[@id='anchor_0']/div[5]/div/div[2]/div[3]/div/a"));
    public static final Target EXPORTACION_EXPERIAN = Target.the("Exportación Experian")
            .located(By.xpath("//*[@id='anchor_0']/div[7]/div/div[2]/div[1]/div/a"));
    public static final Target EXTRACCION_INFORMA_COLOMBIA = Target.the("Extracción Informa Colombia")
            .located(By.xpath("//*[@id='anchor_0']/div[7]/div/div[2]/div[2]/div/a"));
    public static final Target RELACION_PAGOS_VIRTUALES_FORZADOS = Target.the("Relación de pagos virtuales forzados")
            .located(By.xpath("//*[@id='anchor_0']/div[9]/div/div[3]/div[1]/div/a"));
    public static final Target RESUMEN_REGISTROS_TABLA = Target.the("Resumen de registros por tabla")
            .located(By.xpath("//*[@id='anchor_0']/div[9]/div/div[3]/div[3]/div/a"));
    public static final Target INFORME_PRODUCTIVIDAD_FINAL = Target.the("Informe de productividad final del periodo")
            .located(By.xpath("//*[@id='anchor_0']/div[10]/div/div[2]/div[1]/div/a"));
    public static final Target INFORME_PRODUCTIVIDAD_ACTUAL = Target.the("Informe de productividad actual")
            .located(By.xpath("//*[@id='anchor_0']/div[10]/div/div[2]/div[3]/div/a"));
    public static final Target ESTADOS_LIDA = Target.the("Estados Lida")
            .located(By.xpath("//*[@id='anchor_0']/div[10]/div/div[4]/div[1]/div/a"));
    public static final Target BARRAS_FRANKLIN = Target.the("Barras - Franklin")
            .located(By.xpath("//*[@id='anchor_0']/div[10]/div/div[4]/div[2]/div/a"));
    public static final Target ENLACE_ACTOS_INSCRIPCIONES = Target.the("Enlace Actos e Inscripciones")
            .located(By.xpath("//*[@id='page-top']/div[2]/div/div[1]/div[7]/div[1]/div/div/p/a[contains(text(), 'ACTOS E INSCRIPCIONES')]"));

}
