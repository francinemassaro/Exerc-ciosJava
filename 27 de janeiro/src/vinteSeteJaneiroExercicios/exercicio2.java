package vinteSeteJaneiroExercicios;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	Scanner ler = new Scanner(System.in);
	float n1, n2, n3;
	
	System.out.println("Entre com 3 n�meros diferentes: ");
	System.out.println("Entre com o primeiro n�mero ");
	n1=ler.nextFloat();
	System.out.println("Entre com o segundo n�mero ");
	n2=ler.nextFloat();
	System.out.println("Entre com o terceiro n�mero ");
	n3=ler.nextFloat();

	if 		(n1>n2 && n2>n3)
	{
		System.out.println("Os n�meros em ordem crescente s�o: " + n1+" "+" "+n2+" "+" "+n3);
	}
	else if(n1>n3 && n3>n2)
	{
		System.out.println("Os n�meros em ordem crescente s�o: " + n1+" "+n3+" "+n2);
	}
	else if(n2>n1 && n1>n3)
	{
		System.out.println("Os n�meros em ordem crescente s�o: " + n2+" "+n1+" "+n3);
	}
	else if(n2>n3 && n3>n1)
	{
		System.out.println("Os n�meros em ordem crescente s�o: " + n2+" "+n3+" "+n1);
	}
	else if (n3>n2 && n2>n1)
	{
		System.out.println("Os n�meros em ordem crescente s�o: " + n3+" "+n2+" "+n1);
	}
	else if (n3>n1 && n1>n2)
	{
		System.out.println("Os n�meros em ordem crescente s�o: " + n3+" "+n1+" "+n2);
	}
	else
	{
		System.out.println("Valor in�lido");
	}
	
	
	}
}
