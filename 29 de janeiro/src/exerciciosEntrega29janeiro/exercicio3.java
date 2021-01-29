package exerciciosEntrega29janeiro;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
	//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//	das matrizes N1 e N2;
//		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//	posição das matrizes N1 e N2.
		
Scanner ler = new Scanner(System.in);

int n1[][]=new int[4][6],n2[][]=new int[4][6],l1,c1,l2,c2;
int m3[][]=new int[4][6],m4[][]=new int[4][6],l3,c3,l4,c4;

for(l1=0;l1<4;l1++)
{
	{
		for(c1=0;c1<6;c1++)
		{
		System.out.println("Entre com os valores do primeiro vetor: ");
		n1[l1][c1]=ler.nextInt();
		}
	}
}

for(l2=0;l2<4;l2++)
{
	{
		for(c2=0;c2<6;c2++)
		{
		System.out.println("Entre com os valores do segundo vetor: ");
		n2[l2][c2]=ler.nextInt();
		}
	}
}
for(l1=0;l1<4;l1++)
{
	{
		for(c1=0;c1<6;c1++)
		{
		System.out.println("n1["+l1+"]["+c1+"] = "+n1[l1][c1]);
		
		
		}
	}
}

for(l2=0;l2<4;l2++)
{
	{
		for(c2=0;c2<6;c2++)
		{
		System.out.println("n2["+l2+"]["+c2+"] = "+n2[l2][c2]);
		}
	}
}

m3[0][0]=n1[0][0]+n2[0][0];
m3[0][1]=n1[0][1]+n2[0][1];

for(l3=0;l3<4;l3++)
{
	{
		for(c3=0;c3<6;c3++)
		{
		m3[l3][c3]=n1[l3][c3]+n2[l3][c3];
	
		System.out.println("Os valores de M1 são M1["+l3+"]["+c3+"] = "+m3[l3][c3]);
							
		}
	}
}
for(l4=0;l4<4;l4++)
{
	{
		for(c4=0;c4<6;c4++)
		{
		m4[l4][c4]=(n1[l4][c4])-(n2[l4][c4]);
	
		System.out.println("Os valores de M2 são M2["+l4+"]["+c4+"] = "+m4[l4][c4]);
							
		}
	}
}



		
	}

}
