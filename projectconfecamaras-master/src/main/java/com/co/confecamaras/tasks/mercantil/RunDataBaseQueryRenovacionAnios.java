package com.co.confecamaras.tasks.mercantil;

import com.co.confecamaras.database.QueryComfecamarasRenovarAniosAnteriores;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunDataBaseQueryRenovacionAnios implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        QueryComfecamarasRenovarAniosAnteriores queryDatabase = new QueryComfecamarasRenovarAniosAnteriores();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();
        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }
        String matricula = "";

        for (String key : valueMapDataQueryDB.keySet()) {
            List<Map<String, Object>> listMatriculas;
            listMatriculas= (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            matricula = listMatriculas.get(0).get("matricula").toString();
        }

        DataBase.setMatriculaAnios(matricula);

    }

    public static RunDataBaseQueryRenovacionAnios query() {
        return Tasks.instrumented(RunDataBaseQueryRenovacionAnios.class);
    }

}
