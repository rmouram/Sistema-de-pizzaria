
package codes;

import java.util.Comparator;

public class ComparatorPizzas implements Comparator<Pizza>{

    @Override
    public int compare(Pizza t, Pizza t1) {
        return t.getIndiceCompra() - t1.getIndiceCompra();
    }

}
