package br.com.poagilersSorveteria.bo; 

import java.util.ArrayList; 

import br.com.poagilersSorveteria.bean.Sorvete;
import br.com.poagilersSorveteria.dao.SorveteDAO; 

public class SorveteBO {
    
	private SorveteDAO sorvetedao = new SorveteDAO();
    
    public ArrayList<Sorvete> buscarTodos() {
        return sorvetedao.buscarTodos();
    }

}