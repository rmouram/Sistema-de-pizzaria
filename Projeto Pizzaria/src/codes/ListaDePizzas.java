
package codes;

import java.util.ArrayList;

public class ListaDePizzas {
    ArrayList<Pizza> listaPizzas;
    
    public ListaDePizzas() {
        this.listaPizzas = new ArrayList<Pizza>();
    }
    
    public ArrayList<Pizza> getListaPizzas(){
        return this.listaPizzas;
    }
}
