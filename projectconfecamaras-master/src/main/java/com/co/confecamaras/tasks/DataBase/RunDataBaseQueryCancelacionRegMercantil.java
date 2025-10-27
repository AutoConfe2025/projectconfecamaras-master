package com.co.confecamaras.tasks.DataBase;

import com.co.confecamaras.database.QueryCancelacionRegMercantil;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryCancelacionRegMercantil implements Task {

    public <T extends Actor> void performAs(T actor) {

        QueryCancelacionRegMercantil queryDatabase = new QueryCancelacionRegMercantil();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String matricula = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listCodigoBarras;
            listCodigoBarras = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            matricula = listCodigoBarras.get(0).get("matricula").toString();
        }
        DataBase.setNumMatriculaCancelacion(matricula);
        System.out.println("Matricula: " + matricula);
    }

    public static RunDataBaseQueryCancelacionRegMercantil query() {
        return instrumented(RunDataBaseQueryCancelacionRegMercantil.class);
    }
}
