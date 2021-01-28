package exerciciosDoDia;

import java.util.Scanner;

public class segundo {
public static void main(String [] args) {
	
	Scanner ler = new Scanner(System.in);
	float a,b,c,d,ee,f,x,y;
	
	System.out.println("Entre com o valor de A");
	a=ler.nextFloat();
	System.out.println("Entre com o valor de B");
	b=ler.nextFloat();
	System.out.println("Entre com o valor de C");
	c=ler.nextFloat();
	System.out.println("Entre com o valor de D");
	d=ler.nextFloat();
	System.out.println("Entre com o valor de E");
	ee=ler.nextFloat();
	System.out.println("Entre com o valor de F");
	f=ler.nextFloat();
	
	x=(c*ee-b*f)/(a*ee-b*d);
	y=(a*f-c*d)/(a*ee-b*d);
	
	System.out.println("O valor de x é " + x + " e o valor de Y é " + y );
	
	
}
}
