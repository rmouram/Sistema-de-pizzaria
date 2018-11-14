
package codes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class Pizzaria{

    ListaDePizzas lp = new ListaDePizzas();
    
    public void CadastrarPizza(String tipo, String sabor, Integer preço){
        try{
            Pizza nPizza = new Pizza (tipo, sabor, preço);
            lp.getListaPizzas().add(nPizza);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String listarPizzas(){
        String s = "";
        for(Pizza e:lp.getListaPizzas()){
            try{
                s+= "Tipo: "+e.getTipo()+" - Sabor: "+e.getSabor()+" - Preço: "+e.getPreço()+" - Qtd: "+e.getIndiceCompra()+"\n";
            }catch(Exception exc){
                System.out.println(exc.getMessage());
            }
        }
        return s;
    }
    // busca o objeto Pizza no diretório padrão e retorna o objeto
    public Pizza buscar(String sabor){

        File dir = new File("pizzas");
        ArrayList<String> paths =new ArrayList<String>(Arrays.asList(dir.list()));
        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        for (String path:paths){
            try (ObjectInputStream ois = new ObjectInputStream(
                                         new FileInputStream(dir.getPath()+"//"+path))) {

                Pizza e = (Pizza)ois.readObject();
                pizzas.add(e);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        for(Pizza i: pizzas){
            if(i.getSabor().equals(sabor)){
                return i;
            }
        }
        return null;
    }
    // usa o método buscar() para encontrar o objeto para remové-lo da arraylist e em seguida do diretório
    // este método é usado por TelaAdmRemover no pacote view
    public void remover(String sabor){
        Pizza o = buscar(sabor);
        File dir = new File("pizzas/ "+o.getSabor()+".ser"); 
        if(dir.isFile()){
            lp.getListaPizzas().remove(o);
            dir.delete();
        }
    }
    // método para alterar os atributos de um determinado objeto na arraylist
    // a alteração nos arquivos vai ser feita em TelaAdmAlterar
    public void alterarPizzas(String tipo, String sabor, Integer preço){
        Pizza o = buscar(sabor);
        o.setTipo(tipo);
        o.setSabor(sabor);
        o.setPreço(preço);
        lp.getListaPizzas().add(o); 
    }
    private void JOptionPane(Object object, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // os métodos comprar() e gravarPizzasObjeto() deveria estar nas classe
    // Cliente e ManipulacaoARquivos respectivamente, porém elas não funcionaram lá
    // apenas aqui.
    public void comprar(Pizza o){
        o.setIndiceCompra();
        lp.getListaPizzas().add(o);
    }

    public void gravarPizzasObjeto(){
        File dir = new File("pizzas");
        dir.mkdirs();
        for (Pizza e : lp.getListaPizzas()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(dir.getAbsolutePath() + "// "+e.getSabor()+".ser"))) {

                oos.writeObject(e);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
