package Exercicio3;

import java.util.ArrayList;

public abstract class LojaBack {
	
//	public String genero;
	public String nomeProduto;
	public String tipo;
//	public String autor;
//	public int paginas;
	
	public LojaBack ()
	{
		
	}
	
	public LojaBack (String nomeProduto, String tipo)
	{
		//this.genero=genero;
		this.nomeProduto=nomePruduto;
		this.tipo=tipo;
		//this.autor=autor;
	//	this.paginas=paginas;
	}
	
	//abstract public void disca(String paraNumero);
	abstract public String info();
	

	
	//ArrayList<String> estoque = new ArrayList();
	
	
	

}
