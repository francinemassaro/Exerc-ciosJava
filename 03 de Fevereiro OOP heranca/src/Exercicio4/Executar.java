package Exercicio4;

import java.util.Scanner;

public class Executar {
public static void main(String[] args) {
	Administrador adm = new Administrador();
	Scanner scan = new Scanner (System.in);
	
	adm.setNome("Flávio");
	
	adm.info();
	System.out.println("Qual o valor da viagem?");
	adm.custoViagem=scan.nextDouble();
	
	System.out.println("Você irá precisar de parte do valor antes? (1) - Sim ou (2) - Não");
	int simounao=scan.nextInt();
	
	if (simounao==1) {
		System.out.println("\nMuito bem! Foi autorizado o adiantamento de R$ "+adm.ajuda()+". \nComo já informado, reembolsaremos o restante após o retorno. \nBoa viagem e bons negócios!!!");
	}
	else
	{
		System.out.println("Guarde os comprovantes para reembolsarmos o valor completo na volta, ok? \nBoa viagem e bons negócios!");
	}
	
}
}
