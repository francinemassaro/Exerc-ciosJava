package Exercicio4;

import java.util.Scanner;

public class Executar {
public static void main(String[] args) {
	Administrador adm = new Administrador();
	Scanner scan = new Scanner (System.in);
	
	adm.setNome("Fl�vio");
	
	adm.info();
	System.out.println("Qual o valor da viagem?");
	adm.custoViagem=scan.nextDouble();
	
	System.out.println("Voc� ir� precisar de parte do valor antes? (1) - Sim ou (2) - N�o");
	int simounao=scan.nextInt();
	
	if (simounao==1) {
		System.out.println("\nMuito bem! Foi autorizado o adiantamento de R$ "+adm.ajuda()+". \nComo j� informado, reembolsaremos o restante ap�s o retorno. \nBoa viagem e bons neg�cios!!!");
	}
	else
	{
		System.out.println("Guarde os comprovantes para reembolsarmos o valor completo na volta, ok? \nBoa viagem e bons neg�cios!");
	}
	
}
}
