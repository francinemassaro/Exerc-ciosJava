package exerciciosEntrega;

import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {

	//Uma empresa desenvolveu uma pesquisa para saber as características
	//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	//pessoas, calcule e mostre: (WHILE)
	//* - o número de pessoas calmas;
	//* - o número de mulheres nervosas;
	//* - o número de homens agressivos;
	//* - o número de outros calmos;
	//* - o número de pessoas nervosas com mais de 40 anos;
	//* - o número de pessoas calmas com menos de 18 anos.
	
	Scanner ler = new Scanner(System.in);
	
	int idade=0, sexo=0, fp=0, numpessoas=1, calmas=0, mulheresnervosas=0, 
		homensagressivos=0, outroscalmos=0, nervosasquarenta=0, calmasdezoito=0;
	
	while(numpessoas<=2)
	{
		System.out.println("Escreva a sua idade: ");
		idade=ler.nextInt();
		System.out.println("Escreva o número que identifique o seu sexo");
		System.out.println("1 - Feminino");
		System.out.println("2 - Masculino");
		System.out.println("3 - Outros");
		sexo=ler.nextInt();
		System.out.println("Digite o número correspondente ao fator psicológico");
		System.out.println("1 - Pessoa Calma");
		System.out.println("2 - Pessoa Nervosa");
		System.out.println("3 - Pessoa Agressiva");
		fp=ler.nextInt();
	
	
		if (fp==1)
		{
			calmas++;
		}
	
		if (sexo==1 && fp==2)
		{
			mulheresnervosas++;
		}
		
		if (sexo==2 && fp==3)
		{
			homensagressivos++;
		}
		
		if (sexo==3 && fp==1)
		{
			outroscalmos++;
		}
		
		if (idade>40 && fp==2)
		{
			nervosasquarenta++;
		}
		
		if (idade<18 && fp==1)
		{
			calmasdezoito++;
		}
		numpessoas++;
	}
	System.out.println("O número de pessoas calmas é "+calmas);
	System.out.println("O número de mulheres nervosas é " +mulheresnervosas);
	System.out.println("O número de homens agressivos é de " + homensagressivos);
	System.out.println("O número de outros calmos é de "+outroscalmos);
	System.out.println("O número de pessoas nervosas acima de 40 anos é de " +nervosasquarenta);
	System.out.println("O número de pessoas abaixo de 18 anos e calmas é de "+calmasdezoito);

	
	}
}
