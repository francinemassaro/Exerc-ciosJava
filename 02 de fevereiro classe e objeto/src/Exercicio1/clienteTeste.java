package Exercicio1;

public class clienteTeste {
	public static void main(String args[]) {
		
		Cliente humano = new Cliente("Renata","Wiesel", "Rua Sete de Setembro, nº 440");
		System.out.println(humano.getFrase());
		
		ClientePet pet1 = new ClientePet("Dalmata", "Thor", 7);
		System.out.println(pet1.getFrase());
		
		
		
		
	}

}
