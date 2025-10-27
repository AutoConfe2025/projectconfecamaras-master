package com.co.confecamaras.tasks.DataBase;

import com.co.confecamaras.database.QueryBandejaPonalSinAsentamiento;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryBandejaPonalSinAsentamiento implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {

        QueryBandejaPonalSinAsentamiento queryDatabase = new QueryBandejaPonalSinAsentamiento();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String matricula = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listMatricula;
            listMatricula = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            matricula = listMatricula.get(0).get("matricula").toString();
        }
        DataBase.setNumMatricula(matricula);
        System.out.println("Matricula: " + matricula);
    }

    public static RunDataBaseQueryBandejaPonalSinAsentamiento query() {
        return instrumented(RunDataBaseQueryBandejaPonalSinAsentamiento.class);
    }
}
