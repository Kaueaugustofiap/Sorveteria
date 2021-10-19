package br.com.poagilersSorveteria.bo;

import java.util.ArrayList;
import java.util.List;
 

import br.com.poagilersSorveteria.bean.Cliente;
import br.com.poagilersSorveteria.dao.ClienteDAO;


public class ClienteBO {

    private ClienteDAO clientedao = new ClienteDAO();

    public void cadastrar(Cliente cliente) throws Exception {
        validarCliente(cliente);
        clientedao.cadastrar(cliente);
    }
    
    public ArrayList<Cliente> buscarPorSorvete(int codigo) {
        return clientedao.buscaPorSorvete(codigo);
    }
    
    public Cliente buscarPorCodigo(int codigo) {
        return clientedao.buscarPorCodigo(codigo);
    }
    
    public List<Cliente> buscarTodos() {
        return clientedao.buscarTodos();
    }
    
    public void alterar(Cliente cliente) {
        clientedao.alterar(cliente);
    }
    
    public void remover(int codigo) throws Exception {
        clientedao.remover(codigo);
    }
    
    private void validarCliente(Cliente cliente) throws Exception {
        if(cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new Exception("Nome é obrigatório");
        }
    }
    
    
}