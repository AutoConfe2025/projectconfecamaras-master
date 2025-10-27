package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasReversionRecibosCaja;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryReversionRecibosCaja implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasReversionRecibosCaja queryDatabase = new QueryConfecamarasReversionRecibosCaja();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String numRecibo = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listCodigoBarras;
            listCodigoBarras = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            numRecibo= listCodigoBarras.get(0).get("numerorecibo").toString();
        }

        DataBase.setNumeroReversionRecibosCaja(numRecibo);
    }

    public static RunDataBaseQueryReversionRecibosCaja query() {
        return instrumented(RunDataBaseQueryReversionRecibosCaja.class);
    }
}