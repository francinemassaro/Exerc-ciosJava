package Exercicio3;

public class produtoEletronico {
	String tipo, marca, modelo, adicionais;
	int numero;
	
	public produtoEletronico (int numero, String tipo, String marca, String modelo, String adicionais)
	{
		this.numero=numero;
		this.tipo=tipo;
		this.marca=marca;
		this.modelo=modelo;
		this.adicionais=adicionais;
	}
	
	public String getConsideracoes()
	{
		String Consideracoes = "O produto nº "+numero+" escolhido é um "+tipo+" da marca "+marca+", modelo "+modelo+"\nConteúdo adicional: "+adicionais+"\n---------------------------------------------------------\n";
		return Consideracoes;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(String adicionais) {
		this.adicionais = adicionais;
	}

}
