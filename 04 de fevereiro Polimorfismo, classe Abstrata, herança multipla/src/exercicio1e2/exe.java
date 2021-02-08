package exercicio1e2;

import java.util.Scanner;



public class exe {
	public static void main(String[] args) {
	
	int escolha;
	
	Cachorro cao1=new Cachorro ();
	Cavalo cavalo1=new Cavalo();
	Preguiça pregui1=new Preguiça();
	Scanner ler=new Scanner(System.in);
	
	
	
	System.out.println("Digite um nome para o cachorro: ");
	cao1.setNome(ler.next());
	//Nome=ler.next();
	cao1.setLocomocao("correr.");
	cao1.setIdade(10);
	cao1.setSom("AUUUUU AUUUUUUUUUUUUU AU AU AU AU");
	
	cavalo1.setNome("Rogério");
	cavalo1.setLocomocao("correr.");
	cavalo1.setIdade(1);
	cavalo1.setSom("hiiiiii hiiihihihihihi");
	
	pregui1.setNome("Francine");
	pregui1.setLocomocao("sobe em árvores.");
	pregui1.setIdade(0);
	pregui1.setSom("...nhai, que preg...");
	
	//Primeira tentativa foi aqui, pois não estava conseguindo puxar o cao1.sons pra ca.
//	System.out.println("O "+cao1.getNome()+" é um Cachorro. Ele tem "+cao1.getIdade()+" anos e faz "+cao1.getSom()+" ele gosta de "+cao1.getLocomocao());
//	System.out.println("O "+cavalo1.getNome()+" é um Cavalo. Ele tem "+cavalo1.getIdade()+" anos e faz "+cavalo1.getSom()+" ele gosta de "+cavalo1.getLocomocao());
//	System.out.println("A "+pregui1.getNome()+" é uma Preguiça. Ela tem "+pregui1.getIdade()+" anos e faz "+pregui1.getSom()+" ele gosta de "+pregui1.getLocomocao());

			//cao1.sons(null);
			//cavalo1.sons(null);
			//pregui1.sons(null);
			
			
			
//SEGUNDO TESTE PRA BRINCAR:
			
			System.out.println("De qual animal quer saber as informações? \nDigite: \n1-Para Cachorro\n2-Para Cavalo ou \n3-Para Preguiça");
			escolha=ler.nextInt();
			if (escolha==1)
			{
				cao1.sons(null);
			}
			if (escolha==2)
			{
				cavalo1.sons(null);
			}
			
			if (escolha==3)
			{
					pregui1.sons(null);
			}
			
			if (escolha<1 || escolha>3)
			{
				System.out.println("Você deveria ter digitado um número entre 1 e 3");
			}
			if (escolha==3)
			{
					pregui1.sons(null);
			}

	
	}
}
