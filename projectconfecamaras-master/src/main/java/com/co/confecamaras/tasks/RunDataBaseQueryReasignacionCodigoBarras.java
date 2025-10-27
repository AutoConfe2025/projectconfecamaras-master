package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasReasignacionCodigoBarras;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.*;

public class RunDataBaseQueryReasignacionCodigoBarras implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasReasignacionCodigoBarras queryDatabase = new QueryConfecamarasReasignacionCodigoBarras();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String numCodigo = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listCodigoBarras;
            listCodigoBarras = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            numCodigo= listCodigoBarras.get(0).get("codigobarras").toString();
        }

        DataBase.setCodigoBarras(numCodigo);
    }

    public static RunDataBaseQueryReasignacionCodigoBarras query() {
        return instrumented(RunDataBaseQueryReasignacionCodigoBarras.class);
    }
}