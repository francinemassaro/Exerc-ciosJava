package exerciciosEntrega;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
	double x, a, par=0, impar=0;
	
	Scanner ler = new Scanner(System.in);
	
	for(x=1;x<=10;x++)
	{
		System.out.printf("Digite um n�mero qualquer: ");
		a=ler.nextDouble();
		if(a%2==0)
		{
			par++;
		}
		else
		{
			impar++;
		}
	}
	
	//System.out.println("A quantidade de n�meroes �mpares digitados s�o de "+impar+" e a quantidade de n�meros pares digitados s�o de "+par);
	System.out.printf("A quantidade de n�meros �mpares digitados s�o de %2.0f e a quantidade de n�meros pares digitados s�o de %2.0f", impar, par);
		
	}
}
