package exercicio1e2;

import java.util.Scanner;



public class exe {
	public static void main(String[] args) {
	
	int escolha;
	
	Cachorro cao1=new Cachorro ();
	Cavalo cavalo1=new Cavalo();
	Pregui�a pregui1=new Pregui�a();
	Scanner ler=new Scanner(System.in);
	
	
	
	System.out.println("Digite um nome para o cachorro: ");
	cao1.setNome(ler.next());
	//Nome=ler.next();
	cao1.setLocomocao("correr.");
	cao1.setIdade(10);
	cao1.setSom("AUUUUU AUUUUUUUUUUUUU AU AU AU AU");
	
	cavalo1.setNome("Rog�rio");
	cavalo1.setLocomocao("correr.");
	cavalo1.setIdade(1);
	cavalo1.setSom("hiiiiii hiiihihihihihi");
	
	pregui1.setNome("Francine");
	pregui1.setLocomocao("sobe em �rvores.");
	pregui1.setIdade(0);
	pregui1.setSom("...nhai, que preg...");
	
	//Primeira tentativa foi aqui, pois n�o estava conseguindo puxar o cao1.sons pra ca.
//	System.out.println("O "+cao1.getNome()+" � um Cachorro. Ele tem "+cao1.getIdade()+" anos e faz "+cao1.getSom()+" ele gosta de "+cao1.getLocomocao());
//	System.out.println("O "+cavalo1.getNome()+" � um Cavalo. Ele tem "+cavalo1.getIdade()+" anos e faz "+cavalo1.getSom()+" ele gosta de "+cavalo1.getLocomocao());
//	System.out.println("A "+pregui1.getNome()+" � uma Pregui�a. Ela tem "+pregui1.getIdade()+" anos e faz "+pregui1.getSom()+" ele gosta de "+pregui1.getLocomocao());

			//cao1.sons(null);
			//cavalo1.sons(null);
			//pregui1.sons(null);
			
			
			
//SEGUNDO TESTE PRA BRINCAR:
			
			System.out.println("De qual animal quer saber as informa��es? \nDigite: \n1-Para Cachorro\n2-Para Cavalo ou \n3-Para Pregui�a");
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
				System.out.println("Voc� deveria ter digitado um n�mero entre 1 e 3");
			}
			if (escolha==3)
			{
					pregui1.sons(null);
			}

	
	}
}
