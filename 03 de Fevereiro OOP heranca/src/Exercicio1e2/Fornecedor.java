package Exercicio1e2;


//1-Criar a classe e criar atributos
//2-Criar o construtor:
//3-Criar m�todos	
//4-Trazer getters and setters

//2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe
//Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos
//que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito
//m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor).
//Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores,
//um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e
//valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
//adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe
//Fornecedor e os herdados da classe Pessoa.

//1 - CRIAR a classe e os atributos:
public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	private double Saldo;
	
//2-Criar o construtor:
	
	public Fornecedor (String nome, String endere�o, String telefone, double valorCredito, double valorDivida, double Saldo)
	{
		super(nome,endere�o,telefone);
		this.valorCredito=valorCredito;
		this.valorDivida=valorDivida;
		this.Saldo=Saldo;
	}
	
	
//3-Criar M�todos:
	public void getSaldo()
	{
		Saldo=valorCredito-valorDivida;
		System.out.println("Com o pagamento dessa d�vida o seu novo saldo � de "+Saldo);
	}
	
	public void getInfoFornecedor()
	{
		System.out.println("\n \n \nBoa tarde "+nome+"!");
		
	}
	
	public void getAviso()
	{
		System.out.println("Voc� receber� a confirma��o por sms no n�mero "+telefone+". \nCaso n�o utilize mais esse n�mero e queira atualizar, por favor inicie novamente o sistema.");
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	


}
