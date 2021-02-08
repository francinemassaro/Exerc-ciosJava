package ConclusaoModulo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
private	List<Livro> listaDeLivros;	
	
	public Biblioteca() {
		
		this.setListaDeLivros(new ArrayList());
		
	}
	
	public void doarLivro(Livro livro) {
		this.getListaDeLivros().add(livro);
		
	}
	
	public boolean adotarLivro(int id) {
		Livro livro = obterLivro(id);
		
		if (livro == null) { // Livro não encontrado
			return false;
			
		} else { // Livro Existe
			this.getListaDeLivros().remove(livro);
			
			return true;
		}
		
	}
	
	public Livro obterLivro(int id) {
		for(Livro livro : this.getListaDeLivros()) {
			if(livro.getId() ==  id) {
				return livro;
			}
		}
		
		return null;	
	}
	
	public List<Livro> quaisLivrosContemNaBiblioteca() {
		return this.getListaDeLivros();
	}

	public List<Livro> getListaDeLivros() {
		return listaDeLivros;
	}

	public void setListaDeLivros(List<Livro> listaDeLivros) {
		this.listaDeLivros = listaDeLivros;
	}
	
}
