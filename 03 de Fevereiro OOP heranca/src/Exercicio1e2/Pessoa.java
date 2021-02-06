package Exercicio1e2;

//1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
//(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
//op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
//String telefone;

//1-Criar a classe e criar atributos
public class Pessoa {
	protected String nome;
	protected String endere�o;
	protected String telefone;

//2-Criar o construtor:
	protected Pessoa()
	{
		
	}
	protected Pessoa (String nome, String endere�o, String telefone)
	{
		this.nome=nome;
		this.endere�o=endere�o;
		this.telefone=telefone;
	}

//3-Criar m�todos	
	public void info()
	{
		System.out.println("Boa tarde sr�(�) "+nome+"! \nSeu endere�o e telefone foram atualizados respectivamente para "+endere�o+" e "+telefone+".");
	}
	

//4-Trazer getters and setters	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	
	
	
}


