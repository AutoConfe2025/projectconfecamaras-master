package com.co.confecamaras.userinterfaces.sikuli.registro_publico;

import com.co.confecamaras.models.Element;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum page implements Element {

    BOTON_REGENERAR_SELLO_SIKULLI("pagina_principal/OpcionCamara.png"),
    BOTON_CONTINUAR_IMAGEN_SIKULLI("registro_publico/BotonContinuarImagen.png");

    private static final String BASE_PATH =
            System.getProperty("user.dir") + "/src/test/resources/sikuli_imagenes/";

    private final String relativePath;

    @Override
    public String getImagePath() {
        return BASE_PATH + relativePath;
    }
}
