package vinteSeteJaneiroExercicios;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
	
		
		//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		//categoria ela se encontra:
		//10-14 infantil
		//15-17 juvenil
		//18-25 adulto
	
		//OBS: Pra ficar diferente vou usar o caso ao inves do if/else if
	
	char faixa;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Olá, digite a sua faixa etária: ");
	System.out.println("Digite \n1 - se for de 10 a 14 \n2 - se for 15 a 17 \n3- se for 18 a 25");
	faixa=ler.next().charAt(0);
	
	switch (faixa)
	{
	case '1':
		System.out.println("Sua categoria etária é infantil");
		break;
	case '2':
		System.out.println("Sua categoria etária é juvenil");
		break;
	case '3':
		System.out.println("Sua categoria etária é adulto");
		break;
	default:
		System.out.println("Opção inválida");
	
	}
	
	
	
		
		
	}
}
