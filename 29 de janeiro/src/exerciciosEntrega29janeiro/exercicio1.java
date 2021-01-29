package exerciciosEntrega29janeiro;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		
int vet[]=new int[5],x;
Scanner ler = new Scanner(System.in);
	
	System.out.println("Entre com 5 números para completar os espaços de um vetor... ");
	for(x=0;x<5;x++)
	{
		System.out.printf((x+1)+ "o número: ");
		vet[x]=ler.nextInt();
		
	}
	
	System.out.println("\n");
	
	for(x=0;x<5;x++)
	{
		System.out.println("O valor do "+(x+1)+"o vetor é vet["+vet[x]+"]");
		
	}
	
	int maior=vet[0];
	
	for(x=0;x<5;x++)
	{
		if(vet[x]>maior)
		{
			maior=vet[x];
		}
	}
	System.out.println("O maior número foi o " +  maior);
	
	}

}
