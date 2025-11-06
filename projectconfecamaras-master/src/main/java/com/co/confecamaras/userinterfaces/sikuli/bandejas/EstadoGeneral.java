package com.co.confecamaras.userinterfaces.sikuli.bandejas;

import com.co.confecamaras.models.Element;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EstadoGeneral implements Element {

    BOTON_BUSQUEDA("bandejas/estado_general/BotonBusquedaEstadoGeneral.png"),
    ICONO_BUSQUEDA_NOMBRE("bandejas/estado_general/IconoBusquedaClick.png"),
    OPCION_ESTADO_GENERAL_SIKULLI("bandejas/estado_general/OpcionEstadoGeneral.png"),



    ;

    private static final String BASE_PATH =
            System.getProperty("user.dir") + "/src/test/resources/sikuli_imagenes/";

    private final String relativePath;

    @Override
    public String getImagePath() {
        return BASE_PATH + relativePath;
    }
}
