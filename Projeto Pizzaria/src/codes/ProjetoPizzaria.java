
package codes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;

public class ProjetoPizzaria{

    public static void main(String[] args) throws IOException {
        Pizzaria p = new Pizzaria();
        p.CadastrarPizza("salgado", "xampu", 4);
        p.gravarPizzasObjeto();
    }
}