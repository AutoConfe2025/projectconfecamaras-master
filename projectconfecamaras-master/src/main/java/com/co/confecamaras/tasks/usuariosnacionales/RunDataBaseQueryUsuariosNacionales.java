package com.co.confecamaras.tasks.usuariosnacionales;

import com.co.confecamaras.database.QueryConfecamarasUsuariosNacionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.sql.SQLException;

public class RunDataBaseQueryUsuariosNacionales implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        QueryConfecamarasUsuariosNacionales queryDatabase = new QueryConfecamarasUsuariosNacionales();

        try {
            queryDatabase.CrearData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static RunDataBaseQueryUsuariosNacionales query(){
        return Tasks.instrumented(RunDataBaseQueryUsuariosNacionales.class);
    }
}
