package Exercicio1;

public class ClientePet {
	private String ra�aPet;
	private String nomePet;
	private int idadePet;
	
	public ClientePet (String ra�aPet, String nomePet, int idadePet)
	{
		this.ra�aPet=ra�aPet;
		this.nomePet=nomePet;
		this.idadePet=idadePet;
	}

	public String getFrase()
	{
		String	Frase = "O paciente � de ra�a " +ra�aPet + "\nNome: "+nomePet+ "\nCom idade de: "+idadePet;
		return Frase;
	}

	public String getRa�aPet() {
		return ra�aPet;
	}

	public void setRa�aPet(String ra�aPet) {
		this.ra�aPet = ra�aPet;
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
