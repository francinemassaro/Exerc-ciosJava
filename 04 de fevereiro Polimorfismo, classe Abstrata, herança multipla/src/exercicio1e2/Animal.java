package exercicio1e2;

//2-Implemente um programa que crie os 3 tipos de animais definidos no 
//exercício anterior e invoque o método que emite o som de cada um de forma 
//polimórfica, isto é, independente do tipo de animal.

public abstract class Animal {
	
//	nome, idade, emite som, corre
	public String nome;
	public int idade;
	public String som;
	public String locomocao;
	
	public Animal ()
	{
	}
	
	public Animal (String nome, int idade, String som, String locomocao)
	{
		this.nome=nome;
		this.idade=idade;
		this.som=som;
		this.locomocao=locomocao;
	}

	
	
	public abstract void sons(String sons);

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getLocomocao() {
		return locomocao;
	}

	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}


	

}
