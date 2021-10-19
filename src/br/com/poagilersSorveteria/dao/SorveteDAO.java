package br.com.poagilersSorveteria.dao;

import java.util.ArrayList;
import br.com.poagilersSorveteria.bean.Sorvete;
 

public class SorveteDAO {

	private static ArrayList<Sorvete> lista = new ArrayList<Sorvete>();
    
    static {
        
        lista.add(new Sorvete(1, "Chocolate", 12, "Pote"));
        lista.add(new Sorvete(2, "Chocolate", 2.5, "Casquinha"));
        lista.add(new Sorvete(3, "Chocolate", 1.5, "Picolé"));
        lista.add(new Sorvete(4, "Morango", 12, "Pote"));
        lista.add(new Sorvete(5, "Morango", 2.5, "Casquinha"));
        lista.add(new Sorvete(6, "Morango", 1.5, "Picolé"));
        lista.add(new Sorvete(7, "Flocos", 12, "Pote"));
        lista.add(new Sorvete(8, "Flocos", 2.5, "Casquinha"));
        lista.add(new Sorvete(9, "Flocos", 1.5, "Picolé"));
        lista.add(new Sorvete(10, "Chiclete", 12, "Pote"));
        lista.add(new Sorvete(11, "Chiclete", 2.5, "Casquinha"));
        lista.add(new Sorvete(12, "Chiclete", 1.5, "Picolé"));
        lista.add(new Sorvete(13, "Milho Verde", 12, "Pote"));
        lista.add(new Sorvete(14, "Milho Verde", 2.5, "Casquinha"));
        lista.add(new Sorvete(15, "Milho Verde", 1.5, "Picolé"));
        lista.add(new Sorvete(16, "Coco", 12, "Pote"));
        lista.add(new Sorvete(17, "Coco", 2.5, "Casquinha"));
        lista.add(new Sorvete(18, "Coco", 1.5, "Picolé"));
        lista.add(new Sorvete(19, "Laranja", 1.5, "Picolé"));
        lista.add(new Sorvete(20, "Banana", 12, "Pote"));
        lista.add(new Sorvete(21, "Banana", 1.5, "Picolé"));
        lista.add(new Sorvete(22, "Napolitano", 12, "Pote"));
        lista.add(new Sorvete(23, "Napolitano", 2.5, "Casquinha"));
        lista.add(new Sorvete(24, "Napolitano", 1.5, "Picolé"));
        
    }
    
    public ArrayList<Sorvete> buscarTodos() {
        return lista;
    }
    
}