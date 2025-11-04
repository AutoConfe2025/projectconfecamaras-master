package com.co.confecamaras.userinterfaces.sikuli.liquidacion_renovacion;

import com.co.confecamaras.models.Element;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum liquidacion_renovacion implements Element {


    BOTON_INGRESO_MODULOS("liquidacion_renovacion/BotonIngresoModulos.png"),
    OPCION_CONSULTA_TRANSACCIONES_SIKULLI("liquidacion_renovacion/OpcionConsultaTransacciones.png"),
    OPCION_CONSULTA_REGISTRO_PUBLICO_SIKULLI("liquidacion_renovacion/ConsultaRegistroPublico.png"),
    OPCION_LIQUIDACION_RENOVACION_SIKULLI("liquidacion_renovacion/OpcionLiquidacionRenovacion.png"),
    OPCION_NOMBRE_SIKULLI("liquidacion_renovacion/OpcionNombre.png"),



    ;

    private static final String BASE_PATH =
            System.getProperty("user.dir") + "/src/test/resources/sikuli_imagenes/";

    private final String relativePath;

    @Override
    public String getImagePath() {
        return BASE_PATH + relativePath;
    }
}
