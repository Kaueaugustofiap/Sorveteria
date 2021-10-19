package br.com.poagilersSorveteria.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

import br.com.poagilersSorveteria.bean.Cliente;
import br.com.poagilersSorveteria.bean.Sorvete;
import br.com.poagilersSorveteria.bo.*;

 

@WebServlet("/clienteServlet")
public class ClienteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	request.setCharacterEncoding("utf-8");
    	
        String acao =  request.getParameter("acao");
        String retorno = "";
        
        switch(acao) {
        case "carregar":
            carregaCombo(request);
            retorno = "cadastroCliente.jsp";
            break;
        case "remover":
            remover(request);
            listar(request);
            retorno = "listaCliente.jsp";
            break;
        case "buscar":
            buscar(request);
            retorno = "listaCliente.jsp";
            break;
        case "cadastrar":
            try {
                cadastrar(request);
                listar(request);
                retorno = "listaCliente.jsp";
            }catch(Exception e) {
                carregaCombo(request);
                request.setAttribute("erro", e.getMessage());
                retorno = "cadastroCliente.jsp";
            }
            break;
        case "exibir":
            carregaCombo(request);
            editar(request);
            retorno = "cadastroCliente.jsp";
            break;
        case "listar":
            listar(request);
            retorno = "listaCliente.jsp";
            break;
        }
        
        request.getRequestDispatcher(retorno).forward(request, response);
        
    }
    
    private void carregaCombo(HttpServletRequest request) {
        
        SorveteBO sorveteBO = new SorveteBO();
        request.setAttribute("sorvetes", sorveteBO.buscarTodos());
    
    }
    
    private void editar(HttpServletRequest request) {
           
        SorveteBO sorveteBO = new SorveteBO();
       
        if(request.getParameter("codigo") != null) {
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            ClienteBO clienteBO = new ClienteBO();
            Cliente cli = clienteBO.buscarPorCodigo(codigo);
            request.setAttribute("cliente", cli);
        }
       
        ArrayList<Sorvete> sorvetes = sorveteBO.buscarTodos();
        request.setAttribute("sorvetes", sorvetes);
    }
    
    private void buscar(HttpServletRequest request) {
        
        int codigo = Integer.parseInt(request.getParameter("sorvete"));
        ClienteBO clienteBO = new ClienteBO();
        ArrayList<Cliente> lista = clienteBO.buscarPorSorvete(codigo);
        request.setAttribute("lista", lista);
        SorveteBO sorveteBO = new SorveteBO();
        ArrayList<Sorvete> sorvetes = sorveteBO.buscarTodos();
        request.setAttribute("sorvetes", sorvetes);
    
    }

    private void cadastrar(HttpServletRequest request) throws Exception {
        
        String codigo = request.getParameter("codigo");
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        int codSorvete = Integer.parseInt(request.getParameter("codSorvete"));
        int quantidade = Integer.parseInt(request.getParameter("qtdeVendida"));
        
        ClienteBO bo = new ClienteBO();
        
        if(codigo.equals("")) {
            Cliente cli = new Cliente(nome, cpf, codSorvete, quantidade);
            bo.cadastrar(cli);
            request.setAttribute("msg", "Cliente cadastrado com sucesso!");
        } else {
            int cod = Integer.parseInt(codigo);
            Cliente cli = new Cliente(cod, nome, cpf, codSorvete, quantidade);
            bo.alterar(cli);
            request.setAttribute("msg", "Cliente alterado com sucesso!");
        }
        
    }
    
    private void remover(HttpServletRequest request) {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        
        ClienteBO bo = new ClienteBO();
        
        try {
            bo.remover(codigo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("msg", "Cliente removido com sucesso!");
    }
    
    private void listar(HttpServletRequest request) {
        
        ClienteBO bo = new ClienteBO();
        SorveteBO sorveteBO = new SorveteBO();
        
        ArrayList<Sorvete> sorvetes = sorveteBO.buscarTodos();
        request.setAttribute("sorvetes", sorvetes);
        request.setAttribute("lista", bo.buscarTodos());
    }
    
}