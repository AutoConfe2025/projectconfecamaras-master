package com.co.confecamaras.userinterfaces.tableros;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class tableroSection  {
  public static final Target TITULO_MATRICULADOS = Target.the("Tarjeta donde se muestra el número de matriculados")
          .locatedBy("//h2[@data-automation-id='analysis_visual_title_label']");

  public static final Target TITULO_MATRICULADOS_METAS = Target.the("Tarjeta donde se muestra los matriculados vs metas")
          .locatedBy("//h2[@data-automation-id='analysis_visual_title_label' and text()='05 - Matriculados vs Meta']");

  public static final Target TOTAL_INGRESOS_PRESOPUESTO = Target.the("Tarjeta donde se muestra los ingresos vs presupuestos")
          .locatedBy("//h2[@data-automation-context='08 - Total Ingresos vs Presupuesto']");

  public static final Target TITULO_INGRESO_TIPO_INGRESO = Target.the("Tarjeta que muestra los ingresos por tipo de ingreso")
          .locatedBy("//h2[@data-automation-context='10 - Ingresos por Tipo de Ingresos']");

  public static final Target TITULO_COMPARATIVO_INGRESO_POR_GRUPO_INGRESO =Target.the("Tablero de comparativa de ingresos por grupos")
          .locatedBy("//h2[@data-automation-context='12 - Comparativo Ingresos por Grupo de Ingresos']");

  public static final Target FRAME_TABLEROS = Target.the("Frame donde están todos los tableros")
          .located(By.id("sheetBody"));



}
