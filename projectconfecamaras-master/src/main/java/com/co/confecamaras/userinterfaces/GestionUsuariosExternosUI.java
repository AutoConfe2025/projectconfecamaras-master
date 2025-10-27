package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class GestionUsuariosExternosUI extends PageObject {

    public static final Target SELECT_ESTADOS_USUARIO_EXTERNOS = Target.the("Seleccionar el estado de los usuarios")
            .located(By.id("filtroce"));

    public static final Target BTN_CONTINUAR_USUARIO_EXTERNOS = Target.the("Boton continuar")
            .located(By.xpath("//*[contains(text(), ' Continuar')]"));

    public static final Target BTN_REGRESAR_USUARIO_EXTERNOS = Target.the("Boton regresar")
            .located(By.xpath("//button[@data-original-title=\"Regresar\"]"));

    public static final Target TXT_NOMBRE_APELLIDO_USUARIO_EXTERNOS = Target.the("Escribir nombre o apellido")
            .located(By.id("filtronombre"));

    public static final Target BTN_LIMPIAR_USUARIO_EXTERNOS = Target.the("Boton limpiar")
            .located(By.xpath("//*[contains(text(), 'Limpiar')]"));

    public static final Target TXT_IDENTIFICACION_USUARIO_EXTERNOS = Target.the("Escribir identificacion")
            .located(By.id("filtroidentificacion"));

    public static final Target TXT_EMAIL_USUARIO_EXTERNOS = Target.the("Escribir email")
            .located(By.id("filtroemail"));

    public static final Target TXT_CELULAR_USUARIO_EXTERNOS = Target.the("Escribir celular")
            .located(By.id("filtrocelular"));

    public static final Target BTN_EDITAR_USUARIO_EXTERNOS = Target.the("Boton editar")
            .located(By.xpath("//a[@data-original-title=\"Editar\"]"));

    public static final Target BTN_REGRESAR_DOS_USUARIO_EXTERNOS = Target.the("Boton regresar dos")
            .located(By.xpath("//*[contains(text(), ' Regresar')]"));

    public static final Target BTN_INACTIVAR_USUARIO_EXTERNOS = Target.the("Boton inactivar")
            .located(By.xpath("//a[@data-original-title=\"Inactivar\"]"));

    public static final Target BTN_SI_USUARIO_EXTERNOS = Target.the("Boton si")
            .located(By.xpath("//*[text()=' Si']"));

    public static final Target BTN_ACEPTAR_USUARIO_EXTERNOS = Target.the("Boton ACEPTAR Errores enviando correos electrónicos : SMTP")
            .located(By.xpath("//button[normalize-space()='Aceptar']"));

    public static final Target BTN_OK_USUARIO_EXTERNOS = Target.the("Boton OK")
            .located(By.xpath("//button[text()='OK']"));

    public static final Target BTN_OK_USUARIO_EXTERNOS_2 = Target.the("Boton OK")
            .located(By.xpath("//button[normalize-space()='Aceptar']"));

    public static final Target BTN_ACTIVAR_USUARIO_EXTERNOS = Target.the("Boton activar")
            .located(By.xpath("//a[@data-original-title=\"Activar\"]"));

    public static final Target BTN_EMAIL_SMS_USUARIO_EXTERNOS = Target.the("Boton enviar clave email o sms")
            .located(By.xpath("//a[@data-original-title=\"Enviar clave Email o SMS\"]"));

    public static final Target BTN_EMAIL_USUARIO_EXTERNOS = Target.the("Boton email")
            .located(By.xpath("//button[text()='Email']"));

    public static final Target BTN_SMS_USUARIO_EXTERNOS = Target.the("Boton sms")
            .located(By.xpath("//button[text()='SMS']"));

    public static final Target BTN_VER_IMAGENES_USUARIO_EXTERNOS = Target.the("Boton ver imagenes asociadas")
            .located(By.xpath("//a[@data-original-title=\"Ver imágenes asociadas\"]"));

    public static final Target BTN_CERRAR_USUARIO_EXTERNOS = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target BTN_ELIMINAR_USUARIO_EXTERNOS = Target.the("Boton eliminar")
            .located(By.xpath("//a[@data-original-title=\"Eliminar\"]"));

    public static final Target BTN_NO_USUARIO_EXTERNOS = Target.the("Boton no")
            .located(By.xpath("//*[text()=' No']"));

    public static final Target BTN_AGREGAR_USUARIO_EXTERNOS = Target.the("Boton agregar usuario")
            .located(By.xpath("//a[@data-original-title=\"Agregar usuario\"]"));

    public static final Target SELECT_TIPO_IDENTIFICACION_USUARIO_EXTERNOS = Target.the("Seleccionar tipo de identificacion")
            .located(By.id("tipoidentificacion"));

    public static final Target TXT_IDENTIFICACION_DOS_USUARIO_EXTERNOS = Target.the("Escribir la identificacion dos")
            .located(By.id("identificacion"));

    public static final Target TXT_EMAIL_DOS_USUARIO_EXTERNOS = Target.the("Escribir email dos")
            .located(By.id("email"));

    public static final Target TXT_NRO_MOVIL_USUARIO_EXTERNOS = Target.the("Escribir nro movil")
            .located(By.id("celular"));

    public static final Target TXT_PRIMER_NOMBRE_USUARIO_EXTERNOS = Target.the("Escribir primer nombre")
            .located(By.id("nombre1"));

    public static final Target TXT_SEGUNDO_NOMBRE_USUARIO_EXTERNOS = Target.the("Escribir segundo nombre")
            .located(By.id("nombre2"));

    public static final Target TXT_PRIMER_APELLIDO_USUARIO_EXTERNOS = Target.the("Escribir primer apellido")
            .located(By.id("apellido1"));

    public static final Target TXT_SEGUNDO_APELLIDO_USUARIO_EXTERNOS = Target.the("Escribir segundo apellido")
            .located(By.id("apellido2"));

    public static final Target TXT_DIRECCION_USUARIO_EXTERNOS = Target.the("Escribir direccion")
            .located(By.id("direccion"));

    public static final Target SELECT_MUNICIPIO_USUARIO_EXTERNOS = Target.the("Seleccionar municipio")
            .located(By.id("municipio"));

    public static final Target BTN_FOTO_USUARIO_USUARIO_EXTERNOS = Target.the("Boton foto usuario")
            .located(By.xpath("//button[@data-elemento='imgFoto']"));

    public static final Target BTN_CAPTURAR_IMAGEN_USUARIO_EXTERNOS = Target.the("Boton capturar imagen")
            .located(By.id("btnCapturarImagen"));

    public static final Target BTN_GUARDAR_IMAGEN_USUARIO_EXTERNOS = Target.the("Boton guardar imagen")
            .located(By.id("btnGuardarFoto"));

    public static final Target BTN_FOTO_DOCUMENTO_IDENTIDAD_USUARIO_EXTERNOS = Target.the("Boton foto documento identidad")
            .located(By.xpath("//button[@data-elemento=\"Cedula1\"]"));

    public static final Target BTN_FOTO_FORMATO_SUSCRIPCION_USUARIO_EXTERNOS = Target.the("Boton foto formato suscripcion")
            .located(By.xpath("//button[@data-elemento=\"FormatoR\"]"));

    public static final Target BTN_SUBIR_ARCHIVO_USUARIO_EXTERNOS = Target.the("Boton subir archivo")
            .located(By.id("fileArchivoVerificacionDocIdentidad"));

    public static final Target LBL_GESTION_USUARIOS_EXTERNOS = Target.the("Mensaje gestion usuarios externos")
            .located(By.xpath("//*[contains(text(), ' Consulta de usuarios externos')]"));
}