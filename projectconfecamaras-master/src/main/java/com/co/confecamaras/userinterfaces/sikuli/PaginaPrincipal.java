package com.co.confecamaras.userinterfaces.sikuli;

import com.co.confecamaras.models.Element;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PaginaPrincipal implements Element {

    CAMPO_INGRESO_CAMARA_COMERCIO("pagina_principal/OpcionCamara.png"),
    BUSCAR_CAMARA("pagina_principal/BuscarCamara.png");

    private static final String BASE_PATH =
            System.getProperty("user.dir") + "/src/test/resources/sikuli_imagenes/";

    private final String relativePath;

    @Override
    public String getImagePath() {
        return BASE_PATH + relativePath;
    }
}
