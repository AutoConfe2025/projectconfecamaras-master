package com.co.confecamaras.database.NuevasConexiones;

import com.co.confecamaras.models.renovaciones_querys.QueryRenovacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdateActividadNoComercial implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        QueryConfecamarasRenovacionPnEstablecimiento query =
                new QueryConfecamarasRenovacionPnEstablecimiento();

        // 1️⃣ Obtener matrícula inicial
        String matriculaInicial = query.buscarMatricula(
                QueryRenovacion.ACTIVIDAD_NO_COMERCIAL.getSql()
        );

        System.out.println("Inicial: " + matriculaInicial);

        // 2️⃣ Ejecutar update
        String updateSql = String.format(
                QueryRenovacion.UPDATE_NO_COMERCIAL.getSql(),
                matriculaInicial
        );

        query.executeUpdate(updateSql);

        // 3️⃣ Obtener matrícula final
        String matriculaActividadNoComercial = query.buscarMatricula(
                QueryRenovacion.ACTIVIDAD_NO_COMERCIAL_FINAL.getSql()
        );

        System.out.println("Final: " + matriculaActividadNoComercial);

        // 4️⃣ Guardar en el actor (lo que necesitas 🔥)
        actor.remember("matriculaActividadNoComercial", matriculaActividadNoComercial);
    }

    public static UpdateActividadNoComercial datos() {
        return instrumented(UpdateActividadNoComercial.class);
    }
}

