package Exercicio5;

//5. Implemente a classe Operario como subclasse da classe Pessoa. Um determinado operário
//tem como atributos da classe Pessoa e também os atributos próprios como valorProducao
//(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e
//comissao (que corresponde à porcentagem do valorProducao que será adicionado ao
//vencimento base do operário).

public class Pessoa {
	
//1-Criar a classe e criar atributos
public String nome;
public String setorDeTrabalho;

	
//2-Criar o construtor:
public Pessoa (String nome, String setorDeTrabalho)
{
	this.nome=nome;
	this.setorDeTrabalho=setorDeTrabalho;
}

//3-Criar métodos	
//4-Trazer getters and setters


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getSetorDeTrabalho() {
	return setorDeTrabalho;
}


public void setSetorDeTrabalho(String setorDeTrabalho) {
	this.setorDeTrabalho = setorDeTrabalho;
}

	

}
