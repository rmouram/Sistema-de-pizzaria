
package codes;

import java.io.Serializable;

public class Pizza implements Comparable<Pizza>, Serializable{
    private String tipo;
    private String sabor;
    private Integer preço;
    private Integer indiceCompra;

    public Pizza(String tipo, String sabor, Integer preço) throws NegativeValueException{
        super();
        this.indiceCompra = 0;
        this.tipo = tipo;
        this.sabor = sabor;
        if(preço<0){
            throw new NegativeValueException("O preço não pode ser menor que zero!");
        }else this.preço = preço;
        //this.preço = preço;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public void setPreço(Integer preço){
        this.preço = preço;
    }
    
    public Integer getPreço(){
        return this.preço;
    }
    
    public void setIndiceCompra(){
        indiceCompra = indiceCompra + 1;
        this.indiceCompra = indiceCompra;
    }
    
    public Integer getIndiceCompra(){
        return this.indiceCompra;
    }

    @Override
    public int compareTo(Pizza t) {
        return preço.compareTo(t.getPreço());
    }

    @Override
    public String toString() {
        return "Pizza{" + "tipo=" + tipo + ", sabor=" + sabor + ", preço=" + preço + '}';
    }
 
}

