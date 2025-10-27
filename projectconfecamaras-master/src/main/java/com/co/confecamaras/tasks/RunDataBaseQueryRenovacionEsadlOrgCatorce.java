package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasRenovacionEsadlOrgCatorce;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryRenovacionEsadlOrgCatorce implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasRenovacionEsadlOrgCatorce queryDatabase = new QueryConfecamarasRenovacionEsadlOrgCatorce();

        Map<String, Object> valueMapDataQueryDB = new HashMap<>();

        try {
            valueMapDataQueryDB = queryDatabase.buscarData();
        } catch (SQLException e) {

        }

        String numMatricula = "";

        for (String key: valueMapDataQueryDB.keySet()) {
            List<Map<String,Object>> listCodigoBarras;
            listCodigoBarras = (List<Map<String, Object>>) valueMapDataQueryDB.get(key);
            numMatricula = listCodigoBarras.get(0).get("matricula").toString();
        }

        DataBase.setNumeroMatriculaEsadlOrgCatorce(numMatricula);
    }

    public static RunDataBaseQueryRenovacionEsadlOrgCatorce query() {
        return instrumented(RunDataBaseQueryRenovacionEsadlOrgCatorce.class);
    }
}