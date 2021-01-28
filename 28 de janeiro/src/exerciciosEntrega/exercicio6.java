package exerciciosEntrega;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
//Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
		
		Scanner ler = new Scanner(System.in);
		int num, multiplo=0, qtdmultiplo=0, media;
		
		do {
		System.out.println("Entre com um número, para sair da repetição, entre com 0 ");
		num=ler.nextInt();
			if (num%3==0 && num!=0)
			{
				qtdmultiplo++; //feito para saber a quantidade dos múltiplos
				multiplo=multiplo+num; //feito para somar os multiplos
			}
			
		}while (num!=0);
		
		media=multiplo/qtdmultiplo;
	System.out.println("A média dos números múltiplos de 3 é: " + media);
	

	}
}
