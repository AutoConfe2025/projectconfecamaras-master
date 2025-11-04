package com.co.confecamaras.models.liquidacion_renovacion;

import com.co.confecamaras.questions.liquidacion_renovacion.ModeloTabla;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TablaRenovacionModel implements ModeloTabla {

    private String servicio;
    private String nombre;
    private String matricula;
    private String ano;
    private String cant;
    private String base;
    private String valor;

    @Override
    public String[] obtenerColumnas() {
        return new String[]{servicio, nombre, matricula, ano, cant, base, valor};
    }
}