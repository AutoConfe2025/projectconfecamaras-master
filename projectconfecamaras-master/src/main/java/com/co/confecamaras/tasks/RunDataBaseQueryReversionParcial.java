package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasReversionParcial;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryReversionParcial implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasReversionParcial queryDatabase = new QueryConfecamarasReversionParcial();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String numReciboS = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listCodigoBarras;
            listCodigoBarras = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            numReciboS = listCodigoBarras.get(0).get("numerorecibo").toString();
        }

        DataBase.setNumReciboS(numReciboS);
    }

    public static RunDataBaseQueryReversionParcial query() {
        return instrumented(RunDataBaseQueryReversionParcial.class);
    }
}