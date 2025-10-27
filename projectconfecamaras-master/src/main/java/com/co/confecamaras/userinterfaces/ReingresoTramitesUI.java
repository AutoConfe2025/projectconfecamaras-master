package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReingresoTramitesUI extends PageObject {

    public static final Target TXT_CODIGO_BARRAS_TRAMITES = Target.the("Escribir codigo de barras")
            .located(By.id("txtCodBarras"));

    public static final Target BTN_CONTINUAR_TRAMITES = Target.the("Boton continuar")
            .located(By.xpath("//*[contains(text(), ' Continuar')]"));

    public static final Target TXT_NOMBRE_COMPLETO_TRAMITES = Target.the("Escribir nombre completo")
            .located(By.id("txtReingresarTramiteNomApe"));

    public static final Target SELECT_TIPO_IDENTIFICACION_TRAMITES = Target.the("Seleccionar tipo de identificacion")
            .located(By.id("slctReingresarTramiteTipoIdentificacion"));

    public static final Target TXT_NUMERO_IDENTIFICACION_TRAMITES = Target.the("Escribir numero de identificacion")
            .located(By.id("txtReingresarTramiteNumeroIdentificacion"));

    public static final Target TXT_FECHA_EXPEDICION_TRAMITES = Target.the("Escribir fecha de expedicion")
            .located(By.id("txtReingresarTramiteFechaExpDocumento"));

    public static final Target TXT_EMAIL_TRAMITES = Target.the("Escribir email")
            .located(By.id("txtReingresarTramiteEmail"));

    public static final Target TXT_TELEFONO_FIJO_TRAMITES = Target.the("Escribir telefono fijo")
            .located(By.id("txtReingresarTramiteTelefonoFijo"));

    public static final Target TXT_CELULAR_TRAMITES = Target.the("Escribir celular")
            .located(By.id("txtReingresarTramiteCelular"));

    public static final Target BTN_FOTO_USUARIO = Target.the("Boton foto usuario")
            .located(By.xpath("//button[@data-elemento='imgFoto']"));

    public static final Target BTN_CANTURAR = Target.the("Boton popad de captura de la foto")
            .located(By.id("btnCapturarImagen"));

    public static final Target BTN_GUARDAR_IMAGEN = Target.the("Boton popad guardar imagen")
            .located(By.id("btnGuardarFoto"));

    public static final Target BTN_SUBIR_ARCHIVO_TRAMITES = Target.the("Boton subir archivo")
            .located(By.id("fileArchivoVerificacionDocIdentidad"));

    public static final Target BTN_REINGRESAR_TRAMITES = Target.the("Boton reingresar")
            .located(By.xpath("//button[contains(text(), ' Reingresar')]"));

    public static final Target BTN_SI_TRAMITES = Target.the("Boton si")
            .located(By.xpath("//button[contains(text(), 'Si')]"));

    public static final Target BTN_RUTA_DOCUMENTOS_TRAMITES = Target.the("Boton ruta documentos")
            .located(By.xpath("//*[@id=\"frmReingresoDeTramite\"]/div[2]/a"));

    public static final Target LBL_ESTADO_ACTUAL = Target.the("Estado actual")
            .located(By.id("estadoactual"));

}