package vinteSeteJaneiroExercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
	
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	float n1,n2,n3;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Escreva o primeiro n�mero");
	n1 = ler.nextFloat();
	System.out.println("Escreva o segundo n�mero");
	n2=ler.nextFloat();
	System.out.println("Escreva o terceiro n�mero ");
	n3=ler.nextFloat();
	
	if (n1>n2 && n1>n3)
	{
		System.out.println("O n�mero mais alto � o primeiro que digitou " + n1);
	}
	else if (n2>n1 && n2>n3)
	{
		System.out.println("O n�mero mais alto � o segundo que digitou " + n2);	
	}
	else if (n3>n1 && n3>n2)
	{
		System.out.println("O n�mero mais alto � o terceiro que digitou "+n3);
	}
	else if (n1==n2 && n2>n3)
	{
		System.out.println("Voc� digitou dois n�meros mais alto o primeiro "+ n1 +" e o segundo " + n2);
	}
	else if (n2==n3 && n3>n1)
	{
		System.out.println("Voc� digitou dois n�meros mais altos, o segundo "+n2+"e o terceiro" +n3);
	}
	else if (n2==n3 && n3==n1)
	{
		System.out.println("Todos os n�meros que digitou s�o iguais, eles s�o" + n1);
	}
	else if (n1==n3 && n3>n2)
	{
		System.out.println("Voc� digitou dois n�meros mais altos, o primeiro "+n1+" e o terceiro " + n3);
	}
		
}

}
