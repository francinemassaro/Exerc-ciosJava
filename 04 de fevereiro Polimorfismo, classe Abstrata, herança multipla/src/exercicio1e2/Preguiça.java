package exercicio1e2;
//nome, idade, emite som, sobe em árvores
public class Preguiça extends Animal {
	
	public Preguiça()
	{
	}
	
	
	public Preguiça(String nome, int idade, String som, String locomocao) 
	{
		super(nome,idade,som,locomocao);
	}

	@Override
	public void sons(String sons) {
		// TODO Auto-generated method stub
		System.out.println("A preguiça faz aAAAAA");
		
	}



}
