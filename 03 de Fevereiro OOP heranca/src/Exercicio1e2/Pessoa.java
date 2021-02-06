package Exercicio1e2;

//1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
//(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
//opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
//String telefone;

//1-Criar a classe e criar atributos
public class Pessoa {
	protected String nome;
	protected String endereço;
	protected String telefone;

//2-Criar o construtor:
	protected Pessoa()
	{
		
	}
	protected Pessoa (String nome, String endereço, String telefone)
	{
		this.nome=nome;
		this.endereço=endereço;
		this.telefone=telefone;
	}

//3-Criar métodos	
	public void info()
	{
		System.out.println("Boa tarde srª(º) "+nome+"! \nSeu endereço e telefone foram atualizados respectivamente para "+endereço+" e "+telefone+".");
	}
	

//4-Trazer getters and setters	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	
	
	
}


