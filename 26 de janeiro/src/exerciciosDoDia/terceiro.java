package exerciciosDoDia;

import java.util.Scanner;

public class terceiro {
	public static void main(String[] args) {
	
		float nota1, nota2, nota3, mp;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Vamos ver a sua m�dia ponderada e se voc� passou");
		System.out.println("Os pesos ser�o 2, 3 e 5");
		System.out.println("Digite a primeira nota ");
		nota1 = ler.nextFloat();
		System.out.println("Digite a segunda nota ");
		nota2 = ler.nextFloat();
		System.out.println("Digite a terceira nota ");
		nota3=ler.nextFloat();
		
		mp = (nota1*2+nota2*3+nota3*5)/10;
		System.out.println("Sua m�dia ponderada � " + mp);
		
		if (mp>=7)
				{
					System.out.println("Voc� foi aprovado!");
				}
		else if (mp>=4 && mp<=7) {
					System.out.println("Voc� est� de exame...");
				}
		else if (mp<4)
				{
					System.out.println("Voc� reprovou");
				}
		
	}
}
