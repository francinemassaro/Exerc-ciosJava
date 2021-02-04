package exercicio1e2;
// nome, idade, emite som, corre
public class Cavalo extends Animal {
	
	public Cavalo()
	{
	}
	
	
	public Cavalo(String nome, int idade, String som, String locomocao) 
	{
		super(nome,idade,som,locomocao);
	}

	@Override
	public void sons(String sons) {
		// TODO Auto-generated method stub
		System.out.println("\nO cavalo "+nome+" faz hiiiiii hiiihihihihihi");
	}

	
		
	

}
