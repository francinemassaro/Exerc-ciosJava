package exerciciosEntrega29janeiro;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {

//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
//que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
//imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
//quantas foram as ocorr�ncias da maior pontua��o.
		
	Scanner ler = new Scanner(System.in);
	
	int vet[] = new int [10],x,soma=0,media,somavalormaximo=0;
	
	System.out.println("Anote o valor do dado...");
	
	for(x=0;x<10;x++)
	{
	System.out.println((x+1)+"� dado: ");
	vet[x]=ler.nextInt();
	soma=soma+vet[x];
		
		if(vet[x]==6)
		{
			somavalormaximo++;
		}
		if(vet[x]>6 || vet[x]<=0)
		{
			System.out.println("Resultado do dado inv�lido!");
			break;
		}
			
	}
	media=soma/10;
	
	
	
	System.out.println("A m�dia das jogadas foi de: "+media);
	System.out.println("A quantidade de vezes que o dado deu maior m�ximo foi de "+somavalormaximo);
	
	
		
	}

}
