package Exercicio3;


public class produtoEletronicoExe {
	public static void main(String[] args) {
		
		produtoEletronico aparelho1= new produtoEletronico (1,"celular","Asus Zenfone", "M2.", "Carregador e Manual de instruções.");
		System.out.println(aparelho1.getConsideracoes());
		
		produtoEletronico aparelho2= new produtoEletronico (2,"notebook","Lenovo", "G40.", "Carregador, um pendrive 64gb e Manual de instruções.");
		System.out.println(aparelho1.getConsideracoes());
		
		produtoEletronico aparelho3= new produtoEletronico (3,"mouse","Multilaser", "MO274.", "Sem conteúdo adicional.");
		System.out.println(aparelho1.getConsideracoes());
		
		
		
		
		
	}

}
