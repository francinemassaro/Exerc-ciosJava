package exercicio1e2;

// nome, idade, emite som, corre
public class Cachorro extends Animal {
	
	public Cachorro()
	{
	}
	
	
	public Cachorro(String nome, int idade, String som, String locomocao) 
	{
		super(nome,idade,som,locomocao);
	}

	@Override
	public void sons(String sons) {
		// TODO Auto-generated method stub
		
			System.out.println("O "+nome+" é um Cachorro. Ele tem "+idade+" anos e faz "+som+" ele gosta de "+locomocao);
			

	}

	

}
