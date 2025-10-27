package com.co.confecamaras.tasks.usuariosnacionales;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.waitinteractions.*;
import com.co.confecamaras.utils.usuariosnacionales.UsuariosNacionalesConstans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.MenuSistema.TXT_BUSQUEDA_INPUT;
import static com.co.confecamaras.userinterfaces.usuariosnacionales.UsuariosNacionalesPage.*;

public class ModificarUsuarioNacional implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              ModalLoader.modalLoader(),
              WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
              Click.on(BTN_MENU_LATERAL),
              ModalLoader.modalLoader(),
              WaitInteractions.untilBeEnable(TXT_BUSQUEDA_INPUT),
              Enter.theValue(UsuariosNacionalesConstans.TEXTO_BUSQUEDA).into(TXT_BUSQUEDA_INPUT),
              WaitInteractions.untilBeEnable(SUSCRIPTORES_NACIONALES_OPCION),
              Click.on(SUSCRIPTORES_NACIONALES_OPCION),
              CambiarALaSiguientePestana.siguiente()
      );
        //Editar usuario
      actor.attemptsTo(
              WaitInteractions.untilBeEnable(BUSCADOR_USUARIO),
              Enter.theValue(UsuariosNacionalesConstans.DOCUMENTO).into(BUSCADOR_USUARIO),
              WaitInteractions.untilBeEnable(ICONO_EDITAR),
              Click.on(ICONO_EDITAR),
              WaitInteractions.untilBeEnable(BTN_GRABAR),
              Click.on(BTN_GRABAR)
      );
      //Editar usuario
      actor.attemptsTo(
              WaitInteractions.untilBeEnable(BUSCADOR_USUARIO),
              Enter.theValue(UsuariosNacionalesConstans.DOCUMENTO).into(BUSCADOR_USUARIO),
              WaitInteractions.untilBeEnable(ICONO_GENERAR_CONTRASENA),
              Click.on(ICONO_GENERAR_CONTRASENA),
              WaitInteractions.untilBeEnable(BTN_ACEPTAR),
              Click.on(BTN_ACEPTAR)
              );

      //Eliminar usuario
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BUSCADOR_USUARIO),
                Enter.theValue(UsuariosNacionalesConstans.DOCUMENTO).into(BUSCADOR_USUARIO),
                WaitInteractions.untilBeEnable(ICONO_ELIMINAR),
                Click.on(ICONO_ELIMINAR),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_ELIMINAR),
                Click.on(BTN_ACEPTAR_ELIMINAR),
                WaitInteractions.untilBeEnable(BUSCADOR_USUARIO),
                Enter.theValue(UsuariosNacionalesConstans.DOCUMENTO).into(BUSCADOR_USUARIO),
                WaitInterrupted3Segundos.esperaConstante3()
                );
    }
    public static ModificarUsuarioNacional modificar(){
        return Tasks.instrumented(ModificarUsuarioNacional.class);
    }
}
