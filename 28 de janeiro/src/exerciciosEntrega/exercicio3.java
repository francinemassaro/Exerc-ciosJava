package exerciciosEntrega;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
// Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
// idade for =-99. (WHILE)
	
	Scanner ler = new Scanner(System.in);
	int idade = 0, vinteum=0, cinquenta=0;
	String nome;
	
	while (idade!=-99)
	{
		//System.out.printf("Digite o seu nome: ");
			//nome=ler.next();
		System.out.printf("Agora digite a sua idade: ");
		idade=ler.nextInt();
		{
			if (idade<=21 && idade!=-99 && idade!=0)
					{
					vinteum++;
					}
			else if (idade>=50)
					{
					cinquenta++;
					}
			
		} 
	}
	
	System.out.println("O n�mero de pessoas abaixo de 21 anos � de "+vinteum);
	System.out.println("O n�mero de pessoas acima de 50 anos � de "+cinquenta);
	
		//
	}
}
