package exerciciosEntrega;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
//Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)
		
Scanner ler = new Scanner(System.in);		
int x, num=0;

	do
	{
		System.out.println("Entre com um n�mero ");
		x=ler.nextInt();
		
		num=num+x;
	}while (x!=0);
		
	System.out.println("A soma dos n�meros digitados � "+num);
	}
}
