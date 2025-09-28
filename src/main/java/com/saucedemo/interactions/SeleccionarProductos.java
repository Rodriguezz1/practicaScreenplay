package com.saucedemo.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;


import java.util.List;

import static  com.saucedemo.userinterfaces.AgregarProductosUI.BTN_AÑADIR_CESTA;

public class SeleccionarProductos implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> productos = BTN_AÑADIR_CESTA.resolveAllFor(actor);
        productos.get(0).click();
        productos.get(productos.size() - 1).click();
        productos.get(productos.size() / 2).click();
        EsperaExplicita.esperar(10);

    }

    public static SeleccionarProductos aleatoriamente() {
        return Tasks.instrumented(SeleccionarProductos.class);
    }

}
