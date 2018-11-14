
package codes;

import java.util.ArrayList;
import java.util.Collections;

public class Cliente{
    
    public Pizzaria cadPizza;
    ListaDePizzas lp = new ListaDePizzas();
    
    
    
    public ArrayList<Pizza> ordenarMaiorPreço(ArrayList<Pizza>o){
        Collections.sort(o, Collections.reverseOrder());
        return o;
    }

    public ArrayList<Pizza> ordenarMaisVendidas(ArrayList<Pizza>o){
        Collections.sort(o, new ComparatorPizzas().reversed());
        return o;
    }
   

}
