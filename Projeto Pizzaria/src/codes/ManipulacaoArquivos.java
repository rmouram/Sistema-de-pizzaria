package codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ManipulacaoArquivos {

    public Pizzaria cadPizza;
    ListaDePizzas lp = new ListaDePizzas();

    // usado para salvar o conteudo do array em arquivo txt para ser lido e exibido mais facilmente
    public void salvarListaTXT(ArrayList<Pizza> o) throws IOException{
        File arquivo = new File ("listapizzas.txt");
        if(!arquivo.exists()){
            try{
                arquivo.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        try{
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Pizza p: o){
                bw.write("[Tipo: "+p.getTipo()+"|| Sabor: "+p.getSabor()+"|| Preço: "+p.getPreço()+"]"+"\n");
            }
            bw.close();
            fw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    // um método praticamente igual ao salvarListaTXT() porém este salva em arquivo
    // diferente para facilitar o resgate do txt na tela de listagem ordenada
    public void salvarListaTXTOrdenada(ArrayList<Pizza> o) throws IOException{
        File arquivo = new File ("listaPizzasOrdenadas.txt");
        if(!arquivo.exists()){
            try{
                arquivo.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        try{
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Pizza p: o){
                bw.write("[Tipo: "+p.getTipo()+"|| Sabor: "+p.getSabor()+"|| Preço: "+p.getPreço()+"|| Qtd de vendas: "+p.getIndiceCompra()+"]"+"\n");
            }
            bw.close();
            fw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
    // um método praticamente igual ao salvarListaTXT() porém este salva em arquivo
    // diferente para facilitar o resgate do txt na tela de listagem ordenada
    public void salvarListaTXTOrdenadaPelasVendas(ArrayList<Pizza> o) throws IOException{
        
        File arquivo = new File ("listaPizzasOrdenadasPelasVendas.txt");
        if(!arquivo.exists()){
            try{
                arquivo.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        try{
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Pizza p: o){
                bw.write("[Tipo: "+p.getTipo()+"|| Sabor: "+p.getSabor()+"|| Preço: "+p.getPreço()+"|| Qtd de vendas: "+p.getIndiceCompra()+"]"+"\n");
            }
            bw.close();
            fw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
    
    public String lerListaTXT() throws FileNotFoundException, IOException{

        String conteudo = "";
        try (BufferedReader br = new BufferedReader(new FileReader("listapizzas.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                conteudo += sCurrentLine+"\n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return conteudo;
    }
    
    public String lerListaTXTOrdenado() throws FileNotFoundException, IOException{
        String conteudo = "";
        try (BufferedReader br = new BufferedReader(new FileReader("listaPizzasOrdenadas.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                conteudo += sCurrentLine+"\n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return conteudo;
    }
    
    public String lerListaTXTOrdenadoPelasVendas() throws FileNotFoundException, IOException{
        String conteudo = "";
        try (BufferedReader br = new BufferedReader(new FileReader("listaPizzasOrdenadasPelasVendas.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                conteudo += sCurrentLine+"\n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return conteudo;
    }
    
    
    

    public static ArrayList<Pizza> recuperaPizzas() {
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
        return pizzas;
    }
    
}
