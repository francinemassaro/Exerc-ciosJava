package Exercicio1e2;

public class exercicio2Exe {
	public static void main(String[] args) {
		Pessoa pessoa1=new Pessoa(null, null, null);
		Fornecedor fornecedor1=new  Fornecedor(null, null, null, 0, 0, 0);
		
		pessoa1.setNome("Aparecida");
		pessoa1.setEndereço("7 de setembro, nº 38");
		pessoa1.setTelefone("(12)988445390");
		
		fornecedor1.setNome("Pedro");
		fornecedor1.setEndereço("Rua XV de Novembro, nº 240");
		fornecedor1.setTelefone("(11)932940032");
		fornecedor1.setValorCredito(5300);
		fornecedor1.setValorDivida(450);
		fornecedor1.setSaldo(0);
	
		
		pessoa1.info();
		
		
		fornecedor1.getInfoFornecedor();
		System.out.println("O seu valor de crédito é de R$ "+fornecedor1.getValorCredito());
		System.out.println("A conta que quer pagar é no valor de "+fornecedor1.getValorDivida());
		fornecedor1.getSaldo();
		fornecedor1.getAviso();
		
		
		
		
	}

}
