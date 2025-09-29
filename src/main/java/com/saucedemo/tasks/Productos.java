package com.saucedemo.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.userinterfaces.AgregarProductosUI.*;

public class Productos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );

    }

    public static Productos alCarrito(){return Tasks.instrumented(Productos.class);}
}
