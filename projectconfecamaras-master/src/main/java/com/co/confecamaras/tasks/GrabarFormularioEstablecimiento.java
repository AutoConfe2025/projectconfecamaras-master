package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FormularioSoloEstablecimientoComercio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.confecamaras.userinterfaces.GrabarFormularioEstablecimientoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GrabarFormularioEstablecimiento implements Task {

    private String idNomenclatura;
    private String idNombreVias;
    private String idNro;
    private String idLetras;
    private String idMunicipio;
    private String idBarrio;
    private String idTelefonoUno;
    private String idTelefonoDos;
    private String idZona;
    private String idCorreoElectronico;
    private String idUbicacion;
    private String idPersonalOcupado;
    private String idTipoLocal;
    private String idActividadEconomica;

    public GrabarFormularioEstablecimiento(String idNomenclatura, String idNombreVias, String idNro, String idLetras, String idMunicipio,
                                           String idBarrio, String idTelefonoUno, String idTelefonoDos, String idZona, String idCorreoElectronico,
                                           String idUbicacion, String idPersonalOcupado, String idTipoLocal, String idActividadEconomica) {
        this.idNomenclatura = idNomenclatura;
        this.idNombreVias = idNombreVias;
        this.idNro = idNro;
        this.idLetras = idLetras;
        this.idMunicipio = idMunicipio;
        this.idBarrio = idBarrio;
        this.idTelefonoUno = idTelefonoUno;
        this.idTelefonoDos = idTelefonoDos;
        this.idZona = idZona;
        this.idCorreoElectronico = idCorreoElectronico;
        this.idUbicacion = idUbicacion;
        this.idPersonalOcupado = idPersonalOcupado;
        this.idTipoLocal = idTipoLocal;
        this.idActividadEconomica = idActividadEconomica;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GRABAR_FORMULARIO_ESTABLECIMIENTO),
                FormularioSoloEstablecimientoComercio.enConfecamaraSII(SELECT_NOMENCALTURAS_ESTABLECIMIENTO, idNomenclatura, TXT_NOMBRE_VIAS_ESTABLECIMIENTO,
                        idNombreVias, TXT_NRO_ESTABLECIMIENTO, idNro, SELECT_LETRAS_ESTABLECIMIENTO, idLetras, SELECT_MUNICIPIO_ESTABLECIMIENTO, idMunicipio,
                        SELECT_BARRIO_ESTABLECIMIENTO, idBarrio, TXT_TELEFONO_UNO_ESTABLECIMIENTO, idTelefonoUno, TXT_TELEFONO_DOS_ESTABLECIMIENTO, idTelefonoDos,
                        SELECT_ZONA_ESTABLECIMIENTO, idZona, TXT_CORREO_ELECTRONICO_ESTABLECIMIENTO, idCorreoElectronico, SELECT_UBICACION_ESTABLECIMIENTO, idUbicacion,
                        TXT_PERSONAL_OCUPADO_ESTABLECIMIENTO, idPersonalOcupado, SELECT_TIPO_LOCAL_ESTABLECIMIENTO, idTipoLocal, TXT_ACTIVIDAD_ECONOMICA_ESTABLECIMIENTO,
                        idActividadEconomica),
                Click.on(BTN_OK_ESTABLECIMIENTO),
                Click.on(BTN_RECIBIR_PAGO_ESTABLECIMIENTO)
        );
    }

    public static GrabarFormularioEstablecimiento enConfecamaraSII(String idNomenclatura, String idNombreVias, String idNro,
                                                                   String idLetras, String idMunicipio, String idBarrio, String idTelefonoUno,
                                                                   String idTelefonoDos, String idZona, String idCorreoElectronico,
                                                                   String idUbicacion, String idPersonalOcupado, String idTipoLocal,
                                                                   String idActividadEconomica){
        return instrumented(GrabarFormularioEstablecimiento.class, idNomenclatura, idNombreVias, idNro, idLetras, idMunicipio,
                idBarrio, idTelefonoUno, idTelefonoDos, idZona, idCorreoElectronico, idUbicacion, idPersonalOcupado,
                idTipoLocal, idActividadEconomica);
    }
}