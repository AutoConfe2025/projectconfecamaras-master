package com.co.confecamaras.userinterfaces.sikuli.informe_resumido_servicios;

import com.co.confecamaras.models.Element;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Principal implements Element {

    BOTON_BUSQUEDA_USUARIO("informe_resumido_por_servicios/CampoSeleccionUsuario.png"),
    SELECCION_USUARIO("informe_resumido_por_servicios/Usuario.png"),


    ;

    private static final String BASE_PATH =
            System.getProperty("user.dir") + "/src/test/resources/sikuli_imagenes/";

    private final String relativePath;

    @Override
    public String getImagePath() {
        return BASE_PATH + relativePath;
    }
}
