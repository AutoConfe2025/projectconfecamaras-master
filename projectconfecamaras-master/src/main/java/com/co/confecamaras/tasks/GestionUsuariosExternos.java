package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class GestionUsuariosExternos implements Task {

    private String selectEstadoUsuarios;
    private String selectEstadoUsuariosDos;
    private String idApellido;
    private String idIdentificacionUsuario;
    private String idEmail;
    private String idCelular;
    private String idIdentificacionUsuarioDos;
    private String selectTipoIdentificacion;
    private String idIdentificacionDos;
    private String idEmailDos;
    private String idNroMovil;
    private String idPrimerNombre;
    private String idSegundoNombre;
    private String idPrimerApellido;
    private String idSegundoApellido;
    private String idDireccion;
    private String selectMunicipio;

    public GestionUsuariosExternos(String selectEstadoUsuarios, String selectEstadoUsuariosDos, String idApellido,
                                   String idIdentificacionUsuario, String idEmail, String idCelular,
                                   String idIdentificacionUsuarioDos, String selectTipoIdentificacion,
                                   String idIdentificacionDos, String idEmailDos, String idNroMovil, String idPrimerNombre,
                                   String idSegundoNombre, String idPrimerApellido, String idSegundoApellido,
                                   String idDireccion, String selectMunicipio) {
        this.selectEstadoUsuarios = selectEstadoUsuarios;
        this.selectEstadoUsuariosDos = selectEstadoUsuariosDos;
        this.idApellido = idApellido;
        this.idIdentificacionUsuario = idIdentificacionUsuario;
        this.idEmail = idEmail;
        this.idCelular = idCelular;
        this.idIdentificacionUsuarioDos = idIdentificacionUsuarioDos;
        this.selectTipoIdentificacion = selectTipoIdentificacion;
        this.idIdentificacionDos = idIdentificacionDos;
        this.idEmailDos = idEmailDos;
        this.idNroMovil = idNroMovil;
        this.idPrimerNombre = idPrimerNombre;
        this.idSegundoNombre = idSegundoNombre;
        this.idPrimerApellido = idPrimerApellido;
        this.idSegundoApellido = idSegundoApellido;
        this.idDireccion = idDireccion;
        this.selectMunicipio = selectMunicipio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitSeconds.seconds(2),
                WaitInteractions.untilBeEnable(BTN_MODULO_REGISTRO_2),
                Scroll.to(BTN_MODULO_REGISTRO_2).andAlignToBottom(),
                JavaScriptClick.on(BTN_MODULO_REGISTRO_2),
                WaitSeconds.seconds(2),
                WaitInteractions.untilBeEnable(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                Scroll.to(BTN_REGISTROS_PUBLICOS_ADMINISTRACION).andAlignToBottom(),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS_ADMINISTRACION),
                WaitSeconds.seconds(2),
                WaitInteractions.untilBeEnable(BTN_GESTION_USUARIOS_EXTERNOS),
                Scroll.to(BTN_GESTION_USUARIOS_EXTERNOS).andAlignToBottom(),
                JavaScriptClick.on(BTN_GESTION_USUARIOS_EXTERNOS),
                ConsultaUsuariosExternos.enConfecamaraSII(selectEstadoUsuarios, selectEstadoUsuariosDos, idApellido,
                        idIdentificacionUsuario, idEmail, idCelular),
                AccionesConsultaUsuariosExternos.enConfecamaraSII(idIdentificacionUsuarioDos),
                AgregarUsuarioConsultaUsuariosExternos.enConfecamaraSII(selectTipoIdentificacion, idIdentificacionDos,
                        idEmailDos, idNroMovil, idPrimerNombre, idSegundoNombre, idPrimerApellido, idSegundoApellido,
                        idDireccion, selectMunicipio)
        );
    }

    public static GestionUsuariosExternos enConfecamaraSII(String selectEstadoUsuarios, String selectEstadoUsuariosDos, String idApellido,
                                                           String idIdentificacionUsuario, String idEmail, String idCelular,
                                                           String idIdentificacionUsuarioDos, String selectTipoIdentificacion,
                                                           String idIdentificacionDos, String idEmailDos, String idNroMovil, String idPrimerNombre,
                                                           String idSegundoNombre, String idPrimerApellido, String idSegundoApellido,
                                                           String idDireccion, String selectMunicipio){
        return instrumented(GestionUsuariosExternos.class, selectEstadoUsuarios, selectEstadoUsuariosDos, idApellido, idIdentificacionUsuario,
                idEmail, idCelular, idIdentificacionUsuarioDos, selectTipoIdentificacion, idIdentificacionDos, idEmailDos, idNroMovil,
                idPrimerNombre, idSegundoNombre, idPrimerApellido, idSegundoApellido, idDireccion, selectMunicipio);
    }
}