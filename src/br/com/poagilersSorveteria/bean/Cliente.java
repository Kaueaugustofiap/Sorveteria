package br.com.poagilersSorveteria.bean;

public class Cliente {

	private int idCliente;
    private String nome;
    private String cpf;
    private int codSorvete;
    private int qtdeVendida;
    
    public Cliente() {
        super();
    }
 

    public Cliente(String nome, String cpf, int codSorvete, int qtdeVendida) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.codSorvete = codSorvete;
        this.qtdeVendida = qtdeVendida;
    }
 

    public Cliente(int idCliente, String nome, String cpf, int codSorvete, int qtdeVendida) {
        super();
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.codSorvete = codSorvete;
        this.qtdeVendida = qtdeVendida;
    }

 
    public int getIdCliente() {
        return idCliente;
    }
 

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

     public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getCodSorvete() {
        return codSorvete;
    }
 
    public void setCodSorvete(int codigoSorvete) {
        this.codSorvete = codigoSorvete;
    }
    
    public int getQtdeVendida() {
        return qtdeVendida;
    }
    
    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }
	
}
