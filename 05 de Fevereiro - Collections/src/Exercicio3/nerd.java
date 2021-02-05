package Exercicio3;

import java.util.ArrayList;

public class nerd extends LojaBack {
	
	public nerd()
	{
		
	}
	
	@Override
	public String info() {
		System.out.println("Genero: "+genero+"\nNome: "+nome+"\nAutor: "+autor+"\nNº de Páginas: "+paginas);
		return info();
	}
	ArrayList<String> estoque = new ArrayList();
}
