package vinteSeteJaneiroExercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//�mpar exiba o n�mero elevado ao quadrado.
		
	Scanner ler = new Scanner(System.in);
	
	double raiz, elevado, num;
	
	System.out.println("Entre com um n�mero inteiro qualquer ");
	num=ler.nextDouble();
	
	if (num%2==0)
	{
		raiz = Math.sqrt(num);
		System.out.printf("Seu n�mero � par e a ra�z quadrada dele � %5.2f" , raiz);
	}
	else if ((num%2)>0)
	{
		elevado = 	Math.pow(num, 2);
		
		//Math.sqrt(Math.pow(num),2);
		System.out.printf("Seu n�mero � �mpar e elevado ao quadrado d� %5.2f" , elevado);
	}

		
		
		
		
	}
}
