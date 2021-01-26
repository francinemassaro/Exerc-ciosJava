package exerciciosDoDia;

import java.util.Scanner;

public class terceiro {
	public static void main(String[] args) {
	
		float nota1, nota2, nota3, mp;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos ver a sua média ponderada e se você passou");
		System.out.println("Os pesos serão 2, 3 e 5");
		System.out.println("Digite a primeira nota ");
		nota1 = ler.nextFloat();
		System.out.println("Digite a segunda nota ");
		nota2 = ler.nextFloat();
		System.out.println("Digite a terceira nota ");
		nota3=ler.nextFloat();
		
		mp = (nota1*2+nota2*3+nota3*5)/10;
		System.out.println("Sua média ponderada é " + mp);
		
		if (mp>=7)
				{
					System.out.println("Você foi aprovado!");
				}
		else if (mp>=4 && mp<=7) {
					System.out.println("Você está de exame...");
				}
		else if (mp<4)
				{
					System.out.println("Você reprovou");
				}
		
	}
}
