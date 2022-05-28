package org.pepperoni;

import de.inetsoftware.jwebassembly.api.annotation.Export;

import static org.pepperoni.util.jaka.Jaka.*;

/**
 * @author Pepperoni
 *
 */

public class App {

    @Export
    public static void main() {
        div(String.valueOf(1+2));
        h1("H1");
        h2("H2");
        p("Paragraph");
        div("div");
        script("console.log('Javascript')");
    }
}
