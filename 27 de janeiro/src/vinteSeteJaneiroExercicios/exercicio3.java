package vinteSeteJaneiroExercicios;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
	
		
		//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
		//categoria ela se encontra:
		//10-14 infantil
		//15-17 juvenil
		//18-25 adulto
	
		//OBS: Pra ficar diferente vou usar o caso ao inves do if/else if
	
	char faixa;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Ol�, digite a sua faixa et�ria: ");
	System.out.println("Digite \n1 - se for de 10 a 14 \n2 - se for 15 a 17 \n3- se for 18 a 25");
	faixa=ler.next().charAt(0);
	
	switch (faixa)
	{
	case '1':
		System.out.println("Sua categoria et�ria � infantil");
		break;
	case '2':
		System.out.println("Sua categoria et�ria � juvenil");
		break;
	case '3':
		System.out.println("Sua categoria et�ria � adulto");
		break;
	default:
		System.out.println("Op��o inv�lida");
	
	}
	
	
	
		
		
	}
}
