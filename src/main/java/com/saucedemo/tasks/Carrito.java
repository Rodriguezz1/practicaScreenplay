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



        );

    }

    public static Carrito ProductoCarrito(){return Tasks.instrumented(Carrito.class);
    }
}
