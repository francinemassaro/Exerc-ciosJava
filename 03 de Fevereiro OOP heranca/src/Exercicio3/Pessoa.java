package Exercicio3;
/*Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores
e um método calcularSalario. Escreva um programa de teste adequado para a classe
Empregado.*/
public class Pessoa {
	protected String nome;
	protected String endereco;
	protected String telefone;
	

	
	protected Pessoa()
	{
	}
	protected Pessoa(String nome, String endereco, String telefone)
	{
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
