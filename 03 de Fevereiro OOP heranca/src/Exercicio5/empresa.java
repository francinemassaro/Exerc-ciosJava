package Exercicio5;

public class empresa {
	public int valorProducao;
	public int valorVenda;
	public int qtdVenda;
	
	public empresa()
	{
		
	}
	
	public empresa(int valorProducao, int valorVenda, int qtdVenda)
	{
		this.valorProducao=valorProducao;
		this.valorVenda=valorVenda;
		this.qtdVenda=qtdVenda;
	}
	
	public void getinfoAosFuncionarios()
	{
	//	System.out.println("E funcion�rie "+nome+" do setor de "+setorDeTrabalho+" neste m�s confeccionou"+qtdProducao+" pe�as.");
	//	System.out.println("As pe�as que vendemos tem custo de obra prima no valor de R$ "+valorProducao+" e vendemos a unidade por R$ "+valorVenda);
		System.out.println("Neste m�s vendemos "+qtdVenda+" unidades e conseguimos lucrar mais que o esperado.");
		System.out.println("Devido a isso, pagaremos uma comissao de 10% a mais no sal�rio pra quem conseguiu vender acima de 80 pe�as");
		System.out.println("Tamb�m pagaremos um adicional de 50% pra quem mais confeccionou as pe�as neste ano.");
	}

	public int getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(int valorVenda) {
		this.valorVenda = valorVenda;
	}

	public int getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}

	

}
