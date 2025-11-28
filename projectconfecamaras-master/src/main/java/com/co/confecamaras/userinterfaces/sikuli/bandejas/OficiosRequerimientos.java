package com.co.confecamaras.userinterfaces.sikuli.bandejas;

import com.co.confecamaras.models.Element;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OficiosRequerimientos implements Element {

    OPCION_OFICIOS_REQUERIMIENTOS("bandejas/oficios_requerimientos/OpcionOficiosRequerimientos.png"),

    ;

    private static final String BASE_PATH =
            System.getProperty("user.dir") + "/src/test/resources/sikuli_imagenes/";

    private final String relativePath;

    @Override
    public String getImagePath() {
        return BASE_PATH + relativePath;
    }
}
