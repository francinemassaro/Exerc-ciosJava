package Exercicio3;
/*Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores
e um método calcularSalario. Escreva um programa de teste adequado para a classe
Empregado.*/
public class Empregado extends Pessoa {
	protected int codigoSetor;
	protected int salarioBase;
	protected int imposto;
	
	protected Empregado() {
		
	}
	protected Empregado (String nome, String endereco, String telefone, int codigoSetor, int salarioBase, int imposto )
	{
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
		this.codigoSetor=codigoSetor;
		this.salarioBase=salarioBase;
		this.imposto=imposto;

	}
	
	public int imposto()
	{
		return (int) (salarioBase*0.9);
	}
	
	public int salarioBruto ()
	{
		return (int) (salarioBase*0.9);
	}
	public void info()
	{
		System.out.println("Informações sobre funcionário codigo"+codigoSetor+"\nNome: "+nome+"\nEndereço: "+endereco+"\nTelefone: "+telefone);
		System.out.println("O Salário inteiro do funcionário é de "+salarioBase+".");
	}
	
	public void infoImposto()
	{
		System.out.println("Foi aplicado no salario inteiro de "+nome+" os impostos de 10%. \nO salário bruto é de: ");
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public int getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	

}

