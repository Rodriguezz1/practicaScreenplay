package com.saucedemo.tasks;


import com.saucedemo.interactions.SeleccionarProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.userinterfaces.AgregarProductosUI.*;

public class Productos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LST_ORDEN),
                Click.on(OP_MENOR_A_MAYOR),
                Click.on(BTN_AÑADIR_CESTA),
                SeleccionarProductos.aleatoriamente(),
                Click.on(BTN_CARRITO)
        );

    }

    public static Productos alCarrito(){return Tasks.instrumented(Productos.class);}
}
