package exerciciosDoDia;

import java.util.Scanner;

public class primeiro {
	public static void main(String[] args) {
	
	int idade, mes, dia, totalIdade, totalMes, mesesVividosdoAno, totalDia;
	
	try (Scanner ler = new Scanner(System.in)) {
		System.out.println("Vou te dizer os dias que voc� tem de vida baseado na sua idade");
		System.out.println("Para isso, responda... Quantos anos voc� tem? ");
		idade = ler.nextInt();
		System.out.println("E agora por favor responda quantos meses faltam para o seu anivers�rio ");
		mes = ler.nextInt();
		System.out.println("Por �ltimo, digite o dia de hoje");
		dia = ler.nextInt();
	}
	
	totalIdade=idade*365;
	mesesVividosdoAno=12-mes;
	totalMes=mesesVividosdoAno*30;
	totalDia=totalIdade+totalMes+dia;
	
	System.out.println("Voc� est� vivo ha " + totalDia);
			

	
	
	}
}

