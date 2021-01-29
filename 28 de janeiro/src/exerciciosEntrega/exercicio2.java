package exerciciosEntrega;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
	double x, a, par=0, impar=0;
	
	Scanner ler = new Scanner(System.in);
	
	for(x=1;x<=10;x++)
	{
		System.out.printf("Digite um número qualquer: ");
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
	
	//System.out.println("A quantidade de númeroes ímpares digitados são de "+impar+" e a quantidade de números pares digitados são de "+par);
	System.out.printf("A quantidade de números ímpares digitados são de %2.0f e a quantidade de números pares digitados são de %2.0f", impar, par);
		
	}
}
