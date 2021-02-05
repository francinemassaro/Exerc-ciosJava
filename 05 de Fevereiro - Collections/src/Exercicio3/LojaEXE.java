package Exercicio3;

import java.util.Scanner;

public class LojaEXE {
	public static void main(String[] args) {
		
		int opcao, op;
		
		Scanner ler = new Scanner(System.in);
		
		vegano lgbt1 = new vegano();
		eletronico nerd1=new eletronico();
		
		
		
		do {
			System.out.println("\n");
			System.out.println("Deseja entrar em qual produto? \n(1)-Vegano+ \n(2)Eletronico");
			op=ler.nextInt();
			
			if(op==1)
			{	
				
			}

			
			if (op==2)
			{
				
			}
				
			
			
			System.out.println("\n           Digite uma opção: "           );
			System.out.println("----------------------------------------");
			System.out.println("(1)Deseja adicionar livros ao estoque\n(2)Deseja remover\n(3)Atualizar\n(4)Mostrar todos os produtos do estoque\n(0)Encerrar programa");
			System.out.println("----------------------------------------");
			opcao = ler.nextInt();
			

			
		}while(opcao!=0);
	
		
		
	}
}
