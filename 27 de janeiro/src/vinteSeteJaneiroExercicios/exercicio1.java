package vinteSeteJaneiroExercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
	
	//Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	float n1,n2,n3;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Escreva o primeiro número");
	n1 = ler.nextFloat();
	System.out.println("Escreva o segundo número");
	n2=ler.nextFloat();
	System.out.println("Escreva o terceiro número ");
	n3=ler.nextFloat();
	
	if (n1>n2 && n1>n3)
	{
		System.out.println("O número mais alto é o primeiro que digitou " + n1);
	}
	else if (n2>n1 && n2>n3)
	{
		System.out.println("O número mais alto é o segundo que digitou " + n2);	
	}
	else if (n3>n1 && n3>n2)
	{
		System.out.println("O número mais alto é o terceiro que digitou "+n3);
	}
	else if (n1==n2 && n2>n3)
	{
		System.out.println("Você digitou dois números mais alto o primeiro "+ n1 +" e o segundo " + n2);
	}
	else if (n2==n3 && n3>n1)
	{
		System.out.println("Você digitou dois números mais altos, o segundo "+n2+"e o terceiro" +n3);
	}
	else if (n2==n3 && n3==n1)
	{
		System.out.println("Todos os números que digitou são iguais, eles são" + n1);
	}
	else if (n1==n3 && n3>n2)
	{
		System.out.println("Você digitou dois números mais altos, o primeiro "+n1+" e o terceiro " + n3);
	}
		
}

}
