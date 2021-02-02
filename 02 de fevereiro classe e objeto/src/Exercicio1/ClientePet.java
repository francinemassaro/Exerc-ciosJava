package Exercicio1;

public class ClientePet {
	private String raçaPet;
	private String nomePet;
	private int idadePet;
	
	public ClientePet (String raçaPet, String nomePet, int idadePet)
	{
		this.raçaPet=raçaPet;
		this.nomePet=nomePet;
		this.idadePet=idadePet;
	}

	public String getFrase()
	{
		String	Frase = "O paciente é de raça " +raçaPet + "\nNome: "+nomePet+ "\nCom idade de: "+idadePet;
		return Frase;
	}

	public String getRaçaPet() {
		return raçaPet;
	}

	public void setRaçaPet(String raçaPet) {
		this.raçaPet = raçaPet;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public int getIdadePet() {
		return idadePet;
	}

	public void setIdadePet(int idadePet) {
		this.idadePet = idadePet;
	}
	
	
}
