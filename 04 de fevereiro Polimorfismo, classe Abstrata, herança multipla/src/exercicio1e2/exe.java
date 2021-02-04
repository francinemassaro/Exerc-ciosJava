package exercicio1e2;

import java.util.Scanner;



public class exe {
	public static void main(String[] args) {
		
	
	Cachorro cao1=new Cachorro ();
	Cavalo cavalo1=new Cavalo();
	Preguiça pregui1=new Preguiça();
	Scanner ler=new Scanner(System.in);
	
	System.out.println("Digite o nome do cachorro: ");
	cao1.setNome(ler.next());
	//Nome=ler.next();
	cao1.setLocomocao("correr.");
	cao1.setIdade(10);
	cao1.setSom("AUUUUU AUUUUUUUUUUUUU AU AU AU AU");
	
	cavalo1.setNome("Rogério");
	cavalo1.setLocomocao("correr.");
	cavalo1.setIdade(4);
	cavalo1.setSom("HIIIII HI-HI-HI");
	
	pregui1.setNome("Francine");
	pregui1.setLocomocao("subir em árvores.");
	pregui1.setIdade(0);
	pregui1.setSom("...nhai, que preg...");
	
//	System.out.println("O "+cao1.getNome()+" é um Cachorro. Ele tem "+cao1.getIdade()+" anos e faz "+cao1.getSom()+" ele gosta de "+cao1.getLocomocao());
//	System.out.println("O "+cavalo1.getNome()+" é um Cavalo. Ele tem "+cavalo1.getIdade()+" anos e faz "+cavalo1.getSom()+" ele gosta de "+cavalo1.getLocomocao());
//	System.out.println("A "+pregui1.getNome()+" é uma Preguiça. Ela tem "+pregui1.getIdade()+" anos e faz "+pregui1.getSom()+" ele gosta de "+pregui1.getLocomocao());

			cao1.sons(null);
			cavalo1.sons(null);
	
	
	}
}
