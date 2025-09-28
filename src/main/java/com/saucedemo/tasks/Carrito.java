package com.saucedemo.tasks;

import static com.saucedemo.userinterfaces.CarritoUI.*;

import com.saucedemo.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Carrito implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_REMOVER),
                Click.on(BTN_CHECKOUT),
                Enter.theValue(datos.getNombre()).into(TXT_FIRST_NAME),
                Enter.theValue(datos.getApellido()).into(TXT_LAST_NAME),
                Enter.theValue(datos.getCodigoZip()).into(TXT_ZIP),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINALIZAR)


        );

    }

    public static Carrito ProductoCarrito(){return Tasks.instrumented(Carrito.class);
    }
}
