package Exercicio1;

//Crie uma classe cliente e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informa��es deste objeto no console.

public class Cliente {
	private String primeiroNome;
	private String sobrenome;
	private String endere�o;

	
	
	public Cliente (String primeiro, String sobrenome, String endere�o)
	{
		primeiroNome=primeiro;
		//this.primeiroNome=primeiroNome;
		this.sobrenome=sobrenome;
		this.endere�o=endere�o;
	}
	

	
	public String getFrase()
	{
		String	Frase = "Tutor " +primeiroNome + " "+sobrenome+ "\nEndere�o: "+endere�o;
		return Frase;
	}



	public String getPrimeiroNome() {
		return primeiroNome;
	}



	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public String getEndere�o() {
		return endere�o;
	}



	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	


	
}
