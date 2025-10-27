package com.co.confecamaras.models;

import lombok.Data;

@Data
public class TableCargaContratosRup {
    private int rowNombre;
    private String colNombre;
    private String colValor;

    public TableCargaContratosRup(int rowNombre, String colNombre, String colValor){
        this.rowNombre = rowNombre;
        this.colNombre = colNombre;
        this.colValor = colValor;
    }
}
