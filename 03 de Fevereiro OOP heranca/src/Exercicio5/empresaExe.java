package Exercicio5;

public class empresaExe {
	public static void main(String[] args) {
	
	empresa empresa=new empresa();
	
	empresa.setValorProducao(100);
	empresa.setValorVenda(300);
	empresa.setQtdVenda(480);
		
			
	Operario funcionario1=new Operario(null, null, 0, 0, 0, 0, 0,0);
	Operario funcionario2=new Operario(null, null, 0, 0, 0, 0, 0,0);
	Operario funcionario3=new Operario(null, null, 0, 0, 0, 0, 0,0);
	Operario funcionario4=new Operario(null, null, 0, 0, 0, 0, 0,0);
	Operario funcionario5=new Operario(null, null, 0, 0, 0, 0, 0,0);
	
	funcionario1.setNome("Marcela Cicolani");
	funcionario1.setSetorDeTrabalho("Roupa");
	funcionario1.setQtdProducao(1898);
	funcionario1.setComissao(0);
	funcionario1.setSalarioBase(2400);
	funcionario1.setExtra(0);
	funcionario1.setSalarioInteiro(0);
	funcionario1.setQtdVendaF(147);
		
	funcionario1.setNome("Rogéria Figueiredo");
	funcionario1.setSetorDeTrabalho("Roupa");
	funcionario1.setQtdProducao(576);
	funcionario1.setComissao(0);
	funcionario1.setSalarioBase(1800);
	funcionario1.setExtra(0);
	funcionario1.setSalarioInteiro(0);
	funcionario1.setQtdVendaF(54);
	
	funcionario2.setNome("Estefani Duarte");
	funcionario2.setSetorDeTrabalho("Roupa");
	funcionario2.setQtdProducao(963);
	funcionario2.setComissao(0);
	funcionario2.setSalarioBase(1750);
	funcionario2.setExtra(0);
	funcionario2.setSalarioInteiro(0);
	funcionario2.setQtdVendaF(80);
	
	funcionario3.setNome("Lola Aparecida");
	funcionario3.setSetorDeTrabalho("Roupa");
	funcionario3.setQtdProducao(1458);
	funcionario3.setComissao(0);
	funcionario3.setSalarioBase(2000);
	funcionario3.setExtra(0);
	funcionario3.setSalarioInteiro(0);
	funcionario3.setQtdVendaF(66);
	

	funcionario4.setNome("Dórinha Machado");
	funcionario4.setSetorDeTrabalho("Roupa");
	funcionario4.setQtdProducao(365);
	funcionario4.setComissao(0);
	funcionario4.setSalarioBase(1200);
	funcionario4.setExtra(0);
	funcionario4.setSalarioInteiro(0);
	funcionario4.setQtdVendaF(104);
	
	funcionario5.setNome("Clariça Linspecta");
	funcionario5.setSetorDeTrabalho("Roupa");
	funcionario5.setQtdProducao(500);
	funcionario5.setComissao(0);
	funcionario5.setSalarioBase(1050);
	funcionario5.setExtra(0);
	funcionario5.setSalarioInteiro(0);
	funcionario5.setQtdVendaF(29);
	
	empresa.getinfoAosFuncionarios();
	funcionario1.getQtdF();
	funcionario2.getQtdF();
	funcionario3.getQtdF();
	funcionario4.getQtdF();
	funcionario5.getQtdF();
			
		
		
	}
}
