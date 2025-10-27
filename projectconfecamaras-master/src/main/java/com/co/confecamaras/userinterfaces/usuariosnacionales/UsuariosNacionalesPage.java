package com.co.confecamaras.userinterfaces.usuariosnacionales;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuariosNacionalesPage {

    public static final Target SUSCRIPTORES_NACIONALES_OPCION = Target.the("OOpción de suscriptores nacionales en el menu desplegable")
            .located(By.linkText("Suscripciones nacionales"));

    //Cambiar pestaña

    public static final Target BUSCADOR_USUARIO = Target.the("Buscador para filtrar suario a buscar")
            .located(By.cssSelector("#tablesuscriptions_filter > label > input[type=search]"));

    public static final Target ICONO_EDITAR = Target.the("Icono para abrir el apartado de editar usuario")
            .located(By.cssSelector("#tablesuscriptions > tbody > tr > td:nth-child(9) > p > small > a:nth-child(1)"));

    public static final Target BTN_GRABAR = Target.the("Boton para regresar al menu princiapl")
            .located(By.id("submit"));
    //Ingrear nuevamente el usuario a editar

    public static final  Target ICONO_GENERAR_CONTRASENA = Target.the("Icono para generar una nueva contraseña")
            .located(By.cssSelector("#tablesuscriptions > tbody > tr > td:nth-child(9) > p > small > a:nth-child(3)"));

    public static final Target BTN_ACEPTAR = Target.the("Boton para aceptar el envio de nueva cotraseña")
            .located(By.cssSelector("#page-top > div.bootbox.modal.fade.bootbox-confirm.show > div > div > div.modal-footer > button.btn.btn-success"));


    //Ingresar nuevamente usuario a buscar

    public static final Target ICONO_ELIMINAR = Target.the("Icono para eliminar usuario elegido")
            .located(By.cssSelector("#tablesuscriptions > tbody > tr.odd > td:nth-child(9) > p > small > a:nth-child(2)"));

    public static final Target BTN_ACEPTAR_ELIMINAR = Target.the("Boton para confirmar la eliminacion de un usuario")
            .located(By.cssSelector("#page-top > div.bootbox.modal.fade.bootbox-confirm.show > div > div > div.modal-footer > button.btn.btn-success"));

    public static final Target TEXTO_USUARIO_NO_ENCONTRADO = Target.the("Icono para eliminar usuario elegido")
            .located(By.cssSelector("#tablesuscriptions > tbody > tr > td"));

    //Reutilizar boton

}
