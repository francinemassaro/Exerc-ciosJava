package Exercicio3;

import java.util.Scanner;

public class Execute {
	public static void main(String[] args) {
		
		int simounao;
		Scanner scan = new Scanner(System.in);
		
		Empregado empregado1=new Empregado();
		Empregado empregado2=new Empregado();
		
		empregado1.nome=("Eduarda Aparecida");
		empregado1.endereco=("Rua 15 de novembro, 20");
		empregado1.telefone=("16983434433");
		empregado1.codigoSetor=31238;
		empregado1.salarioBase=5400;
		
		empregado2.nome=("José Aparecido");
		empregado2.endereco=("Rua 7 de setembro, 220");
		empregado2.telefone=("1698545433");
		empregado2.codigoSetor=31243;
		empregado2.salarioBase=7400;
		
		empregado1.info();
		System.out.println("\nDeseja aplicar os impostos de 10%? \n(1)-SIM ou (2)-NAO");
		simounao=scan.nextInt();
		
		if (simounao==1)
		{
			empregado1.infoImposto();
			System.out.println(empregado1.salarioBruto());
			//System.out.println("O salário bruto de "+empregado1.nome+" agora é de "+empregado1.salarioBruto());
			System.out.println("\n\nPróximo:");
		}
		else 
		{
			System.out.println("Info do próximo");
		}
		empregado2.info();
		System.out.println("\nDeseja aplicar os impostos de 10%? \n(1)-SIM ou (2)-NAO");
		simounao=scan.nextInt();
		
		if (simounao==1)
		{
			empregado2.info();
			System.out.print(empregado2.salarioBruto());
			//System.out.println("O salário bruto de "+empregado2.nome+" agora é de "+empregado2.salarioBruto());
			System.out.println("Fim");
		}
	}
}
