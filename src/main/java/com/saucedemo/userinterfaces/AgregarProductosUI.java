package com.saucedemo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarProductosUI {

    public static final Target LST_ORDEN = Target.the("").located(By.className("product_sort_container"));
    public static final Target OP_MENOR_A_MAYOR = Target.the("").located(By.xpath("//select/option[@value='lohi']"));
    public static final Target BTN_AÑADIR_CESTA = Target.the("").located(By.xpath("//button[contains(text(), 'Add to cart')]"));
    public static final Target BTN_CARRITO = Target.the("").located(By.className("shopping_cart_link"));

}
