package exerciciosEntrega29janeiro;

import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {
//Crie um programa que receba valores do usu�rio para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.

int l, c, mat[][]=new int [3][3],somadiagonal = 0, somacoluna=0, somatotal=0;
Scanner ler=new Scanner(System.in);

for(l=0;l<3;l++)
{
	for(c=0;c<3;c++)
	{
		System.out.println("Entre com os valores da matriz: ");
		mat[l][c]=ler.nextInt();
		somatotal=somatotal+mat[l][c];
	}
}

//Se quiser imprimir TODAS as matrizes descomente a seguir:

//for(l=0;l<3;l++)
//{
//	for(c=0;c<3;c++)
//	{
//		System.out.println("Valores de mat["+l+"]"+"["+c+"] � "+mat[l][c]);
//	}
//}

System.out.println("\n");

//Pra pensar soma da primeira diagonal seria:
//somadiagonal=mat[0][0]+mat[0][1]+mat[0][2];
//Ent�o, rotacionar apenas o segundo.

//Deixei comentado pois primeiro tinha feito coluna e n�o diagonal rs

for(l=0;l<3;l++)
{
	somacoluna=somacoluna+mat[l][0];
	somadiagonal=somadiagonal+mat[l][l];
}


	


//System.out.println("A soma da primeira coluna � "+somacoluna);
System.out.println("A soma da diagonal �: "+somadiagonal);
System.out.println("A soma total � de: "+somatotal);


	}
}
