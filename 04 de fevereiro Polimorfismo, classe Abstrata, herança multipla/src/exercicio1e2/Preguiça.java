package exercicio1e2;
//nome, idade, emite som, sobe em �rvores
public class Pregui�a extends Animal {
	
	public Pregui�a()
	{
	}
	
	
	public Pregui�a(String nome, int idade, String som, String locomocao) 
	{
		super(nome,idade,som,locomocao);
	}

	@Override
	public void sons(String sons) {
		// TODO Auto-generated method stub
		System.out.println("A pregui�a faz aAAAAA");
		
	}



}
