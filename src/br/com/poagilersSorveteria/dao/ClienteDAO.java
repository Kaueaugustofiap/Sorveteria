package br.com.poagilersSorveteria.dao; 

import java.util.ArrayList;
import java.util.List; 
import br.com.poagilersSorveteria.bean.Cliente;
 

public class ClienteDAO {
 

	private static List<Cliente> lista = new ArrayList<Cliente>();
    
    public void cadastrar(Cliente cliente) {
        
        cliente.setIdCliente(lista.size() + 1);
        lista.add(cliente);
        
    }
    
    public ArrayList<Cliente> buscaPorSorvete(int codigo) {
        
        ArrayList<Cliente> busca = new ArrayList<Cliente>();
        for(Cliente c: lista) {
            if(c.getCodSorvete() == codigo) {
                busca.add(c);
            }
        }
        return busca;
        
    }
    
    public Cliente buscarPorCodigo(int codigo) {
        
        for(Cliente c : lista) {
            if(c.getIdCliente() == codigo) {
                return c;
            }
        }
        return null;
    }

    public void alterar(Cliente cliente) {
        
        Cliente c = buscarPorCodigo(cliente.getIdCliente());
        c.setCodSorvete(cliente.getCodSorvete());
        c.setNome(cliente.getNome());
        c.setCpf(cliente.getCpf());
        c.setQtdeVendida(cliente.getQtdeVendida());
        
    }
    
    public void remover(int codigo) throws Exception{
        
        Cliente c = buscarPorCodigo(codigo);
        if(c == null) {
            throw new Exception("Cliente não encontrado.");
        }
        
        lista.remove(c);
        
    }
    
    public List<Cliente> buscarTodos() {
        
        return lista;
        
    }
    
}