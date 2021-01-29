package exerciciosEntrega29janeiro;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {

//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
//que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
//imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.
		
	Scanner ler = new Scanner(System.in);
	
	int vet[] = new int [10],x,soma=0,media,somavalormaximo=0;
	
	System.out.println("Anote o valor do dado...");
	
	for(x=0;x<10;x++)
	{
	System.out.println((x+1)+"º dado: ");
	vet[x]=ler.nextInt();
	soma=soma+vet[x];
		
		if(vet[x]==6)
		{
			somavalormaximo++;
		}
		if(vet[x]>6 || vet[x]<=0)
		{
			System.out.println("Resultado do dado inválido!");
			break;
		}
			
	}
	media=soma/10;
	
	
	
	System.out.println("A média das jogadas foi de: "+media);
	System.out.println("A quantidade de vezes que o dado deu maior máximo foi de "+somavalormaximo);
	
	
		
	}

}
