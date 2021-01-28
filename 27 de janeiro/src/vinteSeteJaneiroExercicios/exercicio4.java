package vinteSeteJaneiroExercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		//Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//ímpar exiba o número elevado ao quadrado.
		
	Scanner ler = new Scanner(System.in);
	
	double raiz, elevado, num;
	
	System.out.println("Entre com um número inteiro qualquer ");
	num=ler.nextDouble();
	
	if (num%2==0)
	{
		raiz =  Math.sqrt(num);
		System.out.printf("Seu número é par e a raíz quadrada dele é %5.2f" , raiz);
		
	}
	else if ((num%2)>0)
	{
		elevado = 	Math.pow(num, 2);
		//-erro de antes: Math.sqrt(Math.pow(num),2);
		
		
		System.out.println("\nSeu número é ímpar e elevado ao quadrado dá: "+elevado+" e o número é: "+num);
		System.out.printf("\nSeu número %5.2f é ímpar e elevado ao quadrado dá %5.2f" ,num, elevado);
	}

		
		
		
		
	}
}
