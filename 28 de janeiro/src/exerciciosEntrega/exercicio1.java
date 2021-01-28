package exerciciosEntrega;

public class exercicio1 {
	public static void main(String[] args) {

//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
	double x;
	
	System.out.println("Os números de 1000 a 1999 que divididos por 11 sobram 5 são : ");
	for (x=1000;x<=1999;x++)
	{
		if (x%11==5)
		{
			System.out.printf("\n %4.0f " , x , " ");
		}
		
	}
	
	}
}
