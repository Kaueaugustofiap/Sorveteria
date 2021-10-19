package br.com.poagilersSorveteria.bean;

public class Sorvete {
	
	 	private int codigo;
	    private String sabor;
	    private double preco;
	    private String tipo;
	    
	    public Sorvete() {
	        super();
	    }
	    
	    public Sorvete(int codigo, String sabor, double preco, String tipo) {
	        super();
	        this.codigo = codigo;
	        this.sabor = sabor;
	        this.preco = preco;
	        this.tipo = tipo;
	    }	 

	    public int getCodigo() {
	        return codigo;
	    }	 

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }
	 

	    public String getSabor() {
	        return sabor;
	    }	 

	    public void setSabor(String sabor) {
	        this.sabor = sabor;
	    }	 

	    public double getPreco() {
	        return preco;
	    }	 

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }	    
	    public String getTipo() {
	        return tipo;
	    }
	    
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }

}
