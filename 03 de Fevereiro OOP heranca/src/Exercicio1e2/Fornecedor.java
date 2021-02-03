package Exercicio1e2;


//1-Criar a classe e criar atributos
//2-Criar o construtor:
//3-Criar métodos	
//4-Trazer getters and setters

//2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe
//Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos
//que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito
//máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).
//Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
//um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
//valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
//adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
//Fornecedor e os herdados da classe Pessoa.

//1 - CRIAR a classe e os atributos:
public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	private double Saldo;
	
//2-Criar o construtor:
	
	public Fornecedor (String nome, String endereço, String telefone, double valorCredito, double valorDivida, double Saldo)
	{
		super(nome,endereço,telefone);
		this.valorCredito=valorCredito;
		this.valorDivida=valorDivida;
		this.Saldo=Saldo;
	}
	
	
//3-Criar Métodos:
	public void getSaldo()
	{
		Saldo=valorCredito-valorDivida;
		System.out.println("Com o pagamento dessa dívida o seu novo saldo é de "+Saldo);
	}
	
	public void getInfoFornecedor()
	{
		System.out.println("\n \n \nBoa tarde "+nome+"!");
		
	}
	
	public void getAviso()
	{
		System.out.println("Você receberá a confirmação por sms no número "+telefone+". \nCaso não utilize mais esse número e queira atualizar, por favor inicie novamente o sistema.");
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
