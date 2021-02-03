package Exercicio5;
//Um determinado operário
//tem como atributos da classe Pessoa e também os atributos próprios como valorProducao
//(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e
//comissao (que corresponde à porcentagem do valorProducao que será adicionado ao
//vencimento base do operário).

public class Operario extends Pessoa {
	//1-Criar a classe e criar atributos
	
	public double qtdProducao;
	public double comissao;
	public double salarioBase;
	public double extra;
	public double salarioInteiro;
	public double qtdVendaF;
	//2-Criar o construtor:
	

	
	public Operario(String nome, String setorDeTrabalho, double qtdProducao, double comissao, double salarioBase, double extra, double salarioInteiro, double qtdVendaF)
	{
		super(nome,setorDeTrabalho);
		this.comissao=comissao;
		this.salarioBase=salarioBase;
		this.extra=extra;
		this.salarioInteiro=salarioInteiro;
		this.qtdProducao=qtdProducao;
		this.qtdVendaF=qtdVendaF;
	}
	//3-Criar métodos	
	//public void infoAosFuncionarios()
	//{
	//	System.out.println("E funcionárie "+nome+" do setor de "+setorDeTrabalho+" neste mês confeccionou"+qtdProducao+" peças.");
	//	System.out.println("As peças que vendemos tem custo de obra prima no valor de R$ "+valorProducao+" e vendemos a unidade por R$ "+valorVenda);
	//	System.out.println("Neste mês vendemos "+qtdVenda+"unidades e conseguimos lucrar mais que o esperado.");
	//	System.out.println("Devido a isso, pagaremos uma comissao de 10% a mais no salário pra quem conseguiu vender acima de 20 peças");
	//	System.out.println("Também pagaremos um adicional de 50% pra quem mais confeccionou as peças neste ano.");
	//}
	public void getQtdF()
	{
		if (qtdVendaF>=80)
		{
			salarioInteiro=(salarioBase*1.1);
			System.out.println("\nParabens, "+nome+" você ganhou a comissão e seu salário de "+salarioBase+" será R$ "+salarioInteiro+" nesse mês!");
		}
		
	}

	public double getQtdVendaF() {
		return qtdVendaF;
	}

	public void setQtdVendaF(double qtdVendaF) {
		this.qtdVendaF = qtdVendaF;
	}

	public double getQtdProducao() {
		return qtdProducao;
	}

	public void setQtdProducao(double qtdProducao) {
		this.qtdProducao = qtdProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getExtra() {
		return extra;
	}

	public void setExtra(double extra) {
		this.extra = extra;
	}

	public double getSalarioInteiro() {
		return salarioInteiro;
	}

	public void setSalarioInteiro(double salarioInteiro) {
		this.salarioInteiro = salarioInteiro;
	}
	
	//4-Trazer getters and setters
	
	
	
	
	

}
