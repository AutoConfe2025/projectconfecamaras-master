package com.co.confecamaras.tasks;

import com.co.confecamaras.database.QueryConfecamarasEstudioInscripcionDocumentosProponentes;
import com.co.confecamaras.database.QueryConfecamarasRenovacionMatriculaActividadNoComercial;
import com.co.confecamaras.models.DataBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RunDataBaseQueryEstudioInscripcionDocumentosProponentes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        QueryConfecamarasEstudioInscripcionDocumentosProponentes queryDatabase = new QueryConfecamarasEstudioInscripcionDocumentosProponentes();

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

        DataBase.setNumMatEstInsProp(numMatricula);
    }

    public static RunDataBaseQueryEstudioInscripcionDocumentosProponentes query() {
        return instrumented(RunDataBaseQueryEstudioInscripcionDocumentosProponentes.class);
    }
}