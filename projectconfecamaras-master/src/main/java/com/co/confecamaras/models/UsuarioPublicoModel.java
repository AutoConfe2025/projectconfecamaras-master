package com.co.confecamaras.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioPublicoModel {

    private String camara;
    private String usuario;
    private String identificacion;
    private String contrasena;

    public static UsuarioPublicoModel usuarioDefault() {
        return UsuarioPublicoModel.builder()
                .camara("20")
                .usuario("CAJAQA")
                .identificacion("11314260")
                .contrasena("2837279")
                .build();
    }


    public static UsuarioPublicoModel usuarioAdmin20() {
        return UsuarioPublicoModel.builder()
                .camara("20")
                .usuario("Admin")
                .identificacion("11314260")
                .contrasena("2837279")
                .build();
    }

    public static UsuarioPublicoModel usuarioAdmin27() {
        return UsuarioPublicoModel.builder()
                .camara("27")
                .usuario("cajaqa")
                .identificacion("11314260")
                .contrasena("2837279")
                .build();
    }
}
