package Exercicio1;

//Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

public class Cliente {
	private String primeiroNome;
	private String sobrenome;
	private String endereço;

	
	
	public Cliente (String primeiro, String sobrenome, String endereço)
	{
		primeiroNome=primeiro;
		//this.primeiroNome=primeiroNome;
		this.sobrenome=sobrenome;
		this.endereço=endereço;
	}
	

	
	public String getFrase()
	{
		String	Frase = "Tutor " +primeiroNome + " "+sobrenome+ "\nEndereço: "+endereço;
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



	public String getEndereço() {
		return endereço;
	}



	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	


	
}
