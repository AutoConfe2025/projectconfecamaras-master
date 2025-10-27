package com.co.confecamaras.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ReingresoTramitesBloqueUI extends PageObject {

    public static final Target TXT_CODIGO_BARRAS_REINGRESO_TRAMITES_BLOQUE = Target.the("Escribir los codigos de barras")
            //.located(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div/div/form/div[1]/div[2]/div[2]/textarea"));.
            .located(By.id("txtCodBarras"));

    public static final Target BTN_CONTINUAR_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton continuar")
            .located(By.xpath("//button[contains(text(), ' Continuar')]"));

    public static final Target TXT_NOMBRE_COMPLETO_REINGRESO_TRAMITES_BLOQUE= Target.the("Escribir el nombre completo")
            //.located(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div/div[1]/form/div[1]/div[3]/div[5]/div[2]/input"));
            .located(By.id("txtReingresarTramiteNomApe"));

    public static final Target SELECT_TIPO_IDENTIFICACION_REINGRESO_TRAMITES_BLOQUE = Target.the("Seleccionar el tipo de identificacion")
                .located(By.id("slctReingresarTramiteTipoIdentificacion"));

    public static final Target TXT_NUMERO_IDENTIFICACION_REINGRESO_TRAMITES_BLOQUE = Target.the("Escribir el numero de identificacion")
            .located(By.id("txtReingresarTramiteNumeroIdentificacion"));

    public static final Target TXT_FECHA_EXPEDICION_REINGRESO_TRAMITES_BLOQUE = Target.the("Escribir la fecha de expedicion")
            .located(By.id("txtReingresarTramiteFechaExpDocumento"));

    public static final Target BTN_FOTO_USUARIO_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton tomar foto usuario")
            .located(By.xpath("//button[@data-titulo-modal=\"Foto del usuario\"]"));

    public static final Target BTN_CAPTURAR_IMAGEN_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton tomar foto usuario")
            //.located(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div[1]/button"));
            .located(By.id("btnCapturarImagen"));

    public static final Target BTN_GUARDAR_IMAGEN_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton guardar imagen")
            .located(By.id("btnGuardarFoto"));

    public static final Target BTN_FRENTE_DOCUMENTO_IDENTIDAD_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton tomar frente documento identidad")
            .located(By.xpath("//button[@data-titulo-modal=\"Foto frontal del documento de identidad\"]"));

    public static final Target BTN_REVERSO_DOCUMENTO_IDENTIDAD_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton tomar frente documento identidad")
            .located(By.xpath("//button[@data-titulo-modal=\"Foto reverso del documento de identidad\"]"));

    public static final Target BTN_REINGRESAR_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton reingresar")
            .located(By.xpath("//button[contains(text(), ' Reingresar')]"));

    public static final Target BTN_SELECCIONAR_ARCHIVO_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton seleccionar archivo")
            .located(By.id("fileArchivoVerificacionDocIdentidad"));

    public static final Target BTN_SI_REINGRESO_TRAMITES_BLOQUE = Target.the("Boton si")
            .located(By.xpath("//button[contains(text(), 'Si')]"));

    public static final Target LBL_TRAMITES_DEVUELTO = Target.the("Tramites devuelto")
            .located(By.id("frmReingresoDeTramite"));
}