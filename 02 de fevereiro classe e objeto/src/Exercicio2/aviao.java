package Exercicio2;

//Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

public class aviao {
	private String nome;
	private String documento;
	private String destino;
	private String origem;
	private String tipodevoo;
	private String data;
	
	public aviao (String nome, String documento, String destino, String origem, String tipodevoo, String data)
	{
		this.nome=nome;
		this.documento=documento;
		this.destino=destino;
		this.origem=origem;
		this.tipodevoo=tipodevoo;
		this.data=data;
	}
	
	public String getTexto()
	{
		String Texto = "Olá srª(º) "+nome+", portador do documento "+documento+". \nEstamos confirmando sua reserva para um vôo com "+tipodevoo+" para o destino "+destino+" partindo de "+origem+" em "+data;
		return Texto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getTipodevoo() {
		return tipodevoo;
	}

	public void setTipodevoo(String tipodevoo) {
		this.tipodevoo = tipodevoo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	

}
