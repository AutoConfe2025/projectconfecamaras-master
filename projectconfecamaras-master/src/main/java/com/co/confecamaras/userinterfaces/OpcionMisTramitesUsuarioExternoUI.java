package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OpcionMisTramitesUsuarioExternoUI extends PageObject {

    public static final Target BTN_TRAMITES_CONSULTAS_EXPEDIENTE_MIS_TRAMITES_UE = Target.the("Boton tramites y consultas de expediente")
            .located(By.xpath("//h4[text()='Trámites y Consultas de Expediente']"));

    public static final Target TXT_MATRICULA_MIS_TRAMITES_UE = Target.the("Escribir numero de matricula")
            .located(By.id("filtro"));

    public static final Target BTN_CONSULTAR_MIS_TRAMITES_UE = Target.the("Boton consultar")
            .located(By.id("consulta"));

    public static final Target BTN_ACCIONES_DISPONIBLES_MIS_TRAMITES_UE = Target.the("Boton acciones disponibles")
            .located(By.xpath("//i[@data-original-title=\"Acciones Disponibles\"]"));

    public static final Target BTN_OPERACIONES_MERCANTIL_ESADL_MIS_TRAMITES_UE = Target.the("Boton operaciones mercantil/ESADL")
            .located(By.xpath("//*[text()='Trámites del Registro Mercantil y de ESADL']"));

    public static final Target BTN_ACTUALIZACION_DATOS_MIS_TRAMITES_UE = Target.the("Boton actualizacion datos mutacion")
            .located(By.xpath("//a[@data-original-title=\"Actualización de datos (mutación)\"]"));

    public static final Target CHK_BOX_UBICACION_COMERCIAL_MIS_TRAMITES_UE = Target.the("Check box ubicacion comercial")
            .located(By.xpath("//*[contains(text(), 'Ubicación comercial ')]"));

    public static final Target BTN_CONTINUAR_MIS_TRAMITES_UE = Target.the("Boton continuar")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target BTN_CONTINUAR_DOS_MIS_TRAMITES_UE = Target.the("Boton continuar dos")
            .located(By.xpath("//a[@data-original-title=\"Continuar (Con costo).\"]"));

    public static final Target BTN_CONTINUAR_TRES_MIS_TRAMITES_UE = Target.the("Boton continuar tres")
            .located(By.id("btnLiquidar"));

    public static final Target TXT_TELEFONO_MIS_TRAMITES_UE = Target.the("Escribir numero de telefono")
            .located(By.id("telcom2"));

    public static final Target BTN_VOLVER_MIS_TRAMITES_UE = Target.the("Boton volver")
            .located(By.xpath("//*[@id=\"formMatrLiq\"]/div[1]/a"));

    public static final Target BTN_MIS_TRAMITES_UE = Target.the("Boton mis tramites")
            .located(By.xpath("//*[contains(text(), 'Mis trámites ')]"));

    public static final Target BTN_BUSCAR_MIS_TRAMITES_UE = Target.the("Boton buscar")
            //.located(By.xpath("//*[@id=\"tramitesPendientesBody\"]/div/div/ul/li[1]/div/div/div/span[2]/span[2]/a"));
            //.located(By.xpath("//*[@id=\"tramitesPendientesBody\"]/div/div/ul/li[3]/div/div/div/span[2]/span[2]/a"));
            .located(By.xpath("//li[1]//div[1]//div[1]//div[1]//span[2]//span[2]//a[1]"));


    public static final Target BTN_CONTINUAR_TRAMITE_UE = Target.the("Boton continuar tramite")
            //.located(By.xpath("(//a[@data-fn=\"recuperarTramiteMutacionMercantilBandeja\"])[1]"));
            //.located(By.xpath("(//a[@class='btn btn-sm btn-light d-block'])[3]"));
            .located(By.cssSelector(".btn.btn-sm.btn-light.d-block[data-dismiss='modal'][data-fn='recuperarTramiteMutacionMercantilBandeja']"));

    public static final Target LBL_OPCION_MIS_TRAMITES_UE = Target.the("Mensaje final opcion mis tramites usuario externo")
            .located(By.xpath("//small[@id=\"estado\"]"));
}