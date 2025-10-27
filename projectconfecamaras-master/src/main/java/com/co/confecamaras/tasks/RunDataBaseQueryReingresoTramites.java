package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasReasignacionCodigoBarras;
import com.co.confecamaras.database.QueryConfecamarasReingresoTramites;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryReingresoTramites implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasReingresoTramites queryDatabase = new QueryConfecamarasReingresoTramites();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String codBarras = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listCodigoBarras;
            listCodigoBarras = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            codBarras= listCodigoBarras.get(0).get("codigobarras").toString();
        }

        DataBase.setCodigoBarrasReingreso(codBarras);
    }

    public static RunDataBaseQueryReingresoTramites query() {
        return instrumented(RunDataBaseQueryReingresoTramites.class);
    }
}