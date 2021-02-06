package Exercicio4;

import Exercicio1e2.Pessoa;

public class Administrador extends Pessoa {
	
	protected double ajudaCusto;
	protected double custoViagem;

	public Administrador ()
	{
	}
	
	public Administrador (double ajudaCusto, double custoViagem)
	{
		this.ajudaCusto=ajudaCusto;
		this.custoViagem=custoViagem;
	}
	
	public double ajuda()
	{
		return custoViagem*0.6; 
	}
	
	public void info()
	{
		System.out.println("Olá, "+nome+"\nNós adiantamos uma ajuda de 60% do valor da viagem. \nGuarde todos os comprovantes pra colaborarmos com o restante quando voltar.");
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	public double getCustoViagem() {
		return custoViagem;
	}

	public void setCustoViagem(double custoViagem) {
		this.custoViagem = custoViagem;
	}
	
}
