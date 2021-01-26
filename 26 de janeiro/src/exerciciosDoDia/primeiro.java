package exerciciosDoDia;

import java.util.Scanner;

public class primeiro {
	public static void main(String[] args) {
	
	int idade, mes, dia, totalIdade, totalMes, mesesVividosdoAno, totalDia;
	
	try (Scanner ler = new Scanner(System.in)) {
		System.out.println("Vou te dizer os dias que você tem de vida baseado na sua idade");
		System.out.println("Para isso, responda... Quantos anos você tem? ");
		idade = ler.nextInt();
		System.out.println("E agora por favor responda quantos meses faltam para o seu aniversário ");
		mes = ler.nextInt();
		System.out.println("Por último, digite o dia de hoje");
		dia = ler.nextInt();
	}
	
	totalIdade=idade*365;
	mesesVividosdoAno=12-mes;
	totalMes=mesesVividosdoAno*30;
	totalDia=totalIdade+totalMes+dia;
	
	System.out.println("Você está vivo ha " + totalDia);
			

	
	
	}
}

