package vinteSeteJaneiroExercicios;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	//Faça um programa que entre com três números e coloque em ordem crescente.
	
	Scanner ler = new Scanner(System.in);
	float n1, n2, n3;
	
	System.out.println("Entre com 3 números diferentes: ");
	System.out.println("Entre com o primeiro número ");
	n1=ler.nextFloat();
	System.out.println("Entre com o segundo número ");
	n2=ler.nextFloat();
	System.out.println("Entre com o terceiro número ");
	n3=ler.nextFloat();

	if 		(n1>n2 && n2>n3)
	{
		System.out.println("Os números em ordem crescente são: " + n1+" "+" "+n2+" "+" "+n3);
	}
	else if(n1>n3 && n3>n2)
	{
		System.out.println("Os números em ordem crescente são: " + n1+" "+n3+" "+n2);
	}
	else if(n2>n1 && n1>n3)
	{
		System.out.println("Os números em ordem crescente são: " + n2+" "+n1+" "+n3);
	}
	else if(n2>n3 && n3>n1)
	{
		System.out.println("Os números em ordem crescente são: " + n2+" "+n3+" "+n1);
	}
	else if (n3>n2 && n2>n1)
	{
		System.out.println("Os números em ordem crescente são: " + n3+" "+n2+" "+n1);
	}
	else if (n3>n1 && n1>n2)
	{
		System.out.println("Os números em ordem crescente são: " + n3+" "+n1+" "+n2);
	}
	else
	{
		System.out.println("Valor inálido");
	}
	
	
	}
}
